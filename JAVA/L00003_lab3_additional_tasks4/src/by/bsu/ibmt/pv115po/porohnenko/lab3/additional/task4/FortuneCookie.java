/**
 * Lab work №3. Additional task4
 * Theme: Simulator of Fortune cookies
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 22, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.pv115po.porohnenko.lab3.additional.task4;

import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {

    public static void main(String[] args) {

        Scanner scanYN = new Scanner(System.in);

        while (true) {

            System.out.print("Open a cookie? (Y/N?) ");
            if (scanYN.next().equalsIgnoreCase("n")) {
                break;
            }

            String msg1 = "Stay true to those who would do the same for you.";
            String msg2 = "A chance meeting opens new doors to success and friendship.";
            String msg3 = "Don't worry, half the people you know are below average.";
            String msg4 = "May you have great luck.";
            String msg5 = "Good news from afar may bring you a welcome visitor.";
            String msg6 = "Demonstrate refinement in everything you do.";
            String msg7 = "Your succeess will astonish everyone.";
            String msg8 = "Your succeess will astonish everyone.";
            String msg9 = "Don't wait for your ship to come in, swim out to it";
            String msg10 = "Be patient: in time, even an egg will walk.";
            String msg11 = "Even though it will often be difficult and complicated,\nyou know you have what it takes to get it done.";
            String msg12 = "You will live long and enjoy life.";
            String msg13 = "Accept something that you cannot change, and you will feel better.";
            String msg14 = "Being alone and being lonely are two different things.";
            String msg15 = "There are big changes ahead for you. They will be good ones!";

            Random rnd = new Random(System.currentTimeMillis());

            int selection = rnd.nextInt(15) + 1;

            System.out.println("\n\n***********************************************************************");

            switch (selection) {
                case 1:
                    System.out.println(msg1);
                    break;
                case 2:
                    System.out.println(msg2);
                    break;
                case 3:
                    System.out.println(msg3);
                    break;
                case 4:
                    System.out.println(msg4);
                    break;
                case 5:
                    System.out.println(msg5);
                    break;
                case 6:
                    System.out.println(msg6);
                    break;
                case 7:
                    System.out.println(msg7);
                    break;
                case 8:
                    System.out.println(msg8);
                    break;
                case 9:
                    System.out.println(msg9);
                    break;
                case 10:
                    System.out.println(msg10);
                    break;
                case 11:
                    System.out.println(msg11);
                    break;
                case 12:
                    System.out.println(msg12);
                    break;
                case 13:
                    System.out.println(msg13);
                    break;
                case 14:
                    System.out.println(msg14);
                    break;
                case 15:
                    System.out.println(msg15);
                    break;
            }
            System.out.println("***********************************************************************\n\n");
        }
    }
}
