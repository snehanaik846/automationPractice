package pageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class EnterInsurantDataPageObjects  extends TestBase{
	@FindBy(xpath="//input[@name='Gender']/parent::label")
	List<WebElement> gender;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	public void enterFirstandLastName() {
		firstname.sendKeys("sneha");
		lastname.sendKeys("Naik");
	}
	
	public EnterInsurantDataPageObjects(){
		PageFactory.initElements(driver, this);
	}

}
