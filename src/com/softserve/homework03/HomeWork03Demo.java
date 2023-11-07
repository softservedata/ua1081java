package com.softserve.homework03;

import com.softserve.homework03.task01.Task01;
import com.softserve.homework03.task02.Task02;
import com.softserve.homework03.task03.Task03;
import com.softserve.homework03.task04.Faculty;
import com.softserve.homework03.task05.Dog;

import java.util.Scanner;

public class HomeWork03Demo {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Task 01  Write a program that prompts the user to input three float numbers. The program should check if all three numbers
//        fall within the range of -5 and 5 (inclusive). If all three numbers are within this range, the program should output a
//        message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the specified range, the
//        program should output a message indicating that not all numbers belong to the range [-5, 5]. Please note that the range
//        includes the values -5 and 5 as well.

        Task01.enterNumbers();

//        Task 02 Write a program that prompts the user to input three integer numbers. The program should determine the
//        maximum and minimum values among the three numbers and output them to the console.

        Task02.findMinMaxNumbers();

//        Task 03 Write a program that prompts the user to input a number representing an HTTP error (e.g., 400, 401, 402, etc.). The
//        program should use an enum called HTTPError to map the input number to the corresponding name of the error and
//                output it.

        Task03.displayErrorName();

//        Task 04 Create a class named Faculty and input the information about the number of students (using the console) and the
//        current season (using enum). Each season must have a name in English (use the constructor). In the main() method,
//        check the correctness of the code. Here, a season can signify a time of year (winter, spring, summer, autumn). In the
//        context of this task, it can correspond to a certain semester. For example, autumn could be the first semester, spring -
//        the second, and summer - the vacation period. Winter may correspond to the period of winter exams.

        Faculty.enterNumberOfStudents();


//        Task 05 Create a class called Dog that has the following fields: name, breed, age.
//          • Declare enum for field breed.
//          • In main() method create create three instances of type Dog.
//              o Check if there are no two dogs with the same name;
//              o Output the name and the breed of the oldest dog.

        Dog dog1 = new Dog("Bill", 7);
        dog1.setBREED("CORGI");

        Dog dog2 = new Dog("Poll", 8);
        dog2.setBREED("POODLE");

        Dog dog3 = new Dog("Jinny", 12);
        dog3.setBREED("SHIH-TZU");

        Dog.displayBreedOldestDog(dog1, dog2, dog3);
        Dog.compareSameName(dog1, dog2);
    }
}
