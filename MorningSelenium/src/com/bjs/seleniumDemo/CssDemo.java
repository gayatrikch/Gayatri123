package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("http://www.facebook.com/");
		
//WebElement email = driver.findElement(By.cssSelector("input#email"));               // tagname#id method
		 
//WebElement email = driver.findElement(By.cssSelector("input.inputtext_55rl_6luy"));  // tagname.class method
//WebElement email = driver.findElement(By.cssSelector("input[id='email']"));   // tagname[attribute name ='attribute value']
//WebElement email = driver.findElement(By.cssSelector("input.inputtext_55rl_6luy[id='email]"));
	//	 WebElement email = driver.findElement(By.cssSelector("input[id^='em']"));  //Substrings-starts with
	//	 WebElement email = driver.findElement(By.cssSelector("input[id$='il']"));  //Substrings-ends with
		 WebElement email = driver.findElement(By.cssSelector("input[id*='ai']"));  //Substrings- contains
		 
		 
		 email.sendKeys("facebook");
	}

}
