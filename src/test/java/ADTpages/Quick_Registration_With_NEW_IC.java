package ADTpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
public class Quick_Registration_With_NEW_IC 
{
	WebDriver driver=null; 
	public Quick_Registration_With_NEW_IC(WebDriver driver) 
	{
		this.driver=driver;

	}
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//Quick Registration
	By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

	//Basic Information
	//for all search same xpath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//PrimaryID
	By Primaryidclick=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Primaryidselectvalue=By.xpath("//span[contains(text(),'New IC')]");

	//PrimaryIDnumber
	By PrimaryIDnumberclick=By.cssSelector("input[formcontrolname='primaryNumber']");

	//ExpiryDate
	//By Expirydateclick=By.cssSelector("input[formcontrolname='expiryDate']");

	//Title
	By Titleclick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titleselectvalue=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Name 
	By Nameclick=By.cssSelector("input[formcontrolname='firstName']");

	//Gender
	By Genderclick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Genderselectvalue=By.xpath("//span[contains(text(),' MALE ')]");

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
	By Doctorselect=By.xpath("//div[@role='listbox']/mat-option[3]");

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
	By VisitReasonSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//ReferralType
	By ReferralTypeClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Referral
	By ReferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By ReferralSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Patient Category
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Encounter Notes
	By EncounterNotesClick=By.cssSelector("input[formcontrolname='practiceNotes']");

	//Patient Notes
	By PatientNotes=By.cssSelector("textarea[formcontrolname='reportRemarks']");

	//Referral Remarks
	By ReferralRemarksClick=By.cssSelector("textarea[formcontrolname='referralRemarks']");	

	//Tariff
	By Tariffclick12=By.xpath("//tbody[@role='rowgroup']/tr/td[4]");
	By Tariffselect12=By.xpath("//span[contains(text(),'Self Tariff')]");	

	//Add Payer Button
	By AddPayerButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");

	//Payer Type Click
	By PayerTypeClick=By.xpath("//tr[@class='mat-row cdk-row ng-star-inserted'][2]/td[2]");
	By PayerTypeSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Payer
	By PayerCLick=By.xpath("//tr[@class='mat-row cdk-row ng-star-inserted'][2]/td[3]"); 
	By PayerSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Tariff2
	By Tariff22Click=By.xpath("//tr[@class='mat-row cdk-row ng-star-inserted'][2]/td[3]");
	By Tariff22Selopt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//Policy number
	By PolicyNoClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[8]/input");

	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//Referral Details

