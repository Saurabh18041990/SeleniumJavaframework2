package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.ExcelReader;

public class TestBase {
	
	
	/*
	 * WebDrivers : 
	 * Properties : 
	 * Logs - Log4j jar , .log, log4j.properties
	 * ExtendedReports
	 * DB
	 * Excel
	 * Mail
	 * ReportNG, ExtentReports
	 * Jenkins
	 */
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\Client_Excel.xlsx");
	public static ExcelReader excel1 = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\Client Contact1.xlsx");

	
	
	@BeforeSuite
	public void setUp() {
		
		if (driver==null) {
			
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (config.getProperty("browser").equals("firefox")) {
				
				
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
				
			}else if(config.getProperty("browser").equals("chrome")){
	// Silent No Time logs
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
				driver = new ChromeDriver();
			}
			
				
			driver.get(config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		}
		
	}
	
	public boolean isElementPresent(By by) {
		try {
			
			driver.findElement(by);
			return true;
			
			
		}catch(NoSuchElementException e) {
			return false;
		}
	
		
		
	}
	
	
	
	// type method

			public void type(String locator, String value) {

				driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);

			}
			// click method

			public void click(String locator) {

				driver.findElement(By.xpath(OR.getProperty(locator))).click();

			}
		// verify true method
			public void verifyTrue(String locator) {

				Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty(locator))));
				
			}
			
			// verify false method
				public void verifyFalse(String locator) {

					Assert.assertFalse(isElementPresent(By.xpath(OR.getProperty(locator))));
					
				}
			
			

			// select dropdown values method

			static WebElement dropdown;

			public void select(String locator, String value) {
				dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
				Select select = new Select(dropdown);
				select.selectByVisibleText(value);
				
		}
			
			// Reset the fields method
			
			public void reset(String locator) {

				driver.findElement(By.xpath(OR.getProperty(locator))).clear();

			}
		
		
	@AfterSuite
	public void tearDown() {
		
		//driver.quit();
		
	}

}
