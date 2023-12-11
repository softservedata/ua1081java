package com.softserve.edu.HW5;

public class Car implements Comparable<Car> {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    Car(){
        this.type = "Unknown Type";
        this.yearOfProduction = 1900;
        this.engineCapacity = 0.0;
    }

    Car(String type, double engineCapacity){
        this.type = type;
        this.yearOfProduction = 1900;
        this.engineCapacity = engineCapacity;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    
    @Override
    public String toString() {
        return "MyClass{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction+ '\'' +
                ", engineCapacity=" + engineCapacity+
                '}';
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.yearOfProduction, other.yearOfProduction);
    }
    
}
