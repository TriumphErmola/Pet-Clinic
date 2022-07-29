package springguru.petclinic.service;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.MasterOfAnimal;
import springguru.petclinic.model.Veterenar;

import java.util.Set;

public interface MasterOfAnimalServiceImpl extends CrudRepository<MasterOfAnimal,Long> {

    MasterOfAnimal findByLastName(String lastName);
}
