/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olegp
 */
public class Loops {

    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        lable:
        while (true) {
            for (int x : numbers) {
                if (x == 30) {
                    break lable;
                }
                System.out.println(x);
            }
        }
    }
}
