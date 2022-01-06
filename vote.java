/*Day-1(Beginner)[Problem 1 out of 4]
----Check whether the given age is eligible to vote or not---
 */
package com.mycompany.javatraining;
import java.util.*;

public class vote {
        public static void main (String[] args){
            int age;
            Scanner ag = new Scanner(System.in);
            
            System.out.println("Enter your age :");
            
            age = ag.nextInt();
            
            if(age>=18){
                System.out.println("Your eligible to vote");
            }
            else{
                System.out.println("Your not eligible to vote");
            }
        }
    
}
