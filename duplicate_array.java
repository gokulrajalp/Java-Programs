/* Day 5 (Problem 2 out of 3) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for to find duplicate numbers in array---*/

package com.mycompany.javatraining;
import java.util.*;

public class duplicate_array {
    public static void main (String[] args){
        Scanner arr = new Scanner(System.in);
        
        System.out.println("How much number you going to enter?");
        int len = arr.nextInt();
        int [] a = new int[len];
        
        
        
        for(int k=0;k<len;k++){
            System.out.println("Enter number " + (k+1) + ":");
            a[k]= arr.nextInt();
        }
        
        System.out.print("The duplicate of given numbers are:");        
            
        ArrayList<Integer> b = new ArrayList<Integer>();
            
        for(int i = 0;i<len;i++){
            
            for(int j =0;j<len;j++){
                
                if(a[i]==a[j] && i!=j){
                    
                    for(int m = 0;m<len;m++){
                        if(b.contains(a[i])){
                            break;
                        }
                        
                        else{
                           b.add(a[i]);
                        }   
                    }
                }
            }
                    
        }
            System.out.print(b + " ");
    }
}