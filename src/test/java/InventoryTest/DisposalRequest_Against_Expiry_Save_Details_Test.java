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

import InventoryPages.Batch_change_dashboard_Advanced_Search;
import InventoryPages.DisposalRequest_Against_Expiry_Save_Details;
import InventoryPages.DisposalRequest_Against_Item_Save_Details;
import InventoryPages.Disposal_request_dashboard_Advanced_Search;
import InventoryPages.Material_Consumption_Dashboard_Advanced_Search;
import InventoryPages.OpeningBalance;
import InventoryPages.Opening_Balance_Dashboard_Advanced_Search;
import InventoryPages.Stock_Adjustment_Dashboard_Advanced_Search;
import Pages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DisposalRequest_Against_Expiry_Save_Details_Test
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
	public void TC_02_Verify_That_User_can_do_DisposalRequest_Against_Expiry_Save_Details() throws InterruptedException, IOException
	{
		DisposalRequest_Against_Expiry_Save_Details DR=new DisposalRequest_Against_Expiry_Save_Details(driver);
		DR.Disposal_Request_Against_Expiry_Save_Details();
	}		
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{

		WebDriverManager.chromedriver().setup();
		recorder = new ATUTestRecorder(".//Videos//","DisposalRequest_Against_Expiry_Save_Details_Test-"+dateFormat.format(date),false);
		recorder.start();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
	}
	
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//DisposalRequest_Against_Expiry_Save_Details_Test"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}
