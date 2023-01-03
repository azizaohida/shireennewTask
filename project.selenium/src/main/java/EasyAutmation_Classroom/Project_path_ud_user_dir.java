package EasyAutmation_Classroom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Project_path_ud_user_dir{

	static  WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		String ud = System.getProperty("user.dir");
		System.out.println(ud);
		
	
		
		System.setProperty("WebDriver.Chrome. driver", ud + "\\Drivers\\chromedriver.exe");

			
			WebDriver  driver = new ChromeDriver();
			
			  driver.manage().window().maximize();
			  
			driver.get("https://www.facebook.com");
			Thread.sleep(3000);
	}	
		
		
		
	
	  public static void Ibrowser(String nameofbrowser,String url) throws InterruptedException {
		  String ud = System.getProperty("user.dir");
			
		  if(nameofbrowser.equalsIgnoreCase("Edge")) {
				System.setProperty("WebDriver.Edge.driver", ud +"\\Driver\\msedgedriver.exe");
				   driver = new EdgeDriver();
	           
			     driver.get(url);
				
				driver.manage().window().maximize();
				
			    	}
			else if(nameofbrowser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("WebDriver.Chrome.driver", ud + "\\Drivers\\msedgedriver.exe");
				   driver = new ChromeDriver();
	        
				
				driver.manage().window().maximize();
			
				driver.get(url);}	
		}
		
	   public static  void Screeshots() throws IOException {
		  String ud = System.getProperty("user.dir");	
		  
		     java.util.Date  objects = new java.util.Date();
			System.out.println(objects);
			String    Date = objects.toString().replace(" ", "_").replace(":", "_");
			System.out.println(Date);
			
			
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
					
			FileHandler.copy(screenshotFile, new File(ud +"\\Screenshot\\Amazon\\"+Date +"Myss.jpg"));
				
			  }
		
		
	  

	  }
	
	
	
	
	
	
	
	  
	
	
	
	  
	


