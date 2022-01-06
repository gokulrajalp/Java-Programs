/*Day-5(Beginner)[Problem 2 out of 4]
----To display even numbers from 1 to 100---
 */
package com.mycompany.javatraining;
import java.util.Scanner;

public class even {
    public static void main (String[] args) {
        int n,m,i;
        
        Scanner eve = new Scanner(System.in);
        
        System.out.println("Enter starting number :");
        n = eve.nextInt();
        
        System.out.println("Enter ending numbers :");
        m = eve.nextInt();
        System.out.println("The even number between " +  n + " and " + m + " are : ");
        for(i=n;i<=m;i++){
            if(i%2==0){
                System.out.print(i + " ");
                
                if (i%20==0){
                    System.out.println();
                }
            }
        }
    }   
}