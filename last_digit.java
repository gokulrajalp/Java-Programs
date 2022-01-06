/*Day-1(Beginner)[Problem 3 out of 4]
----Display the last digit of given number---
 */
package com.mycompany.javatraining;
import java.util.*;

public class last_digit {
    public static void main (String[] args){
            Scanner dig = new Scanner(System.in);
            
            System.out.println("Enter the number :");
            int number = dig.nextInt();
            
            int last = number%10;

            System.out.println(last + " is the last digit of the given number :");
            
    }
}
