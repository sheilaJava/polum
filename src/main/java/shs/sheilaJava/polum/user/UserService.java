package shs.sheilaJava.polum.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
