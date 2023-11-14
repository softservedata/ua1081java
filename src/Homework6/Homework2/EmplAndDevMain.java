package Homework6.Homework2;

public class EmplAndDevMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Boris", 45, 15030.60);
        Developer developer = new Developer("Taras", 32, "Average Java Developer", 32735.35);

        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
