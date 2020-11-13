package test;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.RemoveItem;
import util.BrowserFactory;

public class RemoveItemTest {
WebDriver driver;
@Test
	public void UserShouldBeAbleToRemoveAnItemOnTheList() throws InterruptedException ,IOException{
	 
	driver=BrowserFactory.init();
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(10000);
	
	RemoveItem removeItem=PageFactory.initElements(driver,RemoveItem.class);
	removeItem.clickOnItem();
	removeItem.clickOnRemove();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	BrowserFactory.tearDown();
}
}

