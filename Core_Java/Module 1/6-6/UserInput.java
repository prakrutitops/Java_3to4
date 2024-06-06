package com.a66;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		//System.out.println(name+" "+pass);
		
		if(pass.equals("1234"))
		{
			System.out.println("welcome "+name);
		}
		else
		{
			System.out.println("fail");
		}
		
	}
}
