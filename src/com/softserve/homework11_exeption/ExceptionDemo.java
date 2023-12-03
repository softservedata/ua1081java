package com.softserve.homework11_exeption;

import com.softserve.homework11_exeption.task01.ArithmeticOperation;
import com.softserve.homework11_exeption.task02.NumberRange;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {

//        Task 01 Create div() method, which calculates the dividing of two double type numbers. In main()
//        method input 2 double numbers and call this method. Catch all exceptions.

        System.out.println(ArithmeticOperation.div(5, 0));

//        Task 02 Create a method readNumber(int start, int end), that read from console integer number
//        and return it, if it is in the range [start...end]. If an invalid number or non-number text is
//        read, the method should throw an exception.
//                Using this method write a method main(), that must enter 10 numbers:
//        a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100


        System.out.println(NumberRange.readNumber(1, 10));
        System.out.println(NumberRange.myMain(1, 100));

    }
}
