package com.a106;

public class ObjectCreation 
{
	//data member or variable
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		
	
		//classname objname = new classname();
		ObjectCreation o1 = new ObjectCreation();
		
		o1.id=101;
		o1.name="xyz";
		
		System.out.println(o1.id+" "+o1.name);
		
	}
	
	
	
	
	
}
