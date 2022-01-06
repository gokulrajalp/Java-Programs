/* Day 1 (Problem 3 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
 */
package com.mycompany.javatraining;
import java.util.*;


public class absolute {
    public static void main (String[] args){
        
        Scanner ab = new Scanner(System.in);
        
        System.out.println("Enter the First Number:");
        int number1 = ab.nextInt();
        System.out.println("Enter the Secont Number:");
        int number2 = ab.nextInt();
        
        System.out.println("Absolute value of First Number is " + Math.abs(number1));
        System.out.println("Absolute value of Second Number is " + Math.abs(number1));
    }
}
