/* Day 5 (Problem 3 out of 3) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for to find Non-repeating numbers in array---*/

package com.mycompany.javatraining;
import java.util.*;

public class demo1 {
 
    public static void main(String[] args) 
    { 
        int [] intArray = {11,22,33,44,55,66,77,88,99,100,222};
 
        
        System.out.println("Original Array: \n" + Arrays.toString(intArray)); 
        
        
        int size = intArray.length;
        
        
        int i, k, temp; 
        for (i = 0; i < size / 2; i++) { 
            temp = intArray[i]; 
            intArray[i] = intArray[size - i - 1]; 
            intArray[size - i - 1] = temp; 
        } 
 
       
       System.out.println("Reversed Array: \n" + Arrays.toString(intArray)); 
    } 
}