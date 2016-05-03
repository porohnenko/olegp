/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 3, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

public class WordsCounter {

    public static int count(char[][] array) {

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != 0) {
                k++;
            }
        }
        return k;
    }
}
