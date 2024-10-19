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

import InventoryPages.Item_Barcode_Against_Item_Print_barcode;
import InventoryPages.OpeningBalance;
import Pages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Item_Barcode_Against_Item_Print_barcode_Test
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
	@Parameters({"IteamGroupPar","IteamCategoryPar","IteamCodePar","IteamNamePar","BatchNoPar","ExpirayDatePar","QuantityPar"})
	public void TC_03_Verify_That_User_can_Create_Opening_Balance_Printing_Barcode(String IteamGroupPar,String IteamCategoryPar,String IteamCodePar,String IteamNamePar,String BatchNoPar,String ExpirayDatePar,String QuantityPar) throws InterruptedException, IOException
	{
		Item_Barcode_Against_Item_Print_barcode OPBalance=new Item_Barcode_Against_Item_Print_barcode(driver);
		OPBalance.User_Can_Create_Opening_Balance_Print_Barcode(IteamGroupPar,IteamCategoryPar,IteamCodePar,IteamNamePar,BatchNoPar,ExpirayDatePar,QuantityPar);
	}	
	
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{

		WebDriverManager.chromedriver().setup();
		recorder = new ATUTestRecorder(".//Videos//","Item_Barcode_Against_Item_Print_barcode_Test-"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Item_Barcode_Against_Item_Print_barcode_Test"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}
