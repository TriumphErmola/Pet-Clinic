package springguru.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.TypeAnimal;

public interface TypeAnimalRepository extends CrudRepository<TypeAnimal, Long> {
}
