package springguru.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.HomeAnimal;

public interface HomeAnimalRepository extends CrudRepository<HomeAnimal, Long> {
}
