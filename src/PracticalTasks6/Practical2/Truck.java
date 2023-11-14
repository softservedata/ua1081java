package PracticalTasks6.Practical2;

public class Truck extends Car{
    private final int cargoCapacity;

    public Truck(String model, int maxSpeed, int yearOfProduction, int cargoCapacity) {
        super(model, maxSpeed, yearOfProduction);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
