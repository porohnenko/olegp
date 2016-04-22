/**
 * @date 24.02.2016
 * @author olegp
 * @version 1.0
 */
public class Test {

    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("There is not enought parameters...");
        } else {
            int a = Integer.valueOf(args[0]);
            int b = Integer.valueOf(args[1]);
            int c = Integer.valueOf(args[2]);

            System.out.println(Equation.solve(a, b, c));
        }

    }
}
