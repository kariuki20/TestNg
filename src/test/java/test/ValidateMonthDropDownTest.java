package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidateMonthDropDown;
import util.BrowserFactory;

public class ValidateMonthDropDownTest {

	WebDriver driver;
	
	@Test
	public void ValidateMonthDropDownHasJanFebMarch () throws InterruptedException,IOException {
		driver=BrowserFactory.init();
		
		ValidateMonthDropDown monthdropdown = PageFactory.initElements(driver, ValidateMonthDropDown.class);
		monthdropdown.clickOnDueMonth();
		monthdropdown.selectFirstMonth("Jan");
		monthdropdown.selectSecondMonth("Feb");
		monthdropdown.selectThirdMonth("march");
		
	TakesScreenshot ts=(TakesScreenshot)(driver);
		File SouceFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SouceFile, new File("C:\\Users\\Jenifer\\Desktop\\Datadriven"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		BrowserFactory.tearDown();
	
	}
	public void takeScreenShotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts=((TakesScreenshot) driver);
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile,new File("user"+System.currentTimeMillis()+".png"));
	}
	
}
