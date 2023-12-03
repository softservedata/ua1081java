package com.softserve.practicaltask11_exeption;

import com.softserve.practicaltask11_exeption.task01.Rectangle;
import com.softserve.practicaltask11_exeption.task02.ColorException;
import com.softserve.practicaltask11_exeption.task02.Plant;
import com.softserve.practicaltask11_exeption.task02.SizeException;
import com.softserve.practicaltask11_exeption.task02.TypeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticalTask11Demo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        try {
            System.out.println("Enter integer parameters 'a' for rectangle: ");
            a = scanner.nextInt();
            System.out.println("Enter integer parameters 'b' for rectangle: ");
            b = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("You entered not integer number");
        }
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Parameters should not be zero");
        } else {
            System.out.println("Square of rectangle: " + Rectangle.squareRectangle(a, b));
        }

        int[] size = {2, 5, 7, 8, 101};
        String[] colors = {"red", "green", "blue", "yellow1", "purple"};
        String[] types = {"flower", "tree", "shrub1", "grass", "christmastree"};
        for (int i = 0; i < 5; i++) {
            try {
                Plant pl = new Plant(size[i], colors[i], types[i]);
                System.out.println(pl);
            } catch (ColorException | TypeException | SizeException e) {
                System.err.println(e.getMessage() + "\n");
//                e.printStackTrace();
            }
        }

//        try {
//            Plant pl1 = new Plant(5, "tree", "blue");
//            System.out.println(pl1);
//        } catch (ColorException | TypeException e) {
//            System.err.println(e.getMessage() + "\n");
//        }


    }
}
