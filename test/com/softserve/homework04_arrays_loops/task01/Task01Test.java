package com.softserve.homework04_arrays_loops.task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task01Test {

    @Test
    void testCalcDaysInMonthForTest() {
        int expected = 31;
        int inputMonth = 8;
        int result = Task01.calcDaysInMonthForTest(inputMonth);
        assertEquals(expected, result);
    }

    @Test
    void testSumFirstFiveOrMultiplicationLastFiveForTest() {
        int expected1 = 10;
        int result1 = Task01.sumFirstFiveOrMultiplicationLastFiveForTest(2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertEquals(expected1, result1);
        int expected2 = 32;
        int result2 = Task01.sumFirstFiveOrMultiplicationLastFiveForTest(2, -2, 2, 2, 2, 2, 2, 2, 2, 2);
        assertEquals(expected2, result2);
    }

    @Test
    void testFindPositionOfSecondPositiveNumberForTest() {
        int expected = 2;
        int result = Task01.findPositionOfSecondPositiveNumberForTest(-2, 1, 2, -1, -6);
        assertEquals(expected, result);
    }


    @Test
    void testFindMinValueAndPositionInArrayForTest() {
        int expected = -99;
        int result = Task01.findMinValueAndPositionInArrayForTest(-3, 2, 5, -99, 8);
        assertEquals(expected, result);
    }

    @Test
    void testCalcMultiplicationOfAllEnteredEvenNumbersForTest() {
        int expected = 8;
        int result = Task01.calcMultiplicationOfAllEnteredEvenNumbersForTest(1,5,1,4,2);
        assertEquals(expected, result);
    }
}