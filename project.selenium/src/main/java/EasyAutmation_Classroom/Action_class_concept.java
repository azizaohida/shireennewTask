package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_class_concept {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("WebDriver. Chrome. driver", "C:\\My automation Task\\My workspace 1\\Selaenium_project1\\Driver\\chromedriver.exe");
			
			
			driver = new  ChromeDriver();
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			driver.get("https://www.amazon.com/");	
			Thread.sleep(3000);
			//driver.navigate().back();
			//hoverover accountlist 
			
			 WebElement   accountandlists = driver.findElement(By.xpath("//span[text() = 'Account & Lists']"));
			
			Actions   act = new Actions(driver);
			act.moveToElement(accountandlists).build().perform();
			Thread.sleep(1000);
			// hoverover musiclibrary
			WebElement   musiclibrary  = driver.findElement(By.xpath("//*[text() = 'Music Library']"));
		
			
			act.moveToElement(musiclibrary).click().build().perform();
		
		//current url //verfy https://music.amazon.com/?ref=nav_youraccount_cldplyr

		String    currenturl1 = driver.getCurrentUrl();
		System.out.println(currenturl1);
		if(currenturl1.equals("https://music.amazon.com/?ref=nav_youraccount_cldplyr")) {
		System.out.println("currenturl is currect -music.amazon.com/?ref=nav_youraccount_cldplyr");
	}
		else {
			
			System.out.println("currenturl is not currect");
		}
		  driver.navigate().back();
		  Thread.sleep(2000);
	  // hover over on misicbutton
		  
		  
		  WebElement musicbutton = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(11)"));
	   
	     act.moveToElement(musicbutton).click().build().perform();
	  // current url https://www.amazon.com/music/unlimited?ref_=nav_cs_music

	            String  currenturl = driver.getCurrentUrl();
	             System.out.println(currenturl);
	        if(currenturl.equals("https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books")){
	       System.out.println("currenturl is correct accrding to frs");
	        	 }

	        else {
	        	System.out.println("currenturl is not current ");
	        }
	        Thread.sleep(2000);
	        driver.navigate().back();
	      Thread.sleep(1000);
// write phones
	      
	      WebElement searchbutton =driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox' ]"));
	searchbutton.click();     
     searchbutton.sendKeys("phones");
	      
     Thread.sleep(1000);
	 //https://www.amazon.com/
    String    currenturl2  = driver.getCurrentUrl();
     System.out.println(currenturl2);
     
     if(currenturl2.equals("https://www.amazon.com/")) {
    	 System.out.println("currenturl is currect --https://www.amazon.com/");
    	   }
     else {
    	 System.out.println("current is not currect");
     }
     Thread.sleep(1000);
     driver.navigate().back();
     driver.navigate().forward();
     // all search button
      WebElement     allsearchbtn = driver.findElement(By.cssSelector("#\\#searchDropdownBox"));
     
     allsearchbtn.click();
     
     
     
     
     
     
     
     
     
     
     
     
     
	      
	      
	}
		
		
		
		
		
		
		
		
		
		
		
	}


