package com.bsu.sbmt.pv1_15po.oleg_porohnenko.mysql_demo;

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
                ", Surname: " + sname + "\n" +
                ", Age: " + age +
                ", Salary: " + salary + "\n";
    }

    public String toJSON() {
        return "{fname: " + fname +
                ", sname: " + sname +
                ", age: " + age +
                ", salary: " + salary + "}";
    }
}
