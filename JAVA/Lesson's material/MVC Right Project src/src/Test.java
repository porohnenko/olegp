import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please, input dimention of array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        Random random = new Random();
        
//        -10 .. 0 .. 10
//        
//        min         max
//        max - min   --> 0.. 20
//        
//        -10 .. 10 <-- 0...20
//                
//        
//        (min; max)
//        random.nextInt(max - min) + min;
//        
//        20 + min
//        
               
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);            
        }        
        
        int min = array[0];
        int max = array[0];
        
        for (int element : array) {
            if (element < min){
                min = element;
            }
            
            if (element > max){
                max = element;
            }
        }
        
        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        
    }
}
