package org.demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL");
		System.out.println(currentUrl);
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		@Nullable
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
}
