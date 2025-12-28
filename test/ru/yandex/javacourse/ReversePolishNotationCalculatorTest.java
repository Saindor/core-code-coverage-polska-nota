package ru.yandex.javacourse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator rpn = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int result = rpn.calculatePolishNotation("4 6 +");
        assertEquals(10, result);
    }



    @Test
    public void shouldCalculateMultiplication() {
        int result = rpn.calculatePolishNotation("5 5 *");
        assertEquals(25, result);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int result = rpn.calculatePolishNotation("14 4 -");
        assertEquals(10, result);
    }

    @Test
    public void shouldIgnoreExtraSpaces() {
        assertEquals(7, rpn.calculatePolishNotation("   4    3   +   "));
    }

}

