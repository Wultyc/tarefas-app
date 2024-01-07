package eu.jgabriel.tarefasapp.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController( UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getUsers(){
        return userService.getUsers()
                .collect(Collectors.toList());
    }

    @PostMapping()
    public Map<String,String> createUsers(@RequestBody Object newUser){
        System.out.println(newUser);

        Map<String, String> result = new HashMap<String, String>();
        result.put("result", "success");

        return result;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId){
        Optional<User> u = userService.getUserById(userId);
        if(u.isEmpty()){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User not found"
            );
        }
        return u.get();
    }
}
