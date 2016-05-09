/**
 * Lab work №6 additional task
 * Theme: class ConsoleView
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 5, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.view;

import java.util.Scanner;

public class ConsoleView {

    private static int rangeUpLimit;    //user's number upper limit of range  
    private static int rangeDownLimit;  //down limit of range  
    private static int arraySize;

    public static void viewOnedimensionalArray(double[] array) {
        System.out.print("Array = { ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%.2f; ", array[i]);
        }
        System.out.printf("%.2f ", array[array.length - 1]);
        System.out.println("}");
    }

    public static void viewMultidimensionalArray(double[][] array) {
        System.out.println("Array:");
        for (double[] array1 : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("\t%.2f", array1[j]);
            }
            System.out.print("\n");
        }
        //System.out.println("\t}");
    }

    public static void ViewMessage(String mes, double value) {
        System.out.printf("%s: %.2f\n", mes, value);
    }

    public static void inputData() {
        rangeUpLimit = 0;
        rangeDownLimit = 0;
        arraySize = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please, insert size of array: ");
            String line = sc.nextLine();

            try {
                arraySize = Integer.parseInt(line);
                if (arraySize < 0) {
                    System.out.println("*****Sorry, you entered must be positive!*****");
                } else if (arraySize == 0) {
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
            System.out.print("Please, insert lower value of range of array: ");
            String line = sc.nextLine();

            try {
                rangeDownLimit = Integer.parseInt(line);

                if (rangeDownLimit < -2147483648) {
                    System.out.println("*****Sorry, you entered the number less than can contain type of data Integer!*****");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("*****Sorry, you entered is not an integer!*****");
            }
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please, insert upper value of range of array: ");
            String line = sc.nextLine();

            try {
                rangeUpLimit = Integer.parseInt(line);
                if (rangeUpLimit > 2147483647) {
                    System.out.println("*****Sorry, you entered the number more than can contain type of data Integer!*****");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("*****Sorry, you entered is not an integer!*****");
            }
        }
    }

    public static void GraphicDelimiter() {
        System.out.println("****************************************************************************************************************************************************");
    }

    public static int getArraySize() {
        return arraySize;
    }

    public static int getRangeUpLimit() {
        return rangeUpLimit;
    }

    public static int getRangeDownLimit() {
        return rangeDownLimit;
    }
}
