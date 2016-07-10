/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class InitSelectByRange
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.exceptions.OutOfBandException;

public class InitSelectByRange {

    public static int init(int i) throws OutOfBandException {
        int range = 0;
        try {
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

            if (i > 7 || i < 0) {
                throw new OutOfBandException("Out of band selection!");
            }
        } catch (OutOfBandException OB) {
            throw (OB);
        }
        return range;
    }
}
