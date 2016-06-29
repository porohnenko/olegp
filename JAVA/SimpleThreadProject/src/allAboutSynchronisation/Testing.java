/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 29, 2016
 * Version: 1.0
 */
package allAboutSynchronisation;

public class Testing {

    public static void main(String[] args) {
        Printer printer = new Printer();
//        Printer printer1 = new Printer();
//        Printer printer2 = new Printer();
//        Printer printer3 = new Printer();
//        Printer printer4 = new Printer();
//        Object o = new Object();

        Writer w1 = new Writer(printer, "first printer");
        Writer w2 = new Writer(printer, "second printer");
        Writer w3 = new Writer(printer, "third printer");
        Writer w4 = new Writer(printer, "fourt printer");
        Writer w5 = new Writer(printer, "fifth printer");
    }
}
