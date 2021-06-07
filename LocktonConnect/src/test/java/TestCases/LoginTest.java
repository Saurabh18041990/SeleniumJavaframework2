package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void loginToLockTon() throws InterruptedException {
		
//		driver.findElement(By.xpath(OR.getProperty("LoginUsername"))).sendKeys("techgenies_qa");
//		driver.findElement(By.xpath(OR.getProperty("Loginpass"))).sendKeys("123456");
//		driver.findElement(By.xpath(OR.getProperty("LoginBtn"))).click();
		Thread.sleep(10000);
		
		type("LoginUsername","global_admin");
		
		type("Loginpass","123456");
		
		click("LoginBtn");


		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("DashBoardHyperLink"))),"Login not Successfull");
		
		
	}

}
