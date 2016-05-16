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

public class TransportAircraft extends Aircraft {

    private int loadingCapacity;
    private int passengerCapacity;

    public TransportAircraft(int loadingCapacity, int passengerCapacity, String model, int flyingRange, int maxTakeoffWeight, int age, int numberOfEngines) {
        super(model, flyingRange, maxTakeoffWeight, age, numberOfEngines);
        this.loadingCapacity = loadingCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Passenger capacity" + passengerCapacity + "Loading capacity: " + loadingCapacity;
    }
}
