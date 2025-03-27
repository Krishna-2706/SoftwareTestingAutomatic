package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver = Bclass.browser("chrome");
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//Switching frames using id
		//driver.switchTo().frame("singleframe");
		//Switching frames using element
		//WebElement element = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		//driver.switchTo().frame(element);
		//Switching frames using index
		driver.switchTo().frame(0);
		WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
		inputbox.sendKeys("Selenium");
		
		
	}
}
