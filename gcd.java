/*Day-3(Beginner)[Problem 2 out of 4]
----To find gcd of two numbers---*/
package com.mycompany.javatraining;
import java.util.Scanner;

public class gcd {
    public static void main (String[] args) {
        Scanner gc = new Scanner(System.in);
        
        int a = 18, b= 24, great=0;
        System.out.println("Enter value 1 :");
        a = gc.nextInt();
        
        System.out.println("Enter value 2 :");
        b = gc.nextInt();
                
        if (a==b){
            System.out.println("Both the value you enter is same, so " +  a + " is GCD");
        }
        else{
           if(a<b){
               great = a;
           }
           else{
               great = b;
           }
           for (int i = great;i>=1;i--){
               if(a%i==0){
                   if(b%i==0){
                       System.out.println("GCG of " + a + " and " + b + " is :" + i);
                       break;
                   }
               }
           }
        }
    }    
}