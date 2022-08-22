package springguru.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springguru.petclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
