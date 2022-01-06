
package com.mycompany.javatraining;


public class amstrong_check {
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