/**
 * Lab work №6
 * Theme: class ArrayCleaner
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 4, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

public class ArrayCleaner {

    private static char[] clearArr;
    private static int newSize;

    public static int getNewSize() {
        return newSize;
    }

    public static void cleaner(char[] array) {
        newSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newSize++;
            }
        }
        clearArr = new char[newSize];
        for (int i = 0; i < newSize; i++) {
            if (array[i] != 0) {
                clearArr[i] = array[i];
            }
        }
    }

    public static void ClearSimpleArray() {
        for (int i = 0; i < clearArr.length; i++) {
            clearArr[i] = 0;
        }
    }

    public static char[] getClearArr() {
        return clearArr;
    }
}
