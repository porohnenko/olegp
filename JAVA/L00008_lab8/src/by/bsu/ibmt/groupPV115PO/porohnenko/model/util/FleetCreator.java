/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.PassengerAircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.TransportAircraft;

public class FleetCreator {

    public static void create() {
        PassengerAircraft P1 = new PassengerAircraft(124, "Airbus A319-100", 6800, 17900, 9, 2);
        PassengerAircraft P2 = new PassengerAircraft(220, "Airbus A320-200", 5550, 18600, 12, 2);
        PassengerAircraft P3 = new PassengerAircraft(142, "Airbus A321-100", 5550, 23400, 19, 2);
        PassengerAircraft P4 = new PassengerAircraft(185, "Airbus A321-200", 5550, 23400, 14, 2);
        PassengerAircraft P5 = new PassengerAircraft(261, "Boeing 767-300", 11000, 43800, 14, 2);
        PassengerAircraft P6 = new PassengerAircraft(357, "Boeing 777-200", 17450, 50850, 8, 2);
        PassengerAircraft P7 = new PassengerAircraft(78, "Fokker F70", 3740, 10890, 19, 2);
        PassengerAircraft P8 = new PassengerAircraft(107, "Fokker F100", 3100, 12000, 21, 2);
        TransportAircraft T1 = new TransportAircraft(77500, 102, "Boeing C-17 Globemaster III", 4445, 265350, 20, 4);
    }
}
