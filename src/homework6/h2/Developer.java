package homework6.h2;

import java.util.Arrays;

public class Developer extends Employee {
    String position;

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s " + "Salary: \u20B4 %.2f.", name,age,position,salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Roman",30,33333.0);
        Developer developer= new Developer("Oleg",35, 35353.0, "Average java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());



    }


}
