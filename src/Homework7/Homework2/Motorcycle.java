package Homework7.Homework2;

public class Motorcycle extends GroundVehicle {
    int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
