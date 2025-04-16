package vehicles;

public class Vehicle {
    private String brand;
    private String model;
    private int powerHP;
    private int numberOfSeats;
    private String licensePlate;
    private boolean isAvailable;

    public Vehicle(String brand, String model, int powerHP, int numberOfSeats, String licensePlate, boolean isAvailable) {
        this.brand = brand;
        this.model = model;
        this.powerHP = powerHP;
        this.numberOfSeats = numberOfSeats;
        this.licensePlate = licensePlate;
        this.isAvailable = isAvailable;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerHP() {
        return powerHP;
    }

    public void setPowerHP(int powerHP) {
        this.powerHP = powerHP;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + licensePlate + ")";
    }
}
