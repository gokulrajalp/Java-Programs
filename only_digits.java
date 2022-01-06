package com.mycompany.javatraining;
import java.util.Scanner;

public class only_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check if a String contains only digits:");
        String str = sc.nextLine();
        int a = 0;
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(i);
            if (!(a >= 48 && a <= 57)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Yes,Condition Satisfied");
        } else {
            System.out.println("No,Condition not Satisfied");
        }
    }
}