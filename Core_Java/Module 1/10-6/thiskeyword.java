package com.a106;

public class thiskeyword 
{
	int id;
	String name;
	String email;
	
	public thiskeyword(int id,String name,String email) 
	{
		this.id= id;
		this.name = name;
		this.email = email;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
	
	public static void main(String[] args) 
	{
		thiskeyword p1 = new thiskeyword(1,"vivek","vivek@gmail.com");
		p1.display();
	}
	
}
