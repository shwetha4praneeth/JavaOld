package javabasics;

public class Sample7Runner
{
	public static void main(String[] args) throws Exception
	{
		Sample7 obj=new Sample7();
		obj.launch("http://google.com");
		Thread.sleep(2000);
		obj.close();
	}
}
