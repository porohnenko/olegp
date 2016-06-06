/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 1, 2016
 * Version: 1.0
 */
package model.logic;

public class Calc {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        double count = 1;
        for (int i = 1; i < 21000000L; i++) {
            count *= i;
        }

        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
