package com.mycompany.javatraining;

import java.util.Scanner;

public class count_occurrance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the character to find occurrance count :");
        char a = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        System.out.println("The character " + a + " occurred " + count + " times");
    }
}