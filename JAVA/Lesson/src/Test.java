
/*class Holder {

    private int held;

    public Holder(int held) {
        this.held = held;
    }

    public int getHeld() {
        return held;
    }

    public void change(Holder holder) {
        holder.held++;
    }

}*/
 /*
abstract class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}*/
/*
class SuperClass{
public String toString(){
return "SuperClass";
}
}*/

class Electric{
    public static final int AC = ~220;
    public static final int DC = -110;
    public static final int GROUND = 0;
    
public static int invert(int type){
if (type==AC){
	return DC;
	}
		else if(type==DC) {
			return AC;
			}
return GROUND;
}
}
public class Test {

    /*public static void main(String[] args) {
        //int j = 0;
        /* for (int k = 0; j + k != 10; j++, k++) {
            //i++;
            System.out.println("j = " + j + ", k = " + k);
        } */

 /* do {
            System.out.println("j=" + j++);
            if (j == 3) {
                continue loop;
            }
        } while (j < 10); */
 /* for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println("i = " + i + "j = " + j);
            } */
 /* Byte type = 1;

        switch (type) {
            case 1:
                System.out.println("Test 1");
                break;
            case 2:
                System.out.println("Test 2");
        } */
 /* int j = 2;
        switch (j) {
            case 1:
                System.out.println("Value is one");
            case 2:
                System.out.println("Value is two");
            default:
                System.out.println("It's a strange value");
            case 2 + 1:
                System.out.println("Value is three");

        }*/
 /* int LENGTH = 3;
        outer_lable:
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == j) {
                    break outer_lable;
                }
                System.out.println("i = " + i + "j = " + j);
            }
        } */

 /*Holder holder = new Holder(100);
        holder.change(holder);
        System.out.println(holder.getHeld());*/
 /*
    private static Test instance = new Test();
    private static final int DELTA = 7;
    private static int BASE = 10;
    private int x;

    private Test() {
        x = DELTA + BASE;
    }
    public static void main(String[] args) {
        System.out.println(Test.instance.x);
    }*/
 /*
    public static void main(String[] args) {
        Student student  = new Student("Alex");
        System.out.println(student);
        }*/
 /*
    public float someMe(float a, float b) {return a;}
    
    public float someMe(float ci, float da){return da;}*/
 /*static void some(int a) {
        System.out.println("1");
    }
    static void some(Integer a) {
        System.out.println("2");
    }*/
   // private static final int LENGTH = 3;

    public static void main(String[] args) {
        /*Boolean b1 = new Boolean(false);
        Boolean b2= new Boolean("True");
        Boolean b3= new Boolean("its True");
        Boolean b4= true;
        System.out.println(b1.equals(b3)+" ");
        System.out.println(b2.equals(b4));  */
        //some(1);
        /*outer_lable:
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == j) {
                    continue outer_lable;
                }
                System.out.println("i = " + i + "j = " + j);
            }
        }*/
        
       // Test test = new Test();
       int power = 220;
       System.out.println(Electric.invert(power));
    }/*
    static {
    SuperClass superclass = new SuperClass();
        System.out.println(superclass);
        System.exit(0);
    }
    static {
    System.out.println("Another");
    }
    public Test(){
    System.out.println("Dafault");
    }*/
    
}
