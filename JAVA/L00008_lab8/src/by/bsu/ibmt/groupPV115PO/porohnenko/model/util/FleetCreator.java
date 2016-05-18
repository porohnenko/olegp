/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;

public class FleetCreator {

    private static AircraftHangar hangar = new AircraftHangar();

    public static AircraftHangar getHangar() {
        return hangar;
    }

}
