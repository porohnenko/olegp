/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 29, 2016
 * Version: 1.0
 */
package allAboutSynchronisation;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;    
import java.util.concurrent.locks.Lock;

public class Printer extends Object{

    //List<Object> list = Collections.synchronizedList(new ArrayList<Object>());
    public synchronized void print(String msg) {
        try {
            System.out.print("[");
            Thread.sleep(100);
            char[] cs = msg.toCharArray();
            
            for (int i = 0; i < cs.length; i++) {
                Thread.sleep(100);
                System.out.print(cs[i] + "");

            }

            Thread.sleep(100);
            System.out.println("]");
        } catch (InterruptedException ex) {
            //...
        }
    }

    public synchronized void print1(String msg) {
    }

    public synchronized void print2(String msg) {

    }

    public void print3(String msg) {
    }

    public void print4(String msg) {
    }

    public void print5(String msg) {
    }
}
