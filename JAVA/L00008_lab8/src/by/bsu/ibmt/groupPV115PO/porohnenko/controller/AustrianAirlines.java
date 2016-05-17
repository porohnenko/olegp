/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

//import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.PassengerAircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.PassengerAircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.TransportAircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.LogistikTerminal;

public class AustrianAirlines {

    public static void main(String[] args) {

        PassengerAircraft P1 = new PassengerAircraft(true, "Airbus A319-100", "OE-LDG", 6800, 75000, 9, 2, 124, 0);
        PassengerAircraft P2 = new PassengerAircraft(true, "Airbus A320-200", "OE-LBL", 5550, 77000, 12, 2, 220, 0);
        PassengerAircraft P3 = new PassengerAircraft(true, "Airbus A321-100", "OE-LBC", 5550, 93500, 19, 2, 142, 0);
        PassengerAircraft P4 = new PassengerAircraft(true, "Airbus A321-200", "OE-LAE", 5550, 93500, 14, 2, 185, 0);
        PassengerAircraft P5 = new PassengerAircraft(true, "Boeing 767-300", "OE-LAE", 11000, 158760, 14, 2, 261, 0);
        PassengerAircraft P6 = new PassengerAircraft(true, "Boeing 777-200", "OE-LPD", 17450, 247210, 8, 2, 357, 0);
        PassengerAircraft P7 = new PassengerAircraft(false, "Fokker F70", "OE-LFR", 3740, 36740, 19, 2, 80, 0);
        PassengerAircraft P8 = new PassengerAircraft(true, "Fokker F100", "OE-LVD", 3100, 12000, 21, 2, 100, 11563);
        TransportAircraft T1 = new TransportAircraft(true, "Boeing C-17 Globemaster III", "98-0057", 4445, 265350, 20, 4, 102, 77500);

        AircraftHangar hangar = new AircraftHangar();

        hangar.add(P1);
        hangar.add(P1);
        hangar.add(P1);

        hangar.add(P2);
        hangar.add(P2);
        hangar.add(P2);
        hangar.add(P2);
        hangar.add(P2);

        hangar.add(P3);
        hangar.add(P3);
        hangar.add(P3);
        hangar.add(P3);

        hangar.add(P4);
        hangar.add(P4);
        hangar.add(P4);
        hangar.add(P4);
        hangar.add(P4);
        hangar.add(P4);

        hangar.add(P5);
        hangar.add(P6);
        hangar.add(P7);
        hangar.add(P8);
        hangar.add(T1);

        System.out.println(hangar);

        double totalPassengerCapacity = LogistikTerminal.CalculateTotalPassengerCapacity(hangar);
        double totalLoad = LogistikTerminal.CalculateTotalLoad(hangar);

        System.out.println("Total passenger capacity: " + totalPassengerCapacity);
        System.out.println("Total load capacity: " + totalLoad);
    }
}
