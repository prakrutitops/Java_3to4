package com.a86;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//row
		{
			for(int j =1;j<=i;j++)//col
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
