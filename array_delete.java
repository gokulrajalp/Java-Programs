/*Day-5(Beginner)[Problem 4 out of 4]
----Write a program to read a sentence using scanner and print---
 */
package com.mycompany.javatraining;
import java.util.Scanner;

public class array_delete {
    public static void main (String[] args){
        Scanner arr = new Scanner(System.in);
        
        System.out.println("How much number you going to enter?");
        int limit = arr.nextInt();
        int [] a = new int[limit];
       
        for(int i=0;i<limit;i++){
            System.out.println("Enter number " + (i+1) + " :");
            a[i]= arr.nextInt();
        }
        
        System.out.println("Enter position to insert :");
        int position = arr.nextInt();
        
        System.out.println("Enter the element :");
        int element = arr.nextInt();
        
        a[position] = element;
        
        System.out.println("The new elements in the array are :");
        
        for(int i=0;i<limit;i++){
            System.out.print(a[i] + " ");
        }
        
        
        
    }    
}
