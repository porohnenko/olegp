/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author olegp
 */
public class A {

//    public void print() {
//        System.out.println("A");
//    }
    
   
// private int x;	
// public static void main(String[ ] args) {
//   A a = new A();
//   a.x = 5;
//   A b = new A();
//   b.x = 5;
//   System.out.println(a);			
//   System.out.println(b);			
// }

     private void print() {
     System.out.println("a");
   }
   private void print(String str) {
     System.out.println("b");
   }
   private void print(int x) {
     System.out.println("c");
   }		
   public static void main(String[ ] args) {	
     A object = new A();
     object.print();	
   }	
}

