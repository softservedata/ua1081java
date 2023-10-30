package practical2.p2;

import java.util.Scanner;

public class Employee {
    static private double totalSum;
    static private double getSalary;
    static private double salaryBonus;

    private String name;
    private int rate;
    private int hours;

    public Employee() {
        totalSum += getSalary();
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        totalSum += getSalary();
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    static public void getInfo(Employee employee){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        employee.setName(name);
        System.out.println("Input rate for " + employee.getName());
        int rate = scanner.nextInt();
        employee.setRate(rate);
        System.out.println("Input hours for " + employee.getName());
        int hour = scanner.nextInt();
        employee.setHours(hour) ;
    }
    static public double totalSum(){
        return getSalary;
    }
    public double getSalary(){
       // System.out.println(employee.getRate()*employee.getHours());
        return (double) (getSalary =(getRate()*getHours()));
    }
    public static  int getBonuses(Employee employee){
        return (int) (salaryBonus = (employee.getRate()*employee.getHours())/10);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
