package homework7.h2;

public class Bas extends GroundVehicle{
    private String rout;

    public Bas(String rout) {
        this.rout = rout;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    @Override
    public void drive() {

    }
}
