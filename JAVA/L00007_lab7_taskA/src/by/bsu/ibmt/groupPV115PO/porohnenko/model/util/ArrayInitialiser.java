/**
 * Lab work №7
 * Theme: class ArrayInitialiser
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;
import java.util.Random;

public class ArrayInitialiser {

    public static void initMultidimensionalArray(float[][] array, int min, int max) {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < ConsoleView.getNumberOfRows(); i++) {
            for (int j = 0; j < ConsoleView.getNumberOfColumns(); j++) {
                array[i][j] = min + random.nextInt(Math.abs(max - min)) + random.nextFloat();
            }
        }
    }
}
