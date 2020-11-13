package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveItem extends  BasePage {
WebDriver driver;
public RemoveItem(WebDriver driver) {
	this.driver=driver;
}
//Element Library
@FindBy(how=How.NAME,using="todo[1]")WebElement ITEM_FIED_LOCATOR;
@FindBy(how=How.XPATH,using="//input[@type=\"submit\"and@value=\"Remove\"]")WebElement REMOVE_FIELD_LOCATOR;

//Interactive Methods
public void clickOnItem() {
	ITEM_FIED_LOCATOR.click();
}
public void clickOnRemove() {
	REMOVE_FIELD_LOCATOR.click();
}
}