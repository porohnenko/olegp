/**
 * Lab work №8 Basics OOP, principles GRASP, SOLID. Pattern MVS
 * Theme: class Aircraft
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs;

public class Aircraft implements Comparable<Aircraft> {

    private String model;
    private String boardNumber;
    private int flyingRange;
    private int maxTakeoffWeight;
    private int age;
    private int numberOfEngines;
    private int passengerCapacity;
    private int loadingCapacity;

    public Aircraft() {
    }

    public Aircraft(
            String model,
            String boardNumber,
            int flyingRange,
            int maxTakeoffWeight,
            int age,
            int numberOfEngines,
            int passengerCapacity,
            int loadingCapacity) {
        this.model = model;
        this.boardNumber = boardNumber;
        this.flyingRange = flyingRange;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.age = age;
        this.numberOfEngines = numberOfEngines;
        this.passengerCapacity = passengerCapacity;
        this.loadingCapacity = loadingCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getFlyingRange() {
        return flyingRange;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\tBoard number: " + boardNumber + "\nFlying range, km: "
                + flyingRange + " | Max takeoff weight, kg: " + maxTakeoffWeight + "| Age, years: "
                + age + " | Number of engines: " + numberOfEngines + "| Passenger capacity: "
                + passengerCapacity + " | Loading capacity: " + loadingCapacity;
    }

    @Override
    public int compareTo(Aircraft A) {
        return model.compareTo(A.model);
    }
}
