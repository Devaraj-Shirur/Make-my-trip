package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass{
	public String FromCity1 ="Mumbai";
	public String ToCity1 ="Hubli";
	public ChromeDriver driver;
	
	@BeforeClass
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void navigateToTheApplication() {
		driver.get("https://www.makemytrip.com/");
	}
	
	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
