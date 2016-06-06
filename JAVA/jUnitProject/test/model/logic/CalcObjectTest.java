package model.logic;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcObjectTest {

    private Calc calc = null;

    public CalcObjectTest() {
        System.out.println("!!!!");
    }

    @BeforeClass
    public static void initClass() {
        System.out.println("initClass");
    }

    @AfterClass
    public static void destroyClass() {
        System.out.println("destroyClass");

    }

    @Before
    public void init1() {
        System.out.println("init1");
//        calc = new Calc();
    }

    @Before
    public void init2() {
        System.out.println("init2");
//        calc = new Calc();
    }

    @Before
    public void init3() {
        System.out.println("init3");
//        calc = new Calc();
    }

    @After
    public void destroy() {
        System.out.println("destroy");
        calc = null;
    }

    @Test
    public void testSum() {
        System.out.println("sum...");
        int a = 10;
        int b = 3;
        int result = 13;

        if (result != calc.sum(a, b)) {
            fail("Error using method sum!!!");
        }
    }

    @Test
    public void testSub() {
        System.out.println("sub...");
        int a = 10;
        int b = 3;
        int result = a - b;

        assertEquals(result, calc.sub(a, b));
    }

    @Test
    public void testMult() {
        System.out.println("mul...");
        int a = 10;
        int b = 3;
        int result = a * b;

        assertEquals(result, calc.mult(a, b));
    }
   
    @Test
    public void testDiv() {
        int a = 10;
        int b = 3;
        int result = a / b;

        assertEquals(result, calc.div(a, b));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        int a = 10;
        int b = 0;
        int result = a / b;

        assertEquals(result, calc.div(a, b));
    }
}
