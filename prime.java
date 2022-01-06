/* Day 2 (Problem 3 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
---3.Write a program that prompts the user to input a positive integer. It should then
            output a message indicating whether the number is a prime number. ---*/
package com.mycompany.javatraining;
import java.util.*;

public class prime {
    public static void main (String[] args){
        int i, n, m, check=1;
        
        Scanner pr = new Scanner(System.in);
        
        System.out.println("Enter the number which is going to check:");
        n = pr.nextInt();
        
        m=n/2;
        
        if(n==0 || n==1){
            check=0;
        }
        else{
            for(i=2;i<=m;i++){
                if(n%i == 0){
                    check=0;
                    break;
                }
            }
        }
        if(check==0){
            System.out.println(n +" is not a prime");
        }
        else{
            System.out.println(n +" is a prime");
        }
    }
}
