package OPDpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OPDTest.DeleteExcelRowWithSelenium;
import OPDTest.ReadExcelRowWithSelenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;




import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Book_Existing_appointment_against_department_quic_regi 
{

	WebDriver driver=null; 
	public Book_Existing_appointment_against_department_quic_regi(WebDriver driver) 
	{
		this.driver=driver;

	}
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//*[@id='2004']");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//Quick Registration
	By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

	//Basic Information
	//for all search same xpath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//PrimaryID
	By Primaryidclick=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Primaryidselectvalue=By.xpath("//span[contains(text(),' Passport ')]");

	//PrimaryIDnumber
	By PrimaryIDnumberclick=By.cssSelector("input[formcontrolname='primaryNumber']");

	//ExpiryDate
	By Expirydateclick=By.cssSelector("input[formcontrolname='expiryDate']");

	//Title
	By Titleclick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titleselectvalue=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");

	//Name 
	By Nameclick=By.cssSelector("input[formcontrolname='firstName']");

	//Gender
	By Genderclick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Genderselectvalue=By.xpath("//span[contains(text(),' FEMALE ')]");

	//DOB
	By DOBclick=By.cssSelector("input[ng-reflect-name='dateOfBirth']");

	//CountryCode
	By CountryCodeclick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodeselectvalue=By.xpath("//span[contains(text(),' +213 ')]");

	//MobielNo
	By Mobilenoclick=By.cssSelector("input[formcontrolname='mobileNumber']");

	//Encounter Details
	//EncounterType
	By EncoujnterTypeclick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
	By EncounterTypeselectvalue=By.xpath("//span[contains(text(),' New Case ')]");

	//SpecialityField
	By Specialityfieldclick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By Specialityfieldselect=By.xpath("//span[contains(text(),' General Surgery ')]");

	//Doctor
	By Doctorclick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By Doctorselect=By.xpath("//span[contains(text(),'Dr Edward Kerry')]");

	//Clinic
	By Clinicclick=By.cssSelector("mat-select[ng-reflect-name='clinic']");
	By Clinicselect=By.xpath("//span[contains(text(),'Consultation Room 1')]");

	//Counter 
	By Counterclick=By.cssSelector("mat-select[ng-reflect-name='cashCounter']");
	By Counterselect=By.xpath("//span[contains(text(),' REGISTRATION COUNTER 1 ')]");

	//ENcounter Remarks
	By EncounterRemarksclick=By.cssSelector("textarea[formcontrolname='remarks']");

	//Encounter Notes Button
	By EncounterNotesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Internal Note']");

	//Add Notes
	By AddNotesClick=By.cssSelector("input[ng-reflect-name='notes']");

	//Add Remark Button
	By AddRemarkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");

	//Close Button
	By CloseButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Close']");

	//Referral Details
	//Visit Reason
	By VisitReasonClick=By.cssSelector("mat-select[ng-reflect-name='visittype']");
	By VisitReasonSelOpt=By.xpath("//span[contains(text(),' Visit cancellation')]");

	//ReferralType
	By ReferralTypeClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelOpt=By.xpath("//span[contains(text(),' Emergency Referral ')]");

	//Referral
	By ReferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By ReferralSelOpt=By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain \")]");

	//Patient Category
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//span[contains(text(),' Senior Citizen ')]");

	//Encounter Notes
	By EncounterNotesClick=By.cssSelector("input[formcontrolname='practiceNotes']");

	//Patient Notes
	By PatientNotes=By.cssSelector("textarea[formcontrolname='reportRemarks']");

	//Referral Remarks
	By ReferralRemarksClick=By.cssSelector("textarea[formcontrolname='referralRemarks']");	

	//Tariff
	By Tariffclick12=By.cssSelector("mat-select[data-automation-attribute='encounterTariff0']");
	By Tariffselect12=By.xpath("//span[contains(text(),'Self Tariff')]");	

	//Add Payer Button
	By AddPayerButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");

	//Payer Type Click
	By PayerTypeClick=By.xpath("//*[@id='mat-select-value-71']");
	By PayerTypeSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Payer
	By PayerCLick=By.xpath("//*[@id='mat-select-value-73']"); 
	By PayerSelOpt=By.xpath("//span[contains(text(), 'Allianz Life Insurance Malaysia Berhad (PAYER003)')]");

	//Tariff2
	By Tariff22Click=By.xpath("//*[@id='mat-select-value-75']");
	By Tariff22Selopt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//Referral Details
	By doctor = By.xpath("//span[contains(text(),'Dr Edward Kerry')]");

    By doctorname = By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[3]/span");


	public  void Quick_Registration_Verification_n(String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException 
	{   

		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions act = new Actions(driver);
		//String kk = Quick_Registration.EnterPatientName;

		// Create object and take the data from another class
		ReadExcelRowWithSelenium  data = new ReadExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);
		
	
		
		
	//	Actions act = new Actions(driver);
		//Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		//Thread.sleep(2000);
		Thread.sleep(4000);
		driver.findElement(OPDMenu).click();
		
		  

		//Over the slide bar in OPD Screen
	    Thread.sleep(20000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(4000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(4000);
		driver.findElement(QuickRegistrationClick).click();
		
	
		
		/*

		WebElement mainmenu1 = wait.until(ExpectedConditions.elementToBeClickable(mainmenu));
		mainmenu1.click();
		
		WebElement OPDMenu1 = wait.until(ExpectedConditions.elementToBeClickable(OPDMenu));
		OPDMenu1.click();
		
		
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();

	//	WebElement overforopdslide11 = wait.until(ExpectedConditions.elementToBeClickable(SideBarMenu));
	//	act.moveToElement(overforopdslide11).build().perform();
		
		WebElement RegistrationMenu1 = wait.until(ExpectedConditions.elementToBeClickable(RegistrationMenu));
		RegistrationMenu1.click();
		//RegistrationMenu1.click();

		//driver.findElement(RegistrationMenu).click();
		WebElement QuickRegistrationClick1 = wait.until(ExpectedConditions.elementToBeClickable(QuickRegistrationClick));
		QuickRegistrationClick1.click();
		//driver.findElement(QuickRegistrationClick).click();

*/
		//Adding Basic Information
		//Primary Identification
		
	
		//Selecting Tariff
		WebElement Tariffclick121 = wait.until(ExpectedConditions.elementToBeClickable(Tariffclick12));
		Tariffclick121.click();
		
		
		//driver.findElement(QuickRegistrationClick).click();
		//driver.findElement(Tariffclick12).click();
		WebElement AllDropDownSearch1 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch1.sendKeys("Self Tariff");
		//driver.findElement(AllDropDownSearch)
		WebElement Tariffselect121 = wait.until(ExpectedConditions.elementToBeClickable(Tariffselect12));
		Tariffselect121.click();
		//driver.findElement(Tariffselect12).click();
		//Thread.sleep(2000);

		WebElement Primaryidclick1 = wait.until(ExpectedConditions.elementToBeClickable(Primaryidclick));
		Primaryidclick1.click();
	//	driver.findElement(Primaryidclick).click();

		WebElement AllDropDownSearch11 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch11.sendKeys("Passport");
		//driver.findElement(AllDropDownSearch)
		WebElement Primaryidselectvalue1 = wait.until(ExpectedConditions.elementToBeClickable(Primaryidselectvalue));
		Primaryidselectvalue1.click();
		//driver.findElement(Primaryidselectvalue).click();

		//Primary Id number
		WebElement PrimaryIDnumberclick1 = wait.until(ExpectedConditions.elementToBeClickable(PrimaryIDnumberclick));
		PrimaryIDnumberclick1.sendKeys(QuickPrimaryIdNumberPar);
		//driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar);
		//Expire Date
		//WebElement Expirydateclick1 = wait.until(ExpectedConditions.elementToBeClickable(Expirydateclick));
	   // Expirydateclick1.sendKeys(QuickExparyDatePar);
		///driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);

		//Title
		WebElement Titleclick1 = wait.until(ExpectedConditions.elementToBeClickable(Titleclick));
		Titleclick1.click();
		//driver.findElement(Titleclick).click();
		WebElement AllDropDownSearch16 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch16.sendKeys("Tan Sri Dato Seri");
		//driver.findElement(AllDropDownSearch)
		WebElement Titleselectvalue1 = wait.until(ExpectedConditions.elementToBeClickable(Titleselectvalue));
		Titleselectvalue1.click();
	//	driver.findElement(Titleselectvalue).click();
		//Add Full Name
		WebElement Nameclick1 = wait.until(ExpectedConditions.elementToBeClickable(Nameclick));
		Nameclick1.sendKeys(EnterPatientName);
		//driver.findElement(Nameclick)
		//Clicking on Gender   // QuickFullNamePar
		Thread.sleep(500);   
		//driver.findElement(Genderclick).click();
		//Thread.sleep(500);
		//driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		//Thread.sleep(500);
		//driver.findElement(Genderselectvalue).click();
		//Clicking on DOB
		WebElement DOBclick1 = wait.until(ExpectedConditions.elementToBeClickable(DOBclick));
		DOBclick1.sendKeys(QuickDateOfBirthPar);
		//driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		WebElement CountryCodeclick1 = wait.until(ExpectedConditions.elementToBeClickable(CountryCodeclick));
		CountryCodeclick1.click();
		//driver.findElement(CountryCodeclick).click();
		WebElement AllDropDownSearch0 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch0.sendKeys("+213");
		//driver.findElement(AllDropDownSearch)
		WebElement CountryCodeselectvalue1 = wait.until(ExpectedConditions.elementToBeClickable(CountryCodeselectvalue));
		CountryCodeselectvalue1.click();
		//Mobile Number
		WebElement Mobilenoclick1 = wait.until(ExpectedConditions.elementToBeClickable(Mobilenoclick));
		Mobilenoclick1.sendKeys(QuickMobileNumberPar);
	//	driver.findElement(Mobilenoclick)
		Thread.sleep(500);
		//Encounter Details
		//Encounter Type
		WebElement EncoujnterTypeclick1 = wait.until(ExpectedConditions.elementToBeClickable(EncoujnterTypeclick));
		EncoujnterTypeclick1.click();
		//driver.findElement(EncoujnterTypeclick).click();
		WebElement AllDropDownSearch15 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch15.sendKeys("New Case");
		//driver.findElement(AllDropDownSearch)
		WebElement EncounterTypeselectvalue1 = wait.until(ExpectedConditions.elementToBeClickable(EncounterTypeselectvalue));
		EncounterTypeselectvalue1.click();
		//driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		WebElement Specialityfieldclick1 = wait.until(ExpectedConditions.elementToBeClickable(Specialityfieldclick));
		Specialityfieldclick1.click();
		//driver.findElement(Specialityfieldclick).click();
		WebElement AllDropDownSearch443 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch443.sendKeys("General Surgery");
		
		//driver.findElement(AllDropDownSearch)
		WebElement Specialityfieldselect88 = wait.until(ExpectedConditions.elementToBeClickable(Specialityfieldselect));
		Specialityfieldselect88.click();
		//driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		
		WebElement Doctorclick44 = wait.until(ExpectedConditions.elementToBeClickable(Doctorclick));
		Doctorclick44.click();
/*
	//	driver.findElement(Doctorclick).click();
		WebElement AllDropDownSearch09 = wait.until(ExpectedConditions.elementToBeClickable(doctorname));
		AllDropDownSearch09.click();
		//driver.findElement(AllDropDownSearch)
		 * */
		Thread.sleep(2000);
		WebElement Doctorselect33 = wait.until(ExpectedConditions.elementToBeClickable(Doctorselect));
		Doctorselect33.click();
	
	//	driver.findElement(Doctorselect).click();
		//Selecting Clinic
		WebElement Clinicclick1 = wait.until(ExpectedConditions.elementToBeClickable(Clinicclick));
		Clinicclick1.click();
	//	driver.findElement(Clinicclick).click();
		WebElement AllDropDownSearch543 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch543.sendKeys("Consultation Room 1");
	//	driver.findElement(AllDropDownSearch)
		WebElement Clinicselect1 = wait.until(ExpectedConditions.elementToBeClickable(Clinicselect));
		Clinicselect1.click();
		//driver.findElement(Clinicselect).click();
		/*
		//Selecting Counter
		Thread.sleep(500);
		driver.findElement(Counterclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(500);
		driver.findElement(Counterselect).click();
		*/
		//Encounter Remarks
		WebElement EncounterRemarksclick1 = wait.until(ExpectedConditions.elementToBeClickable(EncounterRemarksclick));
		EncounterRemarksclick1.sendKeys(QuickEncounterRemarksPar);
		//driver.findElement(EncounterRemarksclick)

		//Clicking on Encounter Notes
		WebElement EncounterNotesButtonClick1 = wait.until(ExpectedConditions.elementToBeClickable(EncounterNotesButtonClick));
		EncounterNotesButtonClick1.click();
	//	driver.findElement(EncounterNotesButtonClick).click();
		//Adding Notes
		WebElement AddNotesClick1 = wait.until(ExpectedConditions.elementToBeClickable(AddNotesClick));
		AddNotesClick1.sendKeys(QuickAddNotesPar);
		//driver.findElement(AddNotesClick)
		//Clicking on Add Remark Button
		WebElement AddRemarkButtonClick1 = wait.until(ExpectedConditions.elementToBeClickable(AddRemarkButtonClick));
		AddRemarkButtonClick1.click();

		//Closing Dialog
		WebElement CloseButtonClick1 = wait.until(ExpectedConditions.elementToBeClickable(CloseButtonClick));
		CloseButtonClick1.click();

		//Referral Details
		//Visit Reason	
		WebElement VisitReasonClick1 = wait.until(ExpectedConditions.elementToBeClickable(VisitReasonClick));
		VisitReasonClick1.click();
	//	driver.findElement(VisitReasonClick).click();
		WebElement AllDropDownSearch337 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch337.sendKeys("Visit cancellation");
	//	driver.findElement(AllDropDownSearch)
		WebElement VisitReasonSelOpt1 = wait.until(ExpectedConditions.elementToBeClickable(VisitReasonSelOpt));
		VisitReasonSelOpt1.click();
	//	driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		WebElement ReferralTypeClick1 = wait.until(ExpectedConditions.elementToBeClickable(ReferralTypeClick));
		ReferralTypeClick1.click();
		//driver.findElement(ReferralTypeClick).click();
		WebElement AllDropDownSearch98 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch98.sendKeys("Emergency Referral");
		//driver.findElement(AllDropDownSearch)
		WebElement ReferralTypeSelOpt1 = wait.until(ExpectedConditions.elementToBeClickable(ReferralTypeSelOpt));
		ReferralTypeSelOpt1.click();
		//driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		WebElement ReferralClick1 = wait.until(ExpectedConditions.elementToBeClickable(ReferralClick));
		ReferralClick1.click();
		//driver.findElement(ReferralClick).click();
		WebElement AllDropDownSearch765 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch765.sendKeys("Dato' Dr. Jefri Zain");
		//driver.findElement(AllDropDownSearch)
		WebElement ReferralSelOpt1 = wait.until(ExpectedConditions.elementToBeClickable(ReferralSelOpt));
		ReferralSelOpt1.click();
		//driver.findElement(ReferralSelOpt).click();
		//Patient Category
		WebElement PatientCategoryClick1 = wait.until(ExpectedConditions.elementToBeClickable(PatientCategoryClick));
		PatientCategoryClick1.click();
		//driver.findElement(PatientCategoryClick).click();
		WebElement AllDropDownSearch654 = wait.until(ExpectedConditions.elementToBeClickable(AllDropDownSearch));
		AllDropDownSearch654.sendKeys("Senior Citizen");
		WebElement PatientCategorySelOpt1 = wait.until(ExpectedConditions.elementToBeClickable(PatientCategorySelOpt));
		PatientCategorySelOpt1.click();
		
		//driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		WebElement EncounterNotesClick1 = wait.until(ExpectedConditions.elementToBeClickable(EncounterNotesClick));
		EncounterNotesClick1.sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		WebElement PatientNotes1 = wait.until(ExpectedConditions.elementToBeClickable(PatientNotes));
		PatientNotes1.sendKeys(QuickPatientNotesPar);
		//Referral Remarks
		WebElement ReferralRemarksClick1 = wait.until(ExpectedConditions.elementToBeClickable(ReferralRemarksClick));
		ReferralRemarksClick1.sendKeys("Testing Referral Remarks");

		//Scrolling the web page
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();


		//Clicking on save button
		WebElement Saveclick1 = wait.until(ExpectedConditions.elementToBeClickable(Saveclick));
		Saveclick1.click();

		//Clicking on OK Button
		WebElement Saveconfirm1 = wait.until(ExpectedConditions.elementToBeClickable(Saveconfirm));
		Saveconfirm1.click();
		
		driver.findElement(Saveconfirm).click();
		
		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(2000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(2000);
	//	driver.findElement(EncounterListClick).click();



	}
}
