/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;
import java.util.Arrays;

public class ArraySorting {

    private static double[] sortedArray = new double[ConsoleView.getArraySize()];
    
    public static double[] sort(double[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        return sortedArray;
    }

}
