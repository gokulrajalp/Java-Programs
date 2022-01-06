package com.mycompany.javatraining;

import java.util.*;

public class Max_time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[4];
        int b[] = new int[4];
        ArrayList<Integer> al = new ArrayList<Integer>();

        int j = 0;
        System.out.println("Enter the numers : ");

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
            al.add(a[i]);
        }

        boolean dig1 = false, dig2 = false, dig3 = false;
        for (int k = 2; k >= 0; k--) {
            if (!dig1) {
                for (int i = 0; i < 4; i++) {
                    if (a[i] == k) {
                        b[j] = a[i];
                        j++;
                        al.remove(i);
                        dig1 = true;
                        break;
                    }
                }
            }
        }

        Collections.sort(al, Collections.reverseOrder());

        if (b[0] == 0 || b[0] == 1) {
            b[1] = al.get(0);
            al.remove(0);
            dig2 = true;
        }
        int temp = 0;

        if (b[0] == 2) {
            for (int i = 0; i < 3; i++) {
                temp = al.get(i);
                if (temp <= 3) {
                    b[1] = temp;
                    al.remove(i);
                    dig2 = true;
                    break;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            temp = al.get(i);
            if (temp <= 5) {
                b[2] = temp;
                al.remove(i);
                dig3 = true;
                break;
            }
        }

        b[3] = al.get(0);

        if (dig1 && dig2 && dig3) {
            System.out.println(b[0] + "" + b[1] + " : " + b[2] + "" + b[3]);
        } else {
            System.out.println("Enter the valid number");
        }
    }
}