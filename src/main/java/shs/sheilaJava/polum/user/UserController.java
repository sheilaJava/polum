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
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
       return userService.createUser(user);
    }
    @PutMapping("/{id}")
    public void updateUser(@RequestBody User user, @PathVariable("id") Integer id) {
        userService.updateUser(user, id);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }
}
