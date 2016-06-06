/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: individual task 9. AIRLINE
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.LogisticTerminal;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetCreator;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ViewReport;

public class AustrianAirlines {

    private static int totalPassengerCapacity;
    private static double totalLoad;

    public static void main(String[] args) {

        AircraftHangar.create();

        totalPassengerCapacity = LogisticTerminal.CalculateTotalPassengerCapacity(FleetCreator.getFleet());
        totalLoad = LogisticTerminal.CalculateTotalLoad(FleetCreator.getFleet());

        ViewReport.printFleet();

        ViewReport.viewTotalPassengerCapacity(totalPassengerCapacity);
        ViewReport.viewTotalLoadCapacity(totalLoad);

        ViewReport.SelectAircraft();
    }
}
