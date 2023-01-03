package EasyAutmation_Classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_window_handle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome", "https://www.amazon.com/");
	    Thread.sleep(4000);
		

	}

	
	
	

	  public static void Ibrowser(String nameofbrowser,String url) throws InterruptedException {
			
			if(nameofbrowser.equalsIgnoreCase("Edge")) {
				System.setProperty("WebDriver.Edge.driver", "C:\\My automation Task\\My workspace 1\\Selenium_projectTask6\\Driver\\msedgedriver.exe");
				   driver = new EdgeDriver();
	           
			     driver.get(url);
				
				driver.manage().window().maximize();
				
			    	}
			else if(nameofbrowser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\msedgedriver.exe");
				   driver = new ChromeDriver();
	        
				
				driver.manage().window().maximize();
			
				driver.get(url);
	
	
			}
	
	
	
	
	
	
	
	
	
	
	  }
	
	
	
				
	
	
}
