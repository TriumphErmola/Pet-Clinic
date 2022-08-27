package springguru.petclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MasterOfAnimal getMasterOfAnimal() {
        return masterOfAnimal;
    }

    public void setMasterOfAnimal(MasterOfAnimal masterOfAnimal) {
        this.masterOfAnimal = masterOfAnimal;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(TypeAnimal typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public Set<Osmotr> getOsmotrs() {
        return osmotrs;
    }

    public void setOsmotrs(Set<Osmotr> osmotrs) {
        this.osmotrs = osmotrs;
    }
}
