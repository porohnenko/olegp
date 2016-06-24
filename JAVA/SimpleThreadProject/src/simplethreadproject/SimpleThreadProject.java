/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 22, 2016
 * Version: 1.0
 */
package simplethreadproject;

public class SimpleThreadProject {

    public static void main(String[] args) throws InterruptedException {
//        SuperThread thread1 = new SuperThread(1);
//        SuperThread thread2 = new SuperThread(2);
//        thread1.start();
//        thread2.start();

        RightSuperThread logic = new RightSuperThread();
        
        Thread[] threads = new Thread[10];
        
        
//        for (int i = 0; i < 10; i++) {
//             threads[i] = new Thread(logic);
//             threads[i].start();
//        }
//        

WrongSuperThread[] threads = new WrongSuperThread[10];
       
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }
        
         for (int i = 0; i < 10; i++) {
             threads[i] = new WrongSuperThread();
         }
         
         
         for (int i = 0; i < 10; i++) {
             threads[i].getThread().join();
         }

//        thread2.join();
//        thread1.join();
//        while (true) {
//            System.out.println("main...");
//            Thread.sleep(100);
//        }
        System.out.println("main...");

        //System.out.println("End main thread...");
    }
}
