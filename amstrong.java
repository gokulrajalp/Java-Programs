/* Day 2 (Problem 4 out of 5) done by L.P.GokulRaja_1913028_CSE-III-A
---Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each 
        digit of the number is equal to the number itself, then the number is called an Armstrong number.
            For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )---*/
package com.mycompany.javatraining;

public class amstrong {
        public static void main (String[] args){
    int a,rem,b=0,r,sum=0,check,c;
    
    for(a=0;a<500;a++){
    
    rem = a;
    check = a;
    c = a;
    while (c != 0){
        c = c/10;
        b++;
}
    
   if(b==1){
        System.out.println(check);

  }    
    
    
    
   if(b==2){
  
  while(rem!=0){
       r=rem%10;
       rem=rem/10;
       
       sum = sum + r*r;
    }
  }
  
  if(b==3){
  
  while(rem!=0){
       r=rem%10;
       rem=rem/10;
       
       sum = sum + r*r*r;
    }
  }
  
  
  
  if(check == sum){
  System.out.println(sum);
  }
  sum=0;
  b=0;
    }
}
}

