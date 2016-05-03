/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.ibmt.mvcProject.model.util;

import java.util.Random;

/**
 *
 * @author user
 */
public class Initializer {
    public static void init(int[] array, int min, int max) {
        Random random = new Random();  
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min) + min;            
        }     
    }    
}
