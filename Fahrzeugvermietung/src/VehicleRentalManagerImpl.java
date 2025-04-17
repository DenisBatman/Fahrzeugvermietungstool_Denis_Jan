import vehicles.Vehicle;

import exceptions.DenylistedPersonException;
import exceptions.LeaseLengthCollisionException;
import exceptions.MinorAgeException;

import java.util.*;

public class VehicleRentalManagerImpl implements VehicleRentalManager {
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();
    private List<PersonImpl> persons = new ArrayList<>();
    private Set<UUID> denyList = new HashSet<>();
    private List<ContractImpl> contracts = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addPerson(PersonImpl person) {
        persons.add(person);
    }

    public void addPersonToDenyList(UUID personId) {
        denyList.add(personId);
    }

    public boolean isPersonDenied(UUID personId) {
        return denyList.contains(personId);
    }

    public void createContract(ContractImpl contract) {
        if (isPersonDenied(contract.getPerson().getId())) {
            throw new DenylistedPersonException("Person is on the deny list.");
        } else if (!isOfLegalAge(contract.getPerson(), contract.getVehicle())) {
            throw new MinorAgeException("Person is too young to rent this vehicle.");
        } else if (hasDateCollision(contract)) {
            throw new LeaseLengthCollisionException("The rental dates overlap with an existing contract.");
        }

        contracts.add(contract);
    }

    private boolean isOfLegalAge(PersonImpl person, Vehicle vehicle) {
        int currentYear = java.time.LocalDate.now().getYear();
        return currentYear - person.getBirthYear().getYear() >= 18;
    }

    private boolean hasDateCollision(ContractImpl newContract) {
        return contracts.stream().anyMatch(existing ->
                existing.getVehicle().equals(newContract.getVehicle()) &&
                        !(newContract.getEndDate().isBefore(existing.getStartDate()) ||
                                newContract.getStartDate().isAfter(existing.getEndDate()))
        );

    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<PersonImpl> getPersons() {
        return persons;
    }

    public List<ContractImpl> getContracts() {
        return contracts;
    }

    public Set<UUID> getDenyList() {
        return denyList;
    }
}
