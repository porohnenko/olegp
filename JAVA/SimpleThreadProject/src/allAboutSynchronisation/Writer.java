/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 29, 2016
 * Version: 1.0
 */
package allAboutSynchronisation;

public class Writer implements Runnable {

    //Thread thread = null;
    Printer printer = null;
    String msg = null;
    //Object o = new Object();

    public Writer(Printer printer, String msg) {
        this.printer = printer;
        this.msg = msg;
        new Thread(this).start();
    }

    @Override
    public void run() {
        synchronized (printer) {
            printer.print(msg);
        }
    }

}
