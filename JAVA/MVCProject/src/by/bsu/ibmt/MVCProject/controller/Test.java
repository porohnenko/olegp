/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.ibmt.MVCProject.controller;

/**
 *
 * @author olegp
 */
public class Test {

    public static void main(String[] args) {
        int suze = 20;
        int[] array = ArrayCreater.create(size);

        Initialaizer.init(array, min, max);
        int max = ArrayWorker.findMax();
        int min = ArrayWorker.findMin();

        ConsolePrinter.print(max);
        ConsolePrinter.print(min);

    }
}
