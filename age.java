/* Day 1 (Problem 2 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
 */
package com.mycompany.javatraining;
import java.util.*;

public class age {
    public static void main (String[] args) {
        Scanner ag = new Scanner(System.in);
        
        System.out.println("Enter 1st person's age:");
        int age1 = ag.nextInt();
        
        System.out.println("Enter 2nd person's age:");
        int age2 = ag.nextInt();
        
        System.out.println("Enter 3rd person's age:");
        int age3 = ag.nextInt();
                
        if(age1>age2 && age1>age3){
            System.out.println("1st person is Oldest whose age is " + age1);
        }        
        else if(age2>age1 && age2>age3){
            System.out.println("2nd person is Oldest whose age is " + age2);
        }
        else{
            System.out.println("3rd person is Oldest whose age is " + age3);
        }
        
        if(age1<age2 && age1<age3){
            System.out.println("1st person is Youngest whose age is " + age1);
        }        
        else if(age2<age1 && age2<age3){
            System.out.println("2nd person is Youngest whose age is " + age2);
        }
        else{
            System.out.println("3rd person is Youngest whose age is " + age3);
        }
    }
    
}
