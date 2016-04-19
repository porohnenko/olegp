package ibmt.by.javalabs.l00004_lab4.randomiser;

import java.util.Random;

/**
 *
 * @author olegp
 */
public class randomNum {
    
    public static int randomNum(int min, int max) {
        Random rnd = new Random();
        int number  = min + rnd.nextInt(max- min +1);
        return number;
    }
}
