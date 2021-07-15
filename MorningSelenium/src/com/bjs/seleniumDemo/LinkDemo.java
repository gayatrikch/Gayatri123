package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("http://www.gmail.com/");
		
		//WebElement link = driver.findElement(By.linkText("Learn more"));
		//link.click();
		
		WebElement link = driver.findElement(By.partialLinkText("Learn"));
		link.click();
			
	}

}
