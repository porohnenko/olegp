/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.ibmt.MVCProject.controller.logic;

/**
 *
 * @author olegp
 */
public class ArrayWorker {
    public static void main(String[] array) {
        //logic
      
        int min = array[0];
         
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
    }
}
