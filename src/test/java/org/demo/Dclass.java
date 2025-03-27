package org.demo;
import org.openqa.selenium.WebDriver;

public class Dclass {
	public static void main(String[] args) {
		//WebDriver driver = Bclass.browser("chrome");
		//driver.get("https://www.google.co.in/");
		//driver.manage().window().maximize();
		WebDriver driver = Bclass.browser("internet explorer");
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	

		
	}

}
