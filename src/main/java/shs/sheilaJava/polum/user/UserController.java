package shs.sheilaJava.polum.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
       return userRepository.save(user);
    }

    @PutMapping
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @DeleteMapping
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
