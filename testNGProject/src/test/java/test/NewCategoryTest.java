package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.StartBrowser;
import pages.AddACategoryPage;

public class NewCategoryTest extends StartBrowser {
	
	AddACategoryPage addCat;

	@Test(priority = 1)
	public void userAbleToAddNewCategory() {
		
		addCat = PageFactory.initElements(driver, AddACategoryPage.class);
		addCat.newCategory("Soccer");
		addCat.validateCategoryExists();
		
	}

}
