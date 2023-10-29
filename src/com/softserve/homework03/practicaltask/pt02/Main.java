package com.softserve.homework03.practicaltask.pt02;

public class Main {
    public static void main(String[] args) {

        //First employee created
        Employee emp1 = new Employee();
        emp1.setHours(10);
        emp1.setName("Nataliia");
        emp1.setRate(514.2);

        //Second employee created
        Employee emp2 = new Employee(1054.3, 20);
        emp2.setName("Taras");

        //Third employee created
        Employee emp3 = new Employee("Ostap", 743.7, 40);


        System.out.println(emp1 + "\n\n" + emp2 + "\n\n" + emp3);

        double emp1Total = emp1.getSalary() + emp1.getBonuses();
        double emp2Total = emp2.getSalary() + emp2.getBonuses();
        double emp3Total = emp3.getSalary() + emp3.getBonuses();

        Employee.setTotalSum(emp1Total + emp2Total + emp3Total);

        System.out.println("\nThe total salary (with bonuses) of all employees is " + Employee.getTotalSum() + ".");
    }
}
