/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package genericproject;

public class GenericProject {

    public static void main(String[] args) {
        /*ObjectBox box = new ObjectBox();

        //dBox dbox = new dBox();
        //box.add(10);
        //...
        //box.add(new Student("Alex"));
        
        Object o = box.get();
        if (o instanceof String) {
        } else if (o instanceof Student) {
        }

        Student st = (Student) box.get();

        System.out.println(box.get());*/
        
        SuperBox<String> box1 = new SuperBox<>();
        SuperBox<Integer> box2 = new SuperBox<>();
        SuperBox<Student> box3 = new SuperBox<>();
        
        
        box1.add("qwerty");
        
        box2.add(10);
        box3.add(new Student("Alex"));
        
        System.out.println(box1.get());
        System.out.println(box2.get());
        System.out.println(box3.get());
    }
}
