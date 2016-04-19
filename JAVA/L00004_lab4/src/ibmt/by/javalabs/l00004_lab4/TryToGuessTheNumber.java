package ibmt.by.javalabs.l00004_lab4;

import ibmt.by.javalabs.l00004_lab4.randomiser.randomNum;
import java.util.*;

/**
 * group: PV1-15PO
 *
 * @date 26.02.2016
 * @author Oleg Porohnenko
 * @version 1.0
 */
public class TryToGuessTheNumber {

    public static void main(String[] args) {
        System.out.println("\tGame 'Try to Guess the Number'!!!");
        System.out.println("***********************************************");
        System.out.println("\nInsert range of numbers between min and max: ");
        System.out.println("\nmin: ");

        int i, j;
        int userNum;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("\nmax: ");
        j = sc.nextInt();
        sc.close();

        int number = randomNum.randomNum(i, j);

        System.out.println("You have 5 attempts to guess the number! Good l"
                + "uck!");
        System.out.println("Ok! Please, enter your number: ");

        Scanner sc1 = new Scanner(System.in);
        userNum = sc1.nextInt();

        for (int k = 0; k < 5; k++) {

            if (number > userNum) {
                System.out.println("Your number is less than the hidden "
                        + "number!");
            }
            if (number < userNum) {
                System.out.println("Your number is greater than the hidden "
                        + "number!");
            }
            if (number == userNum) {
                System.out.println("Congratulations ! You guessed the "
                        + "number !");
            }
        }
        sc1.close();
    }
}
