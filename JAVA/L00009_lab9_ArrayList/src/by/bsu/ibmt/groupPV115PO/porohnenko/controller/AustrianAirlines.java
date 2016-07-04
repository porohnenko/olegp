/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: individual task 9. AIRLINE "Austrian Airlines"
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.comparator.SortByLoadingCapacity;
import by.bsu.ibmt.groupPV115PO.porohnenko.comparator.SortByPassengerCapacity;
import by.bsu.ibmt.groupPV115PO.porohnenko.comparator.SortByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.LogisticTerminal;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetCreator;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.PrintReport;
import java.util.logging.Logger;

public class AustrianAirlines {

    private static int totalPassengerCapacity;
    private static double totalLoad;

    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {

        AircraftHangar hangar = FleetCreator.create(10);
        AircraftHangar hangar1 = FleetCreator.create(10);
        AircraftHangar hangar2 = FleetCreator.create(10);

        //Calculation total passenger and load capacity if aircarft in current hangar
        totalPassengerCapacity = LogisticTerminal.CalculateTotalPassengerCapacity(hangar);
        totalLoad = LogisticTerminal.CalculateTotalLoad(hangar);

        //Output report and user dialog block
        PrintReport.printFleet(hangar, new SortByRange());
        PrintReport.printFleet(hangar1, new SortByPassengerCapacity());
        PrintReport.printFleet(hangar2, new SortByLoadingCapacity());
        
        PrintReport.viewTotalPassengerCapacity(totalPassengerCapacity);
        PrintReport.viewTotalLoadCapacity(totalLoad);
        //PrintReport.SelectAircraft(hangar);
        LOG.info("test info...");
    }
}
