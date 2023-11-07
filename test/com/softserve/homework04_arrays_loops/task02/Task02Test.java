package com.softserve.homework04_arrays_loops.task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task02Test {

    @Test
    void testCalcSumOfTwoNumbersForTest() {
        double expected = 6.5;
        double result = Task02.calcSumOfTwoNumbersForTest(1, 5.5);
        assertEquals(expected, result);
    }

}