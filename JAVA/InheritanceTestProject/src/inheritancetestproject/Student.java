/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject;

/**
 *
 * @author olegp
 */
public class Student {

    private String name;

    public Student() {
    }

    public Student(String name) {
        System.out.println("inheritancetestproject.Student.<init>()");
        this.name = name;
    }

    public String getName() {
    }

    public void setName() {
    }

    public void eat() {
        super eat();
        System.out.println("awfasfd");
    }
}
