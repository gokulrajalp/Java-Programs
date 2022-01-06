/* Day 4 (Problem 2 out of 2) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for printing 10 rows inc-dec triangle---
 */
package com.mycompany.javatraining;


public class triangle1 {
    public static void main (String[] args){
        int i,j,k;
        for(j=0;j<10;j++){
            
        
        for (i=10;i>j;i--){
            System.out.print(" ");
        }
        for(k=1;k<=j+1;k++){
            System.out.print(k);
        }
        for(k=0;k<=j-1;k++){
            System.out.print(j-k);
        }
        System.out.println("");
    }        
}
    
}
