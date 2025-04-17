import java.time.LocalDate;
import java.util.UUID;

 public interface Person {
     UUID getId();

     LocalDate getBirthYear();

     String getFirstName();

     void setFirstName(String firstName);

     String getLastName();

     void setLastName(String lastName);

     void setBirthYear(LocalDate birthYear);

     void setId(UUID id);

 }



