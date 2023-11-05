package practical6.p2;

public class Sedan extends Car{
    String model;
    int year;

    public Sedan(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    void run() {
        System.out.println("Sedan is comfortable");
    }

    @Override
    void stop() {
        System.out.println("Sedan has a short braking distance");
    }
}