	By ADT=By.xpath("//img[contains(@src,'../../../assets/images/master-icons/adt.png')]");
	//AddButton
	By AddButton=By.cssSelector("mat-icon[ng-reflect-message='Add Admission Request']");
	//PrimaryIdentification
	By PriID=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Prisearch=By.cssSelector("input[aria-label='dropdown search']");
	By Priselect=By.xpath("//span[contains(text(),'Passport')]");
	//PriNumber
	By PriNumber=By.cssSelector("input[ng-reflect-name='primaryDocNo']");
	//Name
	By Name=By.cssSelector("input[ng-reflect-name='fullName']");
	//ExpiryDate
	By ExpiryDate=By.cssSelector("input[ng-reflect-placeholder='Expiry Date']");
	//Title
	By Title=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titlesearch=By.cssSelector("input[aria-label='dropdown search']");
	By Titleselect=By.xpath("//span[contains(text(),\"Tan Sri Dato'\")]");
	//Gender
	By Gender=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Gendersearch=By.cssSelector("input[aria-label='dropdown search']");
	By Genderselect=By.xpath("//span[contains(text(),'MALE')]");
	//DOB
	By DOB=By.cssSelector("input[ng-reflect-name='dob']");
	//Mobile 
	By Mobile=By.cssSelector("input[ng-reflect-name='mobileNo']");
	//Email
	By Email=By.cssSelector("input[ng-reflect-name='emailId']");
	//AdmittingDoctor
	By Admdoctor=By.cssSelector("mat-select[ng-reflect-name='primaryCareDoc']");
	By AdmDctsearch=By.cssSelector("input[aria-label='dropdown search']");
	By AdmDctselect=By.xpath("//div[@role='listbox']/mat-option[3]");
	//AdmittingDepartment 
	By AdmDepartment=By.cssSelector("mat-select[ng-reflect-name='primaryCareDept']");
	By AdmDepsearch=By.cssSelector("input[aria-label='dropdown search']");
	By AdmDepselect=By.xpath("//span[contains(text(),'Cardiology')]");
	//AttendingDoctor
	By AttendDoctor=By.cssSelector("mat-select[ng-reflect-name='attendingCareDoc']");
	By AttendDctsearch=By.cssSelector("input[aria-label='dropdown search']");
	By AttendDctselect=By.xpath("//span[contains(text(),'Dr. Salina Yusof')]");
	//ReferringDoctor
	By ReferringDoctor=By.cssSelector("mat-select[ng-reflect-name='refferingDoc']");
	By ReferringDctsearch=By.cssSelector("input[aria-label='dropdown search']");
	By ReferringDctselect=By.xpath("//span[contains(text(),'Dr. James Raman')]");
	//AdmissionType
	By Admissiontype=By.cssSelector("mat-select[ng-reflect-name='typeOfAdmission']");
	By Admissiontypesearch=By.cssSelector("input[aria-label='dropdown search']");
	By Admissiontypeselect=By.xpath("//span[contains(text(),'Elective')]");
	//ReasonAdmission
	By ReasonAdmission=By.cssSelector("mat-select[ng-reflect-name='reasonOfAdmission']");
	By ReasonAdmsearch=By.cssSelector("input[aria-label='dropdown search']");
	By ReasonAdmselect=By.xpath("//span[contains(text(),'Admitted')]");
	//DOA
	By DOA=By.cssSelector("input[ng-reflect-name='DOA']");
	//Length
	By Length=By.cssSelector("input[ng-reflect-name='ELS'");
	//FinancialClass
	By Financialclass=By.cssSelector("mat-select[ng-reflect-name='financialClass']");
	By Financialsearch=By.cssSelector("input[aria-label='dropdown search']");
	By Financialselect=By.xpath("//span[contains(text(),'Third Class')]");
	//BedCategory 
	By Bedcategory=By.cssSelector("mat-select[ng-reflect-name='bedCategory']");
	By Bedcatsearch=By.cssSelector("input[aria-label='dropdown search']");
	By Bedcatselect=By.xpath("//span[contains(text(),'4-Bedded')]");
	//PayerType
	By Payertype=By.cssSelector("mat-select[ng-reflect-name='paymentEntitlement']");
	By Payertypesearch=By.cssSelector("input[aria-label='dropdown search']");
	By Payertypeselect=By.xpath("//span[contains(text(),'Insurance')]");
	//Notes
	By Notes=By.cssSelector("input[ng-reflect-name='notes']");
	//Remarks 
	By Remarks=By.cssSelector("input[ng-reflect-name='remarks'");
	//Save 
	By Save=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	//ConfirmButton
	By ConfirmButton=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Edit 
	By Edit=By.cssSelector("mat-icon[ng-reflect-message='Save Admission']");
	//Registered Radio button
	By RegisteredButtonClick=By.cssSelector("mat-radio-button[ng-reflect-value='registered']");
	//Advance Search
	By AdvancedSearchclick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRD Field
	By MRNTextClick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button Click
	By SearchButtonClick=By.cssSelector("button[ng-reflect-message='Search']");
	//patient MRN From Encounter List
	By PatientMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[1]");

