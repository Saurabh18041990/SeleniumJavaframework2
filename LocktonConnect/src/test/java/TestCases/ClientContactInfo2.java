package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;

public class ClientContactInfo2 extends TestBase{
	
	@SuppressWarnings("unused")
	@Test(dataProvider="Contact")
	public void Pass(String FirstName, String LastName, String WorkPhone, String CellPhone, String Email, String Address, String City, String State, String Country, String ZipCode, String Title ,String HomePhone, String PractiveArea
, String RelationShipOwner , String RelationShipStrength, String Notes, String FormerEmployer1, String FormerEmployer2) throws InterruptedException
	{
//		
//       type("LoginUsername","global_admin");
//		
//		type("Loginpass","123456");
//		
//		click("LoginBtn");
				
			Thread.sleep(10000);
						
			click("ClientsHyperLink");
			
			Thread.sleep(3000);
			
			
			click("Clientcontactinfo");
			Thread.sleep(2000);
			click("Addcontact");
			Thread.sleep(1000);
			
			String AddContact;
			
			type("FirstName", FirstName);
			type("LastName", LastName);
			type("Title", Title);
			type("WorkPhone", WorkPhone);
			type("CellPhone", CellPhone);
			type("Email", Email);
			type("Address", Address);
			type("City", City);
			
			select("Country", Country);
			select("State", State);
			type("ZIP", ZipCode);
			Thread.sleep(2000);
			click("BirthDate");
			Thread.sleep(1000);
			click("BirthDate1");

			Thread.sleep(1000);

		    select("Title", Title);
		    type("HomePhone", HomePhone);
		    select("PracticeArea", PractiveArea);
		    select("RelationShipOwner", RelationShipOwner);
		    select("RelationShipStrength", RelationShipStrength);
		    type("Notes2", Notes); 
		    select("FormerEmployment1", FormerEmployer1);
		    Thread.sleep(2000);
			click("DateLeft1");
			Thread.sleep(1000);
			click("DateLeft11");

			Thread.sleep(1000);
		    
		    select("FormerEmployment2", FormerEmployer2);
		    Thread.sleep(2000);
			click("DateLeft2");
			Thread.sleep(1000);
			click("DateLeft22");

			Thread.sleep(1000);

		    click("AddContact");
		    		
	
	
	
	}
	@DataProvider
	public Object[][] Contact(){
		
		String sheetName2 = "AddContactTest";
		int rows = excel.getRowCount(sheetName2);
		int cols = excel.getColumnCount(sheetName2);
		
		Object[][] data = new Object[rows-1][cols];
		for (int rowNum=2; rowNum<=rows; rowNum++)
		{
			for (int colNum=0; colNum<cols; colNum++)
			{
				data[rowNum-2][colNum] = excel.getCellData(sheetName2, colNum, rowNum);
			}
		}
		return data;
	}
	

}
