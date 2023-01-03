package com.train.org.project.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_class {

	static WebDriver  driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("WebDriver, Chrome. driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
	
	
	 driver = new ChromeDriver();
	 Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	
	
	
	driver.get("https://www.amazon.com");
	Thread.sleep(6000);
	driver.navigate().refresh();
	


	
	}

}
