/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class LogisticTerminal
 * Group: PV1-15PO
 *
 * @author: Oleg Porohnenko Date: May 16, 2016 Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.FirstHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.Aircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.BigPassengerAircraft;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class testLogisticTerminal {

    @Test
    public void testCalculateTotalPassengerCapacity() {

        int a = 1000;
        int b = 2000;
        int c = 2000;
        int d = 2000;
        int e = 2000;
        int result = a + b + c + d + e;
        int sumRange = 0;

        List<Aircraft> testList = new ArrayList<Aircraft>();

        testList.add(new BigPassengerAircraft(true, "Test1", "Test1", 1000, 1, 1, 1, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test2", "Test2", 2000, 1, 1, 1, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test3", "Test3", 3000, 1, 1, 1, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test4", "Test4", 4000, 1, 1, 1, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test5", "Test5", 5000, 1, 1, 1, 1, 1));

//        AircraftHangar testHangar = new FirstHangar();
//
//        for (Aircraft A : testList) {
//            sumRange += A.getPassengerCapacity();
//        }

        assertEquals(result, LogisticTerminal.CalculateTotalLoad(testList));

    }

    public static double testCalculateTotalLoad(AircraftHangar value) {
        double sumLoad = 0;

        for (Aircraft A : value.getHangar()) {
            sumLoad += A.getLoadingCapacity();
        }
        return sumLoad;
    }

}
