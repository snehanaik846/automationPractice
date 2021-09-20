package Tests;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import resuableComponents.PropertiesOperations;
import testBase.DriverFactory;
import testBase.testBase;

public class LoginandAddToCart extends testBase{
	LoginPageObjects loginpage = new LoginPageObjects();
	HomePageObjects homepage = new HomePageObjects();
@Test(priority=0)
public void Logintest() throws Exception {
	loginpage.Login("snehanaik846@gmail.com", "test@123");
}

@Test(priority=1)
public void HomePageTest() throws Exception {
	homepage.clickOnMenu(PropertiesOperations.getPropertyValue("menu"));
	homepage.addtocart(PropertiesOperations.getPropertyValue("product"));
}
}
