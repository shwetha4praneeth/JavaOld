package javabasics;

public class Sample2
{
	//Data members 
	public int i;
	public float f;
	public char c;
	public String s;
	public boolean b;
	
	//Methods
	public Sample2()	//Constructor method without arguments
	{
		i=10;
		s="Shwetha";
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
