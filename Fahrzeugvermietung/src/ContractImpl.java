import vehicles.Vehicle;

import java.time.LocalDate;
import java.util.UUID;

public class ContractImpl implements Contract {
    private PersonImpl person;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private String terms;
    private UUID contractId;

    public ContractImpl(PersonImpl person, Vehicle vehicle, LocalDate startDate, LocalDate endDate, String terms) {
        this.person = person;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.terms = terms;
        this.contractId = UUID.randomUUID();
    }

    public PersonImpl getPerson() {
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

    public void setPerson(PersonImpl person) {
        this.person = person;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public UUID getContractId() {
        return contractId;
    }

    public void setContractId(UUID contractId) {
        this.contractId = contractId;
    }
}
