package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shadi.com/");
		
		//identify web element
		WebElement dropdown = driver.findElement(By.id("ddlEducation"));
		
		//2. Create object Select class
		//3. and pass the dropdown reference
		Select s = new Select(dropdown);
		
		
		//4. make use of any of the methods
		//index
		s.selectByIndex(2);
		Thread.sleep(5000);
		
		//Value
		s.selectByValue("3");
		Thread.sleep(5000);
		
		//Visible Text
		s.selectByVisibleText("High School");
		Thread.sleep(5000);
	}

}
