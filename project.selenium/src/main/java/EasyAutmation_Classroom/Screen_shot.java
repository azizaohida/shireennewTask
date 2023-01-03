package EasyAutmation_Classroom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot  {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		Ibrowser("chrome", "https://www.amazon.com/");
	    Thread.sleep(4000);
	
	    
	    Screeshots();
		Thread.sleep(4000);
		 Screeshots();

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
	
	
	  public static  void Screeshots() throws IOException {
	
  Date objects = new Date();
	System.out.println(objects);
	String    Date = objects.toString().replace(" ", "_").replace(":", "_");
	System.out.println(Date);
	
	
	
	
	
	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
			
	FileHandler.copy(screenshotFile, new File("C:\\My automation Task\\My workspace 1\\project.selenium\\Pictures\\amazon\\"+Date +"Myss.jpg"));
	
	       
	  }  
	
	
}
	
	
	
	
	

