package app.repositories;

import app.dto.AdvertiseShort;
import app.entities.Advertisement;
import app.entities.AgeGroup;
import app.enums.ExpGroup;
import app.enums.SportDiscipline;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long> {

    public Optional<Advertisement> findByIdAndDeletedFalse(Long id);
    public List<Advertisement> findTop10ByExpGroupAndDeletedFalseOrderByEndTimeAsc(ExpGroup expGroup);
    public List<Advertisement> findTop10ByAgeGroupAndDeletedFalseOrderByEndTimeAsc(AgeGroup ageGroup);
    public List<Advertisement> findTop10BySportDisciplineAndDeletedFalseOrderByEndTimeAsc(SportDiscipline sportDiscipline);
    public List<Advertisement> findAll();
}
