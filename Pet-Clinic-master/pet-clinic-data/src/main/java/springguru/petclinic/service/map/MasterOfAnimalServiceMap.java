package springguru.petclinic.service.map;

import springguru.petclinic.model.MasterOfAnimal;
import springguru.petclinic.service.MasterOfAnimalServiceImpl;

import java.util.Set;

public class MasterOfAnimalServiceMap extends AbstractMapService<MasterOfAnimal, Long> implements MasterOfAnimalServiceImpl {

    @Override
    public Set<MasterOfAnimal> findAll() {
        return super.findByAll();
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
        return super.save(object.getId(),object);
    }


    @Override
    public MasterOfAnimal findByLastName(String lastName) {
        return null;
    }
}
