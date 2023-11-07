package com.softserve.practicaltask05_oop_part1;

import com.softserve.practicaltask05_oop_part1.practask02.Car2;
import com.softserve.practicaltask05_oop_part1.practask02.Sedan;
import com.softserve.practicaltask05_oop_part1.practask02.Truck;
import com.softserve.practicaltask05_oop_part1.practask03.ColorLine;
import com.softserve.practicaltask05_oop_part1.practask03.Line;
import com.softserve.practicaltask05_oop_part1.practask03.Point;

public class PracticalTask05Demo {
    public static void main(String[] args) {

//        Task 02 Create abstract class called Car with:
//          • fields: model, maxSpeed and yearOfProduction;
//          • methods: run() and stop().
//        Create classes called Truck and Sedan which extend class Car.
//        In main() method create array of Car’s objects. Add to this array some
//        trucks and sedans and print info about it.

        Car2 truck1 = new Truck("Toyota", 200, 2020);
        Car2 truck2 = new Truck("BMW", 150, 2018);
        Car2 sedan1 = new Sedan("Audi", 220, 2016);
        Car2 sedan2 = new Sedan("Mazda", 250, 2008);
        Car2 sedan3 = new Sedan("Fiat", 170, 2021);

        Car2[] array = new Car2[]{truck1, truck2, sedan1, sedan2, sedan3};
        for (int i = 0; i < array.length; i++) {
            array[i].run();
            array[i].stop();
        }

//        Task 03 . Create three classes − Point, Line, and ColorLine:
//          • The "Point" class should have attributes "x" and "y".
//          • The "Line" class should contain two objects of the "Point" class.
//          • The "ColorLine" class should have an additional attribute "color", which extends the "Line" class.
//        Override toString() method and define print() method in every classes.
//        In main() method create an array of Line objects and add some instances of both Line and
//        ColorLine to it. Call the print() method for all objects in the array

        Line line1 = new Line(new Point(1, 1), new Point(2, 2));
        Line colorLine1 = new ColorLine(new Point(3, 3), new Point(4, 4), "Black");
        Line line2 = new Line(new Point(5, 5), new Point(8, 8));
        Line colorLine2 = new ColorLine(new Point(6, 6), new Point(7, 7), "Red");
        Line colorLine3 = new ColorLine(new Point(9, 9), new Point(10, 10), "Blue");
        Line[] arrayLine = new Line[]{line1, colorLine1, line2, colorLine2, colorLine3};
        for (Line line : arrayLine) {
            line.print();
        }
    }
}
