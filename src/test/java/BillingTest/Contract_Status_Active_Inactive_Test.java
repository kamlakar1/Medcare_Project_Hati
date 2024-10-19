package BillingTest;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import BillingPages.Contract_Status_Active_Inactive_Page;
import BillingPages.OPCharge_Advance_Search_Page;
import OPDpages.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contract_Status_Active_Inactive_Test {
	
	ATUTestRecorder recorder;
	public static WebDriver driver=null;
	

	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();

	
	@Test
	  @Parameters({"Uesrid"})
	  public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	  {
		  
		  Login LoginScreen=new Login(driver);
		  LoginScreen.login_Medcare(Uesrid);
		  
	  }
	

  @Test
  @Parameters({"ContractCodePar","DescriptionPar","ReferenceNoPar","ValidToPar","CoPayNumberPar","ServiceDesPar"})
  public void TC_02_User_Able_To_Create_Contract(String ContractCodePar,String DescriptionPar,String ReferenceNoPar,String ValidToPar,String CoPayNumberPar,String ServiceDesPar) throws InterruptedException, IOException, AWTException 
  
  {
	  Contract_Status_Active_Inactive_Page ContractStatus=new Contract_Status_Active_Inactive_Page(driver);
	  ContractStatus.ContractCreate(ContractCodePar,DescriptionPar,ReferenceNoPar,ValidToPar,CoPayNumberPar,ServiceDesPar);
	  
  }
  
  @BeforeTest
  
  public void startBrowser() throws ATUTestRecorderException, InterruptedException 
  {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		Thread.sleep(8000);
		driver.manage().window().maximize(); 
		recorder = new ATUTestRecorder(".//Videos//","Contract_Status_Active_Inactive_Test"+dateFormat.format(date),false);
		recorder.start();
   
   
	  
  }
      
  @AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		// driver =new ChromeDriver();
		//driver.quit();
		recorder.stop();;
      
  }
}