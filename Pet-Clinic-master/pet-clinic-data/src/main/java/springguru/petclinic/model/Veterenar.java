package springguru.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "veterenars")
public class Veterenar extends Human {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "veterenar_specialties", joinColumns = @JoinColumn(name = "veterenar_id")
            , inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialtySet = new HashSet<>();

    public Set<Specialty> getSpecialtySet() {
        return specialtySet;
    }

    public void setSpecialtySet(Set<Specialty> specialtySet) {
        this.specialtySet = specialtySet;
    }

}
