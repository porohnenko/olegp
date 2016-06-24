/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package genericproject;

public class Box {

    private int n;

    public void add(int n) {
        this.n = n;
    }

    public int get() {
        return n;
    }
}

class dBox {

    private double n;

    public void add(double n) {
        this.n = n;
    }

    public double get() {
        return n;
    }
}

class StudentBox {

    private Student n;

    public void add(Student n) {
        this.n = n;
    }

    public Student get() {
        return n;
    }
}