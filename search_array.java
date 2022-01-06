/* Day 6 [Problem 4 out of 4]
---Program to search for an element in an array---*/

package com.mycompany.javatraining;
import java.util.*;

public class search_array {
        public static void main (String[] args){
        Scanner arr = new Scanner(System.in);
        
        System.out.println("How much number you going to enter?");
        int len = arr.nextInt();
        int [] a = new int[len];
        int check = 1;
        
        for(int k=0;k<len;k++){
            System.out.println("Enter number" + (k+1));
            a[k]= arr.nextInt();
        }

        System.out.println("Enter the element to find :");
        int number = arr.nextInt();
                
        for(int i = 0;i<len;i++){
            if(a[i] == number){
                System.out.println("yes, this element is present in the array");
                check = 0;
                break;
            }
        }
        if(check != 0){

            System.out.println("No, this element is not present in the array");
        }
    }
}