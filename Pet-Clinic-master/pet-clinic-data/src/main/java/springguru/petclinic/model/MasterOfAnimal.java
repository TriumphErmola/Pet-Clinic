package springguru.petclinic.model;

import java.util.Set;

public class MasterOfAnimal extends Human{

    private Set<HomeAnimal> homeAnimalSet;


    public MasterOfAnimal() {
    }

    public Set<HomeAnimal> getHomeAnimalSet() {
        return homeAnimalSet;
    }

    public void setHomeAnimalSet(Set<HomeAnimal> homeAnimalSet) {
        this.homeAnimalSet = homeAnimalSet;
    }
}
