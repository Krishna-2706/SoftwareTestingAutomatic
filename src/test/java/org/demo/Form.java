package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("RESULT_TextField-1"));
		boolean enabled = firstName.isEnabled();
		System.out.println(enabled);
		
		boolean displayed = firstName.isDisplayed();
		System.out.println(displayed);
		WebElement Day = driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_2']"));
		
		boolean selected = Day.isSelected();
		System.out.println(selected);
		Day.click();
		boolean selected2 = Day.isSelected();
		System.out.println(selected2);
		

		
		
	}

}
