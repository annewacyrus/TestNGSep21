package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ValidateMonthsInDropDown {
	WebDriver driver;
	
	public ValidateMonthsInDropDown(WebDriver driver) {
		
		this.driver=driver;
		
		}
	
	@FindBy(how=How.XPATH, using = "//select[@name='due_month']//option") 
	List<WebElement> monthsDropDown;
	//due_month
	@FindBy(how=How.XPATH, using = "//select[@name='due_month']") 
    WebElement months_Drop_Down;
	
	public void validateMonthsInACalendarYear() {
		List<String> expectedMonths = new ArrayList<String>();
		expectedMonths.add("Jan");
		expectedMonths.add("Feb");
		expectedMonths.add("Mar");
		expectedMonths.add("Apr");
		expectedMonths.add("May");
		expectedMonths.add("Jun");
		expectedMonths.add("Jul");
		expectedMonths.add("Aug");
		expectedMonths.add("Sep");
		expectedMonths.add("Oct");
		expectedMonths.add("Nov");
		expectedMonths.add("Dec");
		
		List<String> actualMonths = new ArrayList<String>();
		for(int i=1; i<monthsDropDown.size(); i++) {
			actualMonths.add(monthsDropDown.get(i).getText());
		}
		
		Assert.assertEquals(actualMonths, expectedMonths);
	}

public void monthDropDown(){
	//List<WebElements>
	String arr[] = { "None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	Select select = new Select(months_Drop_Down);
	//select.selectByIndex(7);
   //select.selectByValue("");
   //select.selectByVisibleText("Mar");
    List<WebElement> dropDownValues = select.getOptions();
//System.out.println(dropDownValues.size());
for( int i=0;  i < dropDownValues.size(); i++) {
	
	 //Assert.assertEquals(arr[i], dropDownValues);
	//Assertion is failing-to fix
	
	
	System.out.println(dropDownValues.get(i).getText());


}


}


}
