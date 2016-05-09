/**
 * Lab work №7
 * Theme: Multidimensional arrays
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 5, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.ArrayLogic_task_A;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayCreator;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayInitialiser;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayRowSorting;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.RowsRandomaiser;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class ArrayController {

    public static void main(String[] args) {

        ConsoleView.inputData();
        
        int row = RowsRandomaiser.randomaiser(ConsoleView.getNumberOfRows());
        float[][] Array = ArrayCreator.createMatrix(ConsoleView.getNumberOfRows(), ConsoleView.getNumberOfColumns());

        ArrayInitialiser.initMultidimensionalArray(Array, ConsoleView.getRangeDownLimit(), ConsoleView.getRangeUpLimit());

        ConsoleView.GraphicDelimiter();

        ConsoleView.viewMatrix(Array);

        ConsoleView.GraphicDelimiter();

        ArrayRowSorting.sort(Array, row);
        ConsoleView.viewMatrix(ArrayRowSorting.getSortedArray());
        System.out.println("Selected row: " + row);
        ConsoleView.viewOnedimensionalArray(ArrayRowSorting.getSortedRow());
    }
}
