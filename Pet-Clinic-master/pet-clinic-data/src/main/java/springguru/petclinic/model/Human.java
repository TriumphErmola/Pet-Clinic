package springguru.petclinic.model;

public class Human extends BaseEntity{

    private String firstName;
    private String secondName;
    private long id;

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

}
