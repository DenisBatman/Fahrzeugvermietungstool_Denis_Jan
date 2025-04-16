import vehicles.Vehicle;

import exceptions.DenylistedPersonException;
import exceptions.LeaseLengthCollisionException;
import exceptions.MinorAgeException;

import java.util.*;

public class VehicleRentalManager {
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();
    private List<Person> persons = new ArrayList<>();
    private Set<UUID> denylist = new HashSet<>();
    private List<Contract> contracts = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void addPersonToDenylist(UUID personId) {
        denylist.add(personId);
    }

    public boolean isPersonDenied(UUID personId) {
        return denylist.contains(personId);
    }

    public void createContract(Contract contract) {
        if (isPersonDenied(contract.getPerson().getId())) {
            throw new DenylistedPersonException("Person is on the deny list.");
        } else if (!isOfLegalAge(contract.getPerson(), contract.getVehicle())) {
            throw new MinorAgeException("Person is too young to rent this vehicle.");
        } else if (hasDateCollision(contract)) {
            throw new LeaseLengthCollisionException("The rental dates overlap with an existing contract.");
        }

        contracts.add(contract);
    }

    private boolean isOfLegalAge(Person person, Vehicle vehicle) {
        int currentYear = java.time.LocalDate.now().getYear();
        return currentYear - person.getBirthYear().getYear() >= 18;
    }

    private boolean hasDateCollision(Contract newContract) {
        return contracts.stream().anyMatch(existing ->
                existing.getVehicle().equals(newContract.getVehicle()) &&
                        !(newContract.getEndDate().isBefore(existing.getStartDate()) ||
                                newContract.getStartDate().isAfter(existing.getEndDate()))
        );

    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public Set<UUID> getDenylist() {
        return denylist;
    }
}
