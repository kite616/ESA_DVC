package org.munzinger;

import static org.junit.jupiter.api.Assertions.*;

import org.munzinger.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition")
    void add() {
        assertEquals(42, calculator.add(30, 12));
        assertEquals(-10, calculator.add(20, -30));
    }

    @Test
    @DisplayName("Divide")
    void div() {
        assertThrows(IllegalArgumentException.class, () -> calculator.div(5, 0));
        assertEquals(10, calculator.div(20, 2));
    }

    @Test
    @DisplayName("Subtract")
    void sub() {
        assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    @DisplayName("Multiply")
    void multi() {
        assertAll(() -> assertEquals(4, calculator.multi(2, 2)),
                () -> assertEquals(-4, calculator.multi(2, -2)),
                () -> assertEquals(4, calculator.multi(-2, -2)),
                () -> assertEquals(0, calculator.multi(1, 0)));
    }
}
