/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author olegp
 */
public class Test2 {

    public static void main(String[] args) {
//        try {
//            File x = new File("o:\\olegp\\JavaTest\\Test.txt");
//            if (x.exists()) {
//                System.out.println(x.getName() + "\n" + "exists!");
//            } else {
//                System.out.println("The file does not exist");
//            }
//            Scanner sc = new Scanner(x);
//            while (sc.hasNext()) {
//                System.out.println(sc.next());
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error");
//        }

//        try {
//            Formatter f = new Formatter("o:\\olegp\\JavaTest\\Test.txt");
//            f.format("%s %s %s", "1.", "John", "Smith \r\n");
//            f.format("%s %s %s", "2.", "Amy", "Brown");
//            f.close();
//        } catch (Exception e) {
//            System.out.println("Error!");
//        }
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < 6; i++) {
//            list.add(i);
//        }
//        int x = 0;
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            x += it.next();
//        }
//        System.out.println(x);
        int f = 1, i = 2;
        while (++i < 5) {
            f *= i;
        }
        System.out.println(f);
    }
}
