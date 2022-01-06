/* Day 11 (Problem 4 out of 5)
---Input :1234 --> ( 1 ^ 2 ) + ( 2 ^ 3 ) + ( 3 ^ 4 ) + ( 4 ^ 1 )  --> 1 + 8 + 81 + 4  --> 94---*/
package com.mycompany.javatraining;

import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
        
	    System.out.println("Enter the number :");
	    int a = num.nextInt();
	    int b = (int) (Math.log10(a)+1);
	    int d = a,e = 1,f = 0;
	    
	    int c[] = new int[b+1];
	    
	    for(int i = b-1; i>=0;i--) {
	    	c[i] = d%10;
	    	d /= 10;
	    }
            c[b] = c[0];
            
            for(int i = 0;i<b;i++){
                for(int j = 0;j<c[i+1];j++){
                    e *= c[i]; 
                }
                f +=e;
                e =1;
            }
            System.out.println("The sum of power of its next position of the each number is : " + f);
    }
}