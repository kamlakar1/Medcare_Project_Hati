package MRDTest;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Login;

import LabPages.OPD_registration;

import io.github.bonigarcia.wdm.WebDriverManager;
public class OPD_registration_Test 
{
	public WebDriver driver;	
	@Test	
	@Parameters({"Uesrid"})
	
public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplication(String Uesrid) throws InterruptedException, IOException
{
		Login Loginapp=new Login(driver);
		 Loginapp.login_Medcare(Uesrid);
		 
}
 @Test
 @Parameters({"PrimaryIdNumber12","ExparyDatePar","FullNamePar","DateOfBirthPar","PostCodePar","ResidentialAddressPar","MobileNumberPar"})

  public void TC_02_Verify_That_User_Is_Able_Fill_The_Basic_Information_To_Registration_Page(String PrimaryIdNumber12,String ExparyDatePar,String FullNamePar,String DateOfBirthPar,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar) throws InterruptedException, IOException, AWTException 
  {
	  OPD_registration registration=new OPD_registration(driver);
	  registration.OPD_REGISTRATION(PrimaryIdNumber12,ExparyDatePar,FullNamePar,DateOfBirthPar,PostCodePar,ResidentialAddressPar,MobileNumberPar);	  
}
  @BeforeTest
  public void startBrowser() 
  {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://medcare-productqa.hatiintl.com/");
      //driver.close();
      //driver.quit();
  }
 
  
}
