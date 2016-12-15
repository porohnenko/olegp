package com.android.olegp.databasedemo;

/**
 * Created by olegp on 17.11.2016.
 */

public class Person {

    String fname, lname;
    int age;

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;

    }

    public Person(String fname, int age) {
        this.fname = fname;
        this.age = age;
        this.lname = "";

    }


    @Override
    public String toString() {

        if (!lname.equalsIgnoreCase("")) {

            return "fname = " + fname +
                    ", lname = " + lname +
                    ", age = " + age;
        } else {
            return "fname = " + fname +
                    ", age = " + age;
        }
    }
}
