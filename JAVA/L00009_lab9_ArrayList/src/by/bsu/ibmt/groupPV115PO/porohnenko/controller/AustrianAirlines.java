/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: individual task 9. AIRLINE "Austrian Airlines"
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.FirstHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.sortableEntity.SortByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.comparator.CompareByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.Aircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.LogisticTerminal;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetCreator;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.PrintReport;
import java.util.logging.Logger;

public class AustrianAirlines {

    private static int totalPassengerCapacity;
    private static double totalLoad;
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {

        AircraftHangar hangar = new AircraftHangar();

        hangar = FleetCreator.create(3);

        /**
         * Calculation total passenger and load capacity if aircarft in current
         * hangar
         */
        totalPassengerCapacity = LogisticTerminal.CalculateTotalPassengerCapacity(hangar);
        totalLoad = LogisticTerminal.CalculateTotalLoad(hangar);

        CompareByRange s1 = new CompareByRange();

        FirstHangar first = new FirstHangar();
        first.sort(hangar);

        first.setSortable(new SortByRange());
        //first.sort(hangar);
        
        for (Aircraft aircraft : hangar.getHangar()) {
            System.out.print(aircraft);
        }

        /**
         * Output report and user dialog block
         */
        //PrintReport.printFleet(hangar, s1.toString());

        PrintReport.viewTotalPassengerCapacity(totalPassengerCapacity);
        PrintReport.viewTotalLoadCapacity(totalLoad);

        LOG.info("test info...");
        System.out.println(hangar);
    }

}
