/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 22, 2016
 * Version: 1.0
 */
package simplethreadproject;

public class SuperThread extends Thread {

    private int id;

    public SuperThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("*");

//        while (true) {
//            try {
//                System.out.println("thread = " + id);
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                //...
//            }
//        }
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("thread = " + id);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                //...
            }
        }
    }
}
