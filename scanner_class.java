/*Day-2(Beginner)[Problem 3 out of 4]
----program to get imput from user using scanner class---*/
package com.mycompany.javatraining;
import java.util.Scanner;
        
public class scanner_class {

    public static void main (String[] args){
        Scanner all = new Scanner(System.in);
        
        System.out.println("Enter any Integer value :");        
        int a = all.nextInt();
        System.out.println("Integer = " + a);
        
        System.out.println("Enter any Character :");
        char b = all.next().charAt(0);
        System.out.println("Character = " + b);
        
        System.out.println("Enter any String :");
        all.nextLine();
        String c = all.nextLine();
        System.out.println("String = " + c);
        
        System.out.println("Enter any Double value :");
        double d = all.nextDouble();
        System.out.println("Double = " + (d*d*d));
        
        System.out.println("Enter any Float Value :");
        float e = all.nextFloat();
        System.out.println("Float = " + e);
        
        System.out.println("Enter Boolean (true or false) :");
        boolean f = all.nextBoolean();
        if(f == true){System.out.println("Run Sucessfully");}
        
    }  
}