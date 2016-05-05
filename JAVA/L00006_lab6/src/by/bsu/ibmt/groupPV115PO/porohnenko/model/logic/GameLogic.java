/**
 * Lab work №6
 * Theme: class GameLogic
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 26, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.controller.Anagrams;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.WordSelector;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class GameLogic {

    public static char[] array = WordSelector.getSimpleArray();

    public static boolean Checker(char[] userWord) {

        for (int i = 0; i < userWord.length; i++) {
            if (userWord[i] != array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void logic() {
        for (int i = 0; i <= 2; i++) {
            //message for user
            ConsoleView.MessageInsertWord();
            ConsoleView.inputData();

            if (GameLogic.Checker(ConsoleView.getUserWord())) {
                ConsoleView.MessageWin();
                break;
            } else {
                ConsoleView.printMessage("   Sorry, it's wrong! Try again!\n");
            }
            if (i == 2) {
                ConsoleView.MessageLose();
                ConsoleView.printMessage("Correct word: ");
                ConsoleView.printMassiv(WordSelector.init(Anagrams.getIndex()));
            }
        }
    }
}
