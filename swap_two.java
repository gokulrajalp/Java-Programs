/*Day-3(Beginner)[Problem 4 out of 4]
----To swap two numbers without 3rd variable---
 */
package com.mycompany.javatraining;

import java.util.Scanner;

public class swap_two {
    public static void main (String[] args) {
        int a,b;
        
        Scanner swap = new Scanner(System.in);
    
        System.out.println("Enter value a :");
        a = swap.nextInt();
        
        System.out.println("Enter value b :");
        b = swap.nextInt();
    
    System.out.println("Values before swap :");    
    System.out.println("a = " + a);
    System.out.println("b = " + b);
        
        a=a+b;
        b=a-b;
        a=a-b;
    
    System.out.println("Values after swap :");    
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    }
}