
package com.mycompany.javatraining;
import java.util.*;
import java.util.Arrays;

public class sum_prime_ascii {
    public static void main(String[] args){
String a = "hello world";
int b[] = new int [a.length()];
for (int i =0; i<a.length(); i++){
b[i] = (int) a.charAt(i);
}
for(int j = 0;j<a.length();j++){
for(int i =0;i<a.length()/2;i++){
if(b[i]%i==0){

}
}
}
System.out.println(Arrays.toString(b));
}
}
