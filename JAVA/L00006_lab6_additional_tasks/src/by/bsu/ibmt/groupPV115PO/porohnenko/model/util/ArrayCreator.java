/**
 * Lab work №6 additional task
 * Theme: class ArrayCreator
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

public class ArrayCreator {

    public static double[] createOne(int size) {
        return new double[size];
    }
    
    public static double[][] createMulti(int strings, int columns) {
        return new double[strings][columns];
    }
}
