package springguru.petclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springguru.petclinic.model.TypeAnimal;
import springguru.petclinic.repositories.TypeAnimalRepository;
import springguru.petclinic.service.TypeAnimalService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class TypeAnimalSDJpaService implements TypeAnimalService {

    private final TypeAnimalRepository typeAnimalRepository;

    public TypeAnimalSDJpaService(TypeAnimalRepository typeAnimalRepository) {
        this.typeAnimalRepository = typeAnimalRepository;
    }

    @Override
    public Set<TypeAnimal> findAll() {
        Set<TypeAnimal> typeAnimals = new HashSet<>();
        typeAnimalRepository.findAll().forEach(typeAnimals::add);
        return typeAnimals;
    }

    @Override
    public TypeAnimal findById(Long aLong) {
        return typeAnimalRepository.findById(aLong).orElse(null);
    }

    @Override
    public TypeAnimal save(TypeAnimal object) {
        return typeAnimalRepository.save(object);
    }

    @Override
    public void delete(TypeAnimal object) {
        typeAnimalRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        typeAnimalRepository.deleteById(aLong);
    }
}
