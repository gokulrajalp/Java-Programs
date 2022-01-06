/* Day 12 (Problem 1 out of 1)
---sum of all arrays in the original array---*/

package com.mycompany.javatraining;
import java.util.*;

public class Sum_of_array {
         
    public static int output1;
    public static int output2;
    
    public static void main(String args[]) {
      int arr[] = {8,-10,3,-15};
            findOriginalFirstAndSum(arr);
    }
      
    public static void findOriginalFirstAndSum(int [] arr) {
      int b = arr.length;
      int c[] = new int [b];
      int d = 0;
      
      int j=0;
      
        for(int i = 0;i<b;i++){
            if(j != b-1){
                c[i] = arr[j+1] - arr[j];
            }
          
            j++;
        }
        
      c[b-1]=arr[b-1];
            
        for (int i = 0 ; i<b ; i++){
            d = d + arr[i];
        }   
      
      output1 = arr[0];
      output2 = d;
    
      System.out.println("Original array = " + Arrays.toString(arr));
      System.out.println("Encoded  array = " + Arrays.toString(c));
      System.out.println("First number in the original array = " + output1);
      System.out.println("Sum of all numbers in original array = " + output2);
    }

}
