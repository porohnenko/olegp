package by.bsu.ibmt.groupPV115PO.porohnenko.randomiser;

import java.util.Random;

/**
 *
 * @author olegp
 */
public class randomNum {

    public static int randomNum(int min, int max) {
        Random random = new Random();
        int number = min + random.nextInt(max - min + 1);
        return number;

    }
}
