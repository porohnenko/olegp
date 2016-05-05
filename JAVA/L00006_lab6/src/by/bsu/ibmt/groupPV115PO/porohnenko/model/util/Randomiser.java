/**
 * Lab work №6
 * Theme: class Randomiser
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 3, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import java.util.Random;

public class Randomiser {

    public static int randomIndex(int wordsNumber) {
        Random random = new Random();
        int number = random.nextInt(wordsNumber - 1) + 1;

        return number;
    }

}
