package springguru.petclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springguru.petclinic.model.Osmotr;
import springguru.petclinic.service.OsmotrService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class OsmotrMapService extends AbstractMapService<Osmotr, Long> implements OsmotrService {
    @Override
    public Set<Osmotr> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Osmotr object) {
        super.delete(object);
    }

    @Override
    public Osmotr save(Osmotr osmotr) {
        if (osmotr.getHomeAnimal() == null || osmotr.getHomeAnimal().getMasterOfAnimal() == null ||
                osmotr.getHomeAnimal().getId() == null || osmotr.getHomeAnimal().getMasterOfAnimal().getId() == null) {
            throw new RuntimeException("Invalid Osmotr");
        }
        return super.save(osmotr);
    }

    @Override
    public Osmotr findById(Long id) {
        return super.findById(id);
    }
}
