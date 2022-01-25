package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import resuableComponents.ActionsEngine;
import resuableComponents.PropertiesOperations;

public class testBase extends ActionsEngine{
	@BeforeTest
	public void launchBrowser() throws Exception {
		String url=PropertiesOperations.getPropertyValue("url");
		String browser=PropertiesOperations.getPropertyValue("browser");
		DriverFactory.getInstance().setDriver(new BrowserFactory().createBrowserInstance(browser));
		WebDriver driver=DriverFactory.getInstance().getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		}

	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}
}
