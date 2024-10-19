package ADTTest;

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

import ADTpages.Modify_Existing_Patient_Admission_Request_1;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bed_View_Filter_by_Doctor 
{
	WebDriver driver;
	private ConfigReader configReader;
	ATUTestRecorder recorder;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	
	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_verify_That_User_Is_Able_To_Login_ADT_Dashboard_Screen(String Uesrid) throws InterruptedException, IOException
	{
		ADTpages.Login Loginapp=new ADTpages.Login(driver);
		Loginapp.login_Medcare(Uesrid);
	}
	@Test(priority=2)
  public void TC_02_Verfiy_That_User_Is_Able_To_do_Bed_View_Filter_by_Doctor() throws InterruptedException, IOException
  {
		ADTpages.Bed_View_Filter_by_Doctor doc = new ADTpages.Bed_View_Filter_by_Doctor(driver);
		doc.Bed_View_Filter_by_Doctorfunc();
  }
	
	@BeforeTest
	public void startBrowser() throws ATUTestRecorderException, InterruptedException 
	{

		recorder = new ATUTestRecorder(".//Videos//","Bed_View_Filter_by_Doctor -"+dateFormat.format(date),false);
		recorder.start();  

		configReader = new ConfigReader();
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_Bed_View_Filter_by_Doctor"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
	driver.quit();
		recorder.stop();;
	}

}
