package org.demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsHandling {
	public static void main(String[] args) {
		WebDriver driver = Bclass.browser("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ibox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		ibox.sendKeys("Java");
		ibox.sendKeys(Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		for(WebElement ele:elements) {
			ele.click();
		}
		String windowHandle = driver.getWindowHandle();
		System.out.println("Parent ID: "+ windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String allID: windowHandles) {
			System.out.println(allID);
		}
		WebDriver window = driver.switchTo().window(windowHandle);
		System.out.println(window);
		
	}

}
