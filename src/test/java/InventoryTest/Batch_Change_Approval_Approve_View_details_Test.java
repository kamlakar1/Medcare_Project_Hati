package InventoryTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import InventoryPages.BatchChange_AddItem_Save_Details;
import InventoryPages.BatchChange_AddItem_Save_modify_saveAndsubmit_Details;
import InventoryPages.BatchChange_AddItem_saveAndsubmit_ApproveFromDashboard_details;
import InventoryPages.BatchChange_AddItem_saveAndsubmit_Details;
import InventoryPages.Batch_Change_Approval_Approve_View_details;
import InventoryPages.Batch_change_dashboard_Advanced_Search;
import InventoryPages.Material_Consumption_Dashboard_Advanced_Search;
import InventoryPages.OpeningBalance;
import InventoryPages.Opening_Balance_Dashboard_Advanced_Search;
import InventoryPages.Stock_Adjustment_Dashboard_Advanced_Search;
import Pages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Batch_Change_Approval_Approve_View_details_Test
{
	
	WebDriver driver;
	ATUTestRecorder recorder;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	
	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_verify_That_User_Is_Able_To_Login_Medcare(String Uesrid) throws InterruptedException, IOException
	{
		Login Loginapp=new Login(driver);
		Loginapp.login_Medcare(Uesrid);
	}	
	@Test(priority=2)
	public void TC_02_Verify_That_User_can_do_Batch_Change_Approval_Approve_View_details() throws InterruptedException, IOException
	{
		Batch_Change_Approval_Approve_View_details  BC=new Batch_Change_Approval_Approve_View_details (driver);
		BC.Batchchange_SaveAndSubmit_ApproveFromDashBoard_ViewDetails();
	}		
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{
		WebDriverManager.chromedriver().setup();
		recorder = new ATUTestRecorder(".//Videos//","Batch_Change_Approval_Approve_View_details_Test-"+dateFormat.format(date),false);
		recorder.start();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize(); 
	}
	
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Batch_Change_Approval_Approve_View_details_Test"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}
