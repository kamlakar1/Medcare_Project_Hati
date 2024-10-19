package OPDpages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OPDTest.DeleteExcelRowWithSelenium;
public class Quick_Registration_For_Existing_Patient_with_Passport 
{
	WebDriver driver=null; 
	public Quick_Registration_For_Existing_Patient_with_Passport(WebDriver driver) 
	{
		this.driver=driver;

	}
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]/a");
	
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//Quick Registration
	By QuickRegistrationClick=By.cssSelector("a[ng-reflect-router-link='patient,patient-sampleregistra']");

	//Basic Information
	//for all search same xpath
	By AllDropDownSearch=By.xpath("//div[@role='listbox']/mat-option[2]");

	//PrimaryID
	By Primaryidclick=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Primaryidselectvalue=By.xpath("//div[@role='listbox']/mat-option[2]");

	//PrimaryIDnumber
	By PrimaryIDnumberclick=By.cssSelector("input[formcontrolname='primaryNumber']");

	//ExpiryDate
	By Expirydateclick=By.cssSelector("input[formcontrolname='expiryDate']");

	//Title
	By Titleclick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titleselectvalue=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Name 
	By Nameclick=By.cssSelector("input[formcontrolname='firstName']");

	//Gender
	By Genderclick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Genderselectvalue=By.xpath("//div[@role='listbox']/mat-option[4]");

	//DOB
	By DOBclick=By.cssSelector("input[ng-reflect-name='dateOfBirth']");

	//CountryCode
	By CountryCodeclick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodeselectvalue=By.xpath("//div[@role='listbox']/mat-option[4]");

	//MobielNo
	By Mobilenoclick=By.cssSelector("input[formcontrolname='mobileNumber']");

	//Encounter Details
	//EncounterType
	By EncoujnterTypeclick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
	By EncounterTypeselectvalue=By.xpath("//div[@role='listbox']/mat-option[4]");

	//SpecialityField
	By Specialityfieldclick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By Specialityfieldselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//SpecialityField
		By Specialityfieldclick2=By.cssSelector("mat-select[ng-reflect-name='department']");
		By Specialityfieldselect2=By.xpath("//div[@role='listbox']/mat-option[14]");
	
	//Doctor
	By Doctorclick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By Doctorselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Doctor
	By Doctorclick2=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By Doctorselect2=By.xpath("//div[@role='listbox']/mat-option[5]");
	
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
	By VisitReasonSelOpt=By.xpath("//span[contains(text(),'Visit cancellation')]");

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
	By Tariffselect12=By.xpath("//div[@role='listbox']/mat-option[3]");

	
	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	
	
	
	//EncounterList
	By EncounterListClick2=By.xpath("//span[contains(text(),'Encounter List')]");

	//Quick
	By QuickRegistrationClick2=By.xpath("//span[contains(text(),'Quick Registration')]");

	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[1]");
	
	//---2nd Encounter--//

	//AdvanceSearch 
	By Advancesearchclick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	
	//MRN
	By MRN=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	//SearchClick
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	//SAVE2
	By SAVE2=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//COnfirm2
	By Confirm2=By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	

	public void Quick_Registration_With_Existing_With_Passport(String QuickPrimaryIdNumberPar,String EnterPatientNamePar,String QuickExparyDatePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException 
	{
		//Clicking on menu Icon
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		//Thread.sleep(2000);
		Thread.sleep(4000);
		driver.findElement(OPDMenu).click();
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(4000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(4000);
		driver.findElement(QuickRegistrationClick).click();

		//Details
		Thread.sleep(3000);
		driver.findElement(Primaryidclick).click();
		Thread.sleep(3000);
		driver.findElement(Primaryidselectvalue).click();

		//Primary Id number
		Thread.sleep(3000);
		driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar);
		
		//Expire Date
		/*Thread.sleep(500);
		driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);*/

		//Title
		Thread.sleep(2000);
		driver.findElement(Titleclick).click();
		Thread.sleep(2000);
		driver.findElement(Titleselectvalue).click();
		//Add Full Name
		Thread.sleep(2000);
		driver.findElement(Nameclick).sendKeys(EnterPatientNamePar);
		
		//Gender 
		Thread.sleep(500);   
		driver.findElement(Genderclick).click();
		Thread.sleep(500);
		driver.findElement(Genderselectvalue).click();
		//Clicking on DOB
		Thread.sleep(3000);
		driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		Thread.sleep(2000);
		driver.findElement(CountryCodeclick).click();
		Thread.sleep(2000);
		driver.findElement(CountryCodeselectvalue).click();
		//Mobile Number
		Thread.sleep(2000);
		driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);
		
		//Encounter Details
		//Encounter Type
		Thread.sleep(2000);
		driver.findElement(EncoujnterTypeclick).click();
		Thread.sleep(2000);
		driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		Thread.sleep(2000);
		driver.findElement(Specialityfieldclick).click();
		Thread.sleep(2000);
		driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(Doctorclick).click();
		Thread.sleep(2000);
		driver.findElement(Doctorselect).click();
		
		
		
		//Selecting Clinic
		/*Thread.sleep(2000);
		driver.findElement(Clinicclick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(500);
		driver.findElement(Clinicselect).click();
		//Selecting Counter
		/*
		 * Thread.sleep(500); driver.findElement(Counterclick).click();
		 * Thread.sleep(500);
		 * driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		 * Thread.sleep(500); driver.findElement(Counterselect).click();
		 
		//Encounter Remarks
		Thread.sleep(500);
		driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);

		//Clicking on Encounter Notes
		Thread.sleep(500);
		driver.findElement(EncounterNotesButtonClick).click();
		//Adding Notes
		Thread.sleep(500);
		driver.findElement(AddNotesClick).sendKeys(QuickAddNotesPar);
		//Clicking on Add Remark Button
		Thread.sleep(500);
		driver.findElement(AddRemarkButtonClick).click();

		//Closing Dialog
		Thread.sleep(500);
		driver.findElement(CloseButtonClick).click();

		//Referral Details
		//Visit Reason	
		Thread.sleep(500);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Visit cancellation");
		Thread.sleep(500);
		driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		Thread.sleep(500);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(500);
		driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		Thread.sleep(500);
		driver.findElement(ReferralClick).click();
		Thread.sleep(5000);
		driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
		Thread.sleep(5000);
		driver.findElement(ReferralSelOpt).click();
		//Patient Category
		Thread.sleep(5000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(500);
		driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		Thread.sleep(500);
		driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		Thread.sleep(500);
		driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);
		//Referral Remarks
		Thread.sleep(500);
		driver.findElement(ReferralRemarksClick).sendKeys("Testing Referral Remarks");*/

		//Scrolling the web page
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		
		//Tariffclick12
		Thread.sleep(3000);
		driver.findElement(Tariffclick12).click();
		
		//Tariffselect12
		Thread.sleep(3000);
		driver.findElement(Tariffselect12).click();

		//Clicking on save button
		Thread.sleep(500);
		driver.findElement(Saveclick).click();

		//Clicking on OK Button
		Thread.sleep(500);
		driver.findElement(Saveconfirm).click();

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(2000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();


		Thread.sleep(2000);
		driver.findElement(EncounterListClick).click();

		
		//Get the list of window handles

		Thread.sleep(3000);
		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs2.get(2));

		
		//CreatedMRN
		Thread.sleep(2000);
		WebElement MRNSearch=driver.findElement(CreatedMRN);
		String MRNS=MRNSearch.getText();

		System.out.println("MRN"+MRNS);

		//SideBAR
		Thread.sleep(2000);
		WebElement overforopdslide3=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide3).build().perform();

		//Quick
		Thread.sleep(2000);
		driver.findElement(QuickRegistrationClick2).click();

		Thread.sleep(3000);
		ArrayList<Object> tabs3 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs3.get(3));

		
		
		//Details
				Thread.sleep(3000);
				driver.findElement(Primaryidclick).click();
				Thread.sleep(3000);
				driver.findElement(Primaryidselectvalue).click();

				//Primary Id number
				Thread.sleep(3000);
				driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar);
				
				//Expire Date
				/*Thread.sleep(500);
				driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);*/

				//Title
				Thread.sleep(2000);
				driver.findElement(Titleclick).click();
				Thread.sleep(2000);
				driver.findElement(Titleselectvalue).click();
				//Add Full Name
				Thread.sleep(2000);
				driver.findElement(Nameclick).sendKeys(EnterPatientNamePar);
				
				//Gender 
				Thread.sleep(500);   
				driver.findElement(Genderclick).click();
				Thread.sleep(500);
				driver.findElement(Genderselectvalue).click();
				//Clicking on DOB
				Thread.sleep(3000);
				driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
				//Country Code
				Thread.sleep(2000);
				driver.findElement(CountryCodeclick).click();
				Thread.sleep(2000);
				driver.findElement(CountryCodeselectvalue).click();
				//Mobile Number
				Thread.sleep(2000);
				driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);
				
				//Encounter Details
				//Encounter Type
				Thread.sleep(2000);
				driver.findElement(EncoujnterTypeclick).click();
				Thread.sleep(2000);
				driver.findElement(EncounterTypeselectvalue).click();

		//SpecilitY
		Thread.sleep(3000);
		driver.findElement(Specialityfieldclick2).click();
		Thread.sleep(2000);
		driver.findElement(Specialityfieldselect2).click();
		
		//Doctor
		Thread.sleep(3000);
		driver.findElement(Doctorclick2).click();
		Thread.sleep(2000);
		driver.findElement(Doctorselect2).click();


		//Tariffclick12
		Thread.sleep(3000);
		driver.findElement(Tariffclick12).click();
				
		//Tariffselect12
		Thread.sleep(3000);
		driver.findElement(Tariffselect12).click();
		
		
		//SAVE2
		Thread.sleep(2000);
		driver.findElement(SAVE2).click();
		Thread.sleep(2000);
		driver.findElement(Confirm2).click();


		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs4 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs4.get(0));


		//SideBar
		Thread.sleep(3000);
		WebElement overforopdslide4=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide4).build().perform();

		Thread.sleep(1000);

	}
}
