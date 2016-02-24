/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @date 24.02.2016
 * @author olegp
 * @version 1.0
 */
public class QuadricEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length < 3) {
            System.out.println("There is not enough parameters...");
        }else{
            int a = Integer.valueOf(args[0]);
            int b = Integer.valueOf(args[1]);
            int c = Integer.valueOf(args[2]);
            
            System.out.println(Equation.solve(a,b,c));
        }
    }
    
}
