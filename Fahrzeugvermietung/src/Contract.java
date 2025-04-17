import vehicles.Vehicle;

import java.time.LocalDate;
import java.util.UUID;

 public interface Contract {
     PersonImpl getPerson();

     Vehicle getVehicle();

     LocalDate getStartDate();

     LocalDate getEndDate();

     void setPerson(PersonImpl person);

     void setVehicle(Vehicle vehicle);

     void setStartDate(LocalDate startDate);

     void setEndDate(LocalDate endDate);

     String getTerms();

     void setTerms(String terms);

     UUID getContractId();

     void setContractId(UUID contractId);
 }
    

