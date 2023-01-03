package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handle {
static  WebDriver drivers;
	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().window().maximize();	
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
	     WebElement  newaccount =  driver.findElement(By.linkText("Create new account"));
		
	     newaccount.click();
	     Thread.sleep(3000);
	    ;
	     
	     Thread.sleep(3000);
	     
	     WebElement allmonths = driver.findElement(By.id("month"));
		
		Select  sob = new Select(allmonths);
		sob.selectByIndex(4);
		Thread.sleep(3000);
		
		WebElement   alldays =driver.findElement(By.id("day"));
		
		Select   sob1 = new Select(alldays);
		
		sob1.selectByValue("20");
		Thread.sleep(3000);
		WebElement allyears = driver.findElement(By.id("year"));
		Select  sob2 = new Select(allyears);
		sob2.selectByVisibleText("2019");
		
		WebElement  maleradiobatton = driver.findElement(By.xpath("(html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
		maleradiobatton.click();
		Thread.sleep(3000);
		WebElement   signup = driver.findElement(By.xpath("//button[text() ='Sign Up' and @type ='submit' and  @name = 'websubmit' ]"));
	  
		signup.click();
		WebElement  forgotpassword = driver.findElement(By.xpath("Forgot password?"));
		forgotpassword.click();
		
		
		
	}

}
