package com.softserve.practicaltask09_map.task01;

import com.softserve.homework09_set.task03.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private String position;
    private double salary;
    private String dateOfBirth;

    public Employee(String name, String position, double salary, String dateOfBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(String name) {
        this.name = name;

    }

    public Employee() {

    }

    public Employee(String s, String value) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, dateOfBirth);
    }

    @Override
    public int compareTo(Employee e) {
        return getName().compareTo(e.getName());
    }

    public static class ByName implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }


}
