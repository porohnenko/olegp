/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject.Shapes;

/**
 *
 * @author user
 */
class ShapeWorker {    
    public static void test(Shape shape) {
        shape.draw();
        System.out.println("S = " + shape.getS());
        System.out.println("P = " + shape.getP());
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        ShapeWorker.test(r);
        
        Scuare scuare = new Scuare(7);
        ShapeWorker.test(scuare);
    }
}
