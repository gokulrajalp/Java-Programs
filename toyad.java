/* Day 10 (Problem 1 out of 2) done by L.P.GokulRaja_1913028_CSE-III-A
---Write java Program for to print toyad for an input today---*/

package com.mycompany.javatraining;
import java.util.Scanner;

public class toyad {
    public static void main(String[] args) {
		Scanner to = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String str = to.nextLine();
		int len = str.length();
		
		System.out.print("The modified String is :");
                    for (int i = 0;i<len/2;i++) {
			System.out.print(str.charAt(i));
                    }
		
                    for (int i = str.length()-1;i>=len/2;i--) {
			System.out.print(str.charAt(i));
                    }
    }
}
