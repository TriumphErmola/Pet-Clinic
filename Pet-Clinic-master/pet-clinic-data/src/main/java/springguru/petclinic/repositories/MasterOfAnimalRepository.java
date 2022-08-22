package springguru.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.MasterOfAnimal;

public interface MasterOfAnimalRepository extends CrudRepository<MasterOfAnimal, Long> {


}
