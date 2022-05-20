package basedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class BaseLibrary 
{
	public static WebDriver driver=null;
	public void getlaunch(String url) throws InterruptedException 
	{
//		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Adil\\eclipse-workspace\\MoveToFramework\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}


{
	
}

//	   @AfterTest
//   public void Teardown()
//   {
//		   driver.quit();
//	   }
//
}