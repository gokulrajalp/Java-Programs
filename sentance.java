/*Day-5(Beginner)[Problem 4 out of 4]
----Write a program to read a sentence using scanner and print---
 */
package com.mycompany.javatraining;
import java.util.Scanner;

public class sentance {
    public static void main (String[] args) {
        
        Scanner str = new Scanner(System.in);
    
        System.out.println("Enter the sentence :");
    
        String a = str.nextLine();
        
        System.out.print("You'r sentence is :");
        System.out.print(a);
    }
}
