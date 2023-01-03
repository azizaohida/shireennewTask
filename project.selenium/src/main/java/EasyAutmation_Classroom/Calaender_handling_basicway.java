package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calaender_handling_basicway {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");

		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.expedia.com");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button#d1-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label= 'Dec 20, 2022']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label= 'Jan 20, 2023']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-stid= 'apply-date-picker']")).click();
		Thread.sleep(2000);
		
		
	}

}
