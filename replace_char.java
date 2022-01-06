package com.mycompany.javatraining;

import java.util.Scanner;

public class replace_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        System.out.println("Which character you going to replace :");
        char a = sc.nextLine().charAt(0);

        System.out.println("Enter the character to replace :");
        String b = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                result = result + b;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}