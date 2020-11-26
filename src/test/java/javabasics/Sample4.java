package javabasics;

public class Sample4 
{
	//Data members
	public int i;
	public float f;
	public char c;
	public String s;
	public boolean b;
	
	//Methods
	public Sample4()	//Constructor method
	{
		i=10;
		s="Praneeth";
	}
	
	public Sample4(int a)	//Constructor method
	{
		i=a;
		s="Praneeth";
	}
	
	public Sample4(float b)	//Constructor method
	{
		f=b;
		s="Shwetha";
	}
	
	public Sample4(int a,String b)	//Constructor method
	{
		i=a;
		s=b;
	}
	
	public void display()	//Operational method
	{
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
		System.out.println(s);
		System.out.println(b);
	}
}
