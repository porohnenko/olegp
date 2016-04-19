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

    public void add(Ponchik p) {
        listP.add(p);
    }

    public void add(Orange o) {
        listO.add(o);
    }

    public void add(Bread b) {
        listB.add(b);
    }

    @Override
    public String toString() {
        String str = "";

        for (Milk milk : listM) {
            str += milk.toString() + "\n";
        }

        for (Orange o : listO) {
            str += o.toString() + "\n";
        }

        for (Bread b : listB) {
            str += b.toString() + "\n";
        }

        for (Ponchik p : listP) {
            str += p.toString() + "\n";
        }

        return str;
    }
}
