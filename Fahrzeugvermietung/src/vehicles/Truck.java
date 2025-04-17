package vehicles;

public class Truck extends Vehicle {
    private double maxLoadWeight;
    private double loadVolume;

    public Truck(String brand, String model, int powerHP, int numberOfSeats, String licensePlate, boolean isAvailable,
                 double maxLoadWeight, double loadVolume) {
        super(brand, model, powerHP, numberOfSeats, licensePlate, isAvailable);
        this.maxLoadWeight = maxLoadWeight;
        this.loadVolume = loadVolume;
    }
}
