/**
 * Lab work № ...
 * Theme: ...
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 26, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayCreator;
//import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayInitialiser;
import java.util.Random;
//import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.Randomiser;

public class GameController {

    public static void main(String[] args) {
        int size = 20;
        Random r = new Random();
        int index = r.nextInt(49);
        
        char[] array = ArrayCreator.create(size, index);
        System.out.println("Word: " + array);
        
    }

}
