
package inheritancetestproject;


public class Student {
    private String name;
    public int mark;

    public Student() {
    }   
       
    public Student(String name) {
        System.out.println("Student constructor with params");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("eating...");
    }
    
    @Override
    public String toString() {
        return name;
    }    
}
