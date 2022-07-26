package springguru.petclinic.service;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.MasterOfAnimal;

import java.util.Set;

public interface MasterOfAnimalServiceImpl extends CrudRepository {

    MasterOfAnimal findByLastName(String lastName);

    MasterOfAnimal findByid(Long id);

    MasterOfAnimal safe(MasterOfAnimal masterOfAnimal);

    Set<MasterOfAnimal> findAll();
}
