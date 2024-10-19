package ClinicareTest2;
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
import org.testng.annotations.Test;

import ClinicarePages.OPPatient_SearchInClinicare_OPConsult_AdmitOrder_Save_LoginMedcare_ADTDashboard;
import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class OPPatient_SearchInClinicare_StartConsult_MedicationOrder_LoginMedcare_Accpet_RIS_Test
{
	ATUTestRecorder recorder;
	//public static WebDriver driver=null;
	WebDriver driver;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();

	@Test(priority=1)
	public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplication() throws InterruptedException, IOException, AWTException
	{
		ClinicarePage2.Login2 Loginapp=new ClinicarePage2.Login2(driver);
		Loginapp.login_Medcare2();
	}		
	@Test(priority=2)
	 @Parameters({"PatientMRN"})
	public void TC_02_Click_print_and_submit_Result_Entry_View_orders(String PatientMRN) throws InterruptedException, IOException, AWTException
	{
		OPPatient_SearchInClinicare_OPConsult_AdmitOrder_Save_LoginMedcare_ADTDashboard regis = new OPPatient_SearchInClinicare_OPConsult_AdmitOrder_Save_LoginMedcare_ADTDashboard(driver);
		regis.AdmitOrder(PatientMRN);
	}
	 @BeforeTest	 
	 public void startBrowser() throws ATUTestRecorderException, InterruptedException 
	 {
		  
		   WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://mykare-qa.hatiintl.com/Medcare/#/");
			Thread.sleep(8000);
			driver.manage().window().maximize(); 
			recorder = new ATUTestRecorder(".//Videos//","OPPatient_SearchInClinicare_OPConsult_AdmitOrder_Save_LoginMedcare_ADTDashboard_Test "+dateFormat.format(date),false);			recorder.start();
		  
	 }	     
	 @AfterMethod(alwaysRun=true)
	 public void FailedScreenShot(ITestResult Result) throws IOException
	 {
	     if(ITestResult.FAILURE==Result.getStatus())
	     {
	         File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	         FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//OPPatient_SearchInClinicare_OPConsult_AdmitOrder_Save_LoginMedcare_ADTDashboard_Test"+ dateFormat.format(date)));
	     }	 
	 }	 
	 @AfterSuite
		public void afterTest() throws ATUTestRecorderException {
			// driver =new ChromeDriver();
			driver.quit();
			recorder.stop();	     
	 }
	}