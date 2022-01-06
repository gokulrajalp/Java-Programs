package com.mycompany.javatraining;
import java.util.*;
public  class demo
{
public static void main (String[]args)
{
int i, max,min, size;
Scanner ma= new Scanner(System.in);
System.out.println("Enter the numbers :");
size= ma.nextInt();
int [] a = new int[size];
for(i=0; i<=size;i++)
{
a[i]=ma.nextInt();
}
max=a[0];
min=a[0];

for(i=0;i<size;i++)
{

if(a[i]<min)
{
min= a[i];
}

if(a[i]>max)
{
max= a[i];
}


}

System.out.println("Maximum number :" +max);
System.out.println("Minimum number :" +min);
ma.close();
}
}