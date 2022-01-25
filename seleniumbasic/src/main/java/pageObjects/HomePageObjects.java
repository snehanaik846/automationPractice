package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {
	
	@FindBy(id="nav_automobile")
	WebElement nav_automobile;
	
	@FindBy(id="nav_truck")
	WebElement nav_truck;
	
	@FindBy(id="nav_motorcycle")
	WebElement nav_motorcycle;
	
	
	public void clickonnav_automobile() {
		nav_motorcycle.click();
	}
	//constructor page factory WE needs to initiated
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

}
