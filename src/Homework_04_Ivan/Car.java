/*
3.* Create class called Car with fields: type, year of production and engine capacity.
• Create and initialize in main() method four instances of class Car.
• Output result for cars:
o certain model year (enter year in the console);
o sorted cars by the field “year of production ”.
 */

package Homework_04_Ivan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Car {
    public String type;
    public int year;
    public double engine;


    public Car(String type, int year, double engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngine() {
        return engine;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2012, 3.0);
        Car car2 = new Car("BMW", 1999, 2.5);
        Car car3 = new Car("Lexus", 2022, 2.0);
        Car car4 = new Car("Audi", 2016, 3.5);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of production (1999, 2012, 2016, 2022): ");
        int yearOfProduction = scanner.nextInt();
        boolean found = false;

        // filtering by year and printing
        for (Car car : cars) {
            if (car.getYear() == yearOfProduction) {
                System.out.println("Car: " + car.getType() + ", Year: " + car.getYear() + ", Engine:" + car.getEngine());
                found = true;
            }
            if (!found) {
                System.out.println("No cars found from the year" + yearOfProduction);
            }
        }
        // sorting cars by year of production
        cars.sort(Comparator.comparingInt(Car::getYear));
        System.out.println("\nSorted Cars:");
        for (Car car : cars) {
            System.out.println("Car: " + car.getType() + ", Year: " + car.getYear() + ", Engine:" + car.getEngine());
        }
    }
}
