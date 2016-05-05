/**
 * Lab work №6
 * Theme: class GameConsolePrint
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 26, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.view;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleView {

    public static char[] userArray;

    public static void printNumber(int number) {
        System.out.println("\n\nWord number: " + number);
    }

    public static void printArray(char[] array) {
        System.out.print("Word: " + Arrays.toString(array));
    }

    public static char[] inputData() {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        userArray = line.toCharArray();

        return userArray;
    }

    public static char[] getUserWord() {
        return userArray;
    }

    public static void printMessage(String mes) {
        System.out.print(mes);
    }

    public static void MessageInsertWord() {
        System.out.print("\nPlease,insert your word: ");
    }

    public static void MessageAnagram() {
        System.out.print("Anagram: ");
    }
    
    public static void StartMessage() {
        System.out.println("\n**************************************");
        System.out.println("        Game ***ANAGRAMS***");
        System.out.println("**************************************");
    }

    public static void MessageWin() {
        System.out.println("\n**************************************");
        System.out.println("      Congratulations, you win!");
        System.out.println("**************************************");
    }

    public static void MessageLose() {
        System.out.println("\n**************************************");
        System.out.println("          Sorry, you lose!");
        System.out.println("**************************************");
    }

    public static void printMassiv(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("\n");
    }

    /*public static void printUserWord(char[] array) {
        ConsoleView.printMessage("User word: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("\n");
    }*/

 /*public static char outputChar(char[] userWord) {

        char letter = 0;
        for (int i = 0; i < userWord.length; i++) {
            letter = userWord[i];
            System.out.println("letter " + (i + 1) + ": " + letter);
        }
        return letter;
    }*/
}
