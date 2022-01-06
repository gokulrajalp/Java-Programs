/*Day-3(Beginner)[Problem 1 out of 4]
----To find the given year is leap year or not---
 */
package com.mycompany.javatraining;

import java.util.Scanner;

public class leap_year {
    public static void main (String[] args) {
    
    Scanner leap = new Scanner(System.in);
    
    System.out.println("Enter year :");
    int year = leap.nextInt();
    
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println(year + " is a leap year");
        }
        else{
         System.out.println(year + "  is not a leap year");
        }
    }
}
