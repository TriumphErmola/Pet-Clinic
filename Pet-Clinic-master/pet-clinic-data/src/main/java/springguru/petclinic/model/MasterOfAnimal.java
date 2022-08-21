package springguru.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "master_of_animals")
public class MasterOfAnimal extends Human {

    @Column(name = "addres")
    private String addres;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "master_of_animal")
    private Set<HomeAnimal> homeAnimalSet = new HashSet<>();

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
