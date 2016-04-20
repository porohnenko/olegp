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

    private static int rangeLimit = 0; //user's number upper limit of range   
    private static int guessNumber; //any user's input number
    private static int attempt = 0; //user's number of attempt
    private static int hiddenNumber;
    private static Random randomNum;

    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("           Game 'Try to Guess the Number'");
        System.out.println("********************************************************");

        randomNum = new Random(System.currentTimeMillis());
        inputValues();

    }

    public static void inputValues() {

        System.out.printf("Please, insert upper value of range of numbers: ");

        Scanner scanLimit = new Scanner(System.in);

        if (scanLimit.hasNextInt()) {
            rangeLimit = scanLimit.nextInt();
        } else {
            System.out.println("Sorry, insert integer number!");
        }
        //scanLimit.close();
        //System.out.printf("rangeLimit: %d\n", rangeLimit);
        while (true) {
            hiddenNumber = randomNum.nextInt(rangeLimit) + 1;

            //System.out.printf("hiddenNumber: %d", hiddenNumber);

            System.out.print("\nPlease,insert number of your attempts: ");

            Scanner scanAttempt = new Scanner(System.in);

            if (scanAttempt.hasNextInt()) {
                attempt = scanAttempt.nextInt();
            } else {
                System.out.println("\nSorry, insert integer number!");
            }
            //scanAttempt.close();  

            System.out.println("********************************************************");
            System.out.printf("Ok, now you have to guess a number between 0 and %d\n", rangeLimit);
            System.out.printf("Number of your attempts: %d\n", attempt);
            System.out.println("********************************************************");

            for (int i = 0; i < attempt; i++) {
                System.out.printf("Attempt #%d\n", i + 1);
                System.out.print("Your number: ");

                Scanner scanUserNumber = new Scanner(System.in);
                if (scanUserNumber.hasNextInt()) {
                    guessNumber = scanUserNumber.nextInt();
                } else {
                    System.out.println("\nSorry, insert integer number!");
                }

                if (guessNumber > rangeLimit);
                {
                    //System.out.printf("Sorry, your input number is out of range 0...%d\n", rangeLimit);

                }
                //System.out.printf("rangeLimit: %d\n", rangeLimit);
                //System.out.printf("guessNumber: %d\n", guessNumber);

                if (GameLogic.getGameResult(guessNumber)) {
                    System.out.printf("\nYou guessed the number of %d attempts!\n", i + 1);
                    System.out.println("********************************************************");
                    break;
                } else {
                    System.out.println("Remaining attempts: " + (attempt - 1 - i));
                    System.out.println("Try again...\n");
                }
            }
            if (!GameLogic.getGameResult(guessNumber)) {
                System.out.println("********************************************************");
                System.out.println("                       Game over!");
                System.out.println("********************************************************");
            }
            System.out.print("Do you want to play again? (Y/N?): ");

            Scanner scanYN = new Scanner(System.in);
            if (scanYN.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static int getHiddenNumber() {
        return hiddenNumber;
    }
}
