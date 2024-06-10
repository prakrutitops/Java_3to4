package com.a106;

class P
{
	void p()
	{
		System.out.println("P");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q");
	}
}
class R extends Q
{
	void r()
	{
		System.out.println("R");
	}
}

public class MultilevelInEx 
{
	public static void main(String[] args) {
		
		R r1 = new R();
		
		r1.p();
		r1.q();
		r1.r();
		
	}
}
