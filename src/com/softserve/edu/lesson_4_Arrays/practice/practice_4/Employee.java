package com.softserve.edu.lesson_4_Arrays.practice.practice_4;

public class Employee {
    private String name;
    private int departmentNum;
    private double salsary;

    public Employee() {
    }

    public Employee(String name, int departmentNum, double salsary) {
        this.name = name;
        this.departmentNum = departmentNum;
        this.salsary = salsary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }

    public double getSalsary() {
        return salsary;
    }

    public void setSalsary(double salsary) {
        this.salsary = salsary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNum=" + departmentNum +
                ", salsary=" + salsary +
                '}';
    }
}
