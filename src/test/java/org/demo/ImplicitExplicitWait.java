package org.demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWait {
	public static void main(String args[]) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement inputbox =driver.findElement(By.name("q"));
		inputbox.sendKeys("demo page for selenium testing");
		inputbox.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("LC20lb MBeuO DKV0Md"))));
		until.click();
	
		
	}
}
