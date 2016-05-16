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
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.FleetCreator;

public class AustrianAirlines {

    public static void main(String[] args) {
        
        /*PassengerAircraft P = new PassengerAircraft(124, "Boeing 737-200", 2000, 20000, 15, 2);
        System.out.println(P);*/
        PassengerAircraft P1 = new PassengerAircraft(124, "Airbus A319-100", 6800, 17900, 9, 2);
        PassengerAircraft P2 = new PassengerAircraft(220, "Airbus A320-200", 5550, 18600, 12, 2);
        PassengerAircraft P3 = new PassengerAircraft(142, "Airbus A321-100", 5550, 23400, 19, 2);
        PassengerAircraft P4 = new PassengerAircraft(185, "Airbus A321-200", 5550, 23400, 14, 2);
        PassengerAircraft P5 = new PassengerAircraft(261, "Boeing 767-300", 11000, 43800, 14, 2);
        PassengerAircraft P6 = new PassengerAircraft(357, "Boeing 777-200", 17450, 50850, 8, 2);
        PassengerAircraft P7 = new PassengerAircraft(78, "Fokker F70", 3740, 10890, 19, 2);
        PassengerAircraft P8 = new PassengerAircraft(107, "Fokker F100", 3100, 12000, 21, 2);
        TransportAircraft T1 = new TransportAircraft(77500, 102, "Boeing C-17 Globemaster III", 4445, 265350, 20, 4);
        
        //FleetCreator.create();
        AircraftHangar hangar= new AircraftHangar();
        
        hangar.add(P1);
        hangar.add(P2);
        hangar.add(P3);
        hangar.add(P4);
        hangar.add(P5);
        hangar.add(P6);
        hangar.add(P7);
        hangar.add(P8);
        
        System.out.println(hangar);        
    }
}