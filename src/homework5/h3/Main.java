package homework5.h3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[]{
                new Car("BMW", 2019, 3.0),
                new Car("Mercedes", 2020, 2.0),
                new Car("Citroen", 2023, 1.6),
                new Car("Seat", 2021, 1.0)};



        System.out.println("Enter year of yor car");
        int year = sc.nextInt();

        for (Car car : cars) {
            if (car.getYear() == year) {
                System.out.println("Your car is: " + car.getType() + " " + car.getEngineCapacity());
            }
        }
        Car temp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        for(Car car: cars){
            System.out.println(car);
        }
    }
}

