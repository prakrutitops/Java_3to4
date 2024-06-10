package com.a106;

class S
{
	void s()
	{
		System.out.println("S");
	}
}
class D extends S
{
	void d()
	{
		System.out.println("D");
	}
}
interface H
{
	void h();
}
class T extends D implements H
{
	void t()
	{
		System.out.println("T");
	}

	@Override
	public void h() 
	{
		// TODO Auto-generated method stub
		System.out.println("H");
	}
}


public class HybridInEx 
{
	public static void main(String[] args) {
		
		T t1 = new T();
		
		t1.t();
		t1.d();
		t1.h();
		t1.s();
		
	}
}
