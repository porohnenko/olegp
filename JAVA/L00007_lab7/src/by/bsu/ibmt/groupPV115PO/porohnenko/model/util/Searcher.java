/**
 * Lab work №7
 * Theme: class Searcher
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

public class Searcher {

    public static int FindSortedRow(float[][] array, int rows, int columns) {
        int k = 0;
        int sortedRow = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] < array[i][j + 1]) {
                    k++;
                }
                if (k == (columns - 1)) {
                    sortedRow = i;
                    break;
                }
            }
        }
        return sortedRow;
    }

    public static float FindMax(float[] array) {
        float maxElement = -10000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    /*public static double FindMin(float[] array) {
        double minElement = 10000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }*/
}
