package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;

public class ClientInfoTest1 extends TestBase {

	@SuppressWarnings("unused")
	@Test(dataProvider = "getClientContact")
	public void ClientContact(String ClientLegalname, String AlternateClientname, String Clienttype,
			String CompanyDescription, String Website, String Clientnotes, String Buisnesstype, String PrivateorPublic,
			String PrimaryIndustry, String SecondaryIndustry, String StartBusiness, String EndBusiness,
			String EINnumber, String SICcode, String Naicscode, String Ofemployeestotal, String OfemployeesEligible,
			String LocktonMarketsize, String Locktonclienttype, String Currentstatus, String Clientcomplexity,
			String Frequency, String Address1, String Suite1, String City1, String State1, String Country1,
			String ZIPCode1, String ClientmainPhone, String PhoneExtn, String Milestoclient, String Address2,
			String City2, String State2, String Country2, String ZIPCode2, String LocktoncontactName, String Email,
			String Locktoncontactphoneno) throws InterruptedException {

		Thread.sleep(20000);

// LoginValidation		

		String actualUrl = "https://qa.locktonconnect.com/clients/home";
		String expectedUrl = driver.getCurrentUrl();

		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Login Test passed");
		} else {
			System.out.println("Login Test failed");
		}

		Thread.sleep(4000);

		click("ClientsHyperLink");

		Thread.sleep(3000);

		String GeneralInfoString;

		type("ClientLegal", ClientLegalname);

		Thread.sleep(2000);
		type("AlternateName5", AlternateClientname);

		click("Calendar1");
		Thread.sleep(2000);

		click("Today");

		select("ClientType", Clienttype);

		type("Description", CompanyDescription);
		type("Website", Website);
		type("Notes", Clientnotes);
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

		WebElement element = driver
				.findElement(By.xpath("//*[@class='file_upload_height overflow-hidden rounded-0 bg-gray-200'][1]"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);

		System.out.println(element.getText());

		Thread.sleep(1000);

		String CompanyInfo;

		click("CompanyFounded");
		click("Today1");
		select("BuisnessType", Buisnesstype);
		Thread.sleep(1000);

		select("PrivateOrPublic", PrivateorPublic);
		type("PrimaryIndustry", PrimaryIndustry);
		type("SecondaryIndustry", SecondaryIndustry);
		select("StartBuisnessFiscal", StartBusiness);
		select("EndBuisnessFiscal", EndBusiness);
		type("EINNumber", EINnumber);
		type("SICCode", SICcode);
		type("NAISCCode", Naicscode);
		Thread.sleep(3000);

		String EmployeeInfo;

		reset("OfEmployees");

		type("OfEmployees", Ofemployeestotal);
		Thread.sleep(1000);

		click("OfEmployeesDate");
		Thread.sleep(2000);

		click("OfEmployeesToday");
		type("OfEmployeesBenefit", OfemployeesEligible);
		click("OfEmployeesDate2");
		click("OfmployeesToday2");
		select("LocktonMarket", LocktonMarketsize);

		String LocktonInfo;
		select("LocktonTask", Locktonclienttype);
		select("CurrentStatus", Currentstatus);
		select("Clientcomplexity", Clientcomplexity);
		select("Frequency", Frequency);

		Thread.sleep(4000);

		String AddressInfo;

		reset("Address2");
		Thread.sleep(2000);

		type("Address2", Address1);
		reset("Suite2");
		type("Suite2", Suite1);
		type("City2", City1);
		select("Country2", Country1);

		select("State2", State1);
		// select("Country2", Country1 );
		reset("ZipCode2");
		type("ZipCode2", ZIPCode1);
		reset("ClientMainPhone");
		type("ClientMainPhone", ClientmainPhone);
		type("PhoneExt", PhoneExtn);
		type("MilestoClient", Milestoclient);
		Thread.sleep(3000);

		String LocationInfo;

		type("Address1", Address2);
		reset("Suite1");
		type("Suite1", "Suite1000Coppell");
		type("City1", City2);
		type("Country1", Country2);

		Thread.sleep(1000);
		type("State1", State2);
		Thread.sleep(1000);

		type("ZipCode1", ZIPCode2);
		type("LocationContactName", LocktoncontactName);
		type("LocationContactEmail", Email);
		type("LocationContactPhone", Locktoncontactphoneno);
		Thread.sleep(3000);

		JavascriptExecutor je1 = (JavascriptExecutor) driver;

		WebElement element1 = driver
				.findElement(By.xpath("//*[@name='client_locationsclient_location_contact_phone0']"));

		je1.executeScript("arguments[0].scrollIntoView(true);", element);

		System.out.println(element1.getText());

		Thread.sleep(1000);

		String SaveAsDraft;
		click("SaveDraft");

		Thread.sleep(3000);

		String Approve;
		click("Approve");

	}

	@DataProvider
	public Object[][] getClientContact() {

		String sheetName = "Client Contact";
		int rows = excel1.getRowCount(sheetName);
		int cols = excel1.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][cols];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				data[rowNum - 2][colNum] = excel1.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
	}

}
