package MRDTest;

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
import LabPages.Debit_Note_Final_Bill_Partial_Settlement;
import LabPages.Login;
import LabPages.OPD_registrationn;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Department_Request_Save_MRD_Request_Department_Request_Cancel 
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
 @Test

  public void TC_02_Department_Request_Save_MRD_Request_Department_Request_Cancel() throws InterruptedException, IOException, AWTException 
  {
	MRDPages.Department_Request_Save_MRD_Request_Department_Request_Cancel vv=new MRDPages.Department_Request_Save_MRD_Request_Department_Request_Cancel(driver);
	//OPD_registrationn   kk = new OPD_registrationn(driver);
	//kk.DoubleEncounter();  
	vv.OPD_REGISTRATION();	  
}
 
 
 @BeforeTest

	public void startBrowser() throws ATUTestRecorderException 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","Department_Request_Save_MRD_Request_Department_Request_Cancel -"+dateFormat.format(date),false);
		recorder.start();  

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");

	}
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Department_Request_Save_MRD_Request_Department_Request_Cancel"+ dateFormat.format(date)));
		}
	}

	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		driver.quit();
		recorder.stop();   
	}
}
