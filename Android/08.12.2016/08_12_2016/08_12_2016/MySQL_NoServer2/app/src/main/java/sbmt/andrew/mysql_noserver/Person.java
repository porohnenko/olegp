package sbmt.andrew.mysql_noserver;

/**
 * Created by HP02 on 08.12.2016.
 */

public class Person {
    String fname, sname;
    int age;
    Double salary;


    public Person(String fname, String sname, int age, Double salary) {
        this.sname = sname;
        this.fname = fname;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Имя: " + fname +
                ", Фамилия: " + sname +
                ", Возраст: " + age +
                ", Зарплата: " + salary +"; ";
    }
}