package homework5.h3;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private String type;
    private int year;
    private double engineCapacity;

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }






        }




















