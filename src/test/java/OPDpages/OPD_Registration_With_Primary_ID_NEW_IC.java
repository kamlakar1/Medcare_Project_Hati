package OPDpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
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

public class OPD_Registration_With_Primary_ID_NEW_IC
{

	WebDriver driver=null;


	//By Search=By.xpath("mat-icon[mattooltip='Search']");
		By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
		By MainMenuTooltip=By.xpath("/html/body/div[2]");
		By OPDMenu=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[1]/div/img");
		By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
		By RegistrationMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]/a/span[1]");
		By subRegistration=By.xpath("//*[@id=\"2005\"]/span[1]");
		By PlusButton=By.xpath("//*[@id='Add Patient']");	

		
		//Basic Information

	
		//Locator of Primary Identification Drop down
		By PrimaryIdentificationClick=By.cssSelector("mat-select[formcontrolname='primaryId']");
		By PrimaryIdentificationselOpt=By.xpath("//div[@role='listbox']/mat-option[4]");

		//Primary Id Number
		By PrimaryIdNumber=By.cssSelector("input[formcontrolname='primaryNumber']");
		
		//Issuing country
		By Issuingcountryclick=By.cssSelector("mat-select[ng-reflect-name='issuedCountryPrimary']");
		By IssuingcountrySelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

		//Secondary Identification 
		By SecondaryIdentificationClick=By.cssSelector("mat-select[ng-reflect-name='secondaryId']");
		By SecondaryIdentificationSelOpt=By.xpath("//span[contains(text(),'Work Permit')]");

		//Secondary ID Number
		By SecondaryIDNumClick=By.cssSelector("input[ng-reflect-placeholder='Secondary Id Number']");
		//Secondary Expiray Date
		By SecExpirayDate=By.cssSelector("input[formcontrolname='secondaryExpirydate']");

		//Faculty selection
		By FacultyClick=By.cssSelector("mat-select[ng-reflect-name='faculty']");
		By FacultySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");	

		//Personal Information

		//Title
		By RegTitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
		By RegTitleSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");
		//Full Name
		By Fullname=By.cssSelector("input[data-placeholder='Full Name']");
		//gender
		By GenderClick=By.cssSelector("mat-select[ng-reflect-name='gender']");
		By GenderSelOpt=By.xpath("//div[@role='listbox']/mat-option[4]");

		//martial status
		By MaritalStatusClick=By.cssSelector("mat-select[ng-reflect-name='martial']");
		By MaritalStatusSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Religion
		By ReliginClick=By.cssSelector("mat-select[ng-reflect-name='religion']");
		By ReliginClickSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Date of Birth
		By DateOfBirth=By.cssSelector("input[ng-reflect-placeholder='Date of Birth']");

		//Deceased
		By Deceased=By.xpath("//*[@id='mat-checkbox-8']/label");

		//Patient category
		By RegPatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
		By RegPatientCategorySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Preferred Language
		By PreferredLanguageClick=By.cssSelector("mat-select[ng-reflect-name='preferredLanguage']");
		By PreferredLanguageSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//nationality
		By NationalityClick=By.cssSelector("mat-select[ng-reflect-name='nation']");
		By NationalitySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Mother name
		By MotherNameCLick=By.cssSelector("input[formcontrolname='motherName']");

		//Education
		By EducationClick=By.cssSelector("mat-select[ng-reflect-name='education']");
		By EducationSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Occupation
		By OccupationClick=By.cssSelector("mat-select[ng-reflect-name='occupation']");
		By OccupationSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Race
		By RaceClick=By.cssSelector("mat-select[ng-reflect-name='race']");
		By RaceSelOpt=By.xpath("//span[contains(text(),'Refugee')]");

		//Ethnic
		By EthnicClick=By.cssSelector("mat-select[ng-reflect-name='ethnic']");
		By EthnicSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Birth Place
		By BirthPlaceClick=By.cssSelector("input[formcontrolname='birthplace']");

		//Blood Group
		By BloodGroupClick=By.cssSelector("mat-select[ng-reflect-name='bloodGroup']");
		By BloodGroupSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Source
		By SourceClick=By.cssSelector("mat-select[ng-reflect-name='sourceType']");
		By comman=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Employment Status
		By EmploymentStatusClick=By.cssSelector("mat-select[ng-reflect-name='employmentStatus']");
		By EmploymentStatusSelOpt=By.xpath("//span[contains(text(),'Employed')]");

		//Patient Notes
		By PatientNotesClick=By.cssSelector("input[formcontrolname='patientNotes']");

		//Tab 1 Address and contact Details
		By AddressAndContactDetail=By.cssSelector("div[aria-controls='mat-tab-content-2-0']");

		//Address
		//Residential Address
		By ResAddress=By.cssSelector("input[ng-reflect-name='addressPrimary']");

		//Country
		By countryClick=By.cssSelector("mat-select[ng-reflect-name='countryPrimary']");
		By countrySelOpt=By.xpath("//span[contains(text(),' Malaysia ')]");	 

		//State
		By StateClick=By.cssSelector("mat-select[ng-reflect-name='statePrimary']");
		By StateSelOpt=By.xpath("//div[@role='listbox']/mat-option[4]");

		//City
		By cityClick=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
		By citySelopt=By.xpath("//div[@role='listbox']/mat-option[4]");

		//Area
		By AreaClick=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
		By AreaSelOpt=By.xpath("//span[contains(text(),'Pahang')]");

		//PostCode
		By PostCode=By.cssSelector("input[formcontrolname='pincodePrimary']");

		//Contact Information	

		//Country Code
		By CountryCodeClick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
		By CountryCodeSelOpt=By.xpath("//div[@role='listbox']/mat-option[4]");
		//Mobile Number
		By MobileNumberClick=By.cssSelector("input[formcontrolname='mobileNumber']");

		//RegSave
		By RegSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		
		//SaveConfirm
		By SaveConfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

		
