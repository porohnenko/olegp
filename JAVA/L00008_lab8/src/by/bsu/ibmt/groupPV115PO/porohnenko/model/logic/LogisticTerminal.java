/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;

public class LogisticTerminal {

    public static int CalculateTotalPassengerCapacity(AircraftHangar hangar) {
        int sumRange = 0;

        for (Aircraft A : hangar.list) {
            sumRange += A.getPassengerCapacity();
        }
        return sumRange;
    }

    public static double CalculateTotalLoad(AircraftHangar hangar) {
        double sumLoad = 0;

        for (Aircraft A : hangar.list) {
            sumLoad += A.getLoadingCapacity();
        }
        return sumLoad;
    }
}
