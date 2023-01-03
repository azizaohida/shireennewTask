package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_abstateclass {
	static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("WebDriver.Chrome. driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");

			
			WebDriver  driver = new ChromeDriver();
			
			  driver.manage().window().maximize();
			  Thread.sleep(4000);
			driver.get("https://www.facebook.com");
			Thread.sleep(4000);

			WebElement  maleradiobatton = driver.findElement(By.xpath("(html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
			maleradiobatton.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
