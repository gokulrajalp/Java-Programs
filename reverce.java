/* Day 2 (Problem 2 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
---Write a program that prompts the user to input an integer and then outputs the number with the digits
        reversed. For example, if the input is 12345, the output should be 54321---
 */
package com.mycompany.javatraining;

public class reverce {
    public static void main (String[] args){
        
        int n = 12345, reverce=0, rem;
        int r = n;
        
        for(;n!=0;){
            rem = n % 10;
            reverce = reverce * 10 +rem;
            n = n/10;
        }
        
        System.out.println("The reverse number of " + r + " is " + reverce);
    }   
}
