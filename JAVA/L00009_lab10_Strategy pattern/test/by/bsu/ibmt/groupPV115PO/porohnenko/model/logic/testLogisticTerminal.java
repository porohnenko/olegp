/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class LogisticTerminal
 * Group: PV1-15PO
 *
 * @author: Oleg Porohnenko Date: May 16, 2016 Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.logic;

import by.bsu.ibmt.groupPV115PO.porohnenko.exceptions.LogicException;
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
    public void testCalculateTotalPassengerCapacity() throws LogicException {

        int a = 100;
        int b = 110;
        int c = 120;
        int d = 130;
        int e = 140;
        int result = a + b + c + d + e;

        List<Aircraft> testList = new ArrayList<Aircraft>();

        testList.add(new BigPassengerAircraft(true, "Test1", "Test1", 1, 1, 1, 100, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test2", "Test2", 1, 1, 1, 110, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test3", "Test3", 1, 1, 1, 120, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test4", "Test4", 1, 1, 1, 130, 1, 1));
        testList.add(new BigPassengerAircraft(true, "Test5", "Test5", 1, 1, 1, 140, 1, 1));
       
        AircraftHangar testHangar = new FirstHangar();

        FirstHangar.setHangar(testList);

        assertEquals(result, LogisticTerminal.calculateTotalLoad(testHangar));

    }

//    public static double testCalculateTotalLoad(AircraftHangar value) {
//        double sumLoad = 0;
//
//        for (Aircraft A : value.getHangar()) {
//            sumLoad += A.getLoadingCapacity();
//        }
//        return sumLoad;
//    }

}
