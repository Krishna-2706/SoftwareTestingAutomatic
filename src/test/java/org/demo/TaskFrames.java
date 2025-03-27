package org.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskFrames {
	public static void main(String[] args) {
		WebDriver driver = Bclass.browser("chrome");
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement nestedIframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
		nestedIframe.click();
		//WebElement element = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		//driver.switchTo().frame(element);
		//WebElement element2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		//driver.switchTo().frame(element2);
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);		
		WebElement ibox = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		ibox.sendKeys("Java");
		
	}
}
