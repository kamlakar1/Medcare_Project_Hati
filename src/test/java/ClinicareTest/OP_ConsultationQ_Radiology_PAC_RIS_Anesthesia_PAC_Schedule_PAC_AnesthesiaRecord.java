package ClinicareTest;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.hibernate.validator.internal.util.logging.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ClinicarePages.LAB_Order_Pages;
import ClinicarePages.Op_Consult_page;
import ClinicarePages.RadiologyPage;
import ClinicarePages.RadiologyPagePACAnesthesia;
import ClinicarePages.Register_Patient_add_primary;
import LabPages.Billing_prereq;

import LabPages.OPD_registrationn;
import LabPages.enter_media_observation_identificationsave;
import OPDpages.Login;
import OPDpages.OPD_Registration_Encounter;
import OPDpages.OPD_registration;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class OP_ConsultationQ_Radiology_PAC_RIS_Anesthesia_PAC_Schedule_PAC_AnesthesiaRecord
{
	ATUTestRecorder recorder;
	//public static WebDriver driver=null;
	WebDriver driver;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();


	@Test(priority=1)
	@Parameters({"Uesrid"})

	public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplication() throws InterruptedException, IOException, AWTException
	{
		Login Loginapp=new Login(driver);
		Loginapp.login_Medcare_2();

	
	
	}
	
	
	@Test(priority=2)
	public void TC_02_ER_ConsultationQ_Radiology_PAC_RIS_Anesthesia_PAC_Schedule_PAC_AnesthesiaRecord() throws InterruptedException, IOException, AWTException
	{

		RadiologyPagePACAnesthesia regis = new RadiologyPagePACAnesthesia(driver);
		regis.frssius();
			
	
	}

	 @BeforeTest
	 
	 public void startBrowser() throws ATUTestRecorderException, InterruptedException 
	 {
		  
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://mykare-qa.hatiintl.com/Medcare/#/");
			Thread.sleep(8000);
			driver.manage().window().maximize(); 
			recorder = new ATUTestRecorder(".//Videos//","ER_ConsultationQ_Radiology_PAC_RIS_Anesthesia_PAC_Schedule_PAC_AnesthesiaRecord "+dateFormat.format(date),false);
			recorder.start();
		  
	 }
	     
	 @AfterMethod(alwaysRun=true)
	 public void FailedScreenShot(ITestResult Result) throws IOException
	 {
	     if(ITestResult.FAILURE==Result.getStatus())
	     {
	         File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	         FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//ER_ConsultationQ_Radiology_PAC_RIS_Anesthesia_PAC_Schedule_PAC_AnesthesiaRecord "+ dateFormat.format(date)));
	     }
	 
	 }
	 
	 @AfterSuite
		public void afterTest() throws ATUTestRecorderException {
			// driver =new ChromeDriver();
		driver.quit();
			recorder.stop();;
	     
	 }
	}