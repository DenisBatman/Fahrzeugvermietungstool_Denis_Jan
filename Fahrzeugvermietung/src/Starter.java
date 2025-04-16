import vehicles.*;
import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {
        VehicleRentalManager manager = new VehicleRentalManager();

        // Test persons
        Person p1 = new Person("Denis", "Suciu", LocalDate.of(2006, 9, 10));  // 18 years old
        Person p2 = new Person("Jan", "Ludwig", LocalDate.of(2008, 4, 12)); // 16 years old (too young)

        manager.addPerson(p1);
        manager.addPerson(p2);

        // Test vehicles
        Vehicle car1 = new Kleinwagen("BMW", "M3 E46", 343 , 5, "ZH1234", true, false, 410 );
        Vehicle car2 = new Luxuswagen("Mercedes", "S-Class", 250, 4, "ZH5678", true, true, "Premium");

        manager.addVehicle(car1);
        manager.addVehicle(car2);

        // Valid contract
        Contract validContract = new Contract(p1, car1, LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 10), "Standard terms");

        try {
            manager.createContract(validContract);
            System.out.println("Contract 1 created successfully.");
        } catch (Exception e) {
            System.out.println("Error in Contract 1: " + e.getMessage());
        }

        // Invalid contract – person too young
        Contract underageContract = new Contract(p2, car2, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5), "Luxury terms");

        try {
            manager.createContract(underageContract);
            System.out.println("Contract 2 created successfully.");
        } catch (Exception e) {
            System.out.println("Error in Contract 2: " + e.getMessage());
        }

        // Denylist the person
        manager.addPersonToDenylist(p1.getId());

        // Invalid contract – person is denylisted
        Contract deniedContract = new Contract(p1, car2, LocalDate.of(2025, 6, 10), LocalDate.of(2025, 6, 15), "Denylist test");

        try {
            manager.createContract(deniedContract);
            System.out.println("Contract 3 created successfully.");
        } catch (Exception e) {
            System.out.println("Error in Contract 3: " + e.getMessage());
        }

        // Invalid contract – overlaps with existing contract
        Contract overlappingContract = new Contract(p1, car1, LocalDate.of(2025, 5, 5), LocalDate.of(2025, 5, 12), "Overlap test");

        try {
            manager.createContract(overlappingContract);
            System.out.println("Contract 4 created successfully.");
        } catch (Exception e) {
            System.out.println("Error in Contract 4: " + e.getMessage());
        }
    }
}
