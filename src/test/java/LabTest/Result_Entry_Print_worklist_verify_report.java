package LabTest;

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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class Result_Entry_Print_worklist_verify_report
{
	//public static WebDriver driver = null;
	WebDriver driver;
	ATUTestRecorder recorder;


	@Test(priority=1)
	@Parameters({"Uesrid"})

	public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplication(String Uesrid) throws InterruptedException, IOException, AWTException
	{
		Login Loginapp=new Login(driver);
		Loginapp.login_Medcare(Uesrid);

	
	
	}
	
/*
	
	@Test(priority=2)
	public void TC_02_Create_prerequisit_with_patiantcreat_and_finallbill() throws InterruptedException, IOException, AWTException
	{

		OPD_registrationn registrationj=new OPD_registrationn(driver);
		registrationj.OPD_REGISTRATIONmm();	  

	}
	
	@Test(priority=3)
	public void TC_03_Create_bill() throws InterruptedException, IOException, AWTException
	{

		Billing_prereq registrationj=new Billing_prereq(driver);
		registrationj.hemotollogyService();	  

	}
	*/

	@Test(priority=2)
	public void TC_04_Result_Entry_Print_worklist_verify_report() throws InterruptedException, IOException, AWTException
	{

		Media_Observation_Growth_Completed_Save_Result_Entry_Hold registrationj=new Media_Observation_Growth_Completed_Save_Result_Entry_Hold();
		registrationj.WorlListprint();	  

	}




	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","Result_Entry_Print_worklist_verify_report -"+dateFormat.format(date),false);
		recorder.start();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mykare-qa.hatiintl.com/Medcare/#/");
		Thread.sleep(9000);
		driver.manage().window().maximize(); 

	}
	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();
	}


}
