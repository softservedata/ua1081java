package com.softserve.Homework05.Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getYearProduction() {
    Car car = new Car("Sedan", 2019, 2.0);
    Assertions.assertEquals(2019,car.getYearProduction());
    }

}