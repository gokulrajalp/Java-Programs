/*Day-2(Beginner)[Problem 2 out of 4]
----The sum of digit of given number---*/
package com.mycompany.javatraining;
import java.util.Scanner;

public class Sum_digit {
    public static void main (String[] args){
        Scanner digit = new Scanner(System.in);
                 
        System.out.println("Enter the number :");
        int number = digit.nextInt();
        int sum =0, rem = 0, dig=0, temp=0, temp1 =0;
        temp = number;
        temp1 = number;
        
        while(temp!=0){
            dig++;
            temp = temp/10;
        }
        
        for (int i = 1;i<dig;i++){
            temp1 = temp1 /10;
        }
        
        while(number!=0){
            rem = number%10;
            System.out.print(rem + " ");
        
            if(rem==temp1){
                System.out.print("= ");
            }
            else{
                System.out.print("+ ");
            }
            
            sum = sum + rem;
            
            
            number = number/10;
        }
            System.out.println(sum);
    }
}
