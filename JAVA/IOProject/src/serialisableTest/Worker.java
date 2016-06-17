/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 8, 2016
 * Version: 1.0
 */
package serialisableTest;

import Localisation.Student;
import java.io.IOException;



public class Worker {

    public static void main(String[] args) throws IOException {
        Student student = new Student("Alex", 10,"12345678");
//        
//        ObjectOutputStream out = new
//                ObjectOutputStream(
//                new BufferedOutputStream(
//                new FileOutputStream("student.bin")));
//        
//        out.writeObject(student);
//        
//        out.close();

//        ObjectInputStream in = new ObjectInputStream(
//                new BufferedInputStream(
//                        new FileInputStream("student.bin")));
//
//        Student st = null;
//
//        try {
//            st = (Student) in.readObject();
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//        }
//
//        in.close();
//
//        System.out.println(st);
//        System.out.println("count: " + Student.count);

        System.out.println("Before S: ");
        System.out.println(student);
        
        StudentSerialisator.write(student);
    }
}
