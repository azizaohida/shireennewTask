package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Dragable {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("WebDrive.Chrome. driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");	
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		Thread.sleep(2000);
	
		driver.switchTo().frame(0);
		
		 WebElement  dragstarts = driver.findElement(By.id("draggable"));
		
		   WebElement   dropit = driver.findElement(By.id("droppable"));
		 
		 Actions   act  = new Actions(driver);
		act.dragAndDrop(dragstarts, dropit).build().perform();
		driver.switchTo().parentFrame();
		
		WebElement  resizable = driver.findElement(By.linkText("Resizable"));
		resizable.click();
		
	}

}
