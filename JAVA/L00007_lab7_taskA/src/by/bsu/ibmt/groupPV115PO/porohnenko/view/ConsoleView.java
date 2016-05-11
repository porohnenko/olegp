/**
 * Lab work №7
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
    private static int numberOfRows;    //store number of rows of user array
    private static int numberOfColumns; //tore number of columns of user array

    public static void inputData() {
        rangeUpLimit = 0;
        rangeDownLimit = 0;
        numberOfRows = 0;
        numberOfColumns = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please, insert number of rows of the matrix: ");
            String line = sc.nextLine();

            try {
                numberOfRows = Integer.parseInt(line);
                if (numberOfRows < 0) {
                    System.out.println("*****Sorry, you entered must be positive!*****");
                } else if (numberOfRows == 0) {
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
            System.out.print("Please, insert number of columns of the matrix: ");
            String line = sc.nextLine();

            try {
                numberOfColumns = Integer.parseInt(line);
                if (numberOfColumns < 0) {
                    System.out.println("*****Sorry, you entered must be positive!*****");
                } else if (numberOfColumns == 0) {
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

    public static void viewOnedimensionalArray(String mes, float[] array) {
        System.out.print(mes + " = { ");
        for (int i = 0; i < getNumberOfColumns(); i++) {
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println("}");
    }

    public static void viewMatrix(String mes, float[][] array) {
        System.out.printf("%s [%d][%d]:\n", mes, getNumberOfRows(), getNumberOfColumns());
        for (int i = 0; i < getNumberOfRows(); i++) {
            System.out.print(i + ")->\t");
            for (int j = 0; j < getNumberOfColumns(); j++) {
                System.out.printf("%.2f\t", array[i][j]);
            }
            System.out.print("\n");
        }
        //System.out.println("\t}");
    }

    public static void ViewMessageFloat(String mes, float value) {
        System.out.printf("%s: %.2f\n", mes, value);
    }

    public static void ViewMessageInt(String mes, int value) {
        System.out.printf("%s: %d\n", mes, value);
    }

    public static int getRangeUpLimit() {
        return rangeUpLimit;
    }

    public static int getRangeDownLimit() {
        return rangeDownLimit;
    }

    public static int getNumberOfRows() {
        return numberOfRows;
    }

    public static int getNumberOfColumns() {
        return numberOfColumns;
    }

    public static void GraphicDelimiter() {
        System.out.println("********************************************************************************************************************************");
    }
}
