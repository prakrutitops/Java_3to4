package com.a106;

//interface - collection of abstract methods

interface M
{
	void m();
}
interface N
{
	void n();
}
class L implements M,N
{

	@Override
	public void n() 
	{
		// TODO Auto-generated method stub
		System.out.println("N");
	}

	@Override
	public void m() 
	{
		// TODO Auto-generated method stub
		System.out.println("M");
	}
	
}

public class MultipleEx 
{
	public static void main(String[] args) {
		
		L l1 = new L();
		
		l1.m();
		l1.n();
	}
}
