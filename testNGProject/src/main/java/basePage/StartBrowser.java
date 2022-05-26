package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class StartBrowser {

	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
     driver = new ChromeDriver(options);
		//driver.manage().window().maximize();//taken over by options that maximizes window instant
		driver.get("http://techfios.com/test/107/");

	}

	@AfterTest
	public void tearDown() {
		//driver.close();

	}

}
