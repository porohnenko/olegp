/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 1, 2016
 * Version: 1.0
 */
package model.logic;

public class CalcObject {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static double mult(int a, int b) {
        double count = 1;
        for (int i = 1; i < 100000000; i++) {
            count *= i;
        }

        return count;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
