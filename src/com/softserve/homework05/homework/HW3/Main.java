package com.softserve.homework05.homework.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car mazdaCar = new Car("Mazda", 2021, 2.5);
        Car fordCar = new Car("Ford", 1983, 1.4);
        Car volvoCar = new Car("Volvo", 2012, 1.6);
        Car volkswagenCar = new Car("Volkswagen", 2008, 2.0);

        Car[] carsArray = new Car[] {mazdaCar, fordCar, volvoCar, volkswagenCar};

        //TASK 1. Output certain model year  (enter year in the console).
        //I didn't really understand the task, so I made two options.

        //Option 1. If it was required to display the years of production of different models.
        for (Car model : carsArray) {
            System.out.println("Car model: " + model.getType() + ". Year of production: " + model.getProductionYear() + ".");
        }

        //Option 2. If it was necessary to display the name of the model based on the entered year of production of the car.
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter the year of production of the car: ");
        int productionYearInput = scanner.nextInt();
        String carModel = "";
        for (Car model : carsArray) {
            if (productionYearInput != model.getProductionYear()) {
                continue;
            }
            carModel = model.getType();

        }
        System.out.println(carModel.equals("") ? "We do not have cars produced in " + productionYearInput + "." :
                "The model of the car produced in " + productionYearInput + " is " + carModel + "." );

        //TASK 2. Output sorted cars by the field “year of production ”.
        Car tmp;
        for (int i = 0; i < carsArray.length - 1; i++) {
            for (int j = i + 1; j < carsArray.length; j++) {
                if (carsArray[i].getProductionYear() > carsArray[j].getProductionYear()) {
                    tmp = carsArray[i];
                    carsArray[i] = carsArray[j];
                    carsArray[j] = tmp;
                }
            }
        }
        System.out.println("\nHere is a list of cars available in our fleet, sorted by year of production in ascendence order.");
        for (Car car : carsArray) {
            System.out.println(car.toString());
        }
    }
}
