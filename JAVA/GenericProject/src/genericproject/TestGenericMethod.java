/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package genericproject;

public class TestGenericMethod {

    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] dArray = {1.2, 1.3, 1.5, 5.6};
        Student[] stArray = {new Student("Oleg"), new Student("Vicktor")};

        Character[] characters = {'a', 's', 'd', 'f', 'h', 'h', 'h', 'k'};

        view(dArray);
        view(iArray);
        view(characters);
        sum(new Student("Alex"),1,1.2);
        view(stArray);
        
        
    }

    public static <T> void view(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

//    public static <T extends Number> double sum(T a, T b) {
//        return a.doubleValue() + b.doubleValue();
//    }
    public static <T, M, B> void sum(T a, M b, B c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
