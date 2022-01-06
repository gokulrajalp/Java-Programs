/* Day 3 (Problem 1 out of 3) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for Fibonacci number sequence, to get limit from user---
 */
package com.mycompany.javatraining;
import java.util.*;

public class fibonacci {
    public static void main (String[] args){
        int a=0, b=1, c, n;
        Scanner fib = new Scanner(System.in);
        
        System.out.println("Enter the limit to print fibonacci:");
        n = fib.nextInt();
        
        System.out.println(a);
        System.out.println(b);

        for (int i=2;i<n;i++){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        
    }
        
    }
}
