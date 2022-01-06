/*Day-6(Beginner)[Problem 2 out of 4]
----Program to delete an element in a specified position in a given array---
 */

package com.mycompany.javatraining;
import java.util.Scanner;

public class delete_array {
    public static void main (String[] args) {
        Scanner arr = new Scanner(System.in);
        
        System.out.println("How much number you going to enter?");
        int limit = arr.nextInt();
        int [] a = new int[limit];
        int [] b = new int[limit-1];
        
        for(int i=0;i<limit;i++){
            System.out.println("Enter number " + (i+1) + " :");
            a[i]= arr.nextInt();
        }
        
        System.out.println("Enter position to delete :");
        int position = arr.nextInt();
        
        System.out.print("The array elements you entered are :");
        
        for(int i=0;i<limit;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        int j=0;
        for (int i = 0 ; i<=limit-1; i++){
            if(i != position){
                b[j]= a[i];
                j++;
            }
        }
        
        System.out.print("The new array elements after delete are :");
        
        for(int i=0;i<limit-1;i++){
            System.out.print(b[i] + " ");
        }

    }
}