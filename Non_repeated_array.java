/* Day 5 (Problem 3 out of 3) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for to find Non-repeated numbers in array---*/

package com.mycompany.javatraining;
import java.util.*;

public class Non_repeated_array {
    public static void main (String[] args){
        Scanner arr = new Scanner(System.in);
        
        System.out.println("How much number you going to enter?");
        int len = arr.nextInt();
        int [] a = new int[len];
        int check=0;
        
        for(int k=0;k<len;k++){
            System.out.println("Enter number " + (k+1) + ":");
            a[k]= arr.nextInt();
        }
        
        System.out.print("The Non-repeated numbers are:");        
            
            for(int i = 0;i<len;i++){
            
            check = 0;
            
            for(int j =0;j<len;j++){
                
                if(a[i]==a[j] && i!=j){
                    
                    check++;
            }
        }
            if(check==0){
                    
                    System.out.print(a[i] + " ");
            }        
        }           
    }
}