package PracticalTasks6.Practical2;

public class Sedan extends Car{
    private final int numberOfSeats;

    public Sedan(String model, int maxSpeed, int yearOfProduction, int numberOfSeats) {
        super(model, maxSpeed, yearOfProduction);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
