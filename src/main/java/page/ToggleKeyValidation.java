package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.Locator;

public class ToggleKeyValidation extends BasePage {
WebDriver driver;
public ToggleKeyValidation(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how=How.NAME,using="allbox")WebElement LOCATOR;
public void clickOnToggleAll() {
	LOCATOR.click();
}
}
