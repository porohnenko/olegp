/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olegp
 */
public class Equation {

    public static String solve(int a, int b, int c) {
        String resultMsg;

        if (a == 0) {
            resultMsg = "Equation is not quadratic: 'a' - must be nonzero!";
        } else {
            int D = b * b - 4 * a * c;

            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / 2.0 / a;
                double x2 = (-b - Math.sqrt(D)) / 2.0 / a;
                resultMsg = "There are two roots of eqation: x1 = " + x1 + " , x2 = " + x2;
            } else if (D == 0) {
                double x = -b / 2.0 / a;
                resultMsg = "There is only one root of equation: x = " + x;
            } else {
                resultMsg = "There is not real roots of equation!";
            }
        }
        return resultMsg;
    }
}
