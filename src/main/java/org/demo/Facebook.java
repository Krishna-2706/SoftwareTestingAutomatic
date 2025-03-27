package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String args[]) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement inputbox =driver.findElement(By.name("email"));
		inputbox.sendKeys("krishu1998@gmail.com");
		inputbox.sendKeys(Keys.TAB);
		WebElement input =driver.findElement(By.name("pass"));
		input.sendKeys("Megala*27");
		input.sendKeys(Keys.ENTER);
		
	}

}
