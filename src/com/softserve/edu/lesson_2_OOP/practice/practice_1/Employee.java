package com.softserve.edu.lesson_2_OOP.practice.practice_1;

public class Employee {
    private String name;
    private double rate;
    private int hours;

    private static double totalSum;

    public static double getSalary(Employee empl) {
        double salary = empl.getRate() * empl.getHours();
        totalSum = totalSum + salary;
        return salary;
    }

    public static double getBonuses(double salary){
        double bonuses = salary * 0.10;
        totalSum = totalSum + bonuses;
        return  bonuses;
    }

    public Employee() {
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;

    }

    public static void totalSalary(){
        double totalSum1 = Employee.getTotalSum();
        String total_res = String.format("%.2f", totalSum1);
        System.out.println("$" + total_res);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }


}
