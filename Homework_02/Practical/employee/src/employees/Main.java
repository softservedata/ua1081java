package employees;

import java.util.Scanner;

import static employees.Employee.printEmployeeSalary;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee.promptParameters(employee1);
        Employee.setTotalSum(Employee.getTotalSum()+ employee1.getSalary());

        Employee employee2 = new Employee();
        Employee.promptParameters(employee2);
        Employee.setTotalSum(Employee.getTotalSum()+ employee2.getSalary());

        Employee employee3 = new Employee();
        Employee.promptParameters(employee3);
        Employee.setTotalSum(Employee.getTotalSum()+ employee3.getSalary());

        System.out.println("Total salary = " + Employee.getTotalSum());
    }


}