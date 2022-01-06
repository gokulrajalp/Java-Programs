/* Day 5 (Problem 1 out of 3) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for to find Max and Min number in array---*/

package com.mycompany.javatraining;
import java.util.*;

public class MaxMin_Array {
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
                
        for(int i = 0;i<len;i++){
            for(int j =i;j<len;j++){
                if(a[i]>a[j]){
                    
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        
        }
        
        System.out.println("The Max of given numbers is " + a[len-1]);
        System.out.println("The Min of given numbers is " + a[0]);
        
        
    }
}
