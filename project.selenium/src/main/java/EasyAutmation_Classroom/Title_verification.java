package EasyAutmation_Classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_verification {

	static WebDriver drivers;
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(6000);
		
		//Url frs "https:www.google.com" match korte hobe
		
		
		
		String   url = driver.getCurrentUrl();
		
		
		if (url.equals("https://www.google.com/")) {
		System.out.println("url is correct according to frs");
		}
		else {
			System.out.println("url is not correct");
		}
		
		
		
		}

}
