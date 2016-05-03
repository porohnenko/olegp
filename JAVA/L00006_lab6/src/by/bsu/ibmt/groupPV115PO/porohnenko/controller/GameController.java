/**
 * Lab work № ...
 * Theme: ...
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 26, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.Randomiser;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.WordSelector;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class GameController {

    public static void main(String[] args) {

        int size = 50;

        int index = Randomiser.randomIndex(size);

        ConsoleView.printNumber(index);
        
        //ConsoleView.printArray(WordSelector.init(index));
        ConsoleView.printMassiv(WordSelector.init(index));
    }
}
