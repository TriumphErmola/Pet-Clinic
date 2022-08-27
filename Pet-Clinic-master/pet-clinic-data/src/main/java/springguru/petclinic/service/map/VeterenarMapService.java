package springguru.petclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springguru.petclinic.model.Specialty;
import springguru.petclinic.model.Veterenar;
import springguru.petclinic.service.SpecialtyService;
import springguru.petclinic.service.VeterenarService;

import java.util.Set;
@Service
@Profile({"default","map"})
public class VeterenarMapService extends AbstractMapService<Veterenar,Long> implements VeterenarService {

    SpecialtyService specialtyService;

    public VeterenarMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Veterenar> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Veterenar object) {
        super.delete(object);
    }

    @Override
    public Veterenar save(Veterenar object) {
        if(object.getSpecialtySet().size()>0){
            object.getSpecialtySet().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Veterenar findById(Long id) {
        return super.findById(id);
    }
}
