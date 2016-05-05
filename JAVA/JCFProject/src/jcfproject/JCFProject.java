package jcfproject;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author olegp
 */
public class JCFProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Group group1 = new Group();
             
       Group group2 = new Group(new LinkedList<Student>());
       
       group1.add(new Student("A",10));*/
        Set<Integer> set = new HashSet<Integer>();
        //Set<Integer> set = new LinkedHashSet<Integer>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(80);
        set.add(100);
        for (Integer integer : set) {
            System.out.println(integer + " ");
        }
        
        HashSet<Student> Set = new HashSet<Student>();
        set.add(new Student("A",10));
        set.add(new Student("A",10));
        set.add(new Student("A",10));
        set.add(new Student("A",10));
        set.add(new Student("A",10));
        set.add(new Student("A",10));
        
        
        
    }

}
