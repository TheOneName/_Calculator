package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import calc.Calculator;

public class CalculatorTests {
    final Calculator calculator = new Calculator();
 
    @Test
    public void testAddition() {
        final double result = calculator.Calc(3, "+", 4);
        assertEquals("3+4 must be 7", 7, result, 1e-9);}

    
        @Test
    public void testSubtraction() {
        final double result = calculator.Calc(7, "-", 3);
        assertEquals("7-3 must be 4", 4, result, 1e-9);
}


        @Test
    public void testMultiplication() {
        final double result = calculator.Calc(2, "*", 5);
        assertEquals("2*5 must be 10", 10, result, 1e-9);
}

        @Test
    public void testDivision() {
        final double result = calculator.Calc(10, "/", 2);
        assertEquals("10/2 must be 5", 5, result, 1e-9);
}}


