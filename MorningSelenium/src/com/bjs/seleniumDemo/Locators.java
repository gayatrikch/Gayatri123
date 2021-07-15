package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("http://www.gmail.com/");
				
		WebElement email = driver.findElement(By.className("whsOnd zHQkBf"));
		email.sendKeys("gayatrikch@gmail.com");
		
		
		/*WebElement email = driver.findElement(By.name("identifier"));    //Name locator
		//email.sendKeys("gayatrikch@gmail.com");
		
		WebElement email = driver.findElement(By.id("email"));  //ID locator
		email.sendKeys("gayatrikch@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12345");*/
		
		

	}

}
