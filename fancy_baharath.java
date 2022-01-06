
package com.mycompany.javatraining;
import java.util.*;

public class fancy_baharath {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number:");
		String str=sc.nextLine();
		int len=str.length();
		int i=0,j=0,k=0,count1=0,count2=0,count3=0;
		char arr[]=str.toCharArray();
		if(len==10) {
			for(i=0;i<arr.length-2;i++) {
				for(j=i+1;j<arr.length-1;j++) {
					for(k=j+1;k<arr.length;k++) {
						if(arr[i]==arr[j]&& arr[i]==arr[k]) {
							count1++;
						}
					}
				}
			}
				if(count1>=1) {
					System.out.println("It is Fancy number, Because A single number occurs three consecutive times");
				}
			
			for(i=0;i<arr.length-2;i++) {
				for(j=i+1;j<arr.length-1;j++) {
				   for(k=j+1;k<arr.length;k++) {
					   if(arr[j]==arr[i]+1 && arr[j]==arr[i]+2 ||arr[j]==arr[i]-1 && arr[j]==arr[i]-2) {
						   count2++;
					   }
				   }
				}
			}
			if(count2>=1) {
				System.out.println("It is a fancy number,Because Three consecutive Digits are either increasing or decreasing pattern");
			}
			for(i=0;i<arr.length;i++) {
				for(j=0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count3++;
					}
				}
			}
			
			if(count3>=4) {
				System.out.println("It is fancy number,Because A single Digit occurs"+count3+"times in the number" );
			}
			
			if(count1==0 && count2==0 && count3<=4) {
				System.out.println("It is not a fancy number");
			}
			
			
		}
		else {
			System.out.println("It is not a mobile number");
		}

	}
}