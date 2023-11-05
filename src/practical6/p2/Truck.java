package practical6.p2;

public class Truck extends Car{
    String model;
    int year;


    public Truck(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    void run() {
        System.out.println("Truck is big");

    }

    @Override
    void stop() {
        System.out.println("Sedan has a long braking distance");

    }
}
