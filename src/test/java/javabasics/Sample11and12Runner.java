package javabasics;

public class Sample11and12Runner 
{
	public static void main(String[] args)
	{
		//Create object to interface with the help of concrete class
		Sample11 obj1=new Sample12();
		int i1=obj1.add(10, 20);
		System.out.println(i1);
		//Create object to concrete  class
		Sample12 obj2=new Sample12();
		int i2=obj2.add(10, 20);
		System.out.println(i2);
	}
}
