/**
 * Lab work №6 additional task
 * Task: В одномерном массиве, состоящем из n вещественных элементов, вычислить:
 *       сумму отрицательных элементов массива и произведение элементов массива,
 *       расположенных между максимальным и минимальным элементами.
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 5, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.Searcher;

public class ArrayLogic_task1 {

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
