package com.a106;

public class StaticKeyword 
{
	static int count = 0;
	
	public StaticKeyword() 
	{
		// TODO Auto-generated constructor stub
	
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		StaticKeyword s1 = new StaticKeyword();
		StaticKeyword s2 = new StaticKeyword();
		StaticKeyword s3 = new StaticKeyword();
	}
}
