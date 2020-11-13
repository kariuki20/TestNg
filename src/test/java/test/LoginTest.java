package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
WebDriver driver;
	
	
	@Test
	public void validUserShouldNotBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		//LoginPage login = new LoginPage(driver);
				
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
}
}