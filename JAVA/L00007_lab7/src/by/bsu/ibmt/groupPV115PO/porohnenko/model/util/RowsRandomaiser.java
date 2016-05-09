/**
 * Lab work №7
 * Theme: class RowsRandomaiser
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import java.util.Random;

public class RowsRandomaiser {

    public static int randomaiser(int rows) {
        Random random = new Random(System.currentTimeMillis());
        int selectedRow = random.nextInt(rows);
        return selectedRow;
    }
}
