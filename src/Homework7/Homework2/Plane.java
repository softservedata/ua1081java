package Homework7.Homework2;

public class Plane extends FlyingVehicle {
    int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
