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
@Table(name = "veterenars")
public class Veterenar extends Human {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "veterenar_specialties", joinColumns = @JoinColumn(name = "veterenar_id")
            , inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialtySet = new HashSet<>();
}
