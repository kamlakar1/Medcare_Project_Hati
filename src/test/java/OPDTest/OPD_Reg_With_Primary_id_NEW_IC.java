package OPDTest;

import java.awt.AWTException;
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
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OPD_Reg_With_Primary_id_NEW_IC 
{
	WebDriver driver;
	private ConfigReader configReader;
	ATUTestRecorder recorder;

	


@Test	
@Parameters({"Uesrid"})

	public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplication(String Uesrid) throws InterruptedException, IOException
	{
		OPDpages.Login Loginapp=new OPDpages.Login(driver);
		Loginapp.login_Medcare(Uesrid);

	}
	@Test
	 @Parameters({"PrimaryIdNumber12","FullNamePar","DateOfBirthPar","PostCodePar","ResidentialAddressPar","MobileNumberPar","NOKNamePar"})
	public void TC_02_User_Can_Select_Primary_ID_AS_NEW_IC(String PrimaryIdNumber12,String FullNamePar,String DateOfBirthPar,String PostCodePar,String ResidentialAddressPar,String MobileNumberPar,String NOKNamePar) throws InterruptedException, IOException, AWTException 
	{
		OPDpages.OPD_Registration_With_Primary_ID_NEW_IC NewIc=new OPDpages.OPD_Registration_With_Primary_ID_NEW_IC(driver);
		NewIc.OPD_REG_PRIMARY_ID_NEW_IC(PrimaryIdNumber12,FullNamePar,DateOfBirthPar,PostCodePar,ResidentialAddressPar,MobileNumberPar,NOKNamePar);
		
	}
	
	@BeforeTest
	  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
	  {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","OPD_Reg_With_Primary_id_NEW_IC -"+dateFormat.format(date),false);
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
		// driver =new ChromeDriver();
		driver.quit();
		recorder.stop();
	}

}
