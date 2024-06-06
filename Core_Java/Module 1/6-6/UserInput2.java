package com.a66;

import java.util.Scanner;

public class UserInput2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Marks");
		float marks = sc.nextFloat();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		System.out.println(id);
		System.out.println(marks);
		System.out.println(name);
		System.out.println(salary);
		
		
	}
}
