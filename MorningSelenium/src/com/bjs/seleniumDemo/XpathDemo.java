package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium/html%20codes/TextBoxDemo.html");
		WebElement un = driver.findElement(By.xpath("/html/body/input[1]"));
		un.sendKeys("gayatri");
		
		WebElement ps = driver.findElement(By.xpath("/html/body/input[2]"));
		ps.sendKeys("kumar");
		
	}

}
