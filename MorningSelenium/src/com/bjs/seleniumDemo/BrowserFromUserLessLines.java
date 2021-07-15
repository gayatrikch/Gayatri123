package com.bjs.seleniumDemo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFromUserLessLines {

	public static void main(String[] args) {
//WebDriver driver=new FirefoxDriver();

		System.out.println("Enter the browser");
		Scanner scan = new Scanner(System.in);		
		String browser = scan.next();
		
		if (browser.equalsIgnoreCase("Firefox")) {
			WebDriver f=new FirefoxDriver();
			test (f);			
		}
		else if (browser.equalsIgnoreCase("Chrome")) {
			WebDriver c =new ChromeDriver();
			
			test (c);			
		}
		else {
			System.out.println("Please enter valid browser");
		}
	}
	public static void test(WebDriver driver) {
		driver.get("https://www.gmail.com/");
		String ftitle = driver.getTitle();
		System.out.println(ftitle);
		
		String furl = driver.getCurrentUrl();
		System.out.println(furl);
		driver.close();
	}
	
	
	
}
