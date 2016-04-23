/**
 * Lab work №3. Additional task6
 * Theme:Calculator heads of the dragon
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 23, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.pv115po.porohnenko.lab3.additional.task6;

import java.util.Scanner;

public class DragonHeads {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {

            int age = 0;
            int heads = 1;
            int eye;
            int limitAge = 100;

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("\nPlease, enter age of a dragon (years): ");
                String line = sc.nextLine();

                try {
                    age = Integer.parseInt(line);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("*****Sorry, you entered is not an integer!*****");
                }
            }

            if (age < limitAge) {
                heads = 3 * age;
            } else if (age >= limitAge) {
                heads = 3 * limitAge + 2 * (age - limitAge);
            }

            eye = 2 * heads;

            System.out.println("\n*******************************************"
                    + "****************************");
            System.out.println("The dragon at the age of " + age
                    + " years has " + heads + " heads and " + eye + " eyes.");
            System.out.println("*********************************************"
                    + "**************************");
            Scanner sc = new Scanner(System.in);
            System.out.print("\nTry again? (Y/N?): ");
            if (sc.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
