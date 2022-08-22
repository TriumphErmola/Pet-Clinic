package springguru.petclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springguru.petclinic.model.MasterOfAnimal;
import springguru.petclinic.repositories.HomeAnimalRepository;
import springguru.petclinic.repositories.MasterOfAnimalRepository;
import springguru.petclinic.repositories.TypeAnimalRepository;
import springguru.petclinic.service.MasterOfAnimalServiceImpl;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class MasterOfAnimalSDJpaService implements MasterOfAnimalServiceImpl {

    private final MasterOfAnimalRepository masterOfAnimalRepository;
    private final HomeAnimalRepository homeAnimalRepository;
    private final TypeAnimalRepository typeAnimalRepository;

    public MasterOfAnimalSDJpaService(MasterOfAnimalRepository masterOfAnimalRepository, HomeAnimalRepository homeAnimalRepository, TypeAnimalRepository typeAnimalRepository) {
        this.masterOfAnimalRepository = masterOfAnimalRepository;
        this.homeAnimalRepository = homeAnimalRepository;
        this.typeAnimalRepository = typeAnimalRepository;
    }

    @Override
    public Set<MasterOfAnimal> findAll() {

        Set<MasterOfAnimal> masterOfAnimals = new HashSet<>();
        masterOfAnimalRepository.findAll().forEach(masterOfAnimals::add);
        return masterOfAnimals;
    }

    @Override
    public MasterOfAnimal findById(Long aLong) {
        return masterOfAnimalRepository.findById(aLong).orElse(null);
    }

    @Override
    public MasterOfAnimal save(MasterOfAnimal object) {
        return masterOfAnimalRepository.save(object);
    }

    @Override
    public void delete(MasterOfAnimal object) {
        masterOfAnimalRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        masterOfAnimalRepository.deleteById(aLong);
    }

    @Override
    public MasterOfAnimal findByLastName(String lastName) {
        return masterOfAnimalRepository.findByLastName(lastName);
    }
}
