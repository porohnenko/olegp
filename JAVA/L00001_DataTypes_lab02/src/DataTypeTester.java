/**
 * @date 24.02.2016
 * @author Oleg Porohnenko
 * @version 1.0
 */
public class DataTypeTester {
    public static void byteTesting(){
    byte x = 20;
    byte y = 7;
    byte z;
    
    //Arithmetic operators
    System.out.print("\t\"byte\" with Arithmetic operators");
    
    z = (byte) (x + y);
    System.out.printf("\n%s + %s = %s",x,y,z);
    
    z = (byte) (x - y);
    System.out.printf("\n%d - %d = %d",x,y,z);
    
    z = (byte) (x * y);
    System.out.printf("\n%d * %d = %d",x,y,z);
    
    z = (byte) (x / y);
    System.out.printf("\n%d / %d = %d",x,y,z);
    
    z = (byte) (x % y);
    System.out.printf("\n%d %% %d = %d",x,y,z);
    
    System.out.printf("\n++%d = %d",z,++z);
    System.out.printf("\n--%d = %d",z,--z);
    System.out.printf("\n%d++ = %d",z,z++);
    System.out.printf("\n%d-- = %d",z,z--);
    
    z = (byte) +x;
    System.out.printf("\n+%d = %d",x,z);
    
    z = (byte) -x;
    System.out.printf("\n-%d = %d",x,z);
    
    System.out.print("\n\n\t\"byte\" with Relational Operators:");
    
    System.out.printf("\n%d > %d --> %b",x,y, x>y);
    System.out.printf("\n%d >= %d --> %b",x,y, x>=y);
    System.out.printf("\n%d < %d --> %b",x,y, x<y);
    System.out.printf("\n%d <= %d --> %b",x,y, x<=y);
    System.out.printf("\n%d == %d --> %b",x,y, x==y);
    System.out.printf("\n%d != %d --> %b",x,y, x!=y);
    }
    
    public static void shortTesting(){
    short x = 20;
    short y = 7;
    short z;
    
    //Arithmetic operators
    System.out.print("\t\"short\" with Arithmetic operators");
    
    z = (byte) (x + y);
    System.out.printf("\n%s + %s = %s",x,y,z);
    
    z = (byte) (x - y);
    System.out.printf("\n%d - %d = %d",x,y,z);
    
    z = (byte) (x * y);
    System.out.printf("\n%d * %d = %d",x,y,z);
    
    z = (byte) (x / y);
    System.out.printf("\n%d / %d = %d",x,y,z);
    
    z = (byte) (x % y);
    System.out.printf("\n%d %% %d = %d",x,y,z);
    
    System.out.printf("\n++%d = %d",z,++z);
    System.out.printf("\n--%d = %d",z,--z);
    System.out.printf("\n%d++ = %d",z,z++);
    System.out.printf("\n%d-- = %d",z,z--);
    
    z = (byte) +x;
    System.out.printf("\n+%d = %d",x,z);
    
    z = (byte) -x;
    System.out.printf("\n-%d = %d",x,z);
    
    System.out.print("\n\n\t\"short\" with Relational Operators:");
    
    System.out.printf("\n%d > %d --> %b",x,y, x>y);
    System.out.printf("\n%d >= %d --> %b",x,y, x>=y);
    System.out.printf("\n%d < %d --> %b",x,y, x<y);
    System.out.printf("\n%d <= %d --> %b",x,y, x<=y);
    System.out.printf("\n%d == %d --> %b",x,y, x==y);
    System.out.printf("\n%d != %d --> %b",x,y, x!=y);
    }
    
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
    
    System.out.print("\n\n\t\"int\" with Relational Operators:");
    
    System.out.printf("\n%d > %d --> %b",x,y, x>y);
    System.out.printf("\n%d >= %d --> %b",x,y, x>=y);
    System.out.printf("\n%d < %d --> %b",x,y, x<y);
    System.out.printf("\n%d <= %d --> %b",x,y, x<=y);
    System.out.printf("\n%d == %d --> %b",x,y, x==y);
    System.out.printf("\n%d != %d --> %b",x,y, x!=y);
    }
    
    public static void floatTesting(){
    float x = 10;
    float y = 7;
    float z;
    
    //Arithmetic operators
    System.out.print("\n\n\t\"float\" with Arithmetic operators");
    
    z = x + y;
    System.out.printf("\n%.1f + %.1f = %.1f",x,y,z);
    
    z = x - y;
    System.out.printf("\n%.1f - %.1f = %.1f",x,y,z);
    
    z = x * y;
    System.out.printf("\n.1ff * %.1f = %.1f",x,y,z);
    
    z = x / y;
    System.out.printf("\n%.1f / %.1f = %.4f",x,y,z);
    
    z = x % y;
    System.out.printf("\n%.1f %% %.1f = %.1f",x,y,z);
    
    System.out.printf("\n++%.1f = %.1f",z,++z);
    System.out.printf("\n--%.1f = %.1f",z,--z);
    System.out.printf("\n%.1f++ = %.1f",z,z++);
    System.out.printf("\n%.1f-- = %.1f",z,z--);
    
    z = +x;
    System.out.printf("\n+%.1f = %.1f",x,z);
    
    z = -x;
    System.out.printf("\n-%.1f = %.1f",x,z);
    
    System.out.print("\n\n\t\"float\" with Relational Operators:");
    
    System.out.printf("\n%.1f > %.1f --> %b",x,y, x>y);
    System.out.printf("\n%.1f >= %.1f --> %b",x,y, x>=y);
    System.out.printf("\n%.1f < %.1f --> %b",x,y, x<y);
    System.out.printf("\n%.1f <= %.1f --> %b",x,y, x<=y);
    System.out.printf("\n%.1f == %.1f --> %b",x,y, x==y);
    System.out.printf("\n%.1f != %.1f --> %b",x,y, x!=y);
    }
    
    public static void doubleTesting(){
    double x = 10.2;
    double y = 7.8;
    double z;
    
    //Arithmetic operators
    System.out.print("\n\n\t\"double\" with Arithmetic operators");
    
    z = x + y;
    System.out.printf("\n%.1f + %.1f = %.1f",x,y,z);
    
    z = x - y;
    System.out.printf("\n%.1f - %.1f = %.1f",x,y,z);
    
    z = x * y;
    System.out.printf("\n.1ff * %.1f = %.1f",x,y,z);
    
    z = x / y;
    System.out.printf("\n%.1f / %.1f = %.4f",x,y,z);
    
    z = x % y;
    System.out.printf("\n%.1f %% %.1f = %.1f",x,y,z);
    
    System.out.printf("\n++%.1f = %.1f",z,++z);
    System.out.printf("\n--%.1f = %.1f",z,--z);
    System.out.printf("\n%.1f++ = %.1f",z,z++);
    System.out.printf("\n%.1f-- = %.1f",z,z--);
    
    z = +x;
    System.out.printf("\n+%.1f = %.1f",x,z);
    
    z = -x;
    System.out.printf("\n-%.1f = %.1f",x,z);
    
    System.out.print("\n\n\t\"double\" with Relational Operators:");
    
    System.out.printf("\n%.1f > %.1f --> %b",x,y, x>y);
    System.out.printf("\n%.1f >= %.1f --> %b",x,y, x>=y);
    System.out.printf("\n%.1f < %.1f --> %b",x,y, x<y);
    System.out.printf("\n%.1f <= %.1f --> %b",x,y, x<=y);
    System.out.printf("\n%.1f == %.1f --> %b",x,y, x==y);
    System.out.printf("\n%.1f != %.1f --> %b",x,y, x!=y);
    }
}

