package com.softserve.edu.HW7.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = {new SalariedEmployee("Max", 2000, "SSN1"),
                        new SalariedEmployee("Leo", 2200, "SSN2"),
                        new ContractEmployee("Vincent", new int[]{3, 2, 1}, "FTIM1"),
                        new ContractEmployee("Oliver", new int[]{4, 5, 6}, "FTIM2")};

                        
        for(int i = 0; i<arr.length; i++){
            arr[i].calculatePay();
            //System.out.println(arr[i]);
        }

        System.out.println("\nUNSORTED ARRAY: \n");
        for(Employee emp : arr){
            System.out.printf("Employee ID: " + emp.getEmployeeId() +
                            "; Average Monthly Wage: " + emp.getTheAverageMonthlySalary() + "\n");
        }
        Arrays.sort(arr, Comparator.comparingInt(Employee::getTheAverageMonthlySalary).reversed());

        System.out.println("\nSORTED ARRAY: \n");
        for(Employee emp : arr){
            System.out.printf(" Employee ID: " + emp.getEmployeeId() +
                            "; Average Monthly Wage: " + emp.getTheAverageMonthlySalary() + "\n");
        }
    }
    
}
