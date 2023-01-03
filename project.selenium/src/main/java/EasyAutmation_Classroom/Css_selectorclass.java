package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selectorclass {
   static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

     System.setProperty("WebDriver.Chrome. driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");

		
		WebDriver  driver = new ChromeDriver();
		
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("abc1234");
		
	//	driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail");
		//driver.findElement(By.cssSelector("input._9npi")).sendKeys("abc1234");
		
		
		
		
		 driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("nahar@gmail");
			
		    
		
		    // WebElement    passwordfield = driver.findElement(By.xpath("//input[@aria-label ='Password' ]"));
				//passwordfield.click();
			     
			   //  passwordfield.sendKeys("nahar123er");
		     
			    // WebElement  forgotpassword = driver.findElement(By.xpath("Forgot password?"));
					//forgotpassword.click();
		     
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();   
		
	}

}
