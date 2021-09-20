package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.DriverFactory;
import testBase.testBase;

public class LoginPageObjects extends testBase{
	
	By EMAIL=By.id("email");
	By PASSWORD=By.name("login[password]");
	By Loginlink=By.xpath("//a[@title='Log In']");
	By LoginButton=By.xpath("//button[@title='Login']");
	
	public void Login(String email,String password) throws Exception {
		click_custom(DriverFactory.getInstance().getDriver().findElement(Loginlink), "Loginlink");
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(EMAIL), "loginemailfield", email);
		Thread.sleep(2000);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "Loginpasswordfield", password);
		click_custom(DriverFactory.getInstance().getDriver().findElement(LoginButton), "LoginButton");

	
	}

}
