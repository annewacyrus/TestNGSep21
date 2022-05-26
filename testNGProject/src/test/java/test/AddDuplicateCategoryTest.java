package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.StartBrowser;
import pages.AddDuplicateCategoryPage;

public class AddDuplicateCategoryTest extends StartBrowser {

	AddDuplicateCategoryPage addDupCat;

	@Test(priority = 1)
	public void userAbleToAddNewCategory() {

		addDupCat = PageFactory.initElements(driver, AddDuplicateCategoryPage.class);
		addDupCat.addExistingCategory("Soccer");

	}
}
