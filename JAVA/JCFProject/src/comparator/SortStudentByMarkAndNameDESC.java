/**
 * Theme: JCF Project
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 11, 2016
 * Version: 1.0
 */
package comparator;

import java.util.Comparator;
import jcfproject.Student;

public class SortStudentByMarkAndNameDESC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMark() != o2.getMark()) {
            return o2.getMark() - o1.getMark();
        }
        return o1.getName().compareTo(o2.getName());
    }
}
