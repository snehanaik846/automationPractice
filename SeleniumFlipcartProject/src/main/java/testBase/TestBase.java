package testBase;

import java.util.Iterator;
import java.util.Set;

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
		driver.get(" https://www.flipkart.com");
		homepage=new HomePageObjects();
		
	}
	
	public void switchWindow() {
		Set<String>s=driver.getWindowHandles();

        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

        String child_window=I1.next();
        driver.switchTo().window(child_window);
        System.out.println(driver.switchTo().window(child_window).getTitle());

        }
	
	}
	
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
