package org.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FillingForm {
	public static void main(String[] args) {
		WebDriver driver = Bclass.browser("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Krishna");
		name.sendKeys(Keys.TAB);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("krishu1998@gmail.com");
		email.sendKeys(Keys.TAB);
		WebElement phone = driver.findElement(By.xpath("//input[contains(@id,'phone')]"));
		phone.sendKeys("9897969594");
		phone.sendKeys(Keys.TAB);
		WebElement address = driver.findElement(By.id("textarea"));
		address.sendKeys("Coimbatore");
		address.sendKeys(Keys.TAB);
		WebElement gender = driver.findElement(By.id("female"));
		gender.click();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='form-check form-check-inline']/input"));
		for (WebElement a:checkbox) {
			a.click();
		}
		WebElement country = driver.findElement(By.id("country"));
		country.click();
		country.sendKeys("India");
		country.sendKeys(Keys.ENTER);
		WebElement colors = driver.findElement(By.id("colors"));
		Select s =new Select(colors);
		s.selectByValue("red");
		s.selectByIndex(0);
		s.selectByVisibleText("Green");
		WebElement animal = driver.findElement(By.id("animals"));
		Select d =new Select(animal);
		d.selectByValue("dog");
		d.selectByIndex(1);
		d.selectByIndex(2);
		d.selectByVisibleText("Lion");
		animal.sendKeys(Keys.TAB);
		
		
		
		
	}

}
