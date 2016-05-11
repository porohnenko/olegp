/**
 * Theme: JCF Project
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 11, 2016
 * Version: 1.0
 */
package jcfproject;

import comparator.SortStudentByMarkASC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JCFProject {

    public static void main(String[] args) {
//       Group group1 = new Group();
//             
//       Group group2 = new Group(new LinkedList<Student>());
//       
//       group1.add(new Student("A",10));
//        Set<Integer> set = new HashSet<Integer>();
//        //Set<Integer> set = new LinkedHashSet<Integer>();
//
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(40);
//        set.add(80);
//        set.add(100);
//        for (Integer integer : set) {
//            System.out.println(integer + " ");
//        }
//        
//        HashSet<Student> Set = new HashSet<Student>();
//        set.add(new Student("A",10));
//        set.add(new Student("A",10));
//        set.add(new Student("A",10));
//        set.add(new Student("A",10));
//        set.add(new Student("A",10));
//        set.add(new Student("A",10));

        List<Student> set = new ArrayList<Student>();
        set.add(new Student("A", 5));
        set.add(new Student("As", 6));
        set.add(new Student("Ar", 9));
        set.add(new Student("At", 7));
        set.add(new Student("Au", 10));
        set.add(new Student("Ai", 8));

        Collections.sort(set, new SortStudentByMarkASC());

        for (Student student : set) {
            System.out.println(student + " ");
        }
    }
}
