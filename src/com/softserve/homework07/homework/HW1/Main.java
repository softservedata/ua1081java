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

        Arrays.sort(employeesArray);

        for (Employee employee : employeesArray) {
            System.out.println(employee.toString());
        }
    }
}
