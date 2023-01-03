package com.train.org.project.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {

	static WebDriver driver;// driver reference variable//webdriver interface type global variable// non static interface global variable
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
	// chrome driver open	
	WebDriver driver = new ChromeDriver();
	// browser maximize 
	driver.manage().window().maximize();
	
	// go to  url and open
	driver.get("https://www.facebook.com/");
	// wait for 6 second
	
	
	Thread.sleep(6000);
	
	// refresh 
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	
	// back korte hobe 
  driver.navigate().back();
	
  Thread.sleep(2000);
  
  // forward korte hole 
   driver.navigate().forward();
  
  //parent window session id 
      String sessionid = driver.getWindowHandle();
   System.out.println(sessionid);
	//url 
	  String urlofcurrentpage = driver.getCurrentUrl();
   System.out.println(urlofcurrentpage);
   
   // getting Tittle print
   
   String pageTittle = driver.getTitle();
   System.out.println(pageTittle);
   
   
   
   
   
	}






}
