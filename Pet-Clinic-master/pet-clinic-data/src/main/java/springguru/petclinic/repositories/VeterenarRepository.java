package springguru.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.Veterenar;

public interface VeterenarRepository extends CrudRepository<Veterenar, Long> {
}
