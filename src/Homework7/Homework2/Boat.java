package Homework7.Homework2;

public class Boat extends WaterVehicle {
    int volume;

    public Boat(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {

    }
}
