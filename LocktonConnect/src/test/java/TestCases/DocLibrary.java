package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class DocLibrary extends TestBase {

	private String data;

	@SuppressWarnings("unused")
	@Test

	public void loginToLockTon() throws InterruptedException, AWTException {

		type("LoginUsername", "techgenies_qa");

		type("Loginpass", "123456");

		click("LoginBtn");

		Thread.sleep(25000);

		click("DocumentsLibraryHyperLink");

		Thread.sleep(3000);
// Double click
		Actions actions = new Actions(driver);
		WebElement ShareFolder = driver.findElement(By.xpath("(//*[@title='Shared Files'])[2]"));
		actions.doubleClick(ShareFolder).perform();

		Actions actions1 = new Actions(driver);
		WebElement CityFolder = driver.findElement(By.xpath("(//*[@title='City of Tamarac'])[2]"));
		actions.doubleClick(CityFolder).perform();
		Thread.sleep(3000);

		Actions actions2 = new Actions(driver);
		WebElement ClientLogo = driver.findElement(By.xpath("(//*[@title='Client Logo'])[2]"));
		actions.doubleClick(ClientLogo).perform();
		Thread.sleep(3000);

// UploadJPG File

		Robot robot = new Robot();

		WebElement UPLOAD = driver.findElement(By.xpath("//a[contains(.,'Upload')]"));
		System.out.println(UPLOAD.getText());
		UPLOAD.click();
		robot.setAutoDelay(2000);

		StringSelection stringSelection = new StringSelection("C:\\Users\\Saurabh Gupta\\Desktop\\ST.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		click("Close");
		
		
//Upload Excel Sheet		
		Robot robot1 = new Robot();

		WebElement UPLOAD1 = driver.findElement(By.xpath("//a[contains(.,'Upload')]"));
		System.out.println(UPLOAD1.getText());
		UPLOAD.click();
		robot.setAutoDelay(2000);

		StringSelection stringSelection1 = new StringSelection("C:\\Users\\Saurabh Gupta\\Desktop\\Client Contact1.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		click("Close");
		
		
		
// Favorite
		click("check");
		Thread.sleep(3000);

		click("DW");
		Thread.sleep(3000);
		click("Folder");
		Thread.sleep(3000);

//		String ShareFolder1 = "Index=0"; 
//
//		if ("file".equals(ShareFolder1)) {
//
//			System.out.println("Status: Folder is added");
//		}
//
//		else if ("Index=0".equals(0)) {
//			System.out.println("Status: Folder in present");
//		} else {
//			System.out.println("Status: Folder is not added");
//
//		}
		
		click("Check1");
//        Assert.assertFalse(driver.findElement(By.cssSelector("//*[@class='e-rowcell e-gridchkbox e-fe-checkbox e-lastrowcell']")).isSelected());
//        System.out.println(driver.findElement(By.cssSelector("//*[@class='e-rowcell e-gridchkbox e-fe-checkbox e-lastrowcell']")).isSelected());

//		if(driver.findElements(By.xpath("//*[@class='e-rowcell e-gridchkbox e-fe-checkbox e-lastrowcell']")).size() != 0){
//			System.out.println("Element is Present");
//			}else{
//			System.out.println("Element is Absent");
//			}
		
		Thread.sleep(3000);
		
		
 // Excel Sheet Testing
		WebElement FAVORITE = driver.findElement(By.xpath("//*[@title='Shared Files_2020__City of Tamarac_04302020.xlsx']"));
		System.out.println(FAVORITE.getText());
		Thread.sleep(1000);

		
		String ActualTitle = FAVORITE.getText();
		String ExpectedTitle = "Shared Files_2020__City of Tamarac_04302020.xlsx";
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if (ActualTitle==ExpectedTitle) {
		
		
		System.out.println("test.xlxs passed");
		
		} else {
			
			System.out.println("test.xlxs not passed");
		}

// .JPG Testing
		Thread.sleep(3000);
		
		click("Check2");
		WebElement FAVORITE1 = driver.findElement(By.xpath("//*[@title='Shared Files_2020__City of Tamarac_04302020.jpg']"));
		System.out.println(FAVORITE1.getText());
		Thread.sleep(1000);

		
		String ActualTitle1 = FAVORITE1.getText();
		String ExpectedTitle1 = "Shared Files_2020__City of Tamarac_04302020.jpg";
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if (ActualTitle1==ExpectedTitle1) {
		
		
		System.out.println("test.jpg passed");
		
		} else {
			
			System.out.println("test.jpg not passed");
		}
		
		
//        
//        String ActualTitle = 
//        
//        System.out.println(ActualTitle);
//        String ExpectedTitle = "UAT User";
//		Thread.sleep(1000);

     //   Assert.assertEquals(ActualTitle, ExpectedTitle);
       // System.out.println("Assert passed");
              
        Thread.sleep(3000);

		click("Check1");
		
		Thread.sleep(1000);
		click("VersionHistory");
		
		Thread.sleep(1000);
		click("V1");
		
		click("D1");
		Thread.sleep(4000);


		
	}

//	private void Favorite() {
//		// TODO Auto-generated method stub
//		
	}
