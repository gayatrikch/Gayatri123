package com.bjs.seleniumDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://in.bookmyshow.com/");
		List<WebElement> links=  driver.findElements(By.tagName("a"));
		int size= links.size();
		System.out.println(links);
		
		/*for (WebElement link:links) {
			String text = link.getText();
			System.out.println(text);
		}*/
	}

}
