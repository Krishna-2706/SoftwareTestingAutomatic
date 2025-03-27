package org.demo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BrokenLink {

public static void main(String[] args) throws IOException {
	
	WebDriver driver = Bclass.browser("chrome");
	driver.get("https://www.softwaretestingmaterial.com/");
	driver.manage().window().maximize();
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	for (WebElement e: elements) {
		String str=e.getAttribute("href");
		HelperClass.LinkCHecker(str);
	int statuscode = 0;
	if(statuscode >=400)
	{
		System.out.println("Given link is a broken link: " + str);
	}
	
	else
	{
		System.out.println("Given link is not a broken link " +str);
	}
	
	}}
	

}


