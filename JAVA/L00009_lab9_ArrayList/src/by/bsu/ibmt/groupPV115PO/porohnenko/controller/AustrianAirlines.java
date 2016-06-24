/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: individual task 9. AIRLINE "Austrian Airlines"
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.LogisticTerminal;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetCreator;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.PrintReport;

public class AustrianAirlines {

    private static int totalPassengerCapacity;
    private static double totalLoad;

    public static void main(String[] args) {

        AircraftHangar hangar = FleetCreator.create(10);

        //Calculation total passenger and load capacity if aircarft in current hangar
        totalPassengerCapacity = LogisticTerminal.CalculateTotalPassengerCapacity(hangar);
        totalLoad = LogisticTerminal.CalculateTotalLoad(hangar);

        //Output report and user dialog block
        PrintReport.printFleet(hangar);
        PrintReport.viewTotalPassengerCapacity(totalPassengerCapacity);
        PrintReport.viewTotalLoadCapacity(totalLoad);
        PrintReport.SelectAircraft(hangar);
    }
}
