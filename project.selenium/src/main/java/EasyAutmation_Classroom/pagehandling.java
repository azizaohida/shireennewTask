package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagehandling {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
		// Browser open 
	WebDriver  driver = new ChromeDriver();
	// window maximize 
	
	driver.manage().window().maximize();
	
	//url open
	driver.get("https://www.facebook.com");
	
	Thread.sleep(5000);
	// locating email field . id dea email
	
	 WebElement  emailfield = driver.findElement(By.id("email"));
	
	
	emailfield.click();
	//click on emailfield
	// write eal@gamil
	
	emailfield.sendKeys("eal@gmail");
	
	
	Thread.sleep(2000);
     WebElement  password =  driver.findElement(By.name("pass"));
	//click on passwordfield
     
     password.click();
	//write password
	
	password.sendKeys("@abc123");
	//login button click
	 WebElement loginbutton = driver.findElement(By.name("login"));
	// click on login button 
       loginbutton.click();
	
     //back a jabo
       Thread.sleep(1000);
       
       driver.navigate().back();
      
       WebElement  emailfield1 = driver.findElement(By.id("email"));
       emailfield1.clear();
    
       WebElement  forgotpasswordbtn = driver.findElement(By.partialLinkText("Forgot"));
       forgotpasswordbtn.click();
       
	}

}
