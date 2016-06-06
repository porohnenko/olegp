package model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

    public CalcTest() {
        System.out.println("!!!!");
    }

    @Test
    public void testSum() {
        int a = 10;
        int b = 3;
        int result = 13;

        if (result != Calc.sum(a, b)) {
            fail();
        }
    }

    @Test
    public void testSub() {
        int a = 10;
        int b = 3;
        int result = a - b;

        assertEquals(result, Calc.sub(a, b));
    }

    @Test
    public void testMult() {
        int a = 10;
        int b = 3;
        int result = a * b;

        assertEquals(result, Calc.mult(a, b));
    }
    
     @Test(timeout = 490)
    public void testMultWithTimeout() {
        int a = 10;
        int b = 3;
        int result = a * b;

        assertEquals(result, Calc.mult(a, b));
    }
    
    @Test
    public void testDiv() {
        int a = 10;
        int b = 3;
        int result = a / b;

        assertEquals(result, Calc.div(a, b));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        int a = 10;
        int b = 0;
        int result = a / b;

        assertEquals(result, Calc.div(a, b));
    }
}