package javabasics;

public class Sample6Runner 
{
	public static void main(String[] args) 
	{
		Sample6 obj=new Sample6(20,50);
		int x=obj.add();
		System.out.println(x);
		
		int y=obj.add(55);
		System.out.println(y);
		
		int z=obj.add(30,40);
		System.out.println(z);
	}
}
