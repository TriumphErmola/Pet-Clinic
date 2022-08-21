package springguru.petclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "osmotrs")
public class Osmotr extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "home_animal_id")
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
