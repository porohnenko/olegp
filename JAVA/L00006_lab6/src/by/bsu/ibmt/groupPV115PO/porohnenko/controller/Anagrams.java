/**
 * Lab work № ...
 * Theme: ...
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 26, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.groupPV115PO.porohnenko.controller;

import by.bsu.ibmt.groupPV115PO.porohnenko.model.logic.GameLogic;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayMixer;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.ArrayCleaner;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.Randomiser;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.WordSelector;
import by.bsu.ibmt.groupPV115PO.porohnenko.model.util.WordsCounter;
import by.bsu.ibmt.groupPV115PO.porohnenko.view.ConsoleView;

public class Anagrams {
    
    public static void main(String[] args) {
        
        int size = WordsCounter.count(WordSelector.getMainArray());
        int index = Randomiser.randomIndex(size);
        
        ConsoleView.printNumber(index);

        //ConsoleView.printArray(WordSelector.init(index));
        ConsoleView.printMassiv(WordSelector.init(index));
        ArrayCleaner.cleaner(WordSelector.getSimpleArray());
        char[] anagram = ArrayCleaner.getClearArr();
        
        ConsoleView.printMassiv(ArrayMixer.Mixer(anagram));
        
        ConsoleView.printMessage("\nPlease,insert your word: ");
        ConsoleView.inputData();
        ConsoleView.printMassiv(ConsoleView.getUserArray());
        GameLogic.Checker(ConsoleView.getUserArray());
    }
}
