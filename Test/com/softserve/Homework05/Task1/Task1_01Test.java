package com.softserve.Homework05.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1_01Test {

    @Test
    void monthDaysInRange() {
        Assertions.assertEquals(31, Task1_01.monthDays(1));
    }
    @Test
    void monthDaysNotInRange() {
        Assertions.assertEquals(-1, Task1_01.monthDays(20));
    }
}