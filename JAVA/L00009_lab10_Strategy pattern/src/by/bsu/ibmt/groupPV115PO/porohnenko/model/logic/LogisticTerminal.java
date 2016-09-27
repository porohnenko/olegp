/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class LogisticTerminal
 * Group: PV1-15PO
 *
 * @author: Oleg Porohnenko Date: May 16, 2016 Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.exceptions.LogicException;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.Aircraft;

public class LogisticTerminal {

    public static int calculateTotalPassengerCapacity(AircraftHangar hangar) throws LogicException {

        int sumRange = 0;

//        for (Aircraft A : hangar.getHangar()) {
//            try {
//                sumRange += A.getPassengerCapacity();
//                if (sumRange < 0) {
//                    throw new LogicException("Negative value!");
//                }
//            } catch (LogicException LE) {
//                throw LE;
//            }
//        }
        for (Aircraft A : hangar.getHangar()) {

            sumRange += A.getPassengerCapacity();

        }
        return sumRange;
    }

    public static double calculateTotalLoad(AircraftHangar hangar) throws LogicException {
        double sumLoad = 0;

        for (Aircraft A : hangar.getHangar()) {
            try {
                sumLoad += A.getLoadingCapacity();
                if (sumLoad < 0) {
                    throw new LogicException("Negative value!");
                }
            } catch (LogicException LE) {
                throw LE;
            }

        }
        return sumLoad;
    }

}
