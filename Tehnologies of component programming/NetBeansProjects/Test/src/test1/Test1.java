/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author olegp
 */
public class Test1 {

    public static void main(String[] args) {
//        A object = new B();
//        B b = (B) object;

//        object.print();
//        Animal a1 = new Animal("Robby");
//        Animal a2 = new Animal("Robby");
//        System.out.println(a1.equals(a2));
//        ArrayList<String> colors1 = new ArrayList<String>(10);
//        colors1.add("Red");
//        colors1.add("Blue");
//        colors1.add("Green");
//        colors1.add("Orange");
//        colors1.remove("Green");
//
//        System.out.println(colors1);
//
//ArrayList<String> list = new ArrayList<String>();
//list.add("A");
//list.add("B");
//list.add("C");
//System.out.println(list.get(1));
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
//        colors.remove("Green");
//        for (String s : colors) {
//            System.out.println(s);
//        }

        Iterator<String> it = colors.iterator();
        String value = it.next();
        System.out.println(value);
        value = it.next();
        System.out.println(value);
        
        Boolean bool = it.hasNext();
        
        System.out.println(bool);

    }
}
