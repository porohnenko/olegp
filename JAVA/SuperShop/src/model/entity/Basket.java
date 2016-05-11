package model.entity;

import java.util.ArrayList;
import java.util.List;
import model.entity.abs.Product;

public class Basket {

    public List<Product> list = new ArrayList<Product>();

    public void add(Product p) {
        list.add(p);
    }

//    @Override
//    public String toString() {
//        String str = "";
//
//        for (Product p : list) {
//            str += p.toString() + "\n";
//        }
//        return str;
//    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Product p : list) {
            str.append(p.toString()).append("\n");
        }
        return str.toString();
    }
    
//    @Override
//    public String toString() {
//        StringBuffer str = new StringBuffer();
//
//        for (Product p : list) {
//            str.append(p.toString()).append("\n");
//        }
//        return str.toString();
//    }
}
