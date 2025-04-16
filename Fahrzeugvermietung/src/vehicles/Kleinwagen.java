package vehicles;

public class Kleinwagen extends Vehicle {
    private boolean isElectric;
    private int trunkVolume;

    public Kleinwagen(String brand, String model, int powerHP, int numberOfSeats, String licensePlate, boolean isAvailable,
                      boolean isElectric, int trunkVolume) {
        super(brand, model, powerHP, numberOfSeats, licensePlate, isAvailable);
        this.isElectric = isElectric;
        this.trunkVolume = trunkVolume;
    }
}
