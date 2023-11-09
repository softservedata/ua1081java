package SoftServPracticalOnline;

import java.util.Scanner;

public class TemperatureConverter {
    private double fahrenheit;

    public double getFahrenheit() {
        fahrenheit = (fahrenheit - 32) / 1.8;
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void output() {
        System.out.println(String.format("%.1f", getFahrenheit()) + "°C");
    }

    public static void main(String[] args) {
        TemperatureConverter degrees = new TemperatureConverter();
        degrees.setFahrenheit(40);
        System.out.print("Degrees of " + degrees.fahrenheit + " °F is ");
        degrees.output();
    }
}
