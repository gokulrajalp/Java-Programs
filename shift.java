/*Day-2(Beginner)[Problem 4 out of 4]
----Left shift and Right shift---*/
package com.mycompany.javatraining;
import java.util.Scanner;

public class shift {
        public static void main (String[] args){
        Scanner sh = new Scanner(System.in);
        int result =0;         
        System.out.println("Enter the number which going to shift :");
        int number = sh.nextInt();

        System.out.println("Enter how much position you going to shift :");
        int position = sh.nextInt();
        
        System.out.println("Are you want to shift " + number + " to Right or Left shift[Enter L or R]");
        char shift = sh.next().charAt(0);
        
        if (shift == 'L'){
            result = number<<position;
            System.out.println(number + " << " + position + " = " + result);
            
        }
        else if (shift == 'R'){
            result = number>>position;
            System.out.println(number + " >> " + position + " = " + result);
        
        }
        else{
            System.out.println("Invalid input");
        }
    }
}