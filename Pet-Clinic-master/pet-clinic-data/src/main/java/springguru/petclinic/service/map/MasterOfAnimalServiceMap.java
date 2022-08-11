package springguru.petclinic.service.map;

import org.springframework.stereotype.Service;
import springguru.petclinic.model.HomeAnimal;
import springguru.petclinic.model.MasterOfAnimal;
import springguru.petclinic.service.HomeAnimalServiceImpl;
import springguru.petclinic.service.MasterOfAnimalServiceImpl;
import springguru.petclinic.service.TypeAnimalService;

import java.util.Set;

@Service
public class MasterOfAnimalServiceMap extends AbstractMapService<MasterOfAnimal, Long> implements MasterOfAnimalServiceImpl {

    private final TypeAnimalService typeAnimalService;
    private final HomeAnimalServiceImpl homeAnimalService;

    public MasterOfAnimalServiceMap(TypeAnimalService typeAnimalService, HomeAnimalServiceImpl homeAnimalService) {
        this.typeAnimalService = typeAnimalService;
        this.homeAnimalService = homeAnimalService;
    }

    @Override
    public Set<MasterOfAnimal> findAll() {
        return super.findAll();
    }

    @Override
    public MasterOfAnimal findByLastName(String lastName) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public MasterOfAnimal findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(MasterOfAnimal object) {
        super.delete(object);
    }

    @Override
    public MasterOfAnimal save(MasterOfAnimal object) {
        if (object != null) {
            if (object.getHomeAnimalSet() != null) {
                object.getHomeAnimalSet().forEach(homeAnimal -> {
                    if (homeAnimal.getTypeAnimal() != null) {
                        if (homeAnimal.getTypeAnimal().getId() == null) {
                            homeAnimal.setTypeAnimal(typeAnimalService.save(homeAnimal.getTypeAnimal()));
                        }

                    } else {
                        throw new RuntimeException("Pet type is required");
                    }
                    if (homeAnimal.getId() == null) {
                        HomeAnimal savedAnimal = homeAnimalService.save(homeAnimal);
                        homeAnimal.setId(savedAnimal.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }


}
