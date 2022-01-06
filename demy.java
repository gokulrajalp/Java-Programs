
package com.mycompany.javatraining;

import java.util.Scanner;

public class demy {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = "Upper";

        
        boolean a = str.equalsIgnoreCase(str3);
        
        if (a == true){
                System.out.println(str2.toUpperCase());
                
}
        else{
                System.out.println(str2.toLowerCase());
                
        }
    }
}
