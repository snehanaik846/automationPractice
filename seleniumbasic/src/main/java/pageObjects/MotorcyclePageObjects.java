package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class MotorcyclePageObjects extends TestBase {
	
	@FindBy(id="enterinsurantdata")
	WebElement enterinsurantdata;
	
	
	
	public MotorcyclePageObjects(){
		PageFactory.initElements(driver, this);
	}


}
