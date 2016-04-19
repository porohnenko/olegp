package testproject;

public class God {

    String name = "God";

    public static void  someMethod() {
        System.out.println("God ");
    }

    void show() {
        System.out.println("testproject.God.show()");
    }

    void show(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("testproject.God.show()");
        }
    }
    
}
