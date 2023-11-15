package Homework7.Homework2;

public class Liner extends WaterVehicle {
    int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
