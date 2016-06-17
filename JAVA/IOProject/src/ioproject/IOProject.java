/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 8, 2016
 * Version: 1.0
 */
package ioproject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOProject {

    public static void main(String[] args) throws IOException {
//        OutputStream out = new BufferedOutputStream(
//                new FileOutputStream("text.txt"));
//        
//        for (int i = 0; i < 1000; i++) {
//            out.write(i);
//        }
//        
//        out.flush();        
//        out.close();
//        InputStream in = null;

        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("text.txt")));

        for (int i = 0; i < 1000; i++) {
            out.writeInt(i);
        }

        out.flush();
        out.close();

//        InputStream in = null;
//        try {
//            in = new BufferedInputStream(
//                    new FileInputStream("text.txt"));
//
//            int b;
//            while ((b = in.read()) != -1) {
//                System.out.print(b + " ");
//            }
//        } finally {
//            try {
//                if (in != null) {
//                    in.close();
//                }
//            } catch (IOException e) {
//                System.out.println(e);
//            }
//        }
        DataInputStream in = null;
        try {

            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("text.txt")));

            while (true) {
                try {
                    System.out.print(in.readInt() + " ");
                } catch (EOFException e) {
                    //...
                }
            }
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

// ONLY in 1.7!!!
//        try(in = new FileInputStream("text.txt") {            int b;
//            while ((b = in.read()) != -1) {
//                System.out.print(b + " ");
//            }       
//        }
    }
}
