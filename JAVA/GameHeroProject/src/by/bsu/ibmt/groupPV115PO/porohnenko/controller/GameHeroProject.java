/**
 * Lab work №
 * Theme: 
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jul 8, 2016
 * Version: 1.0
 */

package by.bsu.ibmt.groupPV115PO.porohnenko.controller;


import by.bsu.ibmt.groupPV115PO.porohnenko.model.units.Armor;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.units.Artefact;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.units.LifeSymbol;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.units.Shield;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.units.Spear;

import java.util.ArrayList;
import java.util.List;


public class GameHeroProject {
    public static void main(String[] args) {
        Armor armor = new Armor("Armor", 20, 30, 200, 15);
        Shield shield = new Shield("Shield", 30, 40, 350, 25);
        Spear spear = new Spear("Spear", 15, 20, 150, 10);
        LifeSymbol ls = new LifeSymbol("LifeSymbol", 50, 70, 1000, 60);
        
        List<Artefact> artefacts = new ArrayList<Artefact>();
        
        artefacts.add(armor);
        artefacts.add(shield);
        artefacts.add(spear);
        artefacts.add(ls);
               System.out.println(artefacts); 

    }
        
}
