package springguru.petclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springguru.petclinic.model.Veterenar;
import springguru.petclinic.repositories.VeterenarRepository;
import springguru.petclinic.service.VeterenarService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VeterenarSDJpaService implements VeterenarService {

    private final VeterenarRepository veterenarRepository;

    public VeterenarSDJpaService(VeterenarRepository veterenarRepository) {
        this.veterenarRepository = veterenarRepository;
    }

    @Override
    public Set<Veterenar> findAll() {
        Set<Veterenar> veterenars = new HashSet<>();
        veterenarRepository.findAll().forEach(veterenars::add);
        return veterenars;
    }

    @Override
    public Veterenar findById(Long aLong) {
        return veterenarRepository.findById(aLong).orElse(null);
    }

    @Override
    public Veterenar save(Veterenar object) {
        return veterenarRepository.save(object);
    }

    @Override
    public void delete(Veterenar object) {
        veterenarRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        veterenarRepository.deleteById(aLong);
    }
}
