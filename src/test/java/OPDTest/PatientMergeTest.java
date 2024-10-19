package OPDTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ADTTest.ConfigReader;
import OPDpages.LoginA;
import OPDpages.PatientMerger;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PatientMergeTest {

	WebDriver driver;
	private ConfigReader configReader;
	ATUTestRecorder recorder;

	

	@Test
	@Parameters({"Uesrid"})
	public void TC_01_Verify_User_Login(String Uesrid) throws InterruptedException, IOException 

	{

		LoginA LoginScreen=new LoginA(driver);
		LoginScreen.LoginMedcare(Uesrid);
	}
	@Test
	@Parameters({"PatientMRNPar","PatientMRNPar2","RemarksPar"})
	public void TC_02_User_Can_Do_Patient_Merge(String PatientMRNPar,String PatientMRNPar2,String RemarksPar) throws InterruptedException, IOException
	{
		PatientMerger Merge=new PatientMerger(driver);
		Merge.PatientMerge(PatientMRNPar, PatientMRNPar2,RemarksPar);
		Thread.sleep(10000);
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","PatientMergeTest -"+dateFormat.format(date),false);
		recorder.start();
		configReader = new ConfigReader();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(configReader.getBaseUrl());
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//Thread.sleep(8000);
		driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void afterTest() throws ATUTestRecorderException { 
		//driver =new ChromeDriver();
		driver.quit();
		recorder.stop();
	}
}