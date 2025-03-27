package org.demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String args[]){
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("krishu1998");
		@Nullable
		String attribute = element.getAttribute("data-testid");
		System.out.println(attribute);
		@Nullable
		String attribute2 = element.getAttribute("placeholder");
		System.out.println(attribute2);
		String attribute3 = element.getAttribute("value");
		System.out.println(attribute3);
		WebElement element2 = driver.findElement(By.linkText("Forgotten password?"));
		@Nullable
		String attribute4 = element2.getAttribute("innerHTML");
		System.out.println(attribute4);

		
		
	}

}
