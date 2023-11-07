package com.softserve.homework04_arrays_loops.Task03;

import com.softserve.homework04_arrays_loops.task01.Task01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car1 = new Car("Pickup", 2020, 2.0);
    Car car2 = new Car("Sedan", 2023, 3.6);
    Car car3 = new Car("Truck", 2018, 1.8);
    Car car4 = new Car("Cabriolet", 2021, 5.0);

    @Test
    void testFindCarByModelYearForTest() {
        Car expected = car3;
        Car result = Car.findCarByModelYearForTest(car1, car2, car3, car4, 2018);
        assertEquals(expected, result);
    }


    @Test
    void testSortCarsByYearOfProductionForTest() {
        Car[] expected = {car2, car4, car1, car3};
        Car[] result = Car.sortCarsByYearOfProductionForTest(car1, car2, car3, car4);
        assertArrayEquals(expected, result);
    }
}