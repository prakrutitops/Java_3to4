package com.a106;

public class ParaEx 
{
	int id;
	String name;
	String email;
	
	public ParaEx(int i,String n,String e) 
	{
		id= i;
		name = n;
		email = e;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
	
	public static void main(String[] args) 
	{
		ParaEx p1 = new ParaEx(1,"vivek","vivek@gmail.com");
		p1.display();
	}
	
}
