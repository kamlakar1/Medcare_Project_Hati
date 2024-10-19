package Inventory;

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

public class Store_Indent_Against_Item_Add_Item_Save_Print_report {
	
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
  public void TC_02_Store_Indent_Against_Item_Add_Item_Save_Cancel() throws InterruptedException, IOException 
  
  {
	  InventoryPage.Store_Indent_Against_Item_Add_Item_Save_Print_report AdvanceSearch=new InventoryPage.Store_Indent_Against_Item_Add_Item_Save_Print_report(driver);
	  AdvanceSearch.Store_Indent_Against_Item_Add_Itemfunc();
	  
  }
  

  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	   WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		recorder = new ATUTestRecorder(".//Videos//","Store_Indent_Against_Item_Add_Item_Save_Print_report"+dateFormat.format(date),false);
		recorder.start();
	  
  }
      
  @AfterMethod(alwaysRun=true)
  public void FailedScreenShot(ITestResult Result) throws IOException
  {
      if(ITestResult.FAILURE==Result.getStatus())
      {
          File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Store_Indent_Against_Item_Add_Item_Save_Print_report"+ dateFormat.format(date)));
      }
  
  }
  
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();;
      
  }
}