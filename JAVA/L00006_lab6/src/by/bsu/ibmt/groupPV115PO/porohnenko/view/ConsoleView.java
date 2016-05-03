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

public class ConsoleView {

    public static void printArray(char[] array) {
        System.out.println("Word: " + Arrays.toString(array));
    }

    public static void printNumber(int number) {
        System.out.println("number: " + number);
    }
    
    public static void printMassiv(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
