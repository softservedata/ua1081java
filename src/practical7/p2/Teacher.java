package practical7.p2;

public class Teacher extends Staff{
    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am: " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("Salary " + TYPE_PERSON + " is 17000");;
    }


}
