package springguru.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="home_animals")
public class HomeAnimal extends BaseEntity{

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "master_of_animal_id")
    private MasterOfAnimal masterOfAnimal;

    @Column(name ="birthday")
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "type_animal_id")
    private TypeAnimal typeAnimal;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "home_animal")
    private Set<Osmotr> osmotrs = new HashSet<>();
    //косяк с ссылками
}
