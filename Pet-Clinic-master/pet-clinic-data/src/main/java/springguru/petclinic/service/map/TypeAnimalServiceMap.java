package springguru.petclinic.service.map;

import org.springframework.stereotype.Service;
import springguru.petclinic.model.TypeAnimal;
import springguru.petclinic.service.TypeAnimalService;

import java.util.Set;
@Service
public class TypeAnimalServiceMap extends AbstractMapService<TypeAnimal, Long> implements TypeAnimalService {

    @Override
    public Set<TypeAnimal> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(TypeAnimal object) {
        super.delete(object);
    }

    @Override
    public TypeAnimal save(TypeAnimal object) {
        return super.save(object);
    }

    @Override
    public TypeAnimal findById(Long id) {
        return super.findById(id);
    }
}
