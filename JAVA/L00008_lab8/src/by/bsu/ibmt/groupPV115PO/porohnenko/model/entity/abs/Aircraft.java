/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 15, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.entity.abs;

public class Aircraft {

    private String model;
    private int flyingRange;
    private int maxTakeoffWeight;
    private int age;
    private int numberOfEngines;

    public Aircraft(String model, int flyingRange, int maxTakeoffWeight, int age, int numberOfEngines) {
        this.model = model;
        this.flyingRange = flyingRange;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.age = age;
        this.numberOfEngines = numberOfEngines;
    }

    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public int getFlyingRange() {
        return flyingRange;
    }

    public void setFlyingRange(int flyingRange) {
        this.flyingRange = flyingRange;
    }

    public int getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public void setMaxTakeoffWeight(int maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public String toString() {
        return "Model: " + model + " | Flying range, km: " + flyingRange
                + " | Max takeoff weight, kg: " + maxTakeoffWeight + " | Age, years: "
                + age + " | Number of engines: "
                + numberOfEngines;
    }
}
