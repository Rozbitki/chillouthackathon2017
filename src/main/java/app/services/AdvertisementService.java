package app.services;

import app.dto.AdvertiseShort;
import app.entities.Advertisement;
import app.entities.AgeGroup;
import app.enums.ExpGroup;
import app.enums.SportDiscipline;

import app.repositories.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AdvertisementService {


    private AdvertisementRepository advertisementRepository;


    @Autowired
    public AdvertisementService(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    protected AdvertisementService() {
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


    public Collection<Advertisement> getAdvertisemens() {
        return advertisementRepository.findAll();
    }

    public void save(Advertisement adv){
        advertisementRepository.save(adv);
    }

    public void delete(Advertisement adv){
        adv.setDeleted(true);
        advertisementRepository.save(adv);
    }
}
