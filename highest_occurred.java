package com.mycompany.javatraining;

import java.util.Scanner;

public class highest_occurred {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        int a[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i)]++;
        }

        int max = a[0], value = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (max < a[i + 1]) {
                max = a[i + 1];
                value = i + 1;
            }
        }

        char b = (char) value;
        System.out.println("The highest occurred character : " + b);

    }
}