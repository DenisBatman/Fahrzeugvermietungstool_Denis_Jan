package vehicles;

public class Motorhome extends Vehicle {
    private boolean isElectric;
    private boolean hasToilet;
    private boolean hasKitchen;
    private int bedCount;

    public Motorhome(String brand, String model, int powerHP, int numberOfSeats, String licensePlate, boolean isAvailable,
                     boolean isElectric, boolean hasToilet, boolean hasKitchen, int bedCount) {
        super(brand, model, powerHP, numberOfSeats, licensePlate, isAvailable);
        this.isElectric = isElectric;
        this.hasToilet = hasToilet;
        this.hasKitchen = hasKitchen;
        this.bedCount = bedCount;
    }
}
