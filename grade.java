/* Day 1 (Problem 1 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
 */
package com.mycompany.javatraining;
import java.util.*;

public class grade {
    public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the mark:");
    int mark = sc.nextInt();
    
    if(mark<25){
        System.out.println("F");
    }
    else if(mark>=25 && mark<45){
        System.out.println("E");
    }
    else if(mark>=45 && mark<50){
        System.out.println("D");
    }
    else if(mark>=50 && mark<60){
        System.out.println("C");
    }
    else if(mark>=60 && mark<80){
        System.out.println("B");
    }
    else{
        System.out.println("A");
    }
    
    }
    
}
