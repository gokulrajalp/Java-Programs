/* Day 1 (Problem 5 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
 */
package com.mycompany.javatraining;
import java.util.*;

public class mf {
    public static void main (String[] args) {
        Scanner mfs = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age = mfs.nextInt();
        
        System.out.println("Enter your sex : M or F");
        char sex = mfs.next().charAt(0);
        
        System.out.println("Enter your marital status : Y or N");
        char mari = mfs.next().charAt(0);
        
        
        if(sex == 'M'){
            if((age>=20) && (age<40)){
                System.out.println("Your place of service is anywhere");
            }
            else if((age>=40) && (age<60)){
                System.out.println("Your place of service is urban areas");
            }
        }
        else if(sex == 'F'){
            System.out.println("Your place of service is urban areas");
        }
        else{
            System.out.println("ERROR");
        }       
        System.out.println("ERROR");
}
    
}
