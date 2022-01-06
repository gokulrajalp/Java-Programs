/*Day-5(Beginner)[Problem 3 out of 4]
----To display numbers in reverse order(eg. print numbers from 20 to 1) 
also find sum and product---*/

package com.mycompany.javatraining;
import java.util.Scanner;

public class reverse {
    public static void main (String[] args) {
        int n,m,i,sum = 0; 
        long product = 1;
        
        Scanner rve = new Scanner(System.in);
        
        System.out.println("Enter starting number :");
        n = rve.nextInt();
        
        System.out.println("Enter ending numbers :");
        m = rve.nextInt();
        
        System.out.print("The numbers from " +  n + " to " + m + " are : ");
        
        if (n>m){
            for(i=n;i>=m;i--){
            
                System.out.print(i + " ");
                sum = sum +i;
                product = product * i;
            }
            
            System.out.println();
        
            for(i=n;i>=m;i--){
            
                System.out.print(i);
            
                if(i>m){
                    System.out.print(" + ");
                }
            }
            System.out.print(" = " + sum);
        
            System.out.println();
        
            for(i=n;i>=m;i--){
            
                System.out.print(i);
            
                if(i>m){
                    System.out.print(" * ");
                }
            }
            System.out.print(" = " + product);
        }
        else{
            for(i=n;i<=m;i++){
            
                System.out.print(i + " ");
                sum = sum +i;
                product = product * i;
            
            }
            System.out.println();
        
            for(i=n;i<=m;i++){
            
                System.out.print(i);
            
                if(i<m){
                    System.out.print(" + ");
                }
            }
            System.out.print(" = " + sum);
        
            System.out.println();
        
            for(i=n;i<=m;i++){
            
                System.out.print(i);
            
                if(i<m){
                    System.out.print(" * ");
                }
            }
            System.out.print(" = " + product);
        }

    }
}