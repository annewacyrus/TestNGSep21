package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.StartBrowser;
import pages.ValidateMonthsInDropDown;

public class ValidateMonthsInDropDownTest extends StartBrowser {

ValidateMonthsInDropDown valMonthsDropDown;

	@Test(priority = 1)
	public void userAbleToValidateMonths() {
		
		valMonthsDropDown = PageFactory.initElements(driver, ValidateMonthsInDropDown.class);
		//valMonthsDropDown.validateMonthsInACalendarYear();		
	
		valMonthsDropDown.monthDropDown();
	
	
	}


}
