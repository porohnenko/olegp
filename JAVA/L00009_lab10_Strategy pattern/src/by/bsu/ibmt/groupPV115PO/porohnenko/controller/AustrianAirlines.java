/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: individual task 9. AIRLINE "Austrian Airlines"
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.exceptions.LogicException;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.FirstHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.sortableEntity.SortByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.comparator.CompareByLoadingCapacity;
import by.bsu.ibmt.groupPV115PO.porohnenko.comparator.CompareByPassengerCapacity;
import by.bsu.ibmt.groupPV115PO.porohnenko.comparator.CompareByRange;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.sortableEntity.SortByLoad;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.sortableEntity.SortByPassenger;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.LogisticTerminal;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetCreator;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.PrintReport;
import java.util.logging.Logger;

public class AustrianAirlines {

    private static int totalPassengerCapacity;
    private static double totalLoad;
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) throws LogicException {

        AircraftHangar firstHangar = new FirstHangar();

        firstHangar = FleetCreator.create(5);

        /**
         * Calculation total passenger and load capacity if aircarft in current
         * hangar
         */
        totalPassengerCapacity = LogisticTerminal.CalculateTotalPassengerCapacity(firstHangar);
        totalLoad = LogisticTerminal.CalculateTotalLoad(firstHangar);

        CompareByRange s1 = new CompareByRange();
        CompareByLoadingCapacity s2 = new CompareByLoadingCapacity();
        CompareByPassengerCapacity s3 = new CompareByPassengerCapacity();

        firstHangar.sort(firstHangar);
        PrintReport.printFleet(firstHangar, " ");

        firstHangar.setSortable(new SortByRange());
        firstHangar.sort(firstHangar);
        PrintReport.printFleet(firstHangar, s1.toString());

        firstHangar.setSortable(new SortByLoad());
        firstHangar.sort(firstHangar);
        PrintReport.printFleet(firstHangar, s2.toString());

        firstHangar.setSortable(new SortByPassenger());
        firstHangar.sort(firstHangar);
        PrintReport.printFleet(firstHangar, s3.toString());

        /**
         * Output report and user dialog block
         */
        PrintReport.viewTotalPassengerCapacity(totalPassengerCapacity);
        PrintReport.viewTotalLoadCapacity(totalLoad);

        PrintReport.SelectAircraft(firstHangar);

        LOG.info("test info...");
    }
}
