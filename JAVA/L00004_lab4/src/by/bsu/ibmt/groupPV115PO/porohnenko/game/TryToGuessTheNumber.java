/**
 * @group: PV1-15PO
 * @Lab #4: Basic Syntax - Iteration (loops)
 * @The main class 'TryToGuessTheNumber' implements the game "Try To guess The
 * Number"
 * @date 26.02.2016
 * @author Oleg Porohnenko
 * @version 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.game;

import by.bsu.ibmt.groupPV115PO.porohnenko.logic.GameLogic;
import java.util.Scanner;
import java.util.Random;

public class TryToGuessTheNumber {

    private static int rangeLimit;      //user's number upper limit of range   
    private static int guessNumber;     //any user's input number
    private static int attempt;         //user's number of attempt
    private static int hiddenNumber;    //any random number
    private static Random randomNum;

    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("           Game 'Try to Guess the Number'");
        System.out.println("********************************************************");

        randomNum = new Random(System.currentTimeMillis());
        inputValues();
    }

    public static void inputValues() {

        while (true) {

            rangeLimit = 0;
            attempt = 0;

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Please, insert upper value of range of numbers: ");
                String line = sc.nextLine();

                try {
                    rangeLimit = Integer.parseInt(line);
                    if (rangeLimit < 0) {
                        System.out.println("*****Sorry, you entered must be positive!*****");
                    } else if (rangeLimit == 0) {
                        System.out.println("*****Sorry, you entered must be non zero!*****");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("*****Sorry, you entered is not an integer!*****");
                }
            }

            hiddenNumber = randomNum.nextInt(rangeLimit) + 1;

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("\nPlease,insert number of your attempts: ");
                String line = sc.nextLine();

                try {
                    attempt = Integer.parseInt(line);
                    if (attempt < 0) {
                        System.out.println("*****Sorry, you entered must be positive!*****");
                    } else if (attempt == 0) {
                        System.out.println("*****Sorry, you entered must be non zero!*****");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("*****Sorry, you entered is not an integer!*****");
                }
            }

            System.out.println("********************************************************");
            System.out.printf("Ok, now you have to guess a number between 0 and %d\n", rangeLimit);
            System.out.printf("Number of your attempts: %d\n", attempt);
            System.out.println("********************************************************");

            for (int i = 0; i < attempt; i++) {
                System.out.printf("Attempt #%d\n", i + 1);

                while (true) {
                    System.out.print("Your number: ");
                    Scanner sc = new Scanner(System.in);
                    String line = sc.nextLine();

                    try {
                        guessNumber = Integer.parseInt(line);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("*****Sorry, you entered is not an integer!*****");
                    }
                }

                if (GameLogic.getGameResult(guessNumber, rangeLimit)) {
                    System.out.println("********************************************************");
                    System.out.printf("You guessed the number of %d attempts!\n", i + 1);
                    System.out.println("********************************************************");
                    break;
                } else {
                    System.out.println("Remaining attempts: " + (attempt - 1 - i));
                    System.out.println("Try again...\n");
                }

                if (i == (attempt - 1)) {
                    System.out.println("********************************************************");
                    System.out.println("                       Game over!");
                    System.out.println("********************************************************");
                }
            }

            System.out.print("\nDo you want to play again? (Y/N?): ");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static int getHiddenNumber() {
        return hiddenNumber;
    }
}
