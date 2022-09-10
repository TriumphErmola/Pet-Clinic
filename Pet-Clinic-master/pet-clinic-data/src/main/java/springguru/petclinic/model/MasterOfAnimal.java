package springguru.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "master_of_animals")
public class MasterOfAnimal extends Human {

    public MasterOfAnimal(Long id, String firstName, String secondName, String addres, String city,
                          String telephone, Set<HomeAnimal> homeAnimalSet) {
        super(id, firstName, secondName);
        this.addres = addres;
        this.city = city;
        this.telephone = telephone;
        this.homeAnimalSet = homeAnimalSet;
    }

    @Column(name = "addres")
    private String addres;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "master_of_animal")
    private Set<HomeAnimal> homeAnimalSet = new HashSet<>();

}
