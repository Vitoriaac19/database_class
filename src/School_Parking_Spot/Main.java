package School_Parking_Spot;

public class Main {

    public static void main(String[] args) {

        SchoolService schoolService = new SchoolService();

        // Create a new teacher
        // schoolService.createTeacher("John Doe");
        schoolService.createTeacher("Anna Mae");
        schoolService.createTeacher("Jhon Doe");
        schoolService.createSpot(1);
        schoolService.createCar(1, "123", "BMW");
        schoolService.createMotorcycle(2, "123", "Honda");

    }
}
