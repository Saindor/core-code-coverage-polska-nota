package ru.yandex.javacourse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator rpn = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        assertEquals(10, rpn.calculatePolishNotation("6 4 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(6, rpn.calculatePolishNotation("10 4 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(25, rpn.calculatePolishNotation("5 5 *"));
    }

    @Test
    public void shouldWorkWithNegativeNumbers() {
        assertEquals(1, rpn.calculatePolishNotation("-2 3 +"));
    }

    @Test
    public void shouldIgnoreExtraSpaces() {
        assertEquals(7, rpn.calculatePolishNotation("   4    3   +   "));
    }
}

