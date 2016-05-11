/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jcfproject.comparator;

import java.util.Comparator;
import jcfproject.Student;

/**
 *
 * @author user
 */
public class SortStudentByMarkAndNameDESC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMark() != o2.getMark()) {
            return o1.getMark() - o2.getMark();
        }


        return o1.getName().compareTo(o2.getName());
    }
}
