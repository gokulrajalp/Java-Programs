/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatraining;

import java.util.Scanner;

/**
 *
 * @author elcot
 */
public class greatesti {
    public static void main (String[] args){
        Scanner gr = new Scanner(System.in);
        int a,b,c;
        System.out.print("Input the 1st number:");
        
        a = gr.nextInt();
        
        
        System.out.print("\nInput the 2nd number:");
        
        b = gr.nextInt();
        
        
        System.out.print("\nInput the 3rd number:");        
        
        c = gr.nextInt();
        
        if(a>b && a>c){
            System.out.println("The greatest:" + a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest:" + b);
        }
        else{
            System.out.println("The greatest:" + c);
        }
    }
}
