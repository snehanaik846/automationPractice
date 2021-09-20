package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	// create webdriver object for given browser
	public WebDriver createBrowserInstance(String browser) {
		WebDriver driver=null;
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--incognito");
			driver= new ChromeDriver(co);
		}
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
			
		}
		return driver;
	}
}
