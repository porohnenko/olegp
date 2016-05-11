/**
 * Lab work №7
 * Theme: Multidimensional arrays
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 5, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.ArrayLogic_taskA;
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

        ConsoleView.viewMatrix("Base array", Array);

        ConsoleView.GraphicDelimiter();

        ArrayRowSorting.sort(Array, row);
        ConsoleView.viewMatrix("Partially sorted array",ArrayRowSorting.getSortedArray());

        ConsoleView.GraphicDelimiter();
        ConsoleView.ViewMessageInt("Random row number", row);
        ConsoleView.viewOnedimensionalArray("This random row", ArrayRowSorting.getSortedRow());
        ConsoleView.GraphicDelimiter();

        ArrayLogic_taskA.StoreSortedRow(Array, ConsoleView.getNumberOfRows(), ConsoleView.getNumberOfColumns());
        ConsoleView.ViewMessageInt("Number of the found sorted row:", ArrayLogic_taskA.getK());
        ConsoleView.ViewMessageFloat("Max element in sorted row: ", ArrayLogic_taskA.getMaxElement());
    }
}
