package springguru.petclinic.model;

import java.time.LocalDate;

public class HomeAnimal extends BaseEntity{

    private String name;
    private MasterOfAnimal masterOfAnimal;
    private LocalDate birthday;
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
