package homework5.h4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomsTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @Test
    public void notNumber() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("a");
        });
    }
}