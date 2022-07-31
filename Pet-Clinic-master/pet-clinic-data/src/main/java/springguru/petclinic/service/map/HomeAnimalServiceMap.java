package springguru.petclinic.service.map;

import springguru.petclinic.model.HomeAnimal;
import springguru.petclinic.service.HomeAnimalServiceImpl;

import java.util.Set;

public class HomeAnimalServiceMap extends AbstractMapService<HomeAnimal,Long>implements HomeAnimalServiceImpl {
    @Override
    public Set<HomeAnimal> findAll() {
        return super.findByAll();
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
        return super.save(object.getId(),object);
    }

    @Override
    public HomeAnimal findById(Long id) {
        return super.findById(id);
    }
}