	//Race
	By RaceClick=By.cssSelector("mat-select[ng-reflect-name='race']");
	By RaceSelOpt=By.xpath("//span[contains(text(),'Health Touris')]");
	//By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
	public void Quick_Registration_Verification_With_New_IC(String QuickPrimaryIdNumberPar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException 
	{

		//Clicking on menu Icon
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(8000);
		driver.findElement(OPDMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(10000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(3000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(3000);
		driver.findElement(QuickRegistrationClick).click();

		//Adding Basic Information
		Thread.sleep(5000);




		//Selecting Tariff
		Thread.sleep(3000);
		driver.findElement(Tariffclick12).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariffselect12).click();



		//Primary Identification
		Thread.sleep(2000);
		driver.findElement(Primaryidclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("New IC");
		Thread.sleep(2000);
		driver.findElement(Primaryidselectvalue).click();



		//Primary Id number
		Thread.sleep(2000);
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());

		String id=String.valueOf(d.getTime());

		driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar+id);

		//Expire Date
		//Thread.sleep(2000);
		//driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);
		//Title
		Thread.sleep(2000);
		driver.findElement(Titleclick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(2000);
		driver.findElement(Titleselectvalue).click();


		Thread.sleep(1000);
		driver.findElement(Nameclick).sendKeys(QuickFullNamePar);
		
		

		//Clicking on Gender
		Thread.sleep(1000);
		driver.findElement(Genderclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("MALE");
		Thread.sleep(2000);
		driver.findElement(Genderselectvalue).click();



/*
		Thread.sleep(1000);
		driver.findElement(RaceClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Health Tourist");
		Thread.sleep(1000);
		driver.findElement(RaceSelOpt).click();
*/



		//Clicking on DOB
		Thread.sleep(1000);
		driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		Thread.sleep(2000);
		driver.findElement(CountryCodeclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(2000);
		driver.findElement(CountryCodeselectvalue).click();
		//Mobile Number
		Thread.sleep(1000);
		driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);

		//Encounter Details
		//Encounter Type
		Thread.sleep(1000);
		driver.findElement(EncoujnterTypeclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(2000);
		driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		Thread.sleep(2000);
		driver.findElement(Specialityfieldclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(2000);
		driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(Doctorclick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(2000);
		driver.findElement(Doctorselect).click();
		//Selecting Clinic
		Thread.sleep(1000);
		driver.findElement(Clinicclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(2000);
		driver.findElement(Clinicselect).click();
		//Selecting Counter
		/*
		Thread.sleep(1000);
		driver.findElement(Counterclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(2000);
		driver.findElement(Counterselect).click();

		 */
		//Encounter Remarks
		Thread.sleep(1000);
		driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);

		//Clicking on Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesButtonClick).click();
		//Adding Notes
		Thread.sleep(2000);
		driver.findElement(AddNotesClick).sendKeys(QuickAddNotesPar);
		//Clicking on Add Remark Button
		Thread.sleep(2000);
		driver.findElement(AddRemarkButtonClick).click();

		//Closing Dialog
		Thread.sleep(2000);
		driver.findElement(CloseButtonClick).click();

		//Referral Details
		//Visit Reason	
		Thread.sleep(1000);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
		Thread.sleep(2000);
		driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		Thread.sleep(1000);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(2000);
		driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		Thread.sleep(1000);
		driver.findElement(ReferralClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
		Thread.sleep(2000);
		driver.findElement(ReferralSelOpt).click();
		//Patient Category
		Thread.sleep(1000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(2000);
		driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		Thread.sleep(1000);
		driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);

		//Referral Remarks
		Thread.sleep(1000);
		driver.findElement(ReferralRemarksClick).sendKeys("Testing Referral Remarks");
		/*		
		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Adding payer clicking on plus button
		Thread.sleep(2000);
		driver.findElement(AddPayerButtonClick).click();

		//Payer Type
		Thread.sleep(2000);
		driver.findElement(PayerTypeClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Insurance (PAYTYPE002)");
		Thread.sleep(2000);
		driver.findElement(PayerTypeSelOpt).click();

		//Payer
		Thread.sleep(2000);
		driver.findElement(PayerCLick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad(PAYER002)");
		Thread.sleep(2000);
		driver.findElement(PayerSelOpt).click();

		//Policy number
		Thread.sleep(2000);
		driver.findElement(PolicyNoClick).sendKeys("23698");

		//Selecting Tariff second
		Thread.sleep(2000);
		driver.findElement(Tariff22Click).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Insurance Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariff22Selopt).click();
		 */


		//Clicking on save button
		Thread.sleep(2000);
		driver.findElement(Saveclick).click();

		//Clicking on OK Button
		Thread.sleep(2000);
		driver.findElement(Saveconfirm).click();


		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(10000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(3000);
		driver.findElement(EncounterListClick).click();

		Thread.sleep(3000);
		WebElement PTMRN=driver.findElement(PatientMRN);
		String PatientMRN=PTMRN.getText();
		System.out.println("MRN From ENcounter list"+PatientMRN);

		Thread.sleep(5000);

		driver.findElement(mainmenu).click();
		//ADT
		Thread.sleep(3000);
		driver.findElement(ADT).click();

		//Condition


		//AddButton
		Thread.sleep(6000);
		driver.findElement(AddButton).click();



		//Clicking on Registered Radio button
		Thread.sleep(2000);
		driver.findElement(RegisteredButtonClick).click();

		//Clicking on Advanced search
		Thread.sleep(2000);
		driver.findElement(AdvancedSearchclick).click();

		//Sending MRN
		Thread.sleep(2000);
		driver.findElement(MRNTextClick).sendKeys(PatientMRN);

		//Clicking on Search button
		Thread.sleep(2000);
		driver.findElement(SearchButtonClick).click();


	}
	public void Quick_Registration_Verification_With_old_IC(String QuickPrimaryIdNumberPar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException 
	{

		//Clicking on menu Icon
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(8000);
		driver.findElement(OPDMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(10000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(3000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(3000);
		driver.findElement(QuickRegistrationClick).click();

		//Adding Basic Information
		Thread.sleep(5000);




		//Selecting Tariff
		Thread.sleep(3000);
		driver.findElement(Tariffclick12).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariffselect12).click();



		//Primary Identification
		Thread.sleep(2000);
		driver.findElement(Primaryidclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Old IC");
		Thread.sleep(2000);
		driver.findElement(Primaryidselectvalue).click();



		//Primary Id number
		Thread.sleep(2000);
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());

		String id=String.valueOf(d.getTime());

		driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar+id);

		//Expire Date
		//Thread.sleep(2000);
		//driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);
		//Title
		Thread.sleep(2000);
		driver.findElement(Titleclick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(2000);
		driver.findElement(Titleselectvalue).click();


		Thread.sleep(1000);
		driver.findElement(Nameclick).sendKeys(QuickFullNamePar);


		//Clicking on Gender
		Thread.sleep(1000);
		driver.findElement(Genderclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("MALE");
		Thread.sleep(2000);
		driver.findElement(Genderselectvalue).click();

		//Clicking on DOB
		Thread.sleep(1000);
		driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		Thread.sleep(2000);
		driver.findElement(CountryCodeclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(2000);
		driver.findElement(CountryCodeselectvalue).click();
		//Mobile Number
		Thread.sleep(1000);
		driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);

		//Encounter Details
		//Encounter Type
		Thread.sleep(1000);
		driver.findElement(EncoujnterTypeclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(2000);
		driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		Thread.sleep(2000);
		driver.findElement(Specialityfieldclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(2000);
		driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(Doctorclick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(2000);
		driver.findElement(Doctorselect).click();
		//Selecting Clinic
		Thread.sleep(1000);
		driver.findElement(Clinicclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(2000);
		driver.findElement(Clinicselect).click();
		//Selecting Counter
		/*
		Thread.sleep(1000);
		driver.findElement(Counterclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(2000);
		driver.findElement(Counterselect).click();

		 */
		//Encounter Remarks
		Thread.sleep(1000);
		driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);

		//Clicking on Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesButtonClick).click();
		//Adding Notes
		Thread.sleep(2000);
		driver.findElement(AddNotesClick).sendKeys(QuickAddNotesPar);
		//Clicking on Add Remark Button
		Thread.sleep(2000);
		driver.findElement(AddRemarkButtonClick).click();

		//Closing Dialog
		Thread.sleep(2000);
		driver.findElement(CloseButtonClick).click();

		//Referral Details
		//Visit Reason	
		Thread.sleep(1000);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
		Thread.sleep(2000);
		driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		Thread.sleep(1000);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(2000);
		driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		Thread.sleep(1000);
		driver.findElement(ReferralClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
		Thread.sleep(2000);
		driver.findElement(ReferralSelOpt).click();
		//Patient Category
		Thread.sleep(1000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(2000);
		driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		Thread.sleep(1000);
		driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);

		//Referral Remarks
		Thread.sleep(1000);
		driver.findElement(ReferralRemarksClick).sendKeys("Testing Referral Remarks");
		/*		
		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Adding payer clicking on plus button
		Thread.sleep(2000);
		driver.findElement(AddPayerButtonClick).click();

		//Payer Type
		Thread.sleep(2000);
		driver.findElement(PayerTypeClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Insurance (PAYTYPE002)");
		Thread.sleep(2000);
		driver.findElement(PayerTypeSelOpt).click();

		//Payer
		Thread.sleep(2000);
		driver.findElement(PayerCLick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad(PAYER002)");
		Thread.sleep(2000);
		driver.findElement(PayerSelOpt).click();

		//Policy number
		Thread.sleep(2000);
		driver.findElement(PolicyNoClick).sendKeys("23698");

		//Selecting Tariff second
		Thread.sleep(2000);
		driver.findElement(Tariff22Click).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Insurance Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariff22Selopt).click();
		 */


		//Clicking on save button
		Thread.sleep(2000);
		driver.findElement(Saveclick).click();

		//Clicking on OK Button
		Thread.sleep(2000);
		driver.findElement(Saveconfirm).click();


		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(10000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(3000);
		driver.findElement(EncounterListClick).click();

		Thread.sleep(3000);
		WebElement PTMRN=driver.findElement(PatientMRN);
		String PatientMRN=PTMRN.getText();
		System.out.println("MRN From ENcounter list"+PatientMRN);

		Thread.sleep(5000);

		driver.findElement(mainmenu).click();
		//ADT
		Thread.sleep(3000);
		driver.findElement(ADT).click();

		//Condition


		//AddButton
		Thread.sleep(6000);
		driver.findElement(AddButton).click();



		//Clicking on Registered Radio button
		Thread.sleep(2000);
		driver.findElement(RegisteredButtonClick).click();

		//Clicking on Advanced search
		Thread.sleep(2000);
		driver.findElement(AdvancedSearchclick).click();

		//Sending MRN
		Thread.sleep(2000);
		driver.findElement(MRNTextClick).sendKeys(PatientMRN);

		//Clicking on Search button
		Thread.sleep(2000);
		driver.findElement(SearchButtonClick).click();


	}
	public void Quick_Registration_Verification_With_passport_IC(String QuickPrimaryIdNumberPar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException 
	{

		//Clicking on menu Icon
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(8000);
		driver.findElement(OPDMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(10000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(3000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(3000);
		driver.findElement(QuickRegistrationClick).click();

		//Adding Basic Information
		Thread.sleep(5000);




		//Selecting Tariff
		Thread.sleep(3000);
		driver.findElement(Tariffclick12).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariffselect12).click();



		//Primary Identification
		Thread.sleep(2000);
		driver.findElement(Primaryidclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(2000);
		driver.findElement(Primaryidselectvalue).click();



		//Primary Id number
		Thread.sleep(2000);
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());

		String id=String.valueOf(d.getTime());

		driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar+id);

		//Expire Date
		//Thread.sleep(2000);
		//driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);
		//Title
		Thread.sleep(2000);
		driver.findElement(Titleclick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(2000);
		driver.findElement(Titleselectvalue).click();


		Thread.sleep(1000);
		driver.findElement(Nameclick).sendKeys(QuickFullNamePar);


		//Clicking on Gender
		Thread.sleep(1000);
		driver.findElement(Genderclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("MALE");
		Thread.sleep(2000);
		driver.findElement(Genderselectvalue).click();

		//Clicking on DOB
		Thread.sleep(1000);
		driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		Thread.sleep(2000);
		driver.findElement(CountryCodeclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(2000);
		driver.findElement(CountryCodeselectvalue).click();
		//Mobile Number
		Thread.sleep(1000);
		driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);

		//Encounter Details
		//Encounter Type
		Thread.sleep(1000);
		driver.findElement(EncoujnterTypeclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(2000);
		driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		Thread.sleep(2000);
		driver.findElement(Specialityfieldclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(2000);
		driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(Doctorclick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(2000);
		driver.findElement(Doctorselect).click();
		//Selecting Clinic
		Thread.sleep(1000);
		driver.findElement(Clinicclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(2000);
		driver.findElement(Clinicselect).click();
		//Selecting Counter
		/*
		Thread.sleep(1000);
		driver.findElement(Counterclick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(2000);
		driver.findElement(Counterselect).click();

		 */
		//Encounter Remarks
		Thread.sleep(1000);
		driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);

		//Clicking on Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesButtonClick).click();
		//Adding Notes
		Thread.sleep(2000);
		driver.findElement(AddNotesClick).sendKeys(QuickAddNotesPar);
		//Clicking on Add Remark Button
		Thread.sleep(2000);
		driver.findElement(AddRemarkButtonClick).click();

		//Closing Dialog
		Thread.sleep(2000);
		driver.findElement(CloseButtonClick).click();

		//Referral Details
		//Visit Reason	
		Thread.sleep(1000);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
		Thread.sleep(2000);
		driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		Thread.sleep(1000);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(2000);
		driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		Thread.sleep(1000);
		driver.findElement(ReferralClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
		Thread.sleep(2000);
		driver.findElement(ReferralSelOpt).click();
		//Patient Category
		Thread.sleep(1000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(2000);
		driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		Thread.sleep(1000);
		driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);

		//Referral Remarks
		Thread.sleep(1000);
		driver.findElement(ReferralRemarksClick).sendKeys("Testing Referral Remarks");
		/*		
		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Adding payer clicking on plus button
		Thread.sleep(2000);
		driver.findElement(AddPayerButtonClick).click();

		//Payer Type
		Thread.sleep(2000);
		driver.findElement(PayerTypeClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Insurance (PAYTYPE002)");
		Thread.sleep(2000);
		driver.findElement(PayerTypeSelOpt).click();

		//Payer
		Thread.sleep(2000);
		driver.findElement(PayerCLick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad(PAYER002)");
		Thread.sleep(2000);
		driver.findElement(PayerSelOpt).click();

		//Policy number
		Thread.sleep(2000);
		driver.findElement(PolicyNoClick).sendKeys("23698");

		//Selecting Tariff second
		Thread.sleep(2000);
		driver.findElement(Tariff22Click).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Insurance Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariff22Selopt).click();
		 */


		//Clicking on save button
		Thread.sleep(2000);
		driver.findElement(Saveclick).click();

		//Clicking on OK Button
		Thread.sleep(2000);
		driver.findElement(Saveconfirm).click();


		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(10000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		Thread.sleep(3000);
		driver.findElement(EncounterListClick).click();

		Thread.sleep(3000);
		WebElement PTMRN=driver.findElement(PatientMRN);
		String PatientMRN=PTMRN.getText();
		System.out.println("MRN From ENcounter list"+PatientMRN);

		Thread.sleep(5000);

		driver.findElement(mainmenu).click();
		//ADT
		Thread.sleep(3000);
		driver.findElement(ADT).click();

		//Condition


		//AddButton
		Thread.sleep(6000);
		driver.findElement(AddButton).click();



		//Clicking on Registered Radio button
		Thread.sleep(2000);
		driver.findElement(RegisteredButtonClick).click();

		//Clicking on Advanced search
		Thread.sleep(2000);
		driver.findElement(AdvancedSearchclick).click();

		//Sending MRN
		Thread.sleep(2000);
		driver.findElement(MRNTextClick).sendKeys(PatientMRN);

		//Clicking on Search button
		Thread.sleep(2000);
		driver.findElement(SearchButtonClick).click();


	}

}
