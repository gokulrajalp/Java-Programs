/* Day 6 [Problem 3 out of 4]
---Program to reverse an element of array using same array---*/

package com.mycompany.javatraining;
import java.util.*;

public class reverse_array {
    public static void main (String[] args){
        Scanner arr = new Scanner(System.in);
        
        System.out.println("How much number you going to enter?");
        int len = arr.nextInt();
        int [] a = new int[len];
        int temp=0;
        
        for(int k=0;k<len;k++){
            System.out.println("Enter number" + (k+1));
            a[k]= arr.nextInt();
        }
         
        System.out.print("The original array elements are :");
        
        for(int i=0;i<len;i++){
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0;i<len/2;i++){
                    temp = a[i];
                    a[i]=a[len-1-i];
                    a[len-1-i]=temp;
        }
        
        System.out.print("The reversed array elements are :");
        
        for(int i=0;i<len;i++){
            System.out.print(a[i] + " ");
        }
    }
}