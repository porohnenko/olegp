/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class LogisticTerminal
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

        for (Aircraft A : hangar.hangar) {
            sumRange += A.getPassengerCapacity();
        }
        return sumRange;
    }

    public static double CalculateTotalLoad(AircraftHangar hangar) {
        double sumLoad = 0;

        for (Aircraft A : hangar.hangar) {
            sumLoad += A.getLoadingCapacity();
        }
        return sumLoad;
    }

    public static void SelectDesiredAircraft(int range) {
        System.out.println("\nThe Austrian Airlines can provide next planes: ");

        for (int i = 0; i < AircraftHangar.getHangar().size(); i++) {
            if (AircraftHangar.getRange(i) > range) {
                System.out.println(AircraftHangar.getAircraft(i));
            }
        }
    }
}