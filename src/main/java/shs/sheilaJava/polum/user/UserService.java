package shs.sheilaJava.polum.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new RuntimeException("User not found");
        }
        return userRepository.findById(id).get();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(User user, Integer id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new RuntimeException("User not found");
        }
        User originalUser = userRepository.findById(id).get();

        if (user.getUsername() != null && user.getUsername().length() >= 50) {
            throw new RuntimeException("Username must be less than 50 characters");
        } else if (user.getUsername() != null)
            originalUser.setUsername(user.getUsername());

        if (user.getEmail() != null && userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }else if (user.getEmail() != null && !user.getEmail().matches("^[\\w-]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new RuntimeException("Email must be valid");
        } else if (user.getEmail() != null && user.getEmail().length() >= 255) {
            throw new RuntimeException("Email must be less than 255 characters");
        } else if (user.getEmail() != null)
            originalUser.setEmail(user.getEmail());

        if (user.getPassword() != null && !user.getPassword().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,24}$")) {
            throw new RuntimeException("Password must be between 8 and 24 characters and contain at least one uppercase letter, one lowercase letter, one number, and one special character");
        } else if (user.getPassword() != null)
            originalUser.setPassword(user.getPassword());

        userRepository.save(originalUser);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}