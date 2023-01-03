package EasyAutmation_Classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Besic {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
		
		driver = new  ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(6000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		driver.navigate().forward();
		
	//Thread sleep 6 second
	
	Thread.sleep(3000);
	
	String sessionid = driver.getWindowHandle();
	
	System.out.println(sessionid);
	   String url = driver.getCurrentUrl();
	System.out.println(url);

	String  pagetitle = driver.getTitle();
	System.out.println(pagetitle);
	
	
	}

}
