 package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://www.amazon.in/");
		 
		 //1. Identify Element
		 
		 WebElement acc= driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		 
		 WebElement youracc = driver.findElement(By.xpath("//span[text()='Your Account']"));
		 
		 //2. Creatre an objetc
		 
		 Actions a = new Actions(driver);
		 
		 //3. by using ref call moveTOElement()
		 //4. build() & perform() for compilation and execution
		 
		/* a.moveToElement(acc).build().perform();
		 a.moveToElement(youracc).build().perform();*/
	
		//to minimize above 2 lines
			a.moveToElement(acc).moveToElement(youracc).click().build().perform();
		 
		 }
	
	

}
