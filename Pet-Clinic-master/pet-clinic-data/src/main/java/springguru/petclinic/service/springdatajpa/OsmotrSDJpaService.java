package springguru.petclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springguru.petclinic.model.Osmotr;
import springguru.petclinic.repositories.OsmotrRepository;
import springguru.petclinic.service.OsmotrService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OsmotrSDJpaService implements OsmotrService {

    private final OsmotrRepository osmotrRepository;

    public OsmotrSDJpaService(OsmotrRepository osmotrRepository) {
        this.osmotrRepository = osmotrRepository;

    }

    @Override
    public Set<Osmotr> findAll() {
        Set<Osmotr> osmotrs = new HashSet<>();
        osmotrRepository.findAll().forEach(osmotrs::add);
        return osmotrs;
    }

    @Override
    public Osmotr findById(Long aLong) {
        return osmotrRepository.findById(aLong).orElse(null);
    }

    @Override
    public Osmotr save(Osmotr object) {
        return osmotrRepository.save(object);
    }

    @Override
    public void delete(Osmotr object) {
        osmotrRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        osmotrRepository.deleteById(aLong);
    }
}
