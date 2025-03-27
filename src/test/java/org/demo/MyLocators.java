package org.demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyLocators {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[3]/div[2]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
		inputbox.click();
		WebElement sign=driver.findElement(By.xpath("//span[text()='Create account']"));
		sign.click();	
		WebElement P=driver.findElement(By.xpath("//span[contains(text(),'For my personal use')]"));
		P.click();
		WebElement Q=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		Q.sendKeys("Krishna");
		Q.sendKeys(Keys.TAB);
		WebElement R=driver.findElement(By.xpath("//input[starts-with(@name,'last')]"));
		R.sendKeys("kumari");
		R.sendKeys(Keys.ENTER);
		WebElement M=driver.findElement(By.xpath("//input[@name='day' and @id='day']"));
		M.sendKeys("27");
		WebElement Y=driver.findElement(By.xpath("////input[@name='year' or @id='year']"));
		Y.sendKeys("2000");
		driver.close();
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		@Nullable
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
