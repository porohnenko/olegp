/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class FleetCreator
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;

public class FleetCreator {

    private static AircraftHangar Fleet = new AircraftHangar();

    public static AircraftHangar getFleet() {
        return Fleet;
    }
}
