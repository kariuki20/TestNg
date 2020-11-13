package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateMonthDropDown extends BasePage {
WebDriver driver;


public ValidateMonthDropDown(WebDriver driver){
	this.driver=driver;
}
	
	//Element Library
	@FindBy(how=How.XPATH,using="//select[@name='due_month']") WebElement DUE_MONTH_FIELD_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[3]/option[2]")WebElement JAN_MONTH_LOCATOR;
	@FindBy(how=How.XPATH,using ="//*[@id=\"extra\"]/select[3]/option[3]")WebElement FEB_MONTH_LOCAOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"extra\"]/select[3]/option[4]")WebElement MARCH_MONTH_LOCATOR;
	
	//Interactive Methods
	public void clickOnDueMonth() {
		waitForElement(driver,20,DUE_MONTH_FIELD_LOCATOR);
		DUE_MONTH_FIELD_LOCATOR.click();
	}
	public void selectFirstMonth(String month) {
		selectDropDown(JAN_MONTH_LOCATOR,month);
	}
	public void selectSecondMonth(String month2) {
		selectDropDown(FEB_MONTH_LOCAOR,month2);
	}
	public void selectThirdMonth(String month3) {
		selectDropDown(MARCH_MONTH_LOCATOR,month3);
	
}
}
