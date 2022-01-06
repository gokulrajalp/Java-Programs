/* Day 4 (Problem 3 out of 3) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program to find sum of n even numbers---*/
package com.mycompany.javatraining;
import java.util.*;

public class SumOfEven {
    public static void main(String[] args){
        int n,i,even=0;
        
        Scanner eve = new Scanner(System.in);
        
        System.out.println("Enter the limit to print 'Sum of even numbers':");
        n = eve.nextInt();
        
        for(i=1;i<=n;i++){
            if(i%2==0){
                even = even + i;
            }
        }
        
        System.out.println("The sum of even " + n + " number is " + even);
    }
}
