/*Day-2(Beginner)[Problem 2 out of 4]
----Find the Smallest of three numbers---
 */
package com.mycompany.javatraining;
import java.util.*;

public class smallest {
    public static void main (String[] args){
        int num1, num2, num3;
        
            Scanner small = new Scanner(System.in);
            
            System.out.println("Enter the 1st number :");
            num1 = small.nextInt();
            
            System.out.println("Enter the 2nd number :");
            num2 = small.nextInt();
            
            System.out.println("Enter the 3rd number :");
            num3 = small.nextInt();
            
            if(num1<num2 && num1<num3){
                System.out.println( num1+ " is smallest number");
            }
            else if(num2<num1 && num2<num3){
                System.out.println( num2+ " is smallest number");
            }
            else{
                System.out.println( num3+ " is smallest number");          
            }
    }
}
