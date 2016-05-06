/**
 * Lab work №6
 * Theme: Arrays and MVS Pattern. The class implements the game "Anagrams".
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
import java.util.Scanner;

public class Anagrams {

    private static int size; //size of main word's array
    private static int index; //generate random word position in word's array

    public static void main(String[] args) {

        ConsoleView.StartMessage();
        size = WordsCounter.count(WordSelector.getMainArray());

        while (true) {

            index = Randomiser.randomIndex(size);

            //view number of random selected word
            ConsoleView.printNumber(index);

            //random word selecting
            WordSelector.init(index);

            //removing gaps
            ArrayCleaner.cleaner(WordSelector.getSimpleArray());

            //print anagram
            ConsoleView.MessageAnagram();
            ConsoleView.printMassiv(ArrayMixer.Mixer(ArrayCleaner.getClearArr()));

            //ConsoleView.outputChar(ConsoleView.getUserWord());
            GameLogic.logic();

            //clean array-container
            //ArrayCleaner.ClearSimpleArray();
            System.out.print("\nDo you want to play again? (Y/N?): ");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equalsIgnoreCase("n")) {
                System.out.println("\n\n");
                break;
            }
        }
    }

    public static int getIndex() {
        return index;
    }
}
