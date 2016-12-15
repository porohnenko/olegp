package com.bsu.sbmt.pv1_15po.oleg_porohnenko.mysql_noserver;

/**
 * Created by Oleg on 08.12.16.
 */

public class Person {
    String fname, sname;
    int age;
    Double salary;

    public Person(String fname, String sname, int age, Double salary) {
        this.fname = fname;
        this.sname = sname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + fname +
                ", Surname: " + sname +
                ", Age: " + age +
                ", Salary: " + salary;
    }
}
