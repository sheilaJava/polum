package shs.sheilaJava.polum.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping
    public List<User> getAllUsers() {
        return List.of(
                new User(1, "user1", "user1@gmail.com", "123456"),
                new User(2, "user2", "user2@gmail.com", "123456")
        );
    }
}