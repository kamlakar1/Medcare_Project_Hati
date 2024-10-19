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

import InventoryPages.OpeningBalance;
import InventoryPages.Opening_Balance_Dashboard_Advanced_Search;
import InventoryPages.Stk_Adjst_AddItem_Stk_Adjst_Type_Add_Save_Approvefromdashboard_details;
import InventoryPages.Stock_Adjustment_Add_Item_Write_Off_Save_Approve_from_dashboard_View_details;
import InventoryPages.Stock_Adjustment_Add_Item_Write_Off_Save_View_Details;
import InventoryPages.Stock_Adjustment_Dashboard_Advanced_Search;
import Pages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stk_Adjst_AddItem_Stk_Adjst_Type_Add_Save_Approvefromdashboard_details_Test
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
	
	public void TC_03_Verify_That_User_can_Add_Item_In_Adjustment_Stock_with_Write_Off() throws InterruptedException, IOException
	{
		Stk_Adjst_AddItem_Stk_Adjst_Type_Add_Save_Approvefromdashboard_details  WriteOff=new Stk_Adjst_AddItem_Stk_Adjst_Type_Add_Save_Approvefromdashboard_details(driver);
		WriteOff.Stock_Adjustment_AddItem_For_Stock_adjustment_Save_ApproveFromDashboard();
	}		
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{
		WebDriverManager.chromedriver().setup();
		recorder = new ATUTestRecorder(".//Videos//","Stk_Adjst_AddItem_Stk_Adjst_Type_Add_Save_Approvefromdashboard_details_Test-"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Stk_Adjst_AddItem_Stk_Adjst_Type_Add_Save_Approvefromdashboard_details_Test"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}
