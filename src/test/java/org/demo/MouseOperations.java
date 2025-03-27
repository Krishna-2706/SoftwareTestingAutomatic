package org.demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) {
		WebDriver driver = Bclass.browser("edge");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span[@class='nav-line-2 ']/span"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		act.moveToElement(element2).click().perform();
		driver.close();
		WebDriver browser = Bclass.browser("chrome");
		browser.get("https://testautomationpractice.blogspot.com/");
		browser.manage().window().maximize();
		WebElement ibox = browser.findElement(By.id("field1"));
		ibox.clear();
		ibox.sendKeys("Welcome to Selenium");
		WebElement button = browser.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions act1= new Actions(browser);
		act1.moveToElement(button).doubleClick().perform();
		WebElement field = browser.findElement(By.id("field2"));
		@Nullable
		String attribute = field.getAttribute("value");
		System.out.println(attribute);
		
	
	}
}
