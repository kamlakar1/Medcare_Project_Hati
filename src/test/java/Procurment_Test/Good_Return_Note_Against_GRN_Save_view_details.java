package Procurment_Test;

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
import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Good_Return_Note_Against_GRN_Save_view_details {
	
	ATUTestRecorder recorder;
	public static WebDriver driver=null;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
    Date date = new Date();
	
    @Test
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	{

		OPDpages.Login LoginScreen=new OPDpages.Login(driver);
		LoginScreen.login_Medcare(Uesrid);

	}

	

  @Test
  public void TC_02_Good_Return_Note_Against_GRN_Save_view_details() throws InterruptedException, IOException, AWTException 
  
  {
	  ProcurmentPages.Good_Return_Note_Against_GRN_Save_view_details AdvanceSearch=new ProcurmentPages.Good_Return_Note_Against_GRN_Save_view_details(driver);
	  AdvanceSearch.Good_Return_Note_Against_GRNfunc();
	  
  }
  

  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	   WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		recorder = new ATUTestRecorder(".//Videos//","Good_Return_Note_Against_GRN_Save_view_details"+dateFormat.format(date),false);
		recorder.start();
	  
  }
      
  @AfterMethod(alwaysRun=true)
  public void FailedScreenShot(ITestResult Result) throws IOException
  {
      if(ITestResult.FAILURE==Result.getStatus())
      {
          File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Good_Return_Note_Against_GRN_Save_view_details"+ dateFormat.format(date)));
      }
  
  }
  
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
    //    driver.quit();
		recorder.stop();;
      
  }
}