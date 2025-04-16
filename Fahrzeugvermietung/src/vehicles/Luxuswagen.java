package vehicles;

public class Luxuswagen extends Vehicle {
    private boolean isConvertible;
    private String classLevel;

    public Luxuswagen(String brand, String model, int powerHP, int numberOfSeats, String licensePlate, boolean isAvailable,
                      boolean isConvertible, String classLevel) {
        super(brand, model, powerHP, numberOfSeats, licensePlate, isAvailable);
        this.isConvertible = isConvertible;
        this.classLevel = classLevel;
    }
}
