/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package initialase;

class Human {

    static {
        System.out.println("Human static init...");
    }

    {
        System.out.println("Human init block...");
    }

    public static void Human() {
        System.out.println("Human default constructor...");
    }

    public void Human(String n) {
        System.out.println("Human constructor with parameters");
    }
}

public class Student {

    static {
        System.out.println("init block2...");
    }

    private int mark = 0;

    {
        count++;
        System.out.println("init block1...");
        if (count > 1) {
            mark = 4;
        } else {
            mark = 0;
        }
    }

    private String name;
    //private int mark = 0;
    public static int count = 0;
    //public static int mark = logic

    public Student() {
        count++;
        System.out.println("Student default constructor...");
    }

    {
        System.out.println("init block2...");
    }

    public Student(String name) {
        System.out.println("Student default constructor...");
        this.name = name;
    }

    {
        System.out.println("init block3...");
    }

    public int logic() {
//        if (cloud) {
//            //file
//            mark = x;
//        }
        System.out.println("method logic...");
        return 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Alex");
        Student st2 = new Student("Oleg");
        System.out.println(Student.count);
    }
}
