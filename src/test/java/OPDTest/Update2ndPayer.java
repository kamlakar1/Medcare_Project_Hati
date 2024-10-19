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
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Update2ndPayer  {
 WebDriver driver ;
	private ConfigReader configReader;
	ATUTestRecorder recorder;


  @Test
  @Parameters({"Uesrid"})
  public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplicationogin(String Uesrid) throws InterruptedException, IOException 
  {
	//Login
	  OPDpages.Login LoginScreen=new OPDpages.Login(driver);
	  LoginScreen.login_Medcare(Uesrid);
  }
  
	  
@Test
@Parameters({"MRNSearchPar","PolicyNumberPar","EffectivedatePar","MRNSearchPar2","PolicyNumberPar2","EffectivedatePar2"})
public void TC_02_Verify_That_User_Able_to_Update_sponsor_2Payer(String MRNSearchPar,String PolicyNumberPar,String EffectivedatePar,String MRNSearchPar2,String PolicyNumberPar2,String EffectivedatePar2) throws InterruptedException, IOException
{
	//UpdateSponsorFlow 
	
	 OPDpages.UpdateSponsorWith2Payers UpdateComSponsor2 =new OPDpages.UpdateSponsorWith2Payers(driver);
	 UpdateComSponsor2.UpdateSponsor2(MRNSearchPar,PolicyNumberPar,EffectivedatePar,MRNSearchPar2,PolicyNumberPar2,EffectivedatePar2); 
	 
}


@BeforeTest
public void startBrowser() throws ATUTestRecorderException, InterruptedException 
{
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	recorder = new ATUTestRecorder(".//Videos//","Update2ndPayer -"+dateFormat.format(date),false);
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