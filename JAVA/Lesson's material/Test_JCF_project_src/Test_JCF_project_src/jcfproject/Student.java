
package jcfproject;

public class Student extends Object implements Comparable<Student> {
    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Student() {
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 31 * hash + this.mark;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", mark=" + mark + '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }     
}
