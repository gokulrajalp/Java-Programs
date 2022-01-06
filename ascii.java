/*Day-3(Beginner)[Problem 3 out of 4]
----Write a java program to print ASCII value for a given character get character from user---
 */
package com.mycompany.javatraining;

import java.util.Scanner;


public class ascii {
    public static void main (String[] args) {
        
        Scanner asc = new Scanner(System.in);
        
        System.out.println("Enter the character to ASCII value :");
        char ch = asc.next().charAt(0);
        
        int display = ch;
        
        System.out.println("ASCII value for the given character is " + display);
    }
    
}
