package javabasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7 
{
	//Data member
	public ChromeDriver driver;
	
	//Constructor method
	public Sample7()
	{
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248");
		driver=new ChromeDriver();
	}
	
	//Operational methods
	public void launch(String u)
	{
		driver.get(u);
	}
	
	public void close()
	{
		driver.close();
	}
}
