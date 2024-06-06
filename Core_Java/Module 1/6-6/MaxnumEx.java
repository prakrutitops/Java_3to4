package com.a66;

import java.util.Scanner;

public class MaxnumEx 
{
	public static void main(String[] args) 
	{
		int temp,max=0;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Any Number");
		int num = sc.nextInt();//initialize
		
		while(num>0)
		{
			temp = num%10;
			
			if(temp>max)
			{
				max=temp;
			}
			num=num/10;
		}
		System.out.println("MAx num is "+max);
		
		
	}
}
