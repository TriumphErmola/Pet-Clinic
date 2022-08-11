package springguru.petclinic.service;

import springguru.petclinic.model.MasterOfAnimal;

public interface MasterOfAnimalServiceImpl extends CrudService<MasterOfAnimal, Long> {

    MasterOfAnimal findByLastName(String lastName);
}
