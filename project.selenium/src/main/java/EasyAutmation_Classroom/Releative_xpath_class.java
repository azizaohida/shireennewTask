package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Releative_xpath_class {
	static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("WebDriver.Chrome. driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");

			
			WebDriver  driver = new ChromeDriver();
			
			  driver.manage().window().maximize();
			  Thread.sleep(3000);
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
	
			WebElement    emailfield = driver.findElement(By.xpath("//input[@id = 'email']"));
			emailfield.click();
		     
		     emailfield.sendKeys("nahar@gmail");
		     Thread.sleep(2000);
		   //  WebElement    passwordfield = driver.findElement(By.xpath("//input[@aria-label ='Password' ]"));
				//passwordfield.click();
			     
			    // passwordfield.sendKeys("nahar123er");
		     
		     WebElement  forgotpassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
				forgotpassword.click();
			     
	
	
	
	
	
	}

}
