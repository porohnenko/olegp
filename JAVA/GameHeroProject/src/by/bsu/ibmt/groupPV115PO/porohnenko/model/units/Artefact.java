/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jul 8, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.model.units;

public class Artefact {

    private String name;
    private int force;
    private int protection;
    private int cost;
    private int level;

    public Artefact(String name, int force, int protection, int cost, int level) {
        this.name = name;
        this.force = force;
        this.protection = protection;
        this.cost = cost;
        this.level = level;
    }

    public int getForce() {
        return force;
    }

    public int getProtection() {
        return protection;
    }

    public int getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artefact{" + "name=" + name + ", force=" + force + ", protection=" + protection + ", cost=" + cost + ", level=" + level + '}' + "\n";
    }

}
