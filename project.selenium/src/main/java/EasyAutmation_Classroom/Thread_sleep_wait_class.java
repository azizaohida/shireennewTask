package EasyAutmation_Classroom;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Thread_sleep_wait_class {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    Ibrowser("chrome");
    driver.get("https://www.amazon.com/");	
    
   // driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    
     WebDriverWait  oi =  new WebDriverWait(driver, Duration.ofSeconds(30)) ;   
    
 oi.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Very Merry Deals")));
      
	
    WebElement  Verymerrydeals = driver.findElement(By.linkText("Very Merry Deals"));
    Actions   ob = new Actions(driver);
    ob.keyDown(Keys.SHIFT).build().perform();
    Verymerrydeals.click();
    ob.keyDown(Keys.SHIFT).build().perform();
   
    ob.keyUp(Keys.ALT).build().perform();
    
    Verymerrydeals.click();

    ob.keyDown(Keys.ALT).build().perform();
    
	
	
	//Thread.sleep(3000);
	
	Set<String>  windowsSID = driver.getWindowHandles();
	
	java.util.Iterator<String> it1 = windowsSID.iterator();
	String SID1 = it1.next();
	String  SID2   =  it1.next();
	
  System.out.println(SID1);
	System.out.println(SID2);
	//switch to child window
	Thread.sleep(5000);
	driver.switchTo().window(SID2);
	
	
	WebElement  coupons = driver.findElement(By.linkText("Coupons"));
	 
	coupons.click();
	
	
	
	
	}

	
		
	
	public  static void   Ibrowser(String NameofBrowser) throws InterruptedException {
		
		
	if(NameofBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\Selenium_projectTask6\\Driver\\chromedriver.exe");
	
		driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		
	}
		
	else if(NameofBrowser.equalsIgnoreCase("Edge")) {
		
		System.setProperty("WebDriver.Edge. driver", "C:\\My automation Task\\My workspace 1\\Selenium_projectTask6\\Driver\\msedgedriver.exe");
	
		driver  =  new   EdgeDriver();
		
		driver.manage().window().maximize();  
		
		
		
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
