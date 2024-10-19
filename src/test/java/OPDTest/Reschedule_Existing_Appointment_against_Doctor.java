package OPDTest;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.hibernate.validator.internal.util.logging.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ADTTest.ConfigReader;
import OPDpages.ExistingAppointment;
import OPDpages.Login;
import OPDpages.NewAppointMent;
import OPDpages.OPD_Registration_Encounter;
import OPDpages.OPD_registration;
import OPDpages.Quick_Registration;
import OPDpages.Reschedul_Existing_Appointmet;
import OPDpages.RescheduleAppointment;
import OPDpages.Book_Existing_appointment_against_department_quic_regi;
import OPDpages.Book_Reschedule_ExistingAppointment;
import OPDpages.Reschedule_New_AppointMent;
import OPDpages.Reschedule_existing_appointment_against_doctor_Quick_Registration;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class Reschedule_Existing_Appointment_against_Doctor 
{
	 WebDriver driver ;
		private ConfigReader configReader;
	ATUTestRecorder recorder;

	
	@Test(priority =1)
	@Parameters({"Uesrid"})

	public void TC_01_verify_That_User_Is_Able_To_Login_MedcareApplication(String Uesrid) throws InterruptedException, IOException
	{
		Login Loginapp=new Login(driver);
		Loginapp.login_Medcare(Uesrid);
	
	}
	
	@Test(priority = 2)
	@Parameters({"QuickPrimaryIdNumberPar","QuickExparyDatePar","QuickDateOfBirthPar","QuickMobileNumberPar","QuickEncounterRemarksPar","QuickAddNotesPar","QuickEncounterNotesPar","QuickPatientNotesPar","QuickReferralRemarksPar"})
	public void TC_02_Verify_That_User_Is_Able_To_Do_Quick_Registration_to_book_the_existing_appointmet(String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException
	{
		Book_Existing_appointment_against_department_quic_regi depexiQuickReg=new Book_Existing_appointment_against_department_quic_regi (driver);
		depexiQuickReg.Quick_Registration_Verification_n(QuickPrimaryIdNumberPar,QuickExparyDatePar,QuickDateOfBirthPar,QuickMobileNumberPar,QuickEncounterRemarksPar,QuickAddNotesPar,QuickEncounterNotesPar,QuickPatientNotesPar,QuickReferralRemarksPar);
		
	}
	@Test(priority = 3)
	@Parameters({"AppointmenttypeA", "consultationA", "specialityA", "EmailA", "WorkcontctA", "HomecontactA", "RemarksA" })
	public void TC_03_Verify_that_user_is_able_to_book_the_Existing_appointment(String AppointmenttypeA, String consultationA, String specialityA, String EmailA, String WorkcontctA, String HomecontactA, String RemarksA)throws InterruptedException, AWTException, IOException {
		Book_Reschedule_ExistingAppointment BookExitingAppointment = new Book_Reschedule_ExistingAppointment(driver);
		BookExitingAppointment.ExitingAppontmetfunc(AppointmenttypeA, consultationA,specialityA, EmailA, WorkcontctA, HomecontactA, RemarksA);
	}


	@Test(priority =4)
	//@Parameters({"selectgender"})
	
	public void TC_04_Verify_That_User_Is_Able_Reshcedule_the_appointment() throws InterruptedException, IOException, AWTException 
	{
		Reschedul_Existing_Appointmet Rescheduleexapp=new Reschedul_Existing_Appointmet(driver);
		Rescheduleexapp.Resheduleappointmetfunc();	  
		Thread.sleep(10000);
	}
	
	@BeforeTest
	public void beforeTest() throws InterruptedException, ATUTestRecorderException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","Reschedule_Existing_Appointment_against_Doctor -"+dateFormat.format(date),false);
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
