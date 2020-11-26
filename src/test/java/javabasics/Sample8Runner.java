package javabasics;

public class Sample8Runner 
{
	public static void main(String[] args) 
	{
		Sample8 obj1=new Sample8();
		Sample8 obj2=new Sample8();
		Sample8.x=100;
		obj1.y=200;
		obj2.y=300;
		System.out.println(Sample8.x+" "+obj1.y);
		System.out.println(Sample8.x+" "+obj2.y);
	}
}
