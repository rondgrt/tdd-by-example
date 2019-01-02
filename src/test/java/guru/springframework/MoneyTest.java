package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEquality() {
        Dollar first = new Dollar(5);
        Dollar second = new Dollar(5);
        Dollar third = new Dollar(8);

        assertEquals(first, second);
        assertNotEquals(first, third);
    }

    @Test
    void name() {
    }
}
