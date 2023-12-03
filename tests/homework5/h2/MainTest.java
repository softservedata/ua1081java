package homework5.h2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @Test
    public void positiveNumbers() {
        int[] arr = {2, 3};
        assertEquals(5, arr[0] + arr[1]);
    }

    @Test
    public void negativeNumbers() {
        int[] arr = {-2, -3};
        assertEquals(-5, arr[0] + arr[1]);
    }

    @Test
    public void negativeAndPositiveNumbers() {
        int[] arr = {2, -3};
        assertEquals(-1, arr[0] + arr[1]);
    }

    @Test
    public void positiveAndZeroNumbers() {
        int[] arr = {2, 0};
        assertEquals(2, arr[0] + arr[1]);
    }

    @Test
    public void emptyArray() {
        int[] arr = {};
        assertEquals(0, arr.length);
    }

    @Test
    public void enterNotNumber() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("a");
        });
        }
    }