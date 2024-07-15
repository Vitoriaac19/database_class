package School_Parking_Spot;

import School_Parking_Spot.vehicles.Car;
import School_Parking_Spot.vehicles.Motorcycle;

import javax.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne(mappedBy = "teacher")
    private Spot spot;

    @OneToOne(mappedBy = "teacher")
    private Car car;

    @OneToOne(mappedBy = "teacher")
    private Motorcycle motorcycle;


    //Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

