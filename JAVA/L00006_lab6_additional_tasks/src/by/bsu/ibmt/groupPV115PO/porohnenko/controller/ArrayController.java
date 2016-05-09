/**
 * Lab work №6 additional task
 * Theme: Arrays and MVS Pattern.
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 5, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.ArrayLogic_task1;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayCreator;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayInitialiser;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class ArrayController {

    public static void main(String[] args) {

        ConsoleView.inputData();

        double[] Array = ArrayCreator.createOne(ConsoleView.getArraySize());

        ArrayInitialiser.initOnedimensionalArray(Array, ConsoleView.getRangeDownLimit(), ConsoleView.getRangeUpLimit());

        ConsoleView.GraphicDelimiter();
        ConsoleView.viewOnedimensionalArray(Array);
        ConsoleView.ViewMessage(ArrayLogic_task1.getMessage1(), ArrayLogic_task1.Sum(Array));
        ConsoleView.ViewMessage(ArrayLogic_task1.getMessage2(), ArrayLogic_task1.Mult(Array));
        ConsoleView.GraphicDelimiter();
    }
}
