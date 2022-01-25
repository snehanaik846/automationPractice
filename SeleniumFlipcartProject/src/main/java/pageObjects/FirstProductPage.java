package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class FirstProductPage extends TestBase {
	
	
	public FirstProductPage(){
		PageFactory.initElements(driver, this);
	}


}
