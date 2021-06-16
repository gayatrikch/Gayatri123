package com.bjs.opensource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpensourceloginDemo {

	public static void main(String[] args) throws IOException {


		FileInputStream fis = new FileInputStream("D:\\Selenium\\eclipse-workspace\\KeywordDrivenFramework\\src\\com\\bjs\\utilities\\Keyworddriver.properties");
		Properties p = new Properties();
		
		p.load(fis);
		
		String loginkey = p.getProperty("login");
		String usernamekey = p.getProperty("username");
		String passwordkey = p.getProperty("password");
		String submitkey = p.getProperty("submit");
		String signoutkey = p.getProperty("signout");
		
		System.out.println(loginkey);
		System.out.println(usernamekey);
		System.out.println(passwordkey);
		System.out.println(submitkey);
		System.out.println(signoutkey);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText(loginkey)).click();
		driver.findElement(By.id(usernamekey)).sendKeys("ihassan395@gmail.com");
		driver.findElement(By.id(passwordkey)).sendKeys("Admin@123");
		driver.findElement(By.id(submitkey)).click();
		
		//driver.findElement(By.xpath(commentkey)).click();
		driver.findElement(By.linkText(signoutkey));
		System.out.println("1st change");
		//driver.close();
		
		
	}

}
