/*Day-6(Beginner)[Problem 1 out of 4]
---Program to insert an element in a specified position in a given array----
 */

package com.mycompany.javatraining;
import java.util.Scanner;

public class insert_array {

    public static void main (String[] args) {
        Scanner arr = new Scanner(System.in);
        
        System.out.println("How much number you going to enter?");
        int limit = arr.nextInt();
        int [] a = new int[limit];
        int [] b = new int[limit+1];
        
        for(int i=0;i<limit;i++){
            System.out.println("Enter number " + (i+1) + " :");
            a[i]= arr.nextInt();
        }
        
        System.out.println("Enter position to insert :");
        int position = arr.nextInt();
        
        System.out.println("Enter the element :");
        int element = arr.nextInt();
        
        System.out.print("The array elements you entered are :");
        
        for(int i=0;i<limit;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        int j=0;
        for (int i = 0 ; i<=limit; i++){
            if(i == position){
                b[i] = element;
            }
            else{
                b[i] = a[j];
                j++;
            }
        }
        
        System.out.print("The new array elements with new element are :");
        
        for(int i=0;i<=limit;i++){
            System.out.print(b[i] + " ");
        }

    }
}
