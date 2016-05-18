/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class InitSelectByRange
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

public class InitSelectByRange {

    public static int init(int i) {
        int range = 0;
        switch (i) {
            case 1:
                range = 999;
                break;
            case 2:
                range = 2934;
                break;
            case 3:
                range = 3549;
                break;
            case 4:
                range = 8748;
                break;
            case 5:
                range = 9164;
                break;
            case 6:
                range = 7575;
                break;
            case 7:
                range = 1574;
                break;
        }
        return range;
    }
}
