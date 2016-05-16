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

public class PassengerAircraft extends Aircraft {

    private int passengerCapacity;

    public PassengerAircraft(int passengerCapacity, String model, int flyingRange, int maxTakeoffWeight, int age, int numberOfEngines) {
        super(model, flyingRange, maxTakeoffWeight, age, numberOfEngines);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " | Passenger capacity: " + passengerCapacity;
    }
}
