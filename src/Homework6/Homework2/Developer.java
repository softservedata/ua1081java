package Homework6.Homework2;

public class Developer extends Employee {
    private final String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: ₴ %.2f", name, age, position, salary);
    }
}
