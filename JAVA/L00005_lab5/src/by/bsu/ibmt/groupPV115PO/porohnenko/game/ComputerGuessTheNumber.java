/**
 * Lab work №5
 * Theme: Game 'The computer guesses number'
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 24, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.game;

import by.bsu.ibmt.groupPV115PO.porohnenko.logic.GameLogic;
import java.util.Random;
import java.util.Scanner;

public class ComputerGuessTheNumber {

    private static int rangeUpLimit;    //user's number upper limit of range   
    private static int PCNumber;        //any PC's input number
    private static int attempt;         //PC's number of attempt
    private static int hiddenNumber;    //any random number
    private static Random randomNum;
    private static int k = 0;           //timer for matches
    private static int timeStart;       //time of start of calculation
    private static int timeEnd;         //time of end of calculation

    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("           Game 'The computer guesses number'");
        System.out.println("********************************************************");

        randomNum = new Random(System.currentTimeMillis());
        inputValues();
    }

    public static void inputValues() {

        while (true) {

            rangeUpLimit = 0;
            attempt = 0;

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Please, insert upper value of range of numbers: ");
                String line = sc.nextLine();

                try {
                    rangeUpLimit = Integer.parseInt(line);
                    if (rangeUpLimit < 0) {
                        System.out.println("*****Sorry, you entered must be positive!*****");
                    } else if (rangeUpLimit == 0) {
                        System.out.println("*****Sorry, you entered must be non zero!*****");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("*****Sorry, you entered is not an integer!*****");
                }
            }

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("\nPlease,insert number of PC's attempts: ");
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

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("\nPlease,insert hidden number for PC: ");
                String line = sc.nextLine();

                try {
                    hiddenNumber = Integer.parseInt(line);
                    if (hiddenNumber < 0) {
                        System.out.println("*****Sorry, you entered must be positive!*****");
                    } else if (hiddenNumber == 0) {
                        System.out.println("*****Sorry, you entered must be non zero!*****");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("*****Sorry, you entered is not an integer!*****");
                }
            }

            System.out.println("********************************************************");
            System.out.printf("Ok, now PC have to guess a number between 0 and %d\n", rangeUpLimit);
            System.out.printf("Number of PC's attempts: %d\n", attempt);
            System.out.println("********************************************************");

            timeStart = (int) System.currentTimeMillis();

            int mas[] = new int[(int) attempt];
            for (int j = 0; j < mas.length; j++) {
                mas[j] = 0;
            }

            for (int i = 0; i < attempt; i++) {

                System.out.printf("Attempt #%d\n", i + 1);

                PCNumber = getRandomNumber(rangeUpLimit);
                int temp = PCNumber;

                mas[i] = PCNumber;

                if (i > 0) {
                    while (PCNumber == temp) {
                        for (int j = 0; j < mas.length; j++) {
                            if (mas[j] == PCNumber) {
                                PCNumber = getRandomNumber(rangeUpLimit);
                                k++;
                            }
                        }
                    }
                }

                System.out.println("PC's number: " + PCNumber);

                if (GameLogic.getGameResult(PCNumber, rangeUpLimit)) {
                    System.out.println("********************************************************");
                    System.out.printf("PC guessed the number of %d attempts!\n", i + 1);
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

            System.out.println("The number of processed matches: " + k);
            timeEnd = (int) System.currentTimeMillis();
            double runtime = (double) (timeEnd - timeStart) / 1000;
            System.out.printf("Run time: %.3f seconds", runtime);

            System.out.print("\nDo you want to play again? (Y/N?): ");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equalsIgnoreCase("n")) {
                System.out.println("\n\n");
                break;
            }
        }
    }

    public static int getHiddenNumber() {
        return hiddenNumber;
    }

    public static int getRandomNumber(int max) {
        int number;
        number = 1 + randomNum.nextInt(max + 1);
        return number;
    }

    public static int getMassiveUsedNumbers(int number, int limit, int cell) {
        int mas[] = new int[limit];
        mas[cell] = number;

        return mas[limit];
    }
}