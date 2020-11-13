package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.RemoveAll;
import util.BrowserFactory;

public class RemoveAllTest {
WebDriver driver;

@Test
public void UserShouldBeAbleToRemoveAllItemsOTheList()throws InterruptedException,IOException{
	driver=BrowserFactory.init();
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(10000);
	RemoveAll removeAll=PageFactory.initElements(driver,RemoveAll.class);
	removeAll.clickOnToggleall();
	removeAll.clickOnRemove();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	BrowserFactory.tearDown();
	
}

}
