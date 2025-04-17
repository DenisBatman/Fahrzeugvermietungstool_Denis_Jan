import java.time.LocalDate;
import java.util.UUID;

public class PersonImpl implements Person {
    private String firstName;
    private String lastName;
    private LocalDate birthYear;
    private UUID id;

    public PersonImpl(String firstName, String lastName, LocalDate birthYear) {
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
