package app.services;

import app.entities.AgeGroup;
import app.repositories.AgeGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgeGroupService {


    private final AgeGroupRepository ageGroupRepository;

    @Autowired
    public AgeGroupService(AgeGroupRepository ageGroupRepository) {
        this.ageGroupRepository = ageGroupRepository;
    }

    public Optional<AgeGroup> findById(Long id){
        return ageGroupRepository.findById(id);
    }
    public List<AgeGroup> findAll(){
        return ageGroupRepository.findAll();
    }
}