//-----Encounter---//
		
		//Encounter Type
		By EncounterTypeClick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
		By EncounterTypeSelOpt=By.xpath("//div[@role='listbox']/mat-option[4]");

		//Specialty
		By SpecialityClick=By.cssSelector("mat-select[ng-reflect-name='department']");
		By SpecilitySelOPt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Doctor
		By DoctorClick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
		By doctoropts=By.xpath("//div[@role='listbox']/mat-option[3]");
		
		

		//Clinic
		By ClinicClick=By.cssSelector("mat-select[ng-reflect-name='clinic']");
		By ClinicSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Counter
		By CounterClick=By.cssSelector("mat-select[ng-reflect-name='cashCounter']");
		By CounterSelOpt=By.xpath("//span[contains(text(),'REGISTRATION COUNTER 1')]");

		//Encounter Remarks
		By EncounterRemarks=By.cssSelector("textarea[formcontrolname='remarks']");

		//Encounter Notes
		By EncounterNotes=By.cssSelector("mat-icon[ng-reflect-message='Encounter Notes']");

		//Add Notes
		By AddNotes=By.cssSelector("input[ng-reflect-placeholder='Add Notes']");

		//Add Remark Button
		By AddRemarkButton=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");

		//Close Button
		By CloseButton=By.cssSelector("mat-icon[ng-reflect-message='Close']");

		//Referral Details

		//VisitReason
		By VisitReasonClick=By.cssSelector("mat-select[ng-reflect-name='visittype']");
		By VisitReasonSelOpt=By.xpath("//span[contains(text(),'Consultation & Treatment')]");

		//Patient Category
		By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
		By PatientCategorySelOpt=By.xpath("//span[contains(text(),'Senior Citizen')]");

		//Referral Type
		By ReferralTypeClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
		By ReferralTypeSelOpt=By.xpath("//span[contains(text(),'Emergency Referral')]");

		//Referral
		By ReferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
		By ReferralSelOpt=By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain \")]");

		//Patient Notes
		By PatientNotes12=By.cssSelector("textarea[ng-reflect-name='reportRemarks']");

		//Referral Remarks
		By ReferralRemarks12=By.cssSelector("textarea[ng-reflect-name='referralRemarks']");

		//Adding new payer Details

		By addPayerButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");


		//selecting Tariff
		By TariffClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr/td[4]/mat-select/div/div[1]");
		By TariffSelOpt=By.xpath("//span[contains(text(),'Self Tariff')]");

		//Contract
		By ContractClick=By.cssSelector("mat-select[data-automation-attribute='encounterContract1']");
		By ContractSelOpt=By.xpath("//span[contains(text(),'Allianz Life Insurance Contract')]");

		//Policy Number
		By PolicyNumber=By.cssSelector("input[data-automation-attribute='encounterPolicyNumber0']");


		//Tab 2 Next Of Kin
		By NextKinTabClick=By.cssSelector("div[aria-controls='mat-tab-content-3-1']");

		//Next Of kin Details
		//Titles
		By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
		By TitleSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

		//Name
		By NameClick=By.cssSelector("input[formcontrolname='name']");

		//Identification Type
		By IdentificationTypeClick=By.cssSelector("mat-select[ng-reflect-name='identificationType']");
		By IdentificationTypeSelOpt=By.xpath("//span[contains(text(),'Passport')]");

		//Identification Number
		By IdNumber=By.cssSelector("input[formcontrolname='identificationNumber']");

		//Relation
		By RelationClick=By.cssSelector("mat-select[ng-reflect-name='relation']");
		By RelationSelOpt=By.xpath("//span[contains(text(),'Mother')]");

		//Phone Number
		By PhoneNumber=By.cssSelector("input[formcontrolname='phoneNumber']");

		//Address Details
		//Address
		By AddressNClick=By.cssSelector("input[formcontrolname='address']");

		//Selecting Country
		By CountryNClick=By.cssSelector("mat-select[ng-reflect-name='country']");
		By CountryNSelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

		//State
		By StateNClick=By.cssSelector("mat-select[ng-reflect-name='state']");
		By StateNSelOpt=By.xpath("//span[contains(text(),' Pulau Pinang ')]");

		//City
		By CityNClick=By.cssSelector("mat-select[ng-reflect-name='city']");
		By CityNSelOpt=By.xpath("//span[contains(text(),' Bukit Mertajam ')]");

		//Area
		By AreaNClick=By.cssSelector("mat-select[ng-reflect-name='district']");
		By AreaNSelOpt=By.xpath("//span[contains(text(),'None')]");

		//Postcode
		By PostCodeNClick=By.cssSelector("input[formcontrolname='postcode']");

		//Referral Button
		By ReferralNButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Referral']");

		//NOKAdd
		By NOKAdd=By.cssSelector("mat-icon[ng-reflect-message='Add Referral']");
		
		//EncounterSave
		By EncounterSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");

		//Ok Button
		By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		
		
		
	public OPD_Registration_With_Primary_ID_NEW_IC(WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPD_REG_PRIMARY_ID_NEW_IC(String PrimaryIdNumber12,String FullNamePar,String DateOfBirthPar,String PostCodePar,String ResidentialAddressPar,String MobileNumberPar,String NOKNamePar) throws InterruptedException, IOException, AWTException 
	{	  

		//Clicking on menu Icon
				Thread.sleep(2000);
				Actions act = new Actions(driver);
				Thread.sleep(8000);
				WebElement ele=driver.findElement(mainmenu);
				act.moveToElement(ele).build().perform();
				act.click(ele).perform();
				Thread.sleep(4000);
				driver.findElement(OPDMenu).click();

				//Over the slide bar in OPD Screen
				Thread.sleep(3000);
				WebElement overforopdslide1=driver.findElement(SideBarMenu);
				act.moveToElement(overforopdslide1).build().perform();
				Thread.sleep(5000);
				driver.findElement(RegistrationMenu).click();
				Thread.sleep(4000);
				//click on registration sub menu.
				driver.findElement(subRegistration).click();

				//Click on plus button
				Thread.sleep(2000);
				driver.findElement(PlusButton).click();

				Thread.sleep(5000);

				//Select Primary Identification drop down

				Thread.sleep(1000);
				driver.findElement(PrimaryIdentificationClick).click();
				Thread.sleep(3000);
				driver.findElement(PrimaryIdentificationselOpt).click();

				//Select Primary Id Number
				Date d=new Date(System.currentTimeMillis()+ System.nanoTime());
				Long id=d.getTime();
				Thread.sleep(1000);
				driver.findElement(PrimaryIdNumber).sendKeys(PrimaryIdNumber12+id);

				
				//filling Personal Information
				//Selecting Title
				driver.findElement(RegTitleClick).click();
				Thread.sleep(3000);
				driver.findElement(RegTitleSelOpt).click();

				//ENtering data in name filed
				Thread.sleep(1000);
				driver.findElement(Fullname).sendKeys(FullNamePar);

				//Selecting gender
				Thread.sleep(1000);
				driver.findElement(GenderClick).click();
				Thread.sleep(3000);
				driver.findElement(GenderSelOpt).click();

				//Selecting martial status
				Thread.sleep(1000);
				driver.findElement(MaritalStatusClick).click();
				Thread.sleep(3000);
				driver.findElement(MaritalStatusSelOpt).click();

				
				//date of birth
				Thread.sleep(1000);
				driver.findElement(DateOfBirth).sendKeys(DateOfBirthPar);

				//Patient category
				Thread.sleep(1000);
				driver.findElement(PatientCategoryClick).click();
				Thread.sleep(3000);
				driver.findElement(PatientCategorySelOpt).click();


				//Tab1

				//Clicking on tab Address and content details
				Thread.sleep(1000);
				//driver.findElement(AddressAndContactDetail).click();	

				//Scrolling the web page

				//Selecting Country
				/*Thread.sleep(1000);
				driver.findElement(countryClick).click();
				Thread.sleep(1000);
				driver.findElement(countrySelOpt).click();*/

				//Selecting State
				Thread.sleep(2000);
				driver.findElement(StateClick).click();
				Thread.sleep(2000);
				driver.findElement(StateSelOpt).click();

				//Selecting City
				Thread.sleep(1000);
				driver.findElement(cityClick).click();
				Thread.sleep(3000);
				driver.findElement(citySelopt).click();

				//Selecting Area
				/*Thread.sleep(1000);
				driver.findElement(AreaClick).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Pahang");
				Thread.sleep(1000);
				driver.findElement(AreaSelOpt).click();*/

				//Selecting Postcode
				Thread.sleep(1000);
				driver.findElement(PostCode).sendKeys(PostCodePar);
				//Residential Address
				Thread.sleep(2000);
				driver.findElement(ResAddress).sendKeys(ResidentialAddressPar);
				//Contact Information

				//Country Code
				Thread.sleep(1000);
			//	driver.findElement(CountryCodeClick).click();
				//Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("+255");
				//Thread.sleep(1000);
			//	driver.findElement(CountryCodeSelOpt).click();

				//Mobile Number
				Thread.sleep(1000);
				driver.findElement(MobileNumberClick).sendKeys(MobileNumberPar);

			
				//Clicking on save button	
				Thread.sleep(2000);
				driver.findElement(RegSave).click();

				//Clicking on ok dialog
				Thread.sleep(3000);
				driver.findElement(SaveConfirm).click();


				/*Thread.sleep(5000);
				String windowHandle = driver.getWindowHandle();

				//Get the list of window handles
				ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
				Thread.sleep(1000);
				driver.switchTo().window((String) tabs.get(0));*/

//---Encounter---//
				
				
				//Selecting Encounter Type
				Thread.sleep(1000);
				driver.findElement(EncounterTypeClick).click();
				Thread.sleep(3000);
				driver.findElement(EncounterTypeSelOpt).click();

				//Selecting Specialty
				Thread.sleep(1000);
				driver.findElement(SpecialityClick).click();
				Thread.sleep(3000);
				driver.findElement(SpecilitySelOPt).click();

				//Selecting Doctor
				Thread.sleep(1000);
				driver.findElement(DoctorClick).click();
				Thread.sleep(3000);
				driver.findElement(doctoropts).click();
				//Clinic
				Thread.sleep(1000);
				driver.findElement(ClinicClick).click();
				Thread.sleep(3000);
				driver.findElement(ClinicSelOpt).click();
				//Selecting Counter
				/*
				Thread.sleep(1000);
				driver.findElement(CounterClick).click();
				Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
				Thread.sleep(1000);
				driver.findElement(comman).click();
				//Encounter Remarks
				Thread.sleep(1000);
				driver.findElement(EncounterRemarks).sendKeys(EncounterRemarksPar);

				//Encounter Notes
				Thread.sleep(1000);
				driver.findElement(EncounterNotes).click();
				//Add Notes
				Thread.sleep(2000);
				driver.findElement(AddNotes).sendKeys(AddNotesPar);
				//Click on Add remark Button
				Thread.sleep(2000);
				driver.findElement(AddRemarkButton).click();
				//Click on close button  
				Thread.sleep(2000);
				driver.findElement(CloseButton).click();

				//Visit Reason
				Thread.sleep(1000);
				driver.findElement(VisitReasonClick).click();
				Thread.sleep(1000);
				driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
				Thread.sleep(1000);
				driver.findElement(VisitReasonSelOpt).click();

				//Patient Category
			Thread.sleep(1000);
			driver.findElement(PatientCategoryClick).click();
			Thread.sleep(1000);
			driver.findElement(PatientCategorySearch).sendKeys("Senior Citizen");
			Thread.sleep(1000);
			driver.findElement(PatientCategorySelOpt).click();
				//Referral type
				Thread.sleep(2000);
				driver.findElement(ReferralTypeClick).click();
				Thread.sleep(2000);
				driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
				Thread.sleep(2000);
				driver.findElement(ReferralTypeSelOpt).click();

				//Selecting referral
			Thread.sleep(1000);
			driver.findElement(ReferralClick).click();
			Thread.sleep(2000);
			driver.findElement(ReferralSearch).sendKeys("Dato' Dr. Jefri Zain");
			Thread.sleep(2000);
			driver.findElement(ReferralSelOpt).click();
			//Patient Notes
			Thread.sleep(1000);
			driver.findElement(PatientNotes12).sendKeys(PatientNotesPar);

			//Referral remarks
			Thread.sleep(1000);
			driver.findElement(ReferralRemarks12).sendKeys(ReferralRemarksPar);*/

				//Scrolling Encounter web page
				Thread.sleep(2000);
				Actions actions1 = new Actions(driver);
				actions1.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); 

				//Adding new Payer

				/*//Clicking on New payer button
				Thread.sleep(2000);
				driver.findElement(addPayerButtonClick).click();

				//Clicking on Payer Type
				Thread.sleep(2000);
				driver.findElement(PayerTypeClick).click();
				Thread.sleep(3000);
				driver.findElement(AllDropDownSearch).sendKeys("Insurance(PAYTYPE002)");
				Thread.sleep(2000);
				driver.findElement(PayerTypeSelOpt).click();	

				//Payer
				Thread.sleep(2000);
				driver.findElement(PayerClick).click();
				//Thread.sleep(3000);
				//driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad (PAYER002)");
				Thread.sleep(2000);
				driver.findElement(PayerSelOpt).click();

				/*driver.findElement(PayerClick).click();
				Thread.sleep(2000);
				driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad (PAYER002)");
				Thread.sleep(2000);
				driver.findElement(PayerSelOpt).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

				//Insurance Tariff2
				Thread.sleep(2000);
				driver.findElement(TariffInsuranceClick).click();
				Thread.sleep(2000);
				driver.findElement(AllDropDownSearch).sendKeys("Insurance Tariff");
				Thread.sleep(2000);
				driver.findElement(TariffInsuranceSelOpt).click();

				//COntract
				Thread.sleep(2000);
				driver.findElement(ContractClick).click();
				Thread.sleep(3000);
				driver.findElement(AllDropDownSearch).sendKeys("Allianz Life Insurance Contract");
				Thread.sleep(2000);
				driver.findElement(ContractSelOpt).click();

				//Policy Number
				Thread.sleep(2000);
				driver.findElement(PolicyNumber).sendKeys("653241");*/

				//selecting Tariff	 
				Thread.sleep(2000);
				driver.findElement(TariffClick).click();
				Thread.sleep(2000);
				driver.findElement(TariffSelOpt).click();



				//Tab 2 Next Of Kin
				//Clicking on Tab
				Thread.sleep(2000);
				driver.findElement(NextKinTabClick).click();

				//Next Of Kin details
				//Titles
				Thread.sleep(1000);
				driver.findElement(TitleClick).click();
				Thread.sleep(3000);
				driver.findElement(TitleSelOpt).click();
				
				//NOKName
				Thread.sleep(3000);
				driver.findElement(NameClick).sendKeys(NOKNamePar);
				
				
				//NOKAdd
				Thread.sleep(3000);
				driver.findElement(NOKAdd).click();

				
				//EncounterSave
				Thread.sleep(3000);
				driver.findElement(EncounterSave).click();
				
				//Ok Button
				Thread.sleep(3000);
				driver.findElement(OkButtonClick).click();
				

				
	}



}
