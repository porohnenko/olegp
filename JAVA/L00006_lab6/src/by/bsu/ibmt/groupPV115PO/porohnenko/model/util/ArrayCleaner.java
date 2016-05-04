/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 4, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

public class ArrayCleaner {

    public static char[] clearArr;
    public static int newSize = 0;

    public static void cleaner(char[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newSize++;
            }
        }
        clearArr = new char[newSize];
        for (int i = 0; i < newSize; i++) {
            if (array[i] != '*') {
                clearArr[i] = array[i];
            }
        }
    }

    public static char[] getClearArr() {
        return clearArr;
    }
}
