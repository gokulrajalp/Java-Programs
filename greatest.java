/* Day 1 (Problem 4 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
 */
package com.mycompany.javatraining;
import java.util.*;

public class greatest {
    public static void main (String[] args){
        Scanner gr = new Scanner(System.in);
        
        System.out.print("Input the 1st number:");
        System.out.println();
        int a = gr.nextInt();
        
        
        System.out.print("Input the 2nd number:");
        System.out.println();
        int b = gr.nextInt();
        
        
        System.out.print("Input the 3rd number:");        
        System.out.println();
        int c = gr.nextInt();
        
        if(a>b && a>c){
            System.out.println("The greatest:" + a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest:" + b);
        }
        else{
            System.out.println("The greatest:" + c);
        }
    }
    
}
