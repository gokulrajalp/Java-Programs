/* Day 3 (Problem 2 out of 3) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for Factorial using recursion of n from user---
 */
package com.mycompany.javatraining;
import java.util.*;


public class factorial_recursion {
    
    
    static int fact(int a){
      if (a == 0)    
           return 1;    
      else   
            return (a*fact(a-1));
}
 
    public static void main (String[] args){
        int n,factorial=1;
        
        Scanner fac = new Scanner(System.in);
        
        System.out.println("Enter the number to find factorial:");
        n = fac.nextInt();
                
        factorial = fact(n);
        System.out.println("The Factorial of " + n + " is " + factorial);
                
    }
}
