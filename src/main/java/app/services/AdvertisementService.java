package app.services;

import app.entities.Advertisement;
import app.entities.AgeGroup;
import app.enums.ExpGroup;
import app.enums.SportDiscipline;
import app.repositories.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertisementService {


    private final AdvertisementRepository advertisementRepository;

    @Autowired
    public AdvertisementService(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    public Optional<Advertisement> getById(Long id){
        return advertisementRepository.findByIdAndDeletedFalse(id);
    }
    public List<Advertisement> getAdvertisementsByExpGroup(ExpGroup expGroup){
        return advertisementRepository.findTop10ByExpGroupAndDeletedFalseOrderByEndTimeAsc(expGroup);
    }
    public List<Advertisement> getAdvertisementsByAgeGroup(AgeGroup ageGroup){
        return advertisementRepository.findTop10ByAgeGroupAndDeletedFalseOrderByEndTimeAsc(ageGroup);
    }

    public List<Advertisement> getAdvertisementsBySportDiscipline(SportDiscipline sportDiscipline){
        return advertisementRepository.findTop10BySportDisciplineAndDeletedFalseOrderByEndTimeAsc(sportDiscipline);
    }

    public void save(Advertisement adv){
        advertisementRepository.save(adv);
    }

    public void delete(Advertisement adv){
        adv.setDeleted(true);
        advertisementRepository.save(adv);
    }
}
