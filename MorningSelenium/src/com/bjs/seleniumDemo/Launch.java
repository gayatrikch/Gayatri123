package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenuimcomponent\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenuimcomponent\\geckodriver.exe");		
		ChromeDriver driver= new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
		String curl = driver.getCurrentUrl();
		
		System.out.println("Current url is : " + curl);
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
