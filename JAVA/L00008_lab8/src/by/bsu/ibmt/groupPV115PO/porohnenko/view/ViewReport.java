/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class ViewReport
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.view;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.LogisticTerminal;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetSortingByRangeASC;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.InitSelectByRange;
import java.util.Collections;
import java.util.Scanner;

public class ViewReport {

    private static int select;

    public static void printFleet() {
        System.out.println("Company: Austrian Airlines");
        System.out.println("\nList of aircraft: \tsorted by flying range"
                + "\n------------------------------------------------------------"
                + "-----------------------------------------------------------------"
                + "-----------------------------------------------------------------");

        Collections.sort(AircraftHangar.getHangar(), new FleetSortingByRangeASC());

        for (Aircraft aircraft
                : AircraftHangar.getHangar()) {
            System.out.println(aircraft);
        }
    }

    public static void SelectAircraft() {
        while (true) {
            System.out.print("\nDo you want to select route? (Y/N?): ");
            Scanner sc1 = new Scanner(System.in);
            if (sc1.next().equalsIgnoreCase("n")) {
                System.out.println("\n\n");
                break;
            } else {
                System.out.println("Available routes:");
                System.out.println("1: Munich - Minsk");
                System.out.println("2: Munich - Reykjavik");
                System.out.println("3: Vienna - Gran Canaria");
                System.out.println("4: Vienna - Miami");
                System.out.println("5: Vienna - Tokyo");
                System.out.println("6: Vienna - Chicago");
                System.out.println("7: Vienna - St.Petersburg");
                System.out.print("\nSelect route: ");

                Scanner sc2 = new Scanner(System.in);
                String line = sc2.nextLine();
                select = Integer.parseInt(line);

                int range = InitSelectByRange.init(select);
                LogisticTerminal.SelectDesiredAircraft(range);
            }
        }
    }
}
