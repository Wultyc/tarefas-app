package eu.jgabriel.tarefasapp.users;

import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {
    private final JPAStreamer jpaStreamer;

    @Autowired
    public UserService(JPAStreamer jpaStreamer) {
        this.jpaStreamer = jpaStreamer;
    }

    public Stream<User> getUsers(){
        return jpaStreamer.stream(User.class)
                .sorted(User$.id);
    }

    public Optional<User> getUserById(int userId){
        return jpaStreamer.stream(User.class)
                .filter(user -> Objects.equals(user.getId(), userId))
                .findFirst();
    }
}
