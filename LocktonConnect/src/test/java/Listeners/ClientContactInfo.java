package Listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.TestBase;

public class ClientContactInfo extends TestBase{
	
	@SuppressWarnings("unused")
	@Test
	
	public void AddContact() throws InterruptedException{
		
		
		
        type("LoginUsername","global_admin");
		
		type("Loginpass","123456");
		
		click("LoginBtn");
			
		Thread.sleep(20000);
		
		
		driver.findElement(By.xpath("//*[text()='GA'][1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Logout'][1]")).click();
		
		Thread.sleep(3000);


//		click("ClientsHyperLink");
//		
//		Thread.sleep(3000);
//		
//		
//		click("Clientcontactinfo");
//		Thread.sleep(1000);
//		click("Addcontact");
//		Thread.sleep(1000);
//		
//		String AddContact;
//		
//		type("FirstName","Test");
//		type("LastName","Test1");
//		type("Title","ST");
//		type("WorkPhone","9990999099");
//		type("CellPhone","9990999099");
//		type("Email","Test@gmail.com");
//		type("Address","Test Lane1");
//		type("City","Ney Jersey");
//		
//		select("Country","United States");
//		select("State","New Jersey");
		


		
		
}
}
