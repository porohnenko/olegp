package anotherTest;

public class God {
    String name = "God";
    
    public static void someMethod(){
        System.out.println("$God");
    } 
    
    void show(){
        System.out.println("GOD");
    }
    
    void show(int n){
         for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    
    void show(int n, int m){
        for (int i = 0; i < n*m; i++) {
            System.out.print("*");
        }
    }
    
}
