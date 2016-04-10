/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject.Shapes;

/**
 *
 * @author olegp
 */
public class ShapesWorker{
    public static void main(String[] args) {
        Square s = new Square(5);
        test(s);
    }
    public static void test(Square square) {
        System.out.println("inheritancetestproject.Shapes.ShapesWorker.test()");
        
    }
    
}
