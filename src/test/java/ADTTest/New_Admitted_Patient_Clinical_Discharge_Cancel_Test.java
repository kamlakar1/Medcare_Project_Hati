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
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Admitted_Patient_Clinical_Discharge_Cancel_Test {

	ATUTestRecorder recorder;
	private ConfigReader configReader;
	 WebDriver driver;
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
	@Parameters({"PriNumberPar","PatientNamePar","ExpiryDatePar","DOBPar","MobilePar","EmailPar","LengthPar","NotesPar","RemarksPar","RegAddressPar","LengthOfStayPar","AdmittingDiagPar","AddNotesPar","PatientNotesPar","AdmissionRemarksPar","BillEstimationPar","ReferralRemarksPar","NamePar","IdentificationNOPar","PhoneNumberPar","AddressPar","ZipCodePar","InstructionPar","ClincialRemarksPar","CancelRemarksPar"})
	public void TC_02_User_Able_To_Do_Clinical_Discharge_Cancel(String PriNumberPar,String PatientNamePar,String ExpiryDatePar,String DOBPar,String MobilePar,String EmailPar,String LengthPar,String NotesPar,String RemarksPar,String RegAddressPar,String LengthOfStayPar,String AdmittingDiagPar,String AddNotesPar,String PatientNotesPar,String AdmissionRemarksPar,String BillEstimationPar,String ReferralRemarksPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar,String ZipCodePar,String InstructionPar,String ClincialRemarksPar,String CancelRemarksPar) throws InterruptedException, IOException
	{
		ADTpages.Admitted_Patient_Cancel_Clinical_Discharge ClinicalCancelDischarge=new ADTpages.Admitted_Patient_Cancel_Clinical_Discharge(driver);
		ClinicalCancelDischarge.AdmittedPatientClinicalDischargeCancel(PriNumberPar,PatientNamePar,ExpiryDatePar,DOBPar,MobilePar,EmailPar,LengthPar,NotesPar,RemarksPar,RegAddressPar,LengthOfStayPar,AdmittingDiagPar,AddNotesPar,PatientNotesPar,AdmissionRemarksPar,BillEstimationPar,ReferralRemarksPar,NamePar,IdentificationNOPar,PhoneNumberPar,AddressPar,ZipCodePar,InstructionPar,ClincialRemarksPar,CancelRemarksPar);
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
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failure_New_Admitted_Patient_Clinical_Discharge_Cancel_Test"+ dateFormat.format(date)));
		}
	}
	@AfterSuite
	public void quitBrowser() throws ATUTestRecorderException
	{
		driver.quit();
		recorder.stop();
	}
}