/**
 * Lab work №7: individual task A (number 19)
 * Task: Find the maximum among all the elements of the rows of the matrix ,
 * which are ordered (either ascending or descending) .
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 5, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.Searcher;

public class ArrayLogic_taskA {

    //private static int rows = ConsoleView.getNumberOfRows();
    //private static int columns = ConsoleView.getNumberOfColumns();
    private static float[] sortRow;
    private static int k = 0;
    private static float maxElement = 0;

    public static void StoreSortedRow(float[][] array, int rows, int columns) {
        float[] sortRow = new float[columns];
        k = Searcher.FindSortedRow(array, rows, columns);
        /*for (int i = 0; i < columns; i++) {
            sortRow[i] = array[k][i];
        }*/
        System.arraycopy(array[k], 0, sortRow, 0, columns);
        maxElement = Searcher.FindMax(sortRow, columns);
    }

    public static float[] getSortRow() {
        return sortRow;
    }

    public static float getMaxElement() {
        return maxElement;
    }

    public static int getK() {
        return k;
    }
}
