package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_control {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");

		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
       Thread.sleep(3000);
//copy  korte ctrl+ a dele copy hobe
Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	Thread.sleep(3000);
	//cut korte ControlX
	
	act.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
	Thread.sleep(3000);	
	
	act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	
	//selection chere dete keyup korte hobe
	
	act.keyUp(Keys.CONTROL).build().perform();
	
	
	
	
	}

}
