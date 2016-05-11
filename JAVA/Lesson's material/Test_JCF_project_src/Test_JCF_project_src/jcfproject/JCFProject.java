/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jcfproject;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import jcfproject.comparator.SortStudentByMarkASC;
import jcfproject.comparator.SortStudentByMarkAndNameDESC;
import jcfproject.comparator.SortStudentByMarkDESC;

/**
 *
 * @author user
 */
public class JCFProject {

    public static void main(String[] args) {
//        Group group1 = new Group();
//        Group group2 = new Group(new LinkedList<Student>(100));
//
//        group1.add(new Student("A", 10));
//        group1.add(new Student("B", 7));
//        group1.add(new Student("C", 8));
//
//        System.out.println(group1);
//        

        //Set<Integer> set = new HashSet<Integer>();
//        Set<Integer> set = new LinkedHashSet<Integer>();
//
//        set.add(10);
//        set.add(30);
//        set.add(20);
//        set.add(10);
//        set.add(40);
//        set.add(80);
//
//        for (Integer integer : set) {
//            System.out.print(integer + " ");
//        }

//        Set<Integer> set = new TreeSet<Integer>();
//
//        set.add(10);
//        set.add(30);
//        set.add(20);
//        set.add(10);
//        set.add(40);
//        set.add(80);
//
//        for (Integer integer : set) {
//            System.out.print(integer + " ");
//        }

//        Set<Student> set = new HashSet<Student>();
//        
//        set.add(new Student("A", 10));
//        set.add(new Student("A", 10));
//        set.add(new Student("A", 10));
//        set.add(new Student("A", 10));
//        set.add(new Student("A", 10));
//
//        for (Student student : set) {
//            System.out.println(student + " ");
//        }

//        Set<Student> set = new TreeSet<Student>(
//                new SortStudentByMarkAndNameDESC());
//
//        set.add(new Student("A", 5));
//        set.add(new Student("As", 9));
//        set.add(new Student("Ar", 10));
//        set.add(new Student("Aw", 10));
//        set.add(new Student("Ae", 8));
//        set.add(new Student("Ar", 10));
//
//        for (Student student : set) {
//            System.out.println(student + " ");
//        }
//
//        
        
        List<Student> set = new ArrayList<Student>();
        
        set.add(new Student("A", 5));
        set.add(new Student("As", 9));
        set.add(new Student("Ar", 10));
        set.add(new Student("Aw", 10));
        set.add(new Student("Ae", 8));
        set.add(new Student("Ar", 10));
        
        Collections.sort(set, new SortStudentByMarkASC());
        
        for (Student student : set) {
            System.out.println(student + " ");
        }

    }
}
