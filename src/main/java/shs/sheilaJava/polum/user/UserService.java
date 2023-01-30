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
        if (user.getUsername() != null && user.getUsername().length() <= 50)
            originalUser.setUsername(user.getUsername());
        if (user.getEmail() != null && user.getEmail().length() <= 255) originalUser.setEmail(user.getEmail());
        if (user.getPassword() != null && user.getPassword().matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,24}$"))
            originalUser.setPassword(user.getPassword());
        userRepository.save(originalUser);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}