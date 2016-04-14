package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    public List<Milk> listM = new ArrayList<Milk>();
    public List<Orange> listO = new ArrayList<Orange>();
    public List<Bread> listB = new ArrayList<Bread>();
    public List<Ponchik> listP = new ArrayList<Ponchik>();

    public void add(Milk m) {
        listM.add(m);
    }
     public void add(Orange o) {
        listO.add(o);
    }
      public void add(Bread b) {
        listB.add(b);
    }
      public void add(Ponchik p) {
        listP.add(p);
    }
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
      
      
}
