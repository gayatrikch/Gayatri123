package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		String eTitle = "Gmail";
		String aTitle = driver.getTitle();
		
		if (eTitle.equalsIgnoreCase(aTitle)) {
			
			System.out.println("Pass");
			
		}
		else {
			
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
