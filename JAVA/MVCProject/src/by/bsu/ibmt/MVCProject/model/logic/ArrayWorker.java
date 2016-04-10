/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.ibmt.MVCProject.model.logic;

/**
 *
 * @author user
 */
public class ArrayWorker {
    public static int findMax(int[] array){
        int max = array[0];
        
        for (int element : array) {
            if (element > max){
                max = element;
            }
        }
        
        return max;
    }
    
    public static int findMin(int[] array){
        int min = array[0];
        
        for (int element : array) {
            if (element < min){
                min = element;
            }
        }
        
        return min;
    }
}
