package Radiology;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ADTTest.ConfigReader;
import OPDpages.Quick_Registration;
import RadiologyPages.Add_radiology_order_Mark_to_Bill;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_radiology_order_Mark_to_Bill_Radiology_Verify_record_Status_scheduled {

	public WebDriver driver;
	private ConfigReader configReader;
	ATUTestRecorder recorder;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();

	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException, AWTException 
	{
		//Login
		ADTpages.Login LoginScreen=new ADTpages.Login(driver);
		LoginScreen.login_Medcare(Uesrid);	
	}


	@Test(priority=2)
	@Parameters({"QuickPrimaryIdNumberPar","QuickExparyDatePar","QuickDateOfBirthPar","QuickMobileNumberPar","QuickEncounterRemarksPar","QuickAddNotesPar","QuickEncounterNotesPar","QuickPatientNotesPar","QuickReferralRemarksPar"})
	public void TC_02_Verify_That_User_Is_Able_To_Do_Quick_Registration(String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException
	{
		

		Quick_Registration QuickReg=new Quick_Registration (driver);
		QuickReg.Quick_Registration_Verification(QuickPrimaryIdNumberPar,QuickExparyDatePar,QuickDateOfBirthPar,QuickMobileNumberPar,QuickEncounterRemarksPar,QuickAddNotesPar,QuickEncounterNotesPar);
		driver.quit();
	}


	@Test(priority=3)
	@Parameters({"Uesrid2"})
	public void TC_03_Add_radiology_order_Mark_to_Bill_Radiology_Verify_record_Status_scheduled(String Uesrid2)throws InterruptedException, IOException, AWTException
	{
	
		
		driver.get(configReader.getBaseUrl());
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		ADTpages.Login LoginScreen=new ADTpages.Login(driver);
		LoginScreen.login_to_Clinicare(Uesrid2);	
		Add_radiology_order_Mark_to_Bill radio = new Add_radiology_order_Mark_to_Bill (driver);
		radio.consultAddservice();

	}


	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{

		recorder = new ATUTestRecorder(".//Videos//","AdmissionRequestTest_For_NEW_IC-"+dateFormat.format(date),false);
		recorder.start();

		configReader = new ConfigReader();

		// Initialize WebDriver with the ChromeOptions

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(configReader.getBaseUrl());
		//driver.get("https://mykare-qa.hatiintl.com/Medcare");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
	}
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_AdmissionRequestTest_For_NEW_IC"+ dateFormat.format(date)));
		}
	}	
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}


}