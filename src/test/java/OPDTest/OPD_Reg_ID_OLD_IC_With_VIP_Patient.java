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

public class OPD_Reg_ID_OLD_IC_With_VIP_Patient  {
 WebDriver driver ;
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
@Parameters({"PrimaryIdNumber12","SecondaryIdNumber12","SecondaryExparyDatePar","DateOfBirthPar","MotherNamePar","PatientNotes","ResidentialAddressPar","PostCodePar","MobileNumberPar","Emailpar","PersonalFaxpar","WorkFaxpar","WorkContactNopar","HomeContactNopar","EmploymentNoPar","WorkFromPar","ContactNumberPar","ResAddPar","PostCodePar12","Healthtouristcodepar","AgentIdNoPar","AgentNamePar","StartDatePar","EndDatePar","ContactNoPar4","EmailIdPar4","Address23Par","PostCodePar34"})
public void TC_02_Verify_That_User_Is_Able_Fill_The_Basic_Information_To_Registration_Page_WIth_VIP_Patient_for_OLD_IC(String PrimaryIdNumber12,String SecondaryIdNumber12,String SecondaryExparyDatePar,String DateOfBirthPar,String MotherNamePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String EmploymentNoPar,String WorkFromPar,String ContactNumberPar,String ResAddPar,String PostCodePar12,String Healthtouristcodepar,String AgentIdNoPar,String AgentNamePar,String StartDatePar,String EndDatePar,String ContactNoPar4,String EmailIdPar4,String Address23Par,String PostCodePar34) throws InterruptedException, IOException, AWTException 
{
	OPDpages.OPD_Reg_WIth_OLD_IC_With_VIP_Patient   reg=new OPDpages.OPD_Reg_WIth_OLD_IC_With_VIP_Patient (driver);
	  reg.OPD_Reg_With_OLD_IC_VIP_Patient(PrimaryIdNumber12,SecondaryIdNumber12,SecondaryExparyDatePar,DateOfBirthPar,MotherNamePar,PatientNotes,ResidentialAddressPar,PostCodePar,MobileNumberPar,Emailpar,PersonalFaxpar,WorkFaxpar,WorkContactNopar,HomeContactNopar,EmploymentNoPar,WorkFromPar,ContactNumberPar,ResAddPar,PostCodePar12,Healthtouristcodepar,AgentIdNoPar,AgentNamePar,StartDatePar,EndDatePar,ContactNoPar4,EmailIdPar4,Address23Par,PostCodePar34);	  
}
@Test
@Parameters({"EncounterRemarksPar","AddNotesPar","NamePar","IdentificationNOPar","PhoneNoPar","AddressPar","PostcodeParAdetailsPar"})
public void TC_03_Verify_That_User_Is_Able_TO_Fill_Encounter_Details(String EncounterRemarksPar,String AddNotesPar,String NamePar,String IdentificationNOPar,String PhoneNoPar,String AddressPar,String PostcodeParAdetailsPar) throws InterruptedException, IOException, AWTException
{
	  OPDpages.OPD_Registration_Encounter enc=new OPDpages.OPD_Registration_Encounter(driver);
	  enc.Encounter(EncounterRemarksPar,AddNotesPar,NamePar,IdentificationNOPar,PhoneNoPar,AddressPar,PostcodeParAdetailsPar);
} 
@BeforeTest
public void startBrowser() throws ATUTestRecorderException, InterruptedException 
{
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	recorder = new ATUTestRecorder(".//Videos//","OPD_Reg_ID_OLD_IC_With_VIP_Patient -"+dateFormat.format(date),false);
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
