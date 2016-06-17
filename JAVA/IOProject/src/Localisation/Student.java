/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 8, 2016
 * Version: 1.0
 */
package Localisation;

import java.io.IOException;
import java.io.Serializable;

class Ability {

    public Ability() {
        System.out.println("default constructor of Ability");
    }

    public int inteligant = 1;
}

public class Student extends Ability implements Serializable {

    static int count = 0;
    String name;
    int mark;
    transient String pass;
    private static final long serialVersionUID = 2L;

    {
        count++;
    }

    public Student() {
        System.out.println("constructor Student...");
    }

    public Student(String name, int mark, String pass, int ability) {
        this.name = name;
        this.mark = mark;
        this.pass = pass;
        this.inteligant = ability;
    }

    Student(String alex, int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Student(String alex, int i, String string) {
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + Const.NAME + ", mark=" + mark + ", pass=" + pass + '}';
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeObject(pass);
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.readObject(pass);
    }
}
