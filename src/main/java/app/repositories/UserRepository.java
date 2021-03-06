package app.repositories;

import app.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByIdAndDeletedFalse(Long id);
    Optional<User> findByEmailAndDeletedFalse(String Email);
}
