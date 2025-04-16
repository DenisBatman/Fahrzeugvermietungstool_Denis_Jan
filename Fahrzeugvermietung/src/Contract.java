import java.time.LocalDate;
import java.util.UUID;

public class Contract {
    private Person person;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private String terms;
    private UUID contractId;

    public Contract(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate, String terms) {
        this.person = person;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.terms = terms;
        this.contractId = UUID.randomUUID();
    }

    public Person getPerson() {
        return person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    // Weitere Getter/Setter optional
}
