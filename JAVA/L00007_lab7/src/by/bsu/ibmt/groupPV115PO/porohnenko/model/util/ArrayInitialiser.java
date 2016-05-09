/**
 * Lab work №6 additional task
 * Theme: class ArrayInitialiser
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import java.util.Random;

public class ArrayInitialiser {

    public static void initOnedimensionalArray(double[] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min) + random.nextDouble();
        }
    }
    
    public static void initMultidimensionalArray (double[][] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = min + random.nextInt(max - min) + random.nextDouble();
            }
        }
    }
}
