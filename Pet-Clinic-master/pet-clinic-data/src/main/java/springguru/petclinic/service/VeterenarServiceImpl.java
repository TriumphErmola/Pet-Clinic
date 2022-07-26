package springguru.petclinic.service;



import springguru.petclinic.model.Veterenar;

import java.util.Set;

public interface VeterenarServiceImpl {


    Veterenar findByid(Long id);

    Veterenar safe(Veterenar veterenar);

    Set<Veterenar> findAll();


}
