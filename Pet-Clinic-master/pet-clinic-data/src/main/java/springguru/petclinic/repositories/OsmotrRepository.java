package springguru.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.Osmotr;

public interface OsmotrRepository extends CrudRepository<Osmotr, Long> {
}
