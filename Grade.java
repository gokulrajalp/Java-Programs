/*Day-2(Beginner)[Problem 1 out of 4]
----Display Grade, input marks will be given---
 */
package com.mycompany.javatraining;

import java.util.Scanner;

public class Grade {
    public static void main (String[] args) {
    
    Scanner grade = new Scanner(System.in);
    
    System.out.println("How much Student's mark you going to enter ?");
    int limit = grade.nextInt();
    
    int [] marks = new int[limit];
    String[] name = new String[limit]; 
    grade.nextLine();
    
    for (int i = 0 ;i<limit;i++){
        System.out.println("Enter Student " + (i+1) +  " Name :");
        name[i] = grade.nextLine();
    }
    
    for (int i = 0 ;i<limit;i++){
        System.out.println("Enter " + name[i] + "'s Mark :");
        marks[i] = grade.nextInt();
    }
    
    for (int j=0;j<limit;j++){
            
    if(marks[j]>=0 && marks[j]<=50){
        System.out.println(name[j] + " got fail mark");
    }
    else if(marks[j]>=51 && marks[j]<=70){
        System.out.println(name[j] + " need to improve to get more marks");
    }
    else if(marks[j]>=71 && marks[j]<=80){
        System.out.println(name[j] + " got good marks");
    }
    else if(marks[j]>=81 && marks[j]<=90){
        System.out.println(name[j] + " got very Good marks");
    }
    else if(marks[j]>=90 && marks[j]<=100){
        System.out.println(name[j] + " got excellent marks");
    }
    else{
        System.out.println("The mark you entered for " + name[j] + " is Invalid");
    }
    }
    }
}
