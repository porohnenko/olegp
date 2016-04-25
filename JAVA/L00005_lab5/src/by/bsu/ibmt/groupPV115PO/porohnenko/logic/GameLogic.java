/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 24, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.game.ComputerGuessTheNumber;

public class GameLogic {

    public static boolean getGameResult(int number, int limit) {

        if (number > ComputerGuessTheNumber.getHiddenNumber()) {

            System.out.println("*****Your number is higher than the hidden number!*****");

        } else if (number < ComputerGuessTheNumber.getHiddenNumber()) {

            if (number < 0) {
                System.out.printf("Sorry, your input number is out of range 0...%s\n", limit);
            } else {
                System.out.println("*****Your number is lower than the hidden number!******");
            }
        } else {
            System.out.println("\n\n********************************************************");
            System.out.println("          Congratulations! PC guess the number!");
            System.out.printf("                 The hidden number is %d!\n", ComputerGuessTheNumber.getHiddenNumber());
            return true;
        }
        return false;
    }

    public static int getNewUpLimit(int number, int upLimit) {
        if (number > ComputerGuessTheNumber.getHiddenNumber()) {
            upLimit = number;
        }
        return upLimit;
    }

    public static int getNewDownLimit(int number, int downLimit) {
        if (number < ComputerGuessTheNumber.getHiddenNumber()) {
            downLimit = number;
        }
        return downLimit;
    }

    public static boolean getLimitResult(int number) {
        if (number > ComputerGuessTheNumber.getHiddenNumber()) {
            return true;
        }
        return false;
    }
}
