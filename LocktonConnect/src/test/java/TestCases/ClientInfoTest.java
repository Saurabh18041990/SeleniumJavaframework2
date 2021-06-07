package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class ClientInfoTest extends TestBase{
	
	@SuppressWarnings("unused")
	@Test
	
	public void loginToLockTon() throws InterruptedException {
		
		
		type("LoginUsername","global_admin");
		
		type("Loginpass","123456");
		
		click("LoginBtn");
			
		
//		WebDriverWait wait = new WebDriverWait(driver, 60); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Clients')]")));
//		driver.manage().window().maximize();
		
		Thread.sleep(20000);

	

		
		click("ClientsHyperLink");
		
		Thread.sleep(3000);

		
		String GeneralInfoString;
		
		type("ClientLegal","Nefab Packaging, Inc. , LTD");
		type("AlternateName","Nefab");
		
		click("Calendar1");
		Thread.sleep(2000);

		click("Today");
		
		select("ClientType","Prospect");
		
		type("Description","Nefab PackagingTest");
		type("Website","https://www.nefab.com/en/contact/americas/");
		type("Notes","Nefab Packaging");
//		
//		click("Drag&Drop");
//		type("Drag&Drop","C:\\Users\\Saurabh Gupta\\Desktop\\ST.jpg");				  
//				  UP.sendKeys("C:\\Users\\Saurabh Gupta\\Desktop\\ST.jpg"); Thread.sleep(2000);
//				  System.out.println("FILEUPLOADED SUCCESSFULLY");
//		WebElement fileInput = driver.findElement(By.name("uploadfile"));
//		fileInput.sendKeys("C:\\Users\\Saurabh Gupta\\Desktop\\ST.jpg");
//
//		// Added a wait to make you notice the difference.
//		Thread.sleep(1000);
//
//		driver.findElement(By.id("uploadfile")).sendKeys(
//				"C:\\Users\\Saurabh Gupta\\Desktop\\ST.jpg");
//				  
//				   
//			        Thread.sleep(2000);
//
//			        // check the "I accept the terms of service" check box
//			        driver.findElement(By.id("terms")).click();
//
//			        // click the "UploadFile" button
//			        //driver.findElement(By.name("send")).click();
//					  System.out.println("FILEUPLOADED SUCCESSFULLY");

		
		Thread.sleep(3000);

        JavascriptExecutor je = (JavascriptExecutor) driver;
 
        WebElement element = driver.findElement(By.xpath("//*[@class='file_upload_height overflow-hidden rounded-0 bg-gray-200'][1]"));
 
        je.executeScript("arguments[0].scrollIntoView(true);",element);
 
        System.out.println(element.getText());
        
		Thread.sleep(1000);

		String CompanyInfo;
		
		click("CompanyFounded");
		click("Today1");
		select("BuisnessType","LLC");
		Thread.sleep(1000);

		select("PrivateOrPublic","Public Sector");
		type("PrimaryIndustry","500");
		type("SecondaryIndustry","100");
		select("StartBuisnessFiscal","December");
		select("EndBuisnessFiscal","October");
		type("EINNumber","109999999");
		type("SICCode","1000");
		type("NAISCCode","200999");
		Thread.sleep(3000);

		String EmployeeInfo;
		
		reset("OfEmployees");
		
		type("OfEmployees","500");
		Thread.sleep(1000);

		click("OfEmployeesDate");
		Thread.sleep(2000);

		click("OfEmployeesToday");
		type("OfEmployeesBenefit","200");
		click("OfEmployeesDate2");
		click("OfmployeesToday2");
		select("LocktonMarket","5001+");
		
		String LocktonInfo;
		select("LocktonTask","Small Group");
		select("CurrentStatus","Active");
		select("Clientcomplexity","Complex");
		select("Frequency","Other");
		
		Thread.sleep(3000);

		
		String AddressInfo;
		
		type("Address","504 Airline Drive");
		reset("Suite");
		type("Suite","Suite500Coppell");
		type("City","New York");
		select("State","New York");
		select("Country","United States");
		type("ZipCode","100200");
		type("ClientMainPhone","4005006001");
		type("PhoneExt","400");
		type("MilestoClient","50.50");
		Thread.sleep(3000);

		String LocationInfo;
		
		type("Address1","1004 Airline Drive");
		reset("Suite1");
		type("Suite1","Suite1000Coppell");
		type("City1","New Jersey");
		type("Country1","United States");
		type("State1","New Jersey");
		type("ZipCode1","400100");
		type("LocationContactName","Mr.Zues");
		type("LocationContactEmail","Zues@gmail.com");
		type("LocationContactPhone","3006007001");
		Thread.sleep(3000);
		
		
		
		  JavascriptExecutor je1 = (JavascriptExecutor) driver;
		  
	       WebElement element1 = driver.findElement(By.xpath("//*[@name='client_locationsclient_location_contact_phone0']"));
	 
	       je1.executeScript("arguments[0].scrollIntoView(true);",element);
	 
	       System.out.println(element1.getText());
	       
	       Thread.sleep(1000);

		String SaveAsDraft;
		click("SaveDraft");
		
		Thread.sleep(3000);
		
		String Approve;
		click("Approve");

		
	}
	}