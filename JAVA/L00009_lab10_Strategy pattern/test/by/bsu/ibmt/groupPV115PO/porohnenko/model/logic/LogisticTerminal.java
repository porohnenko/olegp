/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class LogisticTerminal
 * Group: PV1-15PO
 * @author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.Aircraft;
import org.junit.Test;
import static org.junit.Assert.*;


public class LogisticTerminal {

    @Test
    public void testCalculateTotalPassengerCapacity() {
        
        int rezult = 0;

        for (Aircraft A : value.getHangar()) {
            rezult += A.getPassengerCapacity();
        }

    }

    public static double testCalculateTotalLoad(AircraftHangar value) {
        double sumLoad = 0;

        for (Aircraft A : value.getHangar()) {
            sumLoad += A.getLoadingCapacity();
        }
        return sumLoad;
    }

    
}
