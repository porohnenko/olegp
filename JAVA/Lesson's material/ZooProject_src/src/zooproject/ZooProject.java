package zooproject;

import zooproject.entity.animal.Monkey;
import zooproject.entity.animal.Tiger;
import zooproject.entity.plant.Kaktus;
import zooproject.logic.Worker;

public class ZooProject {

   public static void main(String[] args) {
       Monkey m1 = new Monkey();
       Monkey m2 = new Monkey();
       Tiger t = new Tiger();
       Kaktus k = new Kaktus();
       
       Worker.just_do_it(k);
       Worker.just_do_it(m1);
       Worker.just_do_it(m2);
       Worker.just_do_it(t);
   }
}
