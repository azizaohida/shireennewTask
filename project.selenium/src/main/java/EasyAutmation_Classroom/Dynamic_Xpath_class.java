package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_class {
	
static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
   System.setProperty("Webdriver. Chrome. driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
   driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
   Thread.sleep(3000);
    WebElement   emailfied =  driver.findElement(By.xpath("//label[text() = 'Email'] /following-sibling::input[@type ='text' ]"));
   
   emailfied.sendKeys("Easyautoamtionlab@gmail.com");
   Thread.sleep(2000);
   
    WebElement   lastname = driver.findElement(By.xpath("(//label[text() ='Email']/preceding-sibling::label[text() = 'Last Name'])[1]"));
   
   lastname.sendKeys("valo");
   
   
   
   
   
   
   
	}

}
