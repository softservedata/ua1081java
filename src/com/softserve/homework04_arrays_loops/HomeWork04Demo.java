package com.softserve.homework04_arrays_loops;

import com.softserve.homework04_arrays_loops.Task03.Car;
import com.softserve.homework04_arrays_loops.task01.Task01;
import com.softserve.homework04_arrays_loops.task02.Task02;
import com.softserve.homework04_arrays_loops.task04.Task04;

public class HomeWork04Demo {
    public static void main(String[] args) {

//        Task01 Create a program (in different java documents) that prompts the user to enter:
//          • a month number and calculates the number of days in that month based on an array
//        that contains the number of days in each month.
//          • 10 integers numbers and calculates the sum of the first five elements if they are
//        positive, or the product of the last five elements if they are not and output the result.
//          • 5 integer numbers and find:
//              o position of second positive number;
//              o minimum value and its position in the array.
//              o calculate the product of all entered even numbers (exclude 0 from even if entered by user).

        Task01.calcDaysInMonth();
        Task01.sumFirstFiveOrMultiplicationLastFive();
        Task01.findPositionOfSecondPositiveNumber();
        Task01.findMinValueAndPositionInArray();
        Task01.calcMultiplicationOfAllEnteredEvenNumbers();

//        Task 02 Create a do-while loop that prompts the user to enter two numbers and calculates their
//        sum. After displaying the result, the program should ask the user if they want to perform
//        the operation again. If the user inputs a positive response, the loop should repeat;
//        otherwise, it should terminate.

        Task02.calcSumOfTwoNumbers();

//        Task 03 Create class called Car with fields: type, year of production and engine capacity.
//          • Create and initialize in main() method four instances of class Car.
//          • Output result for cars:
//              o certain model year (enter year in the console);
//              o sorted cars by the field “year of production ”.

        Car car1 = new Car("Pickup", 2020, 2.0);
        Car car2 = new Car("Sedan", 2023, 3.6);
        Car car3 = new Car("Truck", 2018, 1.8);
        Car car4 = new Car("Cabriolet", 2020, 5.0);

        Car.findCarByModelYear(car1, car2, car3, car4);
        Car.sortCarsByYearOfProduction(car1, car2, car3, car4);

//        Task 04 Create a program that generates a random number and prompts to the user to guess
//        what the number is. If the user's guess is higher than the random number, the program
//        should display "Too high, try again." If the user's guess is lower than the random number,
//        the program should display "Too low, try again." The program should use a loop that
//        repeats until the user correctly guesses the random number.

        Task04.guessRandomNumber();

    }
}
