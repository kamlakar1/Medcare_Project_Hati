package LabTest;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ClinicarePages.Addbillingservices_and_charges;
import LabPages.Billing_prereq;
import LabPages.Billing_prereqDispatch;
import LabPages.Debit_Note_Final_Bill_Partial_Settlement;
import LabPages.Login;
import LabPages.OPD_registrationn;
import LabPages.Phlebotomy_Printand_submit_Pending_Dispatched_Reprint;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Phlebotomy_Printand_submit_Pending_Dispatched_Dispatched_same_unit_Reject_Sample_order 
{
	ATUTestRecorder recorder;
	//public static WebDriver driver=null;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();
	public WebDriver driver;	
	@Test	
	@Parameters({"Uesrid"})
	
public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplication(String Uesrid) throws InterruptedException, IOException
{
		Login Loginapp=new Login(driver);
		 Loginapp.login_Medcare(Uesrid);
		 
}
	
	/*
	
	@Test
	public void TC_02_Create_prerequisit_with_patiantcreat_and_finallbill() throws InterruptedException, IOException, AWTException
	{

		OPD_registrationn registrationj=new OPD_registrationn(driver);
		registrationj.OPD_REGISTRATIONmm_1();	  

	}
	
	@Test
	public void TC_03_Create_bill() throws InterruptedException, IOException, AWTException
	{

		Billing_prereqDispatch registrationj=new Billing_prereqDispatch(driver);
		registrationj.Billing();	  

	}
	
*/

 @Test
 

  public void TC_04_Phlebotomy_Printand_submit_Pending_Dispatched_Dispatched_same_unit_Reject_Sample_order2() throws InterruptedException, IOException, AWTException 
  {
	 LabPages.Dispatched_same_unit_Reject_Sample_order registration=new LabPages.Dispatched_same_unit_Reject_Sample_order(driver);
	  registration.OPD_REGISTRATION();	  
}
 
 
@BeforeTest
 
 public void startBrowser() throws ATUTestRecorderException, InterruptedException 
 {
	  
	   WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mykare-qa.hatiintl.com/Medcare/#/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		recorder = new ATUTestRecorder(".//Videos//","Phlebotomy_Printand_submit_Pending_Dispatched_Dispatched_same_unit_Reject_Sample_order2"+dateFormat.format(date),false);
		recorder.start();
	  
 }
     
 @AfterMethod(alwaysRun=true)
 public void FailedScreenShot(ITestResult Result) throws IOException
 {
     if(ITestResult.FAILURE==Result.getStatus())
     {
         File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Phlebotomy_Printand_submit_Pending_Dispatched_Dispatched_same_unit_Reject_Sample_order2"+ dateFormat.format(date)));
     }
 
 }
 
 @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
     
 }
}