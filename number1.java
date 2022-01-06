/* Day 11 (Problem 1 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
---Input :1234 --> ( 1 ) + ( 1 + 2 ) + ( 1 + 2 + 3 ) + ( 1 + 2 + 3 + 4 ) --> 1 + 3 + 6 + 10 --> 20---*/

package com.mycompany.javatraining;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int a = num.nextInt();
        
        int b = (int) (Math.log10(a)+1);
        int c = a,d = 0,e = 0,f =0;
        
        for(int i = 0; i<b; i++){
            while(c>0){
            d = c%10;
            e+=d;
            c/=10;
            }
            
            f+=e;
            e = 0;
            a/= 10;
            c = a;           
        }
        System.out.print("The sum of the digits is : "+  f);
    }
}