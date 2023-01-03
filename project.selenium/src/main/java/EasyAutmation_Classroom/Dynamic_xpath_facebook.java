package EasyAutmation_Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath_facebook {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\project.selenium\\Drivers\\chromedriver.exe");

	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
 WebElement   textelement = driver.findElement(By.cssSelector("._8eso"));
	String textfromfacebook = textelement.getText();
	System.out.println(textfromfacebook);
	Thread.sleep(3000);
	//string if/else use / get frs
	String  frstext = "Connect with friends";
if(textelement.equals(frstext)) {
	System.out.println("text is according to frs");
	
}
	
else {
	System.out.println("text is  not correct ");
}
	
	
	}

}
