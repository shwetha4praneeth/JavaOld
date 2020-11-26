package javabasics;

public class Sample3 
{
	//Data members
	public int i;
	public float f;
	public char c;
	public String s;
	public boolean b;
	
	//Methods
	public Sample3(String temp)	//Constructor method with arguments
	{
		i=20;
		s=temp;
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
