/**
 * Lab work №3: Additional task3
 * Theme: Game 'Dice'
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 22, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.pv115po.porohnenko.lab3.additional.task3;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        int dice_1;
        int dice_2;

        Random ran = new Random(System.currentTimeMillis());

        dice_1 = ran.nextInt(6) + 1;
        dice_2 = ran.nextInt(6) + 1;
        System.out.println("Dice #1 has shown number: " + dice_1);
        System.out.println("Dice #2 has shown number: " + dice_2);
        System.out.println("Sum of dices is " + (dice_1 + dice_2));
    }
}
