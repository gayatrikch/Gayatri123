package com.bjs.seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		driver.close();
	}

}
