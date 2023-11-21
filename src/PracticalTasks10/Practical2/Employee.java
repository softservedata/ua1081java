package PracticalTasks10.Practical2;

public class Employee {
    int id;
    String name;
    String dateOfBirth;
    int salary;
    String position;

    public Employee(int id, String name, String dateOfBirth, int salary, String position) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "ID - " + id +
                ", name - " + name +
                ", date of birth - " + dateOfBirth +
                ", salary - " + salary +
                ", position - " + position;
    }
}
