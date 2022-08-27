package springguru.petclinic.service.map;

import org.springframework.stereotype.Service;
import springguru.petclinic.model.HomeAnimal;
import springguru.petclinic.service.HomeAnimalService;

import java.util.Set;
@Service
public class HomeAnimalMapService extends AbstractMapService<HomeAnimal,Long>implements HomeAnimalService {
    @Override
    public Set<HomeAnimal> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(HomeAnimal object) {
        super.delete(object);
    }

    @Override
    public HomeAnimal save(HomeAnimal object) {
        return super.save(object);
    }

    @Override
    public HomeAnimal findById(Long id) {
        return super.findById(id);
    }
}
