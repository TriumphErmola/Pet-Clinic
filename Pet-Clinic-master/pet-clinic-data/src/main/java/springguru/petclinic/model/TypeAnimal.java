package springguru.petclinic.model;

public class TypeAnimal extends BaseEntity{

    private String TypeName;

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }
}
