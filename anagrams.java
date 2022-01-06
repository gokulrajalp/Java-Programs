package com.mycompany.javatraining;
import java.util.*;

public class anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String :");
        String str1 = sc.nextLine();

        System.out.println("Enter the Second String :");
        String str2 = sc.nextLine();

        int a, b, a1 = 0, b1 = 0;

        for (int i = 0; i < str1.length(); i++) {
            a = Character.toLowerCase(str1.charAt(i));
            if (a != ' ') {
                a1 = a1 + a;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            b = Character.toLowerCase(str2.charAt(i));
            if (b != ' ') {
                b1 = b1 + b;
            }
        }

        if (a1 == b1) {
            System.out.println("It is anagram");
        } else {
            System.out.println("It is not anagram");
        }
    }
}