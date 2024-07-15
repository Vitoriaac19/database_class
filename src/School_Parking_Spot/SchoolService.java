package School_Parking_Spot;

import School_Parking_Spot.vehicles.Car;
import School_Parking_Spot.vehicles.Motorcycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SchoolService {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

    public void createTeacher(String name) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Teacher teacher = new Teacher();
        teacher.setName(name);
        em.persist(teacher);
        em.getTransaction().commit();
        em.close();
    }

    public void createSpot(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Spot spot = new Spot();

        //finding teacher with the id given
        Teacher teacher = em.find(Teacher.class, id);
        spot.setTeacher(teacher);
        em.persist(spot);
        em.getTransaction().commit();
        em.close();
    }

    public void createCar(Integer id, String licensePlate, String model) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Car car = new Car();
        car.setLicensePlate(licensePlate);
        car.setModel(model);

        //finding teacher with the id given
        Teacher teacher = em.find(Teacher.class, id);
        car.setTeacher(teacher);

        em.persist(car);
        em.getTransaction().commit();
        em.close();
    }

    public void createMotorcycle(Integer id, String licensePlate, String model) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setLicensePlate(licensePlate);
        motorcycle.setModel(model);

        //finding teacher with the id given
        Teacher teacher = em.find(Teacher.class, id);
        motorcycle.setTeacher(teacher);

        em.persist(motorcycle);
        em.getTransaction().commit();
        em.close();
    }

}
