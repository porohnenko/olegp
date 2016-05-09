/**
 * Lab work №7: individual task A (number 19)
 * Task: Найти максимальный среди всех элементов тех строк заданной матрицы, 
 *       которые упорядочены (либо по возрастанию, либо по убыванию).
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 5, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.Searcher;

public class ArrayLogic_task_A {

    private static String message1 = "Sum of negative elements: ";
    private static String message2 = "Multiplication of elements between Min and Max: ";
    private static double sum = 0;
    private static double mult = 1;

    public static double Sum(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double Mult(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Searcher.FindMin(array)&& array[i] < Searcher.FindMax(array)) {
                mult *= array[i];
            }
        }
        return mult;
    }

    public static String getMessage1() {
        return message1;
    }

    public static String getMessage2() {
        return message2;
    }
}
