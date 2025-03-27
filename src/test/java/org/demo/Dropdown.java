package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("fruits"));
		Select s=new Select(element);
		s.selectByIndex(0);
		s.selectByValue("1");
		s.selectByVisibleText("Orange");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement all:allSelectedOptions) {
			System.out.println(all.getText());
		}
		
		List<WebElement> options = s.getOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		WebElement element2 = driver.findElement(By.id("superheros"));
		Select s1=new Select(element2);
		s1.selectByIndex(2);
		s1.selectByVisibleText("Daredevil");
		s1.selectByValue("am");
		s1.deselectByIndex(0);
		List<WebElement> allSelectedOptions1 = s1.getAllSelectedOptions();
		for(WebElement all1:allSelectedOptions1) {
			System.out.println("Multiple Dropdown");
			System.out.println(all1.getText());
		}
		
		List<WebElement> options1 = s1.getOptions();
		for(WebElement opt1:options1) {
			System.out.println(opt1.getText());
		}
		
	}

}

