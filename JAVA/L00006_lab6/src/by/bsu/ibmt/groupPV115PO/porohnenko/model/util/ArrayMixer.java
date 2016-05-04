/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 27, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import java.util.Random;

public class ArrayMixer {

    public static char[] Mixer(char[] array) {

        Random r = new Random();
        r.nextInt();

        for (int i = 0; i < array.length; i++) {
            int newIndex = i + r.nextInt(array.length - i);
            swap(array, i, newIndex);
        }
        return array;
    }

    public static void swap(char[] arr, int index, int change) {
        char tmp = arr[index];
        arr[index] = arr[change];
        arr[change] = tmp;
    }
}
