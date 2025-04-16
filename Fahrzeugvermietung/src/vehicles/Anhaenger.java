package vehicles;

public class Anhaenger extends Vehicle {
    private String type;
    private double maxLoad;
    private boolean isBraked;

    public Anhaenger(String brand, String model, int powerHP, int numberOfSeats, String licensePlate, boolean isAvailable,
                     String type, double maxLoad, boolean isBraked) {
        super(brand, model, powerHP, numberOfSeats, licensePlate, isAvailable);
        this.type = type;
        this.maxLoad = maxLoad;
        this.isBraked = isBraked;
    }
}
