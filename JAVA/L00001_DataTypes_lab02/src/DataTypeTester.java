/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @date 24.02.2016
 * @author Oleg Porohnenko
 * @version 1.0
 */
public class DataTypeTester {
    public static void intTesting(){
    int x = 20;
    int y = 7;
    int z;
    
    //Arithmetic operators
    System.out.print("\t\"int\" with Arithmetic operators");
    
    z = x + y;
    System.out.printf("\n%d + %d = %d",x,y,z);
    
    z = x - y;
    System.out.printf("\n%d - %d = %d",x,y,z);
    
    z = x * y;
    System.out.printf("\n%d * %d = %d",x,y,z);
    
    z = x / y;
    System.out.printf("\n%d / %d = %d",x,y,z);
    
    z = x % y;
    System.out.printf("\n%d %% %d = %d",x,y,z);
    
    System.out.printf("\n++%d = %d",z,++z);
    System.out.printf("\n--%d = %d",z,--z);
    System.out.printf("\n%d++ = %d",z,z++);
    System.out.printf("\n%d-- = %d",z,z--);
    
    z = +x;
    System.out.printf("\n+%d = %d",x,z);
    
    z = -x;
    System.out.printf("\n-%d = %d",x,z);
    
    System.out.print("\n\n\t\"int\" with Reletional Operators:");
    
    System.out.printf("\n%d > %d --> %b",x,y, x>y);
    System.out.printf("\n%d >= %d --> %b",x,y, x>=y);
    System.out.printf("\n%d < %d --> %b",x,y, x<y);
    System.out.printf("\n%d <= %d --> %b",x,y, x<=y);
    System.out.printf("\n%d == %d --> %b",x,y, x==y);
    System.out.printf("\n%d != %d --> %b",x,y, x!=y);
    }
}

