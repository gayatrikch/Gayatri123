package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		Thread.sleep(5000);
		
		driver.close();
		
	}		

	}