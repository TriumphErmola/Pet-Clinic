package springguru.petclinic.model;

import java.time.LocalDate;

public class PetEmployee extends Human{

    private TypeAnimal typeAnimal;
    private MasterOfAnimal masterOfAnimal;
    private LocalDate birthDataAnimal;

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(TypeAnimal typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public MasterOfAnimal getMasterOfAnimal() {
        return masterOfAnimal;
    }

    public void setMasterOfAnimal(MasterOfAnimal masterOfAnimal) {
        this.masterOfAnimal = masterOfAnimal;
    }

    public LocalDate getBirthDataAnimal() {
        return birthDataAnimal;
    }

    public void setBirthDataAnimal(LocalDate birthDataAnimal) {
        this.birthDataAnimal = birthDataAnimal;
    }
}
