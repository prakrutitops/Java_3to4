package com.a106;

public class CopyConEx 
{
	int id;
	String name;
	
	public CopyConEx(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	public CopyConEx(CopyConEx c) 
	{
		System.out.println(c.id+" "+c.name);
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		CopyConEx c1 = new CopyConEx(101,"a");
		CopyConEx c2 = new CopyConEx(c1);
		c1.display();
	}
}
