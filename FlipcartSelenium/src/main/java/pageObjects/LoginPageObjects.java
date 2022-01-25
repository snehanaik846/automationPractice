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
	By searchbutton=By.xpath("//button[@class='L0Z3Pu']");
	By crossbutton=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	By searchfield=By.xpath("//input[@title='Search for products, brands and more']");
	
	public void Login(String searchword) throws Exception {
		//click_custom(DriverFactory.getInstance().getDriver().findElement(Loginlink), "Loginlink");
		//sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(EMAIL), "loginemailfield", email);
		//Thread.sleep(2000);
		//sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "Loginpasswordfield", password);
		click_custom(DriverFactory.getInstance().getDriver().findElement(crossbutton), "crossbutton");
		Thread.sleep(3000);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(searchfield), "searchfield", searchword);
		click_custom(DriverFactory.getInstance().getDriver().findElement(searchbutton), "searchbutton");
		DriverFactory.getInstance().getDriver().close();



	
	}

}
