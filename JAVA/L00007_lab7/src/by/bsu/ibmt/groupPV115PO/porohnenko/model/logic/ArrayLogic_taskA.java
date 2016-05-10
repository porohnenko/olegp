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
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class ArrayLogic_taskA {

    private static String message1 = "Sum of negative elements: ";
    private static String message2 = "Multiplication of elements between Min and Max: ";
    float[] SortedRow = new float[columns];
    private static int rows = ConsoleView.getNumberOfRows();
    private static int columns = ConsoleView.getNumberOfColumns();

    public static float StoreSortedRow(float[][] array) {
        int k = Searcher.FindSortedRow(array, rows, columns);
        float[] SortedRow = new float[columns];
        for (int i = 0; i < columns; i++) {
            SortedRow[i] = array[k][i];
        }
        return Searcher.FindMax(SortedRow);
    }
    
    

    public float[] getSortedRow() {
        return SortedRow;
    }
    
    public static String getMessage1() {
        return message1;
    }

    public static String getMessage2() {
        return message2;
    }
}
