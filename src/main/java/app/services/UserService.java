package app.services;

import app.entities.User;
import app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getById(Long id) {
        return userRepository.findByIdAndDeletedFalse(id);
    }

    public Optional<User> getByEmail(String email){
        return userRepository.findByEmailAndDeletedFalse(email);
    }

    public void save(User user) {
        userRepository.save(user);
    }
    public void delete(User user){
        user.setDeleted(true);
        userRepository.save(user);
    }
}
