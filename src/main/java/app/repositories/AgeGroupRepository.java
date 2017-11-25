package app.repositories;

import app.entities.AgeGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgeGroupRepository extends CrudRepository<AgeGroup, Long> {

    Optional<AgeGroup> findById(Long id);
    List<AgeGroup> findAll();
}
