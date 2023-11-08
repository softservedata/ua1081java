package homework7.h1;

import java.util.Comparator;

public abstract class Employee implements Comparable<Employee>, Payment{
    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                '}';
    }
    public int compareTo(Employee emp) {
        return emp.calculatePay() - calculatePay();

    }
}
