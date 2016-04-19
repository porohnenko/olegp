package testproject;

public class Test {

    public static void main(String[] args) {
        Man man = new Man();
        System.out.println(man.name);
        System.out.println((Human) man.name);
        System.out.println((God) man.name);

        Man g = new Man();
        Human h new Man();
        Man man = new Man();

        God.someMethod();

        //overload
        //override
        /*g.show();
        h.show();
        man.show();
        
        man.show(10);*/
        HumanSystem.test(new God());
        HumanSystem.test(new Human());
        HumanSystem.test(new Woman());

        System.out.println(g.name);
        System.out.println(g.name);
    }
}
