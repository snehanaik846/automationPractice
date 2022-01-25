package insuranceMotorcycle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.TestBase;

public class EndToEndTest_Motorcycle extends TestBase{
	
	@Test
	public void insuranceCalculate() throws InterruptedException {
		System.out.println(driver.getTitle());
		homepage.clickonnav_automobile();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void EnterInsurantDataFields() {
		System.out.println("EnterInsurantDataFields "+driver.getTitle());

	}
	

}
