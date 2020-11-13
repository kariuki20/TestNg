package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.ToggleKeyValidation;
import util.BrowserFactory;

public class TogglekeyValidatonTest {
		WebDriver driver;
		
		@Test
		public void UserShouldBeAbleToClickOnToggleAll()throws InterruptedException,IOException{
			driver=BrowserFactory.init();
			LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(10000);
			ToggleKeyValidation toggleKey=PageFactory.initElements(driver, ToggleKeyValidation.class);
				toggleKey.clickOnToggleAll();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				BrowserFactory.tearDown();
		}
		
}
