/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 22, 2016
 * Version: 1.0
 */
package simplethreadproject;

/*public class RightSuperThread implements Runnable {

    private int id;

    public RightSuperThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("thread = " + name);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                //...
            }
        }
    }

}*/

class WrongSuperThread implements Runnable {

    public WrongSuperThread(int id) {
        Thread thread = new Thread();
        thread.start();
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("thread = " + name);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                //...
            }
        }
    }
}

