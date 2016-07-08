/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class FleetCreator
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 16, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.util;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.FirstHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abstractEntity.AircraftHangar;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.Aircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.BigPassengerAircraft;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.BusinesJet;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.units.TransportAircraft;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FleetCreator extends FirstHangar{

    private static int select = 0;

    public static AircraftHangar create(int count) {

        List<Aircraft> typesOfAircraft = new ArrayList<Aircraft>();

        typesOfAircraft.add(new BigPassengerAircraft(true, "Airbus A319-100", "OE-LDG", 6850, 75000, 9, 2, 124, 13200));
        typesOfAircraft.add(new BigPassengerAircraft(false, "Airbus A320-200", "OE-LBL", 6100, 78000, 12, 2, 220, 16600));
        typesOfAircraft.add(new BigPassengerAircraft(true, "Airbus A321-100", "OE-LBC", 5950, 93500, 19, 2, 142, 21200));
        typesOfAircraft.add(new BigPassengerAircraft(false, "Airbus A321-200", "OE-LAE", 5950, 93500, 14, 2, 185, 21200));
        typesOfAircraft.add(new BigPassengerAircraft(true, "Boeing 767-300", "OE-LAE", 11000, 158760, 14, 2, 261, 15000));
        typesOfAircraft.add(new BigPassengerAircraft(true, "Boeing 777-200", "OE-LPD", 17450, 247210, 8, 2, 357, 17000));
        typesOfAircraft.add(new BigPassengerAircraft(false, "Fokker F70", "OE-LFR", 3740, 36740, 19, 2, 80, 9000));
        typesOfAircraft.add(new BigPassengerAircraft(true, "Fokker F100", "OE-LVD", 3100, 12000, 21, 2, 100, 11563));
        typesOfAircraft.add(new TransportAircraft(true, "Boeing C-17", "98-0057", 4445, 265350, 20, 4, 102, 77500));
        typesOfAircraft.add(new BusinesJet(true, "Hawker Beechcraft 4000", "N1630K", 3283, 39500, 7, 2, 12, 1400));

        FirstHangar currentHangar = new FirstHangar();

        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < count; i++) {
            select = random.nextInt(typesOfAircraft.size());
            currentHangar.getHangar().add(typesOfAircraft.get(select));
            System.out.println("select = " + select);
        }
        return currentHangar;
    }
}
