package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.gmail.com");
		
			String eURL = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
			String aURL = driver.getCurrentUrl();
			
			if (eURL.equalsIgnoreCase(aURL)) {
				
				System.out.println("Pass");
				
			}
			else {
				System.out.println("Fail");
			}

	}

}
