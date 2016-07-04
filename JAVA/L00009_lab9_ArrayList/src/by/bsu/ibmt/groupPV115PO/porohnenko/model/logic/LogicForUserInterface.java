/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.AircraftHangar;

public class LogicForUserInterface {

    public static void SelectDesiredAircraft(AircraftHangar a, int range) {

        System.out.println("\nThe Austrian Airlines can provide next planes: ");

        for (int i = 0; i < a.getHangar().size(); i++) {
            if (a.getRange(i) > range) {
                System.out.println(a.getAircraft(i));
            }
        }
    }
}
