package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingDemo {

	public static void main(String[] args) {  //Non- data driven approach
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("http://automationpractice.com//");
		 driver.findElement(By.linkText("Sign in")).click();
		 driver.findElement(By.id("email")).sendKeys("ihassan395@gmail.com");
		 driver.findElement(By.id("passwd")).sendKeys("Admin@123");
		 driver.findElement(By.id("SubmitLogin")).click();;
		 driver.findElement(By.linkText("Sign out")).click();
	}

}
