package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement crossbutton;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchfield;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement searchicon;
	
	@FindBy(xpath="//a[@class='_1fQZEK']")
	WebElement firstproduct;
	
	@FindBy(xpath="//div[@id='container']//div[@class='_30jeq3 _16Jk6d']")
	WebElement price;
	
	@FindBy(xpath="//label[@class='_6Up2sF']")
	WebElement sharebutton;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement AddToCartButton;
	
	@FindBy(linkText="Cart")
	WebElement cartbutton;

//	@FindBy(xpath="//label[@class='_6Up2sF']")
//	WebElement sharebutton;
	
	
	
	
	public void closeloginpopup() {
		crossbutton.click();
	}
	
	public void searchfoproducts(String searchvalue) throws InterruptedException {
		searchfield.sendKeys(searchvalue);
		searchicon.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(3000);
		switchWindow();
		System.out.println(price.getText());
		AddToCartButton.click();
		cartbutton.click();
		
	}
	
	
	//constructor page factory WE needs to initiated
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

}
