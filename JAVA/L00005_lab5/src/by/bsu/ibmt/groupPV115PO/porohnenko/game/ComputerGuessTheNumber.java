/**
 * Lab work №5
 * Theme: Game 'The computer guesses number'
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 24, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.game;

import model.logic.GameLogic;
import java.util.Random;
import java.util.Scanner;

public class ComputerGuessTheNumber {

    private static int rangeUpLimit;    //user's number upper limit of range  
    private static int rangeDownLimit;  //down limit of range  
    private static int PCNumber;        //random PC's input number
    private static int attempt;         //PC's number of attempt
    private static int hiddenNumber;    //any user's number
    private static Random randomNum;
    private static int k = 0;           //counter of matches
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
            rangeDownLimit = 0;
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

            PCNumber = getRandomNumber(rangeDownLimit, rangeUpLimit);

            int mas[] = new int[(int) attempt];
            for (int j = 0; j < mas.length; j++) {
                mas[j] = 0;
            }

            for (int i = 0; i < attempt; i++) {

                System.out.printf("Attempt #%d\n", i + 1);

                if (i > 0) {

                    for (int j = 0; j < mas.length; j++) {
                        while (mas[j] == PCNumber) {
                            if (mas[j] == PCNumber) {
                                PCNumber = getRandomNumber(GameLogic.getNewDownLimit(PCNumber, rangeDownLimit), GameLogic.getNewUpLimit(PCNumber, rangeUpLimit));
                                k++;
                            }
                        }
                    }
                }
                mas[i] = PCNumber;
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

                if (GameLogic.getLimitResult(PCNumber)) {
                    rangeUpLimit = GameLogic.getNewUpLimit(PCNumber, rangeUpLimit);
                    PCNumber = getRandomNumber(rangeDownLimit, GameLogic.getNewDownLimit(PCNumber, rangeUpLimit));
                } else {
                    rangeDownLimit = GameLogic.getNewDownLimit(PCNumber, rangeDownLimit);
                    PCNumber = getRandomNumber(GameLogic.getNewDownLimit(PCNumber, rangeDownLimit), rangeUpLimit);
                }

                if (i == (attempt - 1)) {
                    System.out.println("********************************************************");
                    System.out.println("                       Game over!");
                    System.out.println("********************************************************");
                }
            }

            timeEnd = (int) System.currentTimeMillis();
            double runtime = (double) (timeEnd - timeStart) / 1000;
            System.out.printf("Run time: %.3f sec\n", runtime);

            System.out.println("The number of processed matches: " + k);

            System.out.print("\nPC's numbers of attemts: ");
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] != 0) {
                    System.out.print(mas[j] + ", ");
                }
            }

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

    public static int getRandomNumber(int min, int max) {
        int number;
        number = 1 + min + randomNum.nextInt(max - min + 1);
        return number;
    }
}
