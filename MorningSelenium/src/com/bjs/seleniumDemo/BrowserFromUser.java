package com.bjs.seleniumDemo;

import java.util.Scanner;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class BrowserFromUser {

	public static void main(String[] args) {


		System.out.println("Entwr the browser");
		Scanner scan = new Scanner(System.in);
		
		String browser = scan.next();
		
		if (browser.equalsIgnoreCase("Firefox")) {
			FirefoxDriver f = new FirefoxDriver();
			test (f);			
		}
		else if (browser.equalsIgnoreCase("Chrome")) {
			
			ChromeDriver c = new ChromeDriver();
			test (c);			
		}
		else {
			System.out.println("Please enter valid browser");
		}
	}
	public static void test(FirefoxDriver driver) {
		driver.get("https://www.gmail.com/");
		String ftitle = driver.getTitle();
		System.out.println(ftitle);
		
		String furl = driver.getCurrentUrl();
		System.out.println(furl);
		driver.close();
	}
	public static void test(ChromeDriver driver) {
		driver.get("https://www.gmail.com/");
		String ctitle = driver.getTitle();
		System.out.println(ctitle);
		
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		driver.close();
		
	}
	
	
}
