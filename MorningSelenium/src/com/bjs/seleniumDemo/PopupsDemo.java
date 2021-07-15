package com.bjs.seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupsDemo {

	public static void main(String[] args) throws InterruptedException {


	//	WebDriver driver = new ChromeDriver();  //do it on firefox
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		 driver.get("http://www.echoecho.com/javascript4.htm");
		 
		 //1. Alert box
		 WebElement alert = driver.findElement(By.name("B1"));
		 alert.click();
		 
		 Alert a = driver.switchTo().alert();
		 Thread.sleep(2000);
		 a.accept();
	
	    //2. confirm box
		 
		WebElement confirm = driver.findElement(By.name("B2"));
		 confirm.click();
		 
		 Alert c = driver.switchTo().alert();
		 Thread.sleep(2000);
		 c.dismiss();      
		 
     	//3. prompt box
		 
		WebElement prompt = driver.findElement(By.name("B3"));
	   prompt.click();
	   
        Alert p =  driver.switchTo().alert();
        p.sendKeys("Kumar");
        String text = p.getText();
        System.out.println(text);
        Thread.sleep(2000);
        p.accept();
	}

}
