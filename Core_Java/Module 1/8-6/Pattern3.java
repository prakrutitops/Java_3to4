package com.a86;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		int a= 64;
		//char ch='A';
		for(int i=1;i<=5;i++)//row
		{
			for(int j =1;j<=i;j++)//col
			{
				System.out.print((char)(a+j));
			}
			System.out.println();
		}
		
	}
}
