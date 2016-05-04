/**
 * Lab work № ...
 * Theme: ...
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 26, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayCleaner;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class GameLogic {

    public static char[] array = ArrayCleaner.getClearArr();

    public static void Checker(char[] userWord) {

        for (int i = 0; i < userWord.length; i++) {
            if (userWord[i] != array[i]) {
                ConsoleView.printMessage("Sorry, you missed!");
            }
        }
    }
}
