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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BedBlockingTest
{
	public WebDriver driver;
	private ConfigReader configReader;
	ATUTestRecorder recorder;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	
	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_verify_That_User_Is_Able_To_Login_ADT_Form_Bed_Blocking(String Uesrid) throws InterruptedException, IOException
	{
		ADTpages.Login Loginapp=new ADTpages.Login(driver);
		Loginapp.login_Medcare(Uesrid);
	}
	@Test(priority=2)
	@Parameters({"ReleaseTimePar","RemarksPar"})
	public void Tc_02_Verify_User_Can_Able_TO_Do_Bed_Blocking(String ReleaseTimePar,String RemarksPar) throws InterruptedException, IOException
	{
		ADTpages.BedBlocking BedBl=new ADTpages.BedBlocking(driver);
		BedBl.Bed_Blocking_Screen(ReleaseTimePar,RemarksPar);
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException 
	{

		
		recorder = new ATUTestRecorder(".//Videos//","BedBlockingTest-"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_BedBlocking"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}
