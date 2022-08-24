package springguru.petclinic.service;

import springguru.petclinic.model.MasterOfAnimal;

public interface MasterOfAnimalService extends CrudService<MasterOfAnimal, Long> {

    MasterOfAnimal findByLastName(String lastName);
}
