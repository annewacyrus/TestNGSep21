package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddACategoryPage {
WebDriver driver;

public AddACategoryPage(WebDriver driver) {
	
	this.driver=driver;
	
	}

	@FindBy(how=How.NAME,using = "categorydata")
	WebElement elem;
	@FindBy(how=How.XPATH,using = "//input[@value='Add category']")
	WebElement elem1;
	@FindBy(how=How.XPATH,using = "//body//span[1]") WebElement elem2;
	@FindBy(how=How.XPATH, using = "//select[@name='due_month']//option") List<WebElement> monthDropDown;
	@FindBy(how=How.XPATH, using = "//a[@title='Remove this category']") WebElement categoryName;
	@FindBy(how=How.XPATH, using = "//a[text()='Yes']") WebElement yes;
	
	
	public void removeCategory() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(categoryName.isDisplayed()) {
			categoryName.click();
			yes.click();
		}
	}
	
	public void newCategory(String catName) {
		removeCategory();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elem.sendKeys(catName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		elem1.click();

	}
	
	public void validateCategoryExists() {
		Assert.assertTrue(categoryName.isDisplayed());
	}
	
}