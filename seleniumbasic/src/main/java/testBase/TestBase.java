package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;

public class TestBase extends ObjectRepo{
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowserNavigate() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		homepage=new HomePageObjects();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
