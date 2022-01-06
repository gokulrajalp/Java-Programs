/* Day 2 (Problem 5 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for factorial of n numbers---
 */
package com.mycompany.javatraining;
import java.util.*;


public class factorial {
    public static void main (String[] args ){
        Scanner fact = new Scanner(System.in);
        
        System.out.println("Enter the number to find Factorial:");
        int n = fact.nextInt();
        
        int factorial = 1;
        
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        
        System.out.println("Factorial of " + "is " + factorial);
    }
}
