package practical7.p2;

public class Cleaner extends Staff{
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am: " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("Salary " + TYPE_PERSON + " is 9000");
    }
}
