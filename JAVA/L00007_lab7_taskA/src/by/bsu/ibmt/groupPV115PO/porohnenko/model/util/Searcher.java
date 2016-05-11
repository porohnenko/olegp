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

    private static int k;
    private static int sortedRow = 0;

    public static int FindSortedRow(float[][] array, int rows, int columns) {

        for (int i = 0; i < rows; i++) {
            //k = 0;                                  //reset counter
            for (int j = 0; j < columns - 1; j++) {
                if (array[i][j] < array[i][j + 1]) {
                    k = j;
                } else {
                    break;
                }
            }
            if (k == (columns - 2)) {
                sortedRow = i;
                break;
            }
        }
        return sortedRow;
    }
    
    public static float FindMax(float[] array, int lenght) {
        float maxElement = -10000;
        for (int i = 0; i < lenght; i++) {
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
