import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthYear;
    private UUID id;

    public Person(String firstName, String lastName, LocalDate birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    // Weitere Getter/Setter optional
}
