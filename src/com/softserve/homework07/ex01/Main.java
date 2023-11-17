package com.softserve.homework07.ex01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("1", "Alex", "yes", 5.5, 120),
                new SalariedEmployee("2", "Karen","yes", 650),
                new ContractEmployee("3", "Tray", "yes", 7.5, 125),
                new SalariedEmployee("4", "Eliza","yes", 780)
        };

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees);

        System.out.println(Arrays.toString(employees));
    }
}
