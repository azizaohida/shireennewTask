package EasyAutmation_Classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser_setup {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		Ibrowsers("Edge","https://www.amazon.com/");
		Thread.sleep(4000);
	
	}
		public static void Ibrowsers(String NameofBrowser,String url) throws InterruptedException {
		
		if(NameofBrowser.equalsIgnoreCase("Chrome")) {
		
System.setProperty("WebDriver. Chrome. driver", "C:\\My automation Task\\My workspace 1\\Selaenium_project1\\Driver\\chromedriver.exe");
			
			driver = new  ChromeDriver();
			driver.get(url);	
			Thread.sleep(2000);
			driver.manage().window().maximize();
			}
		 else if(NameofBrowser.equalsIgnoreCase("Edge")) {
			 System.setProperty("WebDriver. Edge. driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\msedgedriver.exe");
				driver = new  EdgeDriver();
				driver.get(url);	
				Thread.sleep(2000);
				driver.manage().window().maximize();
		
		 }
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
	
	
	
	
	
	
	


