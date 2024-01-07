package eu.jgabriel.tarefasapp.users;

import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final JPAStreamer jpaStreamer;

    @Autowired
    public UserService(JPAStreamer jpaStreamer) {
        this.jpaStreamer = jpaStreamer;
    }

    public List<User> getUsers(){
        List<User> allUsers = jpaStreamer.stream(User.class)
                .sorted(User$.id)
                .collect(Collectors.toList());

        return allUsers;
    }

    public Optional<User> getUserById(int userId){
        return jpaStreamer.stream(User.class)
                .filter(user -> Objects.equals(user.getId(), userId))
                .findFirst();
    }
}
