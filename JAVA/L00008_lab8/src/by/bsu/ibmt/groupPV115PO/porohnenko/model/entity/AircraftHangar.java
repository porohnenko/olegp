/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;
import java.util.ArrayList;
import java.util.List;

public class AircraftHangar {

    public static List<Aircraft> list = new ArrayList<Aircraft>();

    public static void create() {
        list.add(new PassengerAircraft(true, "Airbus A319-100", "OE-LDG", 6850, 75000, 9, 2, 124, 13200));
        list.add(new PassengerAircraft(true, "Airbus A320-200", "OE-LBL", 6100, 78000, 12, 2, 220, 16600));
        list.add(new PassengerAircraft(true, "Airbus A321-100", "OE-LBC", 5950, 93500, 19, 2, 142, 21200));
        list.add(new PassengerAircraft(true, "Airbus A321-200", "OE-LAE", 5950, 93500, 14, 2, 185, 21200));
        list.add(new PassengerAircraft(true, "Boeing 767-300", "OE-LAE", 11000, 158760, 14, 2, 261, 15000));
        list.add(new PassengerAircraft(true, "Boeing 777-200", "OE-LPD", 17450, 247210, 8, 2, 357, 17000));
        list.add(new PassengerAircraft(false, "Fokker F70", "OE-LFR", 3740, 36740, 19, 2, 80, 9000));
        list.add(new PassengerAircraft(true, "Fokker F100", "OE-LVD", 3100, 12000, 21, 2, 100, 11563));
        list.add(new TransportAircraft(true, "Boeing C-17", "98-0057", 4445, 265350, 20, 4, 102, 77500));
    }

    public static List<Aircraft> getList() {
        return list;
    }

//    @Override
//    public String toString() {
//        StringBuilder str = new StringBuilder();
//
//        for (Aircraft A : list) {
//            str.append(A.toString()).append("\n");
//        }
//        return str.toString();
//    }
}
