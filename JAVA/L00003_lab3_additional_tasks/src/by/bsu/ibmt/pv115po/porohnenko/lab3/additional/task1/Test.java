/**
 * Lab work №3. Additional task 1
 * Theme: Output arguments of command line in revers
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Apr 22, 2016
 * Version: 1.0
 */
package by.bsu.ibmt.pv115po.porohnenko.lab3.additional.task1;

class Test {

    public static void main(String[] args) {

        for (int i = args.length - 1; i >= 0; i--) {
            //int j = args.length - i;
            System.out.printf("Argument #%d: %s\n", i+1, args[i]);
        }
    }
}
