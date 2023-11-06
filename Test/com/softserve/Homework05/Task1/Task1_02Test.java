package com.softserve.Homework05.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1_02Test {

    @Test
    void productNumbers() {
        int[] arr ={1,3,3};
        Assertions.assertEquals(9,Task1_02.productNumbers(arr));
    }
    @Test
    void productWithPositiveNumbers() {
        int[] arr ={2,4,7};
        Assertions.assertEquals(Integer.MIN_VALUE,Task1_02.productNumbers(arr));
    }
    @Test
    void productNumbersWithEmptyArray() {
        int[] arr =new int[0];
        Assertions.assertEquals(1,Task1_02.productNumbers(arr));
    }

    @Test
    void sumNumbers() {
        int[] arr ={2,4,6};
        Assertions.assertEquals(12,Task1_02.sumNumbers(arr));
    }

    @Test
    void sumWithNegativeNumbers() {
        int[] arr ={2,4,7};
        Assertions.assertEquals(Integer.MIN_VALUE,Task1_02.sumNumbers(arr));
    }
    @Test
    void sumNumbersWithEmptyArray() {
        int[] arr =new int[0];
        Assertions.assertEquals(0,Task1_02.sumNumbers(arr));
    }

    @Test
    void entryNumbers() {
    }
}