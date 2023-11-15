package Homework7.Homework2;

public class Bus extends GroundVehicle {
    String route;

    public Bus(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {

    }
}
