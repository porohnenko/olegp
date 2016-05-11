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
public class SortStudentByMarkDESC implements Comparator<Student> {
        @Override
    public int compare(Student o1, Student o2) {
        return o2.getMark() - o1.getMark();
    }
}
