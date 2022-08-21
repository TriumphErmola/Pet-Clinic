package springguru.petclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

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
}
