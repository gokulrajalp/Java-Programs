package com.mycompany.javatraining;

import java.util.Scanner;

public class x_last {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String res="";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                count++;
            } else {
                res = res + str.charAt(i);
            }
        }
        for (int i = 0; i < count; i++) {
            res = res + "x";
        }
        System.out.println("The Encoded string :" + res);
    }
}