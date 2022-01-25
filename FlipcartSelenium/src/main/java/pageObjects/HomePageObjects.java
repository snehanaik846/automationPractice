package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testBase.DriverFactory;
import testBase.testBase;

public class HomePageObjects extends testBase {
	
	public void clickOnMenu(String menu) {
		String menupath="//ul[@id='mtnav']/li//following-sibling::a/span[text()='"+menu+"']";
		moveToElement_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath(menupath)), "Fruits and veg");
		click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath(menupath)),"menu click");
	}
	public void addtocart(String productname) {
		String productclick="//ul[@class='products-grid itemgrid itemgrid-adaptive products-itemgrid-5col show-grid first last odd']/li//following-sibling::h3/a[text()='"+productname+"']";
		String addtocartbutton="//form[@id='product_addtocart_form']//div[@class='add-to-box']//button[@title='Add to Cart']";
		String directaddcartbutton="//ul[@class='products-grid itemgrid itemgrid-adaptive products-itemgrid-5col show-grid first last odd']//li//following-sibling::h3/a[text()='"+productname+"']/..//following-sibling::div[@class='actions']//div[2]//p//button";
		//click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath(productclick)), "productclick");
		//click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath(addtocartbutton)), "added to cart");
		click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath(directaddcartbutton)), "directaddcartbuttonclick");



	}
	

}
