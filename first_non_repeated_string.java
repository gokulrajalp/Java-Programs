package com.mycompany.javatraining;

import java.util.*;

public class first_non_repeated_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("The First non repeated character from String is " + str.charAt(i));
                break;
            }
            count = 0;
        }
    }
}