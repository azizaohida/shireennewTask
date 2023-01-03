package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Css_selector_Automatically {
    static WebDriver   driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
		
		  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	  Thread.sleep(3000);	
		 String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(2000);
		WebElement    emailfield = driver.findElement(By.cssSelector("#email"));
	emailfield.click();
	Thread.sleep(2000);
	emailfield.sendKeys("sdaer1@gmail.com");

	
	
	
	
	}


	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



















