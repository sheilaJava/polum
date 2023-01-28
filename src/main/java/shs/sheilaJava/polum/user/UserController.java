package shs.sheilaJava.polum.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
       return userService.createUser(user);
    }
    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestBody Integer id) {
        userService.deleteUser(id);
    }
}
