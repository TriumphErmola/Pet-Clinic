package springguru.petclinic.model;

import java.time.LocalDate;


public class Osmotr extends BaseEntity {

    private LocalDate date;
    private String description;
    private HomeAnimal homeAnimal;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HomeAnimal getHomeAnimal() {
        return homeAnimal;
    }

    public void setHomeAnimal(HomeAnimal homeAnimal) {
        this.homeAnimal = homeAnimal;
    }
}
