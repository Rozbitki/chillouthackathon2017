package app.repositories;

import app.entities.Advertisement;
import app.entities.AgeGroup;
import app.enums.ExpGroup;
import app.enums.SportDiscipline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long> {

    Optional<Advertisement> findByIdAndDeletedFalse(Long id);
    List<Advertisement> findTop10ByExpGroupAndDeletedFalseOrderByEndTimeAsc(ExpGroup expGroup);
    List<Advertisement> findTop10ByAgeGroupAndDeletedFalseOrderByEndTimeAsc(AgeGroup ageGroup);
    List<Advertisement> findTop10BySportDisciplineAndDeletedFalseOrderByEndTimeAsc(SportDiscipline sportDiscipline);
}
