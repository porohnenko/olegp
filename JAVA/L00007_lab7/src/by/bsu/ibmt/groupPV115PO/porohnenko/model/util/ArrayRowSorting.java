/**
 * Lab work №7
 * Theme: class ArraySorting
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;
import java.util.Arrays;

public class ArrayRowSorting {

    private static float[][] sortedArray = new float[ConsoleView.getNumberOfRows()][ConsoleView.getNumberOfColumns()];
    private static float[] sortedRow = new float[ConsoleView.getNumberOfColumns()];
    private static int rows = ConsoleView.getNumberOfRows();
    private static int columns = ConsoleView.getNumberOfColumns();

    public static void sort(float[][] array, int row) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == row) {
                    sortedRow[j] = array[row][j];
                }
            }
        }

        Arrays.sort(sortedRow);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == row) {
                    array[row][j] = sortedRow[j];
                }
                sortedArray[i][j] = array[i][j]; 
            }
        }
    }

    public static float[][] getSortedArray() {
        return sortedArray;
    }

    public static float[] getSortedRow() {
        return sortedRow;
    }
}
