package BillingTest;

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

import BillingPages.Contract_Add;
import BillingPages.OPCharge_Advance_Search_Page;
import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contract_Add_Test {
	
	ATUTestRecorder recorder;
	public static WebDriver driver=null;
	

	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();

	
	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	{

		OPDpages.Login LoginScreen=new OPDpages.Login(driver);
		LoginScreen.login_Medcare(Uesrid);

	}

  @Test
  @Parameters({"ContractCodePar","DescriptionPar","ReferenceNoPar","ValidToPar","CoPayNumberPar","ServiceDesPar"})
  public void TC_02_User_Able_To_Create_Contract(String ContractCodePar,String DescriptionPar,String ReferenceNoPar,String ValidToPar,String CoPayNumberPar,String ServiceDesPar) throws InterruptedException, IOException 
  
  {
	  Contract_Add Contract=new Contract_Add(driver);
	  Contract.Contractcreate_1(ContractCodePar,DescriptionPar,ReferenceNoPar,ValidToPar,CoPayNumberPar,ServiceDesPar);
	  
  }
  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		recorder = new ATUTestRecorder(".//Videos//","Contract_Add_Test"+dateFormat.format(date),false);
		recorder.start();
   
   
	  
  }
  

@AfterMethod(alwaysRun=true)
public void FailedScreenShot(ITestResult Result) throws IOException
{
	if(ITestResult.FAILURE==Result.getStatus())
	{
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failed_Credit_Note_Against_Service_Single_service_Full_settlement"+ dateFormat.format(date)));
	}
}
  
      
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
      
  }
}