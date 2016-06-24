/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package genericproject;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student {" + "name = " + name + "}";
    }
}
