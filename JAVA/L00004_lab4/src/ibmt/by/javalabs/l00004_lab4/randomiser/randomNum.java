/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmt.by.javalabs.l00004_lab4.randomiser;

import java.util.Random;

/**
 *
 * @author olegp
 */
public class randomNum {
    private static Random random = new Random();

    public static int randomNum(int min, int max) {
        Random rnd = new Random();
        int number  = min + rnd.nextInt(max- min +1);
        return number;
    }
}
