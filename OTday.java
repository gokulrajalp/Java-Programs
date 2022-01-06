/* Day 10 (Problem 2 out of 2) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for to print OTday for an input today,and otday for an input TOday---*/

package com.mycompany.javatraining;
import java.util.Scanner;

public class OTday {
    public static void main(String[] args) {
		Scanner to = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String str = to.nextLine();
		int len = str.length();
                char str1;
		
		System.out.print("The modified String is :");
		
                for (int i = len/2-1;i>=0;i--) {
                    str1 = str.charAt(i);
                    
                    if(Character.isLowerCase(str1)) 
                        System.out.print(Character.toUpperCase(str1));
                    else 
                        System.out.print(Character.toLowerCase(str1));
		}
		
		for (int i = len/2;i<=str.length()-1;i++) {
			System.out.print(str.charAt(i));
		}
	}
}
