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
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayCleaner;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.WordSelector;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class GameLogic {

    private static char[] array;
    private static int attempt = 2;

    public static boolean Checker(char[] userWord) {

        for (int i = 0; i < userWord.length; i++) {
            if (userWord[i] != array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void logic() {
        for (int i = 0; i <= attempt; i++) {

            //message for user
            ConsoleView.MessageInsertWord();
            ConsoleView.inputData();

            ArrayCleaner.cleaner(WordSelector.getSimpleArray());
            array = ArrayCleaner.getClearArr();

            if (ConsoleView.getUserArray().length != 0) {
                if (ConsoleView.getUserArray().length == array.length) {
                    if (GameLogic.Checker(ConsoleView.getUserWord())) {
                        ConsoleView.MessageWin();
                        break;
                    }
                } else {
                    if (i < attempt) {
                        ConsoleView.printMessage("   Sorry, it's wrong! Try again!\n");
                    } else {
                        ConsoleView.printMessage("   Sorry, it's wrong!\n");
                    }
                    System.out.printf("   Attempts left: %d", attempt - i);
                }
            } else {
                ConsoleView.printMessage("The input field can not be empty!\n");
                System.out.printf("   Attempts left: %d", attempt - i);
            }

            if (i == attempt) {
                ConsoleView.MessageLose();
                ConsoleView.printMessage("Correct word: ");
                ConsoleView.printMassiv(WordSelector.init(Anagrams.getIndex()));
            }
        }
    }
}
