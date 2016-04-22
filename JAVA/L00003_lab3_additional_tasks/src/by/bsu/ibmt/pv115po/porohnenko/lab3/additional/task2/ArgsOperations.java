/**
 * Lab work №3. Additional task 2
 * Theme: Arithmetic operations over arguments of a command line
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 22, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.pv115po.porohnenko.lab3.additional.task2;

public class ArgsOperations {

    public static void main(String[] args) {

        int sum = 0;
        int p = 1;
        int max = 0;
        int min = 1000000;

        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            sum += value;
            p = p * value;
        }
        System.out.println("Summ of arguments: " + sum);
        System.out.println("Arguments multiplication: " + p);

        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max argument: " + max);
        
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            
            if (min > value) {
                min = value;
            }
        }
        System.out.println("Min argument: " + min);
    }
}
