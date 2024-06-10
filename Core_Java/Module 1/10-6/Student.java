package com.a106;

import java.util.Scanner;

public class Student 
{
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		
		Student s1 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		s1.id=sc.nextInt();
		System.out.println("Enter Your Name");
		s1.name=sc.next();
		
		System.out.println(s1.id+" "+s1.name);
	}
}
