/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.view;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetSortingByRangeASC;
import java.util.Collections;
import java.util.Scanner;

public class ViewReport {

    public static void printFleet() {
        System.out.println("Company: Austrian Airlines");
        System.out.println("\nList of aircraft: \tsorted by flying range"
                + "\n------------------------------------------------------------"
                + "-----------------------------------------------------------------"
                + "-----------------------------------------------------------------");

        Collections.sort(AircraftHangar.getList(), new FleetSortingByRangeASC());

        for (Aircraft aircraft
                : AircraftHangar.getList()) {
            System.out.println(aircraft);
        }
    }

    public static void SelectAircraft() {
        while (true) {
            System.out.print("\nDo you want to select aircraft? (Y/N?): ");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equalsIgnoreCase("n")) {
                System.out.println("\n\n");
                break;
            }
        }
    }
    
}
