package OBillingTest;

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

import BillingPages.Billing_Estimation_Advance_Search;
import BillingPages.Billing_Estimation_Advance_Search;
import BillingPages.OP_Company_Deposit_Singal_Payment_Method_Page;
import BillingPages.OP_Company_Full_Refund_Page;
import BillingPages.OP_Debit_Note_Against_Company_Payer_Page;
import BillingPages.OP_Debit_Note_OPCharge_Against_Company_Payer_Page;
import Login.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_Billing_Estimation_Advance_Search_Test {
	
	ATUTestRecorder recorder;
	public static WebDriver driver=null;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();
	
    @Test
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	{

    	Login LoginScreen=new Login(driver);
		LoginScreen.LoginMedcare(Uesrid);

	}

	

  @Test
  @Parameters({"NAMEPar"})
  public void TC_02_User_Able_To_Do_Bill_Estimation_Advance_Search (String NAMEPar) throws InterruptedException, IOException 
  
  {
	  Billing_Estimation_Advance_Search EstimationAdvanceSearch=new Billing_Estimation_Advance_Search(driver);
	  EstimationAdvanceSearch.BillingEstimationAdvanceSearch(NAMEPar);
	  
  }
  
  @BeforeTest
	public void startBrowser() throws ATUTestRecorderException 
	{ 
		recorder = new ATUTestRecorder(".//Videos//","Billing_Estimation_Advance_Search_Test"+dateFormat.format(date),false);
		recorder.start();   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mykare-qa.hatiintl.com/Medcare");
		//driver.close();
		//driver.quit();	  
	}   
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Billing_Estimation_Advance_Search_Test.png"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
  }
}