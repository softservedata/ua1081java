/*
  Flower bed is shaped like a circle.
  Calculate its perimeter and area.
  Input the radius from the console, and output obtained results.
*/

package com.softserve.homework01.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Class allows to calculate the area and parameter of a circle based on a given radius.
 * */
public class CircleParametersCalculation {

    /**
     * Calculates the circle area by the circle radius and returns a value of the specified precision.
     * */
    public double circleArea (double radius, String precision) {
        DecimalFormat df = new DecimalFormat(precision);
        String area = df.format(Math.PI * radius * radius);
        return Double.parseDouble(area);
    }

    /**
     * Calculates the circle perimeter by the circle radius and returns a value of the specified precision.
     * */
    public double circlePerimeter (double radius, String precision) {
        DecimalFormat df = new DecimalFormat(precision);
        String perimeter = df.format(2 * Math.PI * radius);
        return Double.parseDouble(perimeter);
    }

    public static void main(String[] args) throws IOException {
        CircleParametersCalculation cpc = new CircleParametersCalculation();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program allows you to calculate the area or perimeter of a circle. " +
                "\nWhat parameter do you want to calculate: area, perimeter or both?");
        String parameterName = br.readLine();

        if (parameterName.equalsIgnoreCase("area")) {
            System.out.println("Please enter the circle radius value:");
            double radius = Double.parseDouble(br.readLine());
            System.out.println("Please enter the precision value in the format 0.[number of decimal places] (e.g., 0.000):");
            String precision = br.readLine();
            System.out.println("Please enter the units of measurement:");
            String units = br.readLine();
            System.out.println("Circle area is " + cpc.circleArea(radius, precision) + " " + units + ".");
        } else if (parameterName.equalsIgnoreCase("perimeter")) {
            System.out.println("Please enter the circle radius value");
            double radius = Double.parseDouble(br.readLine());
            System.out.println("Please enter the precision value in the format 0.[number of decimal places] (e.g., 0.000):");
            String precision = br.readLine();
            System.out.println("Please enter the units of measurement:");
            String units = br.readLine();
            System.out.println("Circle perimeter is " + cpc.circlePerimeter(radius, precision) + " " + units + ".");
        } else if (parameterName.equalsIgnoreCase("both")) {
            System.out.println("Please enter the circle radius value");
            double radius = Double.parseDouble(br.readLine());
            System.out.println("Please enter the precision value in the format 0.[number of decimal places] (e.g., 0.000):");
            String precision = br.readLine();
            System.out.println("Please enter the units of measurement:");
            String units = br.readLine();
            System.out.println("Circle area is " + cpc.circleArea(radius, precision) + " " + units + "." +
                    "\nCircle perimeter is " + cpc.circlePerimeter(radius, precision) + " " + units + ".");
        } else {
            System.out.println("Please check the entered value and try again.");
        }
    }
}
