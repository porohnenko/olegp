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

    public static void main(String[] args) {

        AircraftHangar.create();

        int totalPassengerCapacity = LogisticTerminal.CalculateTotalPassengerCapacity(FleetCreator.getHangar());
        double totalLoad = LogisticTerminal.CalculateTotalLoad(FleetCreator.getHangar());

        ViewReport.printFleet();

        System.out.println("Total passenger capacity: " + totalPassengerCapacity + " passengers");
        System.out.printf("Total load capacity: %.2f tonnes\n", totalLoad / 1000);

        ViewReport.SelectAircraft();
    }
}
