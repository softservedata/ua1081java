package Homework7.Homework1;

abstract class Employee implements Payment {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
}
