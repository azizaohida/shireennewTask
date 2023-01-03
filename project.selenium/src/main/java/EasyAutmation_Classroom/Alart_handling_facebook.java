package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart_handling_facebook {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");

		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
     
		//cliclme1
		driver.findElement(By.id("alertBox")).click();
        Thread.sleep(3000);
	driver.switchTo().alert().accept();
       //clickme2
       
    driver.findElement(By.cssSelector("#confirmBox")).click();
    Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("#promptBox")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("I am a strong people");

		driver.switchTo().alert().accept();
		

	
	}

}
