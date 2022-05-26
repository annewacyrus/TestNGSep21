package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddDuplicateCategoryPage {
	WebDriver driver;

	public AddDuplicateCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement elem;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement elem1;
	@FindBy(how = How.XPATH, using = "//span[contains(.,'Soccer')]") // span[contains(.,'Soccer')]
	WebElement catAdd;
	@FindBy(how = How.XPATH, using = "//body[contains(.,'The category you want to add already exists')]")
	WebElement msg;

	@FindBy(how = How.XPATH, using = "//a[@title='Remove this category']")
	WebElement catName;

	@FindBy(how = How.XPATH, using = "//a[text()='Yes']")
	WebElement yes;

	public void addExistingCategory(String categoryName) {

		elem.sendKeys(categoryName);
		elem1.click();

		Boolean bool = msg.isDisplayed();
		if (bool == true) {

			Assert.assertTrue(bool);
			System.out.println("message: " + msg.getText());

		} else {

			Assert.assertFalse(true);

		}

	}

}
