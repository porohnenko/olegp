/**
 * @group: PV1-15PO
 * @Lab #4: Basic Syntax - Iteration (loops)
 * @The logic class of game 'TryToGuessTheNumber'
 * @date 20.04.2016
 * @author Oleg Porohnenko
 * @version 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.game.TryToGuessTheNumber;

public class GameLogic {

    public static boolean getGameResult(int number, int limit) {

        if (number > TryToGuessTheNumber.getHiddenNumber()) {
            if ((number - limit) > 0) {
                System.out.printf("Sorry, your input number is out of range 0...%s\n", limit);
            } else {
                System.out.println("*****Your number is higher than the hidden number!*****");
            }
        } else if (number < TryToGuessTheNumber.getHiddenNumber()) {

            if (number < 0) {
                System.out.printf("Sorry, your input number is out of range 0...%s\n", limit);
            } else {
                System.out.println("*****Your number is lower than the hidden number!******");
            }
        } else {
            System.out.println("\n\n********************************************************");
            System.out.println("          Congratulations! You guess the number!");
            System.out.printf("                 The hidden number is %d!\n", TryToGuessTheNumber.getHiddenNumber());
            return true;
        }
        return false;
    }
}
