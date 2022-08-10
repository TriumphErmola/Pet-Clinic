package springguru.petclinic.model;

import java.util.Set;

public class MasterOfAnimal extends Human{

    private String addres;
    private String city;
    private String telephone;
    private Set<HomeAnimal> homeAnimalSet;

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<HomeAnimal> getHomeAnimalSet() {
        return homeAnimalSet;
    }

    public void setHomeAnimalSet(Set<HomeAnimal> homeAnimalSet) {
        this.homeAnimalSet = homeAnimalSet;
    }
}
