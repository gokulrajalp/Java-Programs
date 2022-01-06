/*Day-5(Beginner)[Problem 1 out of 4]
----To find the power of the given number get the base and exponent from the given number---
 */

package com.mycompany.javatraining;
import java.util.Scanner;

public class power {
    public static void main (String[] args) {
        Scanner pow = new Scanner(System.in);
    
        System.out.println("Enter base :");
        int base = pow.nextInt();
        
        System.out.println("Enter exponent :");
        int exponent = pow.nextInt();
        
        int result = 1;
        for (int i = 0 ; i<exponent;i++){
            result = result*base;
            System.out.print(base);
            if(i<exponent-1){
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + result);
    }
}