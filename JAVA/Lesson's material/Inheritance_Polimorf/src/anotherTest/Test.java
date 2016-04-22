package anotherTest;

public class Test {

    public static void main(String[] args) {
//        Man man = new Man();

//        System.out.println(man.name);
//        System.out.println(((Human)man).name);
//        System.out.println(((God)man).name);
//        

//        System.out.println("\n");



        //overloading

        //overriding
        HumanSystem.test(new God());
        HumanSystem.test(new Human());
        HumanSystem.test(new Man());
        HumanSystem.test(new Woman());


//        God g = new Man();
//        Human h = new Man();
//        Man m = new Man();
//
//
//        g.someMethod();
//        h.someMethod();
//        m.someMethod();
//
//        God.someMethod();
//        Human.someMethod();
//        Man.someMethod();

//        System.out.println(g.name);
//        System.out.println(h.name);
//        

    }
}
