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
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAdmissionWithVIPPatient_NewIC_Test {

	ATUTestRecorder recorder;
	private ConfigReader configReader;
	public static WebDriver driver=null;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();

	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	{
		//Login
		ADTpages.Login LoginScreen=new ADTpages.Login(driver);
		LoginScreen.login_Medcare(Uesrid);
	}
	@Test(priority=2)
	@Parameters({"PriNumberPar", "PatientNamePar", "MobilePar", "EmailPar", "LengthPar", "RegAddressPar", "NamePar", "IdentificationNOPar", "PhoneNumberPar", "AddressPar", "ZipCodePar"})
	public void TC_02_User_Able_To_Do_Admission_With_VIP_NewIC(String PriNumberPar, String PatientNamePar,String MobilePar,String EmailPar,String LengthPar,String RegAddressPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar,String ZipCodePar) throws InterruptedException, IOException
	{
		ADTpages.NewAdmissionWithVIPPatient_NewIC VIPAdmissionNewIC=new ADTpages.NewAdmissionWithVIPPatient_NewIC(driver);
		VIPAdmissionNewIC.AdmissionWithVIPPatientNewIC (PriNumberPar, PatientNamePar, MobilePar, EmailPar, LengthPar, RegAddressPar, NamePar, IdentificationNOPar, PhoneNumberPar, AddressPar, ZipCodePar);
	}
	@BeforeTest 
	public void startBrowser() throws ATUTestRecorderException, InterruptedException 
	{
		recorder = new ATUTestRecorder(".//Videos//","NewAdmissionWithVIPPatient_NewIC"+dateFormat.format(date),false);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_NewAdmissionWithVIPPatient_NewIC_Test"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}