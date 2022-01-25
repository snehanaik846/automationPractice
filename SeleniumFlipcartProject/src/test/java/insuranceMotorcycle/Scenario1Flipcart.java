package insuranceMotorcycle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.TestBase;

public class Scenario1Flipcart extends TestBase{
	
	@Test
	public void userSearch() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		homepage.closeloginpopup();
		homepage.searchfoproducts("vu tv");
		
	}
	
	@Test
	public void EnterInsurantDataFields() {
		System.out.println("EnterInsurantDataFields "+driver.getTitle());

	}
	

}
