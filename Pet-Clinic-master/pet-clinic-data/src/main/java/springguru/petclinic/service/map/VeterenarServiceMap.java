package springguru.petclinic.service.map;

import springguru.petclinic.model.Veterenar;
import springguru.petclinic.service.VeterenarServiceImpl;

import java.util.Set;

public class VeterenarServiceMap extends AbstractMapService<Veterenar,Long> implements VeterenarServiceImpl {


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
        return super.save(object);
    }

    @Override
    public Veterenar findById(Long id) {
        return super.findById(id);
    }
}
