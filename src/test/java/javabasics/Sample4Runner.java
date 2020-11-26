package javabasics;

public class Sample4Runner 
{
	public static void main(String[] args) 
	{
		Sample4 obj1=new Sample4();	//1st Constructor
		obj1.display();
		
		Sample4 obj2=new Sample4(100);	//2nd Constructor
		obj2.display();
		
		Sample4 obj3=new Sample4(10.5f);	//3rd Constructor
		obj3.display();
		
		Sample4 obj4=new Sample4(200,"Gaurav");	//4th Constructor
		obj4.display();
	}
}
