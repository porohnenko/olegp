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
        System.out.println("Word number: " + number);
    }

    public static void printArray(char[] array) {
        System.out.print("Word: " + Arrays.toString(array));
    }

    public static void printMassiv(char[] array) {
        System.out.print("Anagram: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("\n");
    }

    public static char[] inputData() {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        userArray = line.toCharArray();

        return userArray;
    }

    public static char[] getUserArray() {
        return userArray;
    }

    public static void printMessage(String mes) {
        System.out.print(mes);
    }
}
