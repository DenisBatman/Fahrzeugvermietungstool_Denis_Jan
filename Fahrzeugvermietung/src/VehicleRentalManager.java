import vehicles.Vehicle;
import java.util.*;

public interface VehicleRentalManager {
    void addVehicle(Vehicle vehicle);

    void addPerson(PersonImpl person);

    void addPersonToDenyList(UUID personId);

    boolean isPersonDenied(UUID personId);

    void createContract(ContractImpl contract);

    List<Vehicle> getVehicles();

    List<PersonImpl> getPersons();

    List<ContractImpl> getContracts();

    Set<UUID> getDenyList();
}
