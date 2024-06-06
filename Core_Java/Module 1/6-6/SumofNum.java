package com.a66;

import java.util.Scanner;

public class SumofNum 
{
	public static void main(String[] args) 
	{
		int temp,sum=0;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Any Number");
		int num = sc.nextInt();//initialize
		
		while(num>0)
		{
			temp = num % 10;
			sum+=temp;
			num=num/10;
		}
		
		System.out.println(sum);
		
		
		
	}
}
