import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class MVCProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //input data
        System.out.println("Insert dimension of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        Random random = new Random();
        //random.nextInt(max - min) + min;

        //logic
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        int min = array[0];
        int max = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        //UI view
        System.out.println("Array: \n");
        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}
