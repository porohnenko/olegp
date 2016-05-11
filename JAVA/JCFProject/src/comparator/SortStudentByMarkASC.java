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

public class SortStudentByMarkASC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark() - o2.getMark();
    }
}
