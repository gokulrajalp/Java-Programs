/*Day-1(Beginner)[Problem 4 out of 4]
----Check whether the given number is eact multiple of 8---
 */
package com.mycompany.javatraining;
import java.util.*;

public class mul_8 {
    public static void main (String[] args){
            Scanner mul = new Scanner(System.in);
            
            System.out.println("Enter the number :");
            int num = mul.nextInt();
            
            if(num%8==0){
            System.out.println(num + " is multiple of 8");                
            }
            else{
            System.out.println(num + " is not a multiple of 8");                                
            }
    }
}
