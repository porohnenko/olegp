/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs.Aircraft;

public class LongHaulFleet extends Aircraft {

    private int passengerCapacity;

    public LongHaulFleet(int passengerCapacity, String model, int flyingRange, int maxTakeoffWeight, int age, int numberOfEngines) {
        super(model, flyingRange, maxTakeoffWeight, age, numberOfEngines);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Passenger capacity: " + passengerCapacity;
    }
}
