/**
 * Theme: JCF Project
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: May 11, 2016
 * Version: 1.0
 */

package jcfproject;

import java.util.ArrayList;
import java.util.List;

public class Group {
    
    private List<Student> list = null;
    
    public Group() {
        list = new ArrayList<Student>();
    }
    
    public Group(ArrayList<Student> list) {
        this.list = list;
    }
    
    public void add(Student student) {
        list.add(student);
    }
    
    public int size() {
        return list.size();
    }
    
    public Student get(int index) {
        return list.get(index);
    }
    
    @Override
    public String toString() {
        String string = "Group:\n";
        for (Student student : list) {
            string +=student.toString() + "\n";
        }
        return "Group{" + "list=" + list + '}';
    }
    
}
