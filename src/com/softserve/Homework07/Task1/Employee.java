package com.softserve.Homework07.Task1;

public  abstract class Employee implements Comparable<Employee>, Payment{
    private  String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    @Override
    public String toString() {
        return  employeeId;
    }


}
