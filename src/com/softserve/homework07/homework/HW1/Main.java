package com.softserve.homework07.homework.HW1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee firstSalariedEmployee = new SalariedEmployee("Andrii Panasenko", "HY673ghd63", "635-29-9636", 3425.4);
        ContractEmployee firstContractEmployee = new ContractEmployee("Oleh Petrenko", "ST63k82G64", "635-529-936", 35.7, 192);
        SalariedEmployee secondSalariedEmployee = new SalariedEmployee("Nataliia Kondratenko", "LS673nd6Ye");
        secondSalariedEmployee.setSocialSecurityNumber("827-88-0264");
        secondSalariedEmployee.setFixedMonthlyPayment(6625.34);
        ContractEmployee secondContractEmployee = new ContractEmployee("John Smith", "76KDe84J64");
        secondContractEmployee.setHourlyRate(50.18);
        secondContractEmployee.setFederalTaxIdNumber("736-287-109");
        secondContractEmployee.setHoursWorked(208);
        Employee[] employeesArray = new Employee[] {
                firstSalariedEmployee,
                firstContractEmployee,
                secondSalariedEmployee,
                secondContractEmployee
        };

        for (Employee employee : employeesArray) {
            ((Payment) employee).calculatePay();
        }

        //Sort by averageMonthlySalary (in descending order) using overridden compareTo method (from Employee class)
        //Arrays.sort(employeesArray);

        //Sort by averageMonthlySalary (in descending order) using overridden compare method from static ByAverageSalaryDesc inner class (from Employee class)
        Arrays.sort(employeesArray, new Employee.ByAverageSalaryDesc());

        //Sort by averageMonthlySalary (in ascending order) using overridden compare method from static ByAverageSalaryAsc inner class (from Employee class)
        //Arrays.sort(employeesArray, new Employee.ByAverageSalaryAsc());

        //Sort by name (in ascending order) using overridden compare method from static ByNameAsc inner class (from Employee class)
        //Arrays.sort(employeesArray, new Employee.ByNameAsc());

        //Sort by name (in descending order) using overridden compare method from static ByNameDesc inner class (from Employee class)
        //Arrays.sort(employeesArray, new Employee.ByNameDesc());

        for (Employee employee : employeesArray) {
            System.out.println(employee.toString());
        }

        //Sort by hourlyRate (in ascending order) using overridden compare method from non-static ByHourlyRateAsc inner class (from ContractEmployee class)
        /*
        ContractEmployee[] contractEmployeesArray = new ContractEmployee[] {firstContractEmployee,secondContractEmployee};
        Arrays.sort(contractEmployeesArray, new ContractEmployee(). new ByHourlyRateAsc());
        System.out.println("\n");
        for (Employee employee : contractEmployeesArray) {
            System.out.println(employee.toString());
        }
         */
    }
}
