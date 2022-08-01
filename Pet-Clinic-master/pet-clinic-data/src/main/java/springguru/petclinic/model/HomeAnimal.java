package springguru.petclinic.model;

public class HomeAnimal extends BaseEntity{

    private String name;

    public HomeAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
