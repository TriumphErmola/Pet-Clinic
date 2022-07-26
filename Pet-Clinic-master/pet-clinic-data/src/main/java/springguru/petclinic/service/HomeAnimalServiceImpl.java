package springguru.petclinic.service;

import springguru.petclinic.model.HomeAnimal;


import java.util.Set;

public interface HomeAnimalServiceImpl {

    HomeAnimal findByid(Long id);

    HomeAnimal safe(HomeAnimal homeAnimal);

    Set<HomeAnimal> findAll();
}
