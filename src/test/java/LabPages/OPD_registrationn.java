package LabPages;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import OPDTest.DeleteExcelRowWithSelenium;
import OPDTest.ReadExcelRowWithSelenium;

public class OPD_registrationn
{
	//private static final By UploadImhe = null;


	WebDriver driver=null;

	By pushcell = By.xpath("//span[contains(text(),' Pus cells ')]");
	By bill = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[4]/a");

	By mainmenuuu = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	
	//	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	//By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	
	//Image Uploading
	//Clicking for Uploading
	

	//Basic Information
	By name_3 = By.cssSelector("input[ng-reflect-placeholder='Patient Name']");
	//for all search same xpath
	
	


	//Personal Information

	//Title
	//By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	//By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
	//Full Name
	

	
	//Patient category
	//By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	//By PatientCategorySelOpt=By.xpath("//span[contains(text(),'Senior Citizen')]");

	

	By ServiceSelect1=By.xpath("//span[contains(text(),'Urinalysis')]");


	//AddButton

	

	//Race
	//By RaceClick=By.cssSelector("mat-select[ng-reflect-name='race']");
	//By RaceSelOpt=By.xpath("//span[contains(text(),'Chinese')]");

	
	
	

	


	// =======================================
	// Encounter details

	
	
	
	
	
	By RaceClick=By.cssSelector("mat-select[ng-reflect-name='race']");
	By RaceSelOpt=By.xpath("//span[contains(text(),'Refugee')]");

	//By Documenttab4Click=By.cssSelector("div[aria-controls='mat-tab-content-1-3']");

	By Documenttab4Click=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[3]/form/mat-tab-group/mat-tab-header/div/div/div/div[4]");



	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By mainmenu2=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[2]");
	By MainMenuTooltip=By.xpath("/html/body/div[2]");
	By OPDMenu=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[1]/div/img");
	//	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	//By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By RegistrationMenu=By.xpath("//*[@id='2004']");

	By subRegistration=By.xpath("//*[@id='2005']");
	By PlusButton=By.xpath("//*[@id='Add Patient']");	

	//Image Uploading
	//Clicking for Uploading
	By ClickImageUplaod=By.xpath("//*[@id=\"registration\"]/form/div[1]/div/div[1]/div/img");
	By UploadImageClick=By.xpath("//*[@id=\"btnUploadPhoto\"][3]");
	By SaveButtonClickIamge=By.xpath("//*[@id=\"mat-dialog-0\"]/app-camera-dialog/div/div[2]/div[2]/div[2]/button[3]");

	//Basic Information

	//for all search same xpath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//Locator of Primary Identification Drop down
	By PrimaryIdentificationClick=By.cssSelector("mat-select[formcontrolname='primaryId']");
	By PrimaryIdentificationselOpt=By.xpath("//span[contains(text(),'Passport')]");

	//Primary Id Number
	By PrimaryIdNumber=By.cssSelector("input[formcontrolname='primaryNumber']");
	//ExpirayDate
	By ExpirayDate=By.cssSelector("input[formcontrolname='expiryDate']");

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
	By FacultySelOpt=By.xpath("//span[contains(text(),'FAKULTI KEMANUSIAAN, SENI DAN WARISAN')]");	

	//Personal Information

	//Title
	//By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	//By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
	//Full Name
	By Fullname=By.cssSelector("input[data-placeholder='Full Name']");
	//gender
	By GenderClick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By GenderSelOpt=By.xpath("//span[contains(text(),'FEMALE')]");

	//martial status
	By MaritalStatusClick=By.cssSelector("mat-select[ng-reflect-name='martial']");
	By MaritalStatusSelOpt=By.xpath("//span[contains(text(),' Married ')]");

	//Religion
	By ReliginClick=By.cssSelector("mat-select[ng-reflect-name='religion']");
	By ReliginClickSelOpt=By.xpath("//span[contains(text(),'Islam')]");

	//Date of Birth
	By DateOfBirth=By.cssSelector("input[ng-reflect-placeholder='Date of Birth']");

	//Deceased
	By Deceased=By.xpath("//*[@id='mat-checkbox-8']/label");

	//Patient category
	//By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	//By PatientCategorySelOpt=By.xpath("//span[contains(text(),'Senior Citizen')]");

	//Preferred Language
	By PreferredLanguageClick=By.cssSelector("mat-select[ng-reflect-name='preferredLanguage']");
	By PreferredLanguageSelOpt=By.xpath("//span[contains(text(),'Mandarin')]");

	//nationality
	By NationalityClick=By.cssSelector("mat-select[ng-reflect-name='nation']");
	By NationalitySelOpt=By.xpath("//span[contains(text(),'Albania')]");

	//Mother name
	By MotherNameCLick=By.cssSelector("input[formcontrolname='motherName']");

	//Education
	By EducationClick=By.cssSelector("mat-select[ng-reflect-name='education']");
	By EducationSelOpt=By.xpath("//span[contains(text(),'Bachelor of Medicine and Bachelor of Surgery (MBBS)')]");

	//Occupation
	By OccupationClick=By.cssSelector("mat-select[ng-reflect-name='occupation']");
	By OccupationSelOpt=By.xpath("//span[contains(text(),'Mining')]");

	//Race
	//By RaceClick=By.cssSelector("mat-select[ng-reflect-name='race']");
	//By RaceSelOpt=By.xpath("//span[contains(text(),'Chinese')]");

	//Ethnic
	By EthnicClick=By.cssSelector("mat-select[ng-reflect-name='ethnic']");
	By EthnicSelOpt=By.xpath("//span[contains(text(),' Malay ')]");

	//Birth Place
	By BirthPlaceClick=By.cssSelector("input[formcontrolname='birthplace']");

	//Blood Group
	By BloodGroupClick=By.cssSelector("mat-select[ng-reflect-name='bloodGroup']");
	By BloodGroupSelOpt=By.xpath("//span[contains(text(),'A RhD positive (A+)')]");

	//Source
	By SourceClick=By.cssSelector("mat-select[ng-reflect-name='sourceType']");
	By SourceSelOpt=By.xpath("//span[contains(text(),'Exhibition')]");

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
	By StateSelOpt=By.xpath("//span[contains(text(),'Negeri Sembilan')]");

	//City
	By cityClick=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
	By citySelopt=By.xpath("//span[contains(text(),'Seremban')]");

	//Area
	By AreaClick=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
	By AreaSelOpt=By.xpath("//span[contains(text(),'None')]");

	//PostCode
	By PostCode=By.cssSelector("input[formcontrolname='pincodePrimary']");

	//Contact Information	

	//Country Code
	By CountryCodeClick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodeSelOpt=By.xpath("//span[contains(text(),' +213 ')]");
	//Mobile Number
	By MobileNumberClick=By.cssSelector("input[formcontrolname='mobileNumber']");

	//Relation
	//	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='contactRelation']");
	//	By RelationSelOpt=By.xpath("//span[contains(text(),'Wife')]");
	//Email
	By EmailClick=By.cssSelector("input[formcontrolname='emailId']");
	//Personal Fax
	By PersonalFax=By.cssSelector("input[formcontrolname='personalFax']");
	//Work Fax
	By WorkFax=By.cssSelector("input[formcontrolname='workFax']");
	//Work Contact Number
	By WorkContactNo=By.cssSelector("input[formcontrolname='workContact']");
	//Home contact Number
	By HomeContactNo=By.cssSelector("input[formcontrolname='homeContact']");

	//Tab 2 Employment details Tab

	By EmploymentDetailsTab=By.cssSelector("div[aria-controls='mat-tab-content-2-1']");
	//Employeer
	By EmployeerClick=By.cssSelector("mat-select[ng-reflect-name='employerName']");
	By EmployeerSelOpt=By.xpath("//span[contains(text(),'Ayesha Sudhir Lande')]");

	//Employment No
	By EmploymentNo=By.cssSelector("input[formcontrolname='employmentNo']");

	//Working from
	By WorkingFrom=By.cssSelector("input[formcontrolname='workingFrom']");

	//Contact No
	By ContactNo=By.cssSelector("input[formcontrolname='employmentContactNo']");

	//Employment Address
	By EmpAdd=By.cssSelector("input[formcontrolname='employmentAddress']");

	//Country
	By Country2Click=By.cssSelector("mat-select[ng-reflect-name='employmentCountry']");
	By Country2SelOpt=By.xpath("//span[contains(text(),' Malaysia ')]");

	//State
	By State2Click=By.cssSelector("mat-select[ng-reflect-name='employmentState']");
	By State2SelOpt=By.xpath("//span[contains(text(),'Negeri Sembilan')]");

	//City
	By City2Click=By.cssSelector("mat-select[ng-reflect-name='employmentCity']");
	By City2SelOpt=By.xpath("//span[contains(text(),'None')]");

	//PostCode
	By PostCode2=By.cssSelector("input[formcontrolname='employmentPostCode']");

	//Tab3 Document 
	//Documents
	By Documenttab3Click=By.cssSelector("div[aria-controls='mat-tab-content-2-2']");
	//Save Button
	//By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	//OK Dialog
	By OkDialog=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Upload Button
	By UploadButton=By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");
	//Choose Files
	By ChooseFiles=By.cssSelector("input[id='fileUpload']");
	//File upload last
	By FileUploadFinalclick=By.cssSelector("mat-icon[ng-reflect-message='Upload']");
	//Back Button
	By Back=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[4]/button[1]/span[1]/mat-icon");


	By CurrentOrder = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/mat-tab-header/div/div/div/div[1]");
	By currentmrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-row[1]/mat-cell[4]");
	By checkbox = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/mat-checkbox");
	// By print =
	// By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/section/div/div/div[1]/button/span[1]/mat-icon");

	By closee = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-barcode-scanner/div/form/div[1]/span/mat-icon");

	By sampletrack = By.id("22662");

	By cicrcle = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]");

	By printandsubmit = By.cssSelector("button[ng-reflect-message='Print and Sample']");

	By saveandsub = By.cssSelector("button[value='submit']");

	By Cancel = By.cssSelector("button[ng-reflect-message='Cancel']");

	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By clickonedit = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation/div[3]/mat-table/mat-row/mat-cell[14]/mat-icon");


	By mrnnnm = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By sercahghh = By.cssSelector("button[ng-reflect-message='Search']");
	By getmrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation/div[3]/mat-table/mat-row[1]/mat-cell[1]");
	By Microbilogy = By.id("1567");
	By MediaObservation = By.id("15677");

	// =======================================
	// Encounter details

	By EncounterType = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[2]/div[1]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Enttypeopt = By.xpath("//span[contains(text(),'Follow up')]");
	By Speciality = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By septopt = By.xpath("//span[contains(text(),' General Surgery')]");
	By Doctor = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By doctopt = By.xpath("//span[contains(text(),' Dr Edward Kerry')]");
	By Clicnic = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[3]/div[2]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]");
	By clcincopt = By.xpath("//span[contains(text(),' Consultation Room 1')]");
	By PatintMRN = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By save = By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Yes = By.xpath("mat-icon[ng-reflect-message='Yes']");

	// ================
	// Encounter details

	By EncounterList = By.xpath("//span[contains(text(),'Encounter List')]");

	By EncounterTypeClick = By.cssSelector("mat-select[ng-reflect-name='encounterType']");
	By Search = By.cssSelector("input[aria-label='dropdown search']");
	By EncounterTypeSelOpt = By.xpath("//span[contains(text(),'New Case')]");
	// Specialty
	By SpecialityClick = By.cssSelector("mat-select[ng-reflect-name='department']");
	// By
	// SpecialitySearch=By.xpath("//*[@id=\"mat-option-4194\"]/span/ngx-mat-select-search/div/input");
	By SpecilitySelOPt = By.xpath("//span[contains(text(),'General Surgery')]");
	// Doctor
	By DoctorClick = By.cssSelector("mat-select[ng-reflect-name='doctor']");
	// By
	// DoctorSearch=By.xpath("//*[@id=\"mat-option-4190\"]/span/ngx-mat-select-search/div/input");
	By DoctorSelOpt = By.xpath("//span[contains(text(),'Dr Edward Kerry')]");
	// Clinic
	By ClinicClick = By.cssSelector("mat-select[ng-reflect-name='clinic']");
	// By
	// ClinicSearch=By.xpath("//*[@id=\"mat-option-4196\"]/span/ngx-mat-select-search/div/input");
	By ClinicSelOpt = By.xpath("//span[contains(text(),'Consultation Room 1')]");
	// Counter
	By CounterClick = By.cssSelector("mat-select[ng-reflect-name='cashCounter']");
	// By
	// CounterSearch=By.xpath("//*[@id=\"mat-option-4198\"]/span/ngx-mat-select-search/div/input");
	By CounterSelOpt = By.xpath("//span[contains(text(),'REGISTRATION COUNTER 1')]");
	// Encounter Remarks
	By EncounterRemarks = By.cssSelector("textarea[ng-reflect-name='remarks']");
	// Encounter Notes
	By EncounterNotes = By.cssSelector("mat-icon[ng-reflect-message='Internal Note']");
	// Add Notes
	By AddNotes = By.cssSelector("input[ng-reflect-name='notes']");
	// Add Remark Button
	By AddRemarkButton = By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");
	// Close Button
	By CloseButton = By.cssSelector("mat-icon[ng-reflect-message='Close']");

	// Referral Details
	// VisitReason
	By VisitReasonClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[2]/div[2]/div[1]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// VisitReasonSearch=By.xpath("//*[@id=\"mat-option-4200\"]/span/ngx-mat-select-search/div/input");
	By VisitReasonSelOpt = By.xpath("//span[contains(text(),'Consultation & Treatment')]");
	// Patient Category
	By PatientCategoryClick = By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	// By
	// PatientCategorySearch=By.xpath("//*[@id=\"mat-option-4202\"]/span/ngx-mat-select-search/div/input");
	By PatientCategorySelOpt = By.xpath("//span[contains(text(),'Senior Citizen')]");
	// Referral Type
	By ReferralTypeClick = By.cssSelector("mat-select[ng-reflect-name='referralType']");
	// By
	// ReferralTypeSearch=By.xpath("//*[@id=\"mat-option-4218\"]/span/ngx-mat-select-search/div/input");
	By ReferralTypeSelOpt = By.xpath("//span[contains(text(),'Emergency Referral')]");
	// Referral
	By ReferralClick = By.cssSelector("mat-select[ng-reflect-name='referral']");
	// By
	// ReferralSearch=By.xpath("//*[@id=\"mat-option-4220\"]/span/ngx-mat-select-search/div/input");
	By ReferralSelOpt = By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain \")]");
	// Patient Notes
	// By PatientNotes12=By.xpath("//*[@id=\"mat-input-102\"]");
	// Referral Remarks
	By ReferralRemarks12 = By.cssSelector("textarea[ng-reflect-name='referralRemarks']");
	// selecting Tariff
	By TariffClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr/td[4]/mat-select");
	// By
	// TariffSearch=By.xpath("//*[@id=\"mat-option-4226\"]/span/ngx-mat-select-search/div/input");
	By TariffSelOpt = By.xpath("//span[contains(text(),'Self Tariff')]");

	// Tab 2 Next Of Kin
	By NextKinTabClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[2]/div");

	// Next Of kin Details
	// Titles
	By TitleClick = By.cssSelector("mat-select[ng-reflect-name='prefix']");
	// By
	// TitleSearch=By.xpath("//*[@id=\"mat-option-4204\"]/span/ngx-mat-select-search/div/input");
	By TitleSelOpt = By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
	By TitleSelOpt2 = By.xpath("//span[contains(text(),'Tan Sri Datuk')]");


	// Name
	By NameClick = By.cssSelector("input[ng-reflect-name='name']");
	// Identification Type
	By IdentificationTypeClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[1]/div[2]/div[3]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// IdentificationTypeSearch=By.xpath("//*[@id=\"mat-option-4206\"]/span/ngx-mat-select-search/div/input");
	By IdentificationTypeSelOpt = By.xpath("//span[contains(text(),'Passport')]");
	// Identification Number
	By IdNumber = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[1]/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input");
	// Relation
	By RelationClick = By.cssSelector("mat-select[ng-reflect-name='relation']");
	// By
	// RelationSearch=By.xpath("//*[@id=\"mat-option-4208\"]/span/ngx-mat-select-search/div/input");
	By RelationSelOpt = By.xpath("//span[contains(text(),'Mother')]");
	// Phone Number
	By PhoneNumber = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[1]/div[3]/div[3]/mat-form-field/div/div[1]/div[3]/input");

	// Address Details
	// Address
	By AddressNClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input");
	// Selecting Country
	By CountryNClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[2]/div[2]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// CountryNSearch=By.xpath("//*[@id=\"mat-option-4210\"]/span/ngx-mat-select-search/div/input");
	By CountryNSelOpt = By.xpath("//span[contains(text(),'Malaysia')]");
	// State
	By StateNClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[2]/div[3]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// StateNSearch=By.xpath("//*[@id=\"mat-option-4212\"]/span/ngx-mat-select-search/div/input");
	By StateNSelOpt = By.xpath("//span[contains(text(),' Pulau Pinang ')]");
	// City
	By CityNClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[3]/div[1]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// CityNSearch=By.xpath("//*[@id=\"mat-option-4214\"]/span/ngx-mat-select-search/div/input");
	By CityNSelOpt = By.xpath("//span[contains(text(),' Bukit Mertajam ')]");
	// Area
	By AreaNClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[3]/div[2]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// AreaNSearch=By.xpath("//*[@id=\"mat-option-4216\"]/span/ngx-mat-select-search/div/input");
	By AreaNSelOpt = By.xpath("//span[contains(text(),'None')]");
	// Postcode
	By PostCodeNClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[3]/div[3]/mat-form-field/div/div[1]/div[3]/input");
	// Referral Button
	By ReferralNButtonClick = By.cssSelector("mat-icon[ng-reflect-message='Add Referral']");

	// Save Button
	By SaveBUttonClick = By.cssSelector("mat-icon[ng-reflect-message='Save']");
	// Ok Button
	By OkButtonClick = By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	// Tab 3 Document
	// Click on Document Tab
	By DocumentTabClick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[3]/div");

	// Click on Upload button
	By UploadButtonClick = By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");

	// Click on Choose File Button
	By ChooseFIleClick = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[2]/table/tr/td/input");
	// Upload
	By UploadClick1 = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[3]/div/button/span[1]/mat-icon");
	By Lab = By.xpath("//span[contains(text(),'Lab')]");
	By SideBarMenu = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");
	// SideBar
	By SideBar = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By getmrnm = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	// BillingIcon
	By BillingMenu = By.xpath("//span[contains(text(),'Billing')]");

	// SideBar
	// By
	// SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	// OPBill
	By OPBill = By.cssSelector("a[ng-reflect-router-link='bill,opbill']");

	// SearchClick
	By AdvanceSearch = By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	// MRN
	By MRNsearch = By.cssSelector("input[ng-reflect-name='PatienName']");

	// SearchClick
	By SearchClick = By.cssSelector("button[ng-reflect-message='Search']");

	// ServiceName
	By ServiceName = By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceSelect = By.xpath("/html/body/div[2]/div/div/div/mat-option/span");

	// AddButton
	By AddButton = By.cssSelector("button[ng-reflect-message='Add Service']");

	By addref = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[1]/div[2]/button/span[1]/mat-icon");

	// ServiceName2
	By ServiceName2 = By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceSelect2 = By.xpath("//span[contains(text(),'MRI Brain')]");

	// SaveButton
	By SaveButton1 = By.cssSelector("mat-icon[ng-reflect-message='Save']");

	// Confirm
	By Confirm1 = By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	// FinalBill
	By FinalBill = By.cssSelector("mat-checkbox[ng-reflect-id='Final Bill']");

	// SaveButton
	By SaveButton = By.cssSelector("mat-icon[ng-reflect-message='Save']");

	// Confirm
	By Confirm = By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	By edit = By.cssSelector("mat-icon[ng-reflect-message='Edit']");
	By Click_on_arrow_Growth = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[1]/mat-cell[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]");
	By select_status_nogrwoth = By.xpath("//mat-select//span[contains(text(),'No Growth')]");
	By Click_on_2arrow_Growth = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[1]/mat-cell[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]");
	By select_2status_nogrwoth = By.xpath("//mat-option//span[contains(text(),'Pending')]");
	By Culture = By.cssSelector("mat-select[ng-reflect-placeholder='Add Culture']");
	By CultureNoGrowth = By.xpath("//mat-option//span[contains(text(),'No Growth')]");
	By Staus = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]");
	By select_status = By.xpath("//mat-option//span[contains(text(),'Pending')]");
	By Save_sample = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[4]/div/button[3]");
	By yes = By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	By Finalstaus = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation/div[3]/mat-table/mat-row/mat-cell[13]");
	//Confirm
	//By Confirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//PaymentAdd
	By PaymentAdd=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");

	//ReceivedFrom
	By ReceivedFrom=By.cssSelector("input[ng-reflect-name='receivedFrom']");

	//IDNo
	By IdentificatioNo=By.cssSelector("input[ng-reflect-name='indentificationNumber']");

	//Remarks 
	By Remarks=By.cssSelector("input[ng-reflect-placeholder='Remark']");

	//Save
	By SaveButton2=By.cssSelector("mat-icon[ng-reflect-message='Save Payment Details']");

	//Confirm2
	By Confirm2=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	By checkboxcricle = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-opdbill/app-patient-search/div/div/div/table/tbody/tr[1]/td[1]/div/mat-radio-button/label/span[1]/span[1]");	

	By selectreco = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-row/mat-cell[1]");
	By selectrecheckbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-accordion/mat-expansion-panel/div/div/div/table/tr[1]/td[1]/mat-checkbox/label/span[1]");
	By Printandsample = By.cssSelector("img[title='Print and Submit']");
	By saveandsubmit = By.cssSelector("mat-icon[ng-reflect-message='Print and Submit']");
	By centerreceving = By.id("22664");
	By centerrecivecwhck = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-central-receiving/div[3]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By receiversubmit = By.cssSelector("img[title='Receive Sample']");
	By receivesample = By.cssSelector("mat-icon[ng-reflect-message='Receive Sample']");
	By Pathology = By.id("22663");
	By sampleprocessing = By.cssSelector("a[ng-reflect-router-link='pathology,sample-processing']");
	By checkclcik = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-processing/div[3]/mat-table/mat-row/mat-cell[1]/mat-checkbox/label/span[1]");
	By Acceptsample = By.cssSelector("img[title='Accept Sample']");
	By Acceptsamplesave = By.cssSelector("mat-icon[ng-reflect-message='Accept Sample']");
	By SideBarr=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By Growth = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[1]/mat-cell[2]/mat-form-field/div/div[1]/div[3]/mat-select");
	By Growth12 = By.xpath("//mat-option//span[contains(text(),'Growth')]");
	By status = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[1]/mat-cell[3]/mat-form-field/div/div[1]/div[3]/mat-select");
	By stats2 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[2]/mat-cell[3]/mat-form-field/div/div[1]/div[3]/mat-select");
	By Completed = By.xpath("//mat-option//span[contains(text(),'Completed')]");
	By cultur = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By status2  = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By savesample = By.cssSelector("img[title='Save Sample']");
	By Yess = By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	By growthrwosec = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[2]/mat-cell[2]/mat-form-field/div/div[1]/div[3]/mat-select");
	By Observation = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entrydetails/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[3]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Hold = By.cssSelector("img[title='Hold']");
	By response = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entrydetails/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[3]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By formula = By.xpath("//span[contains(text(),' ≥ 25/lpf ')]");
	By addformula = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entrydetails/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/div[3]/mat-grid-list/div/mat-grid-tile[3]/div/button/span[1]/mat-icon");
	By Identificationtab = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entrydetails/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[2]");
	By organism = By.cssSelector("mat-select[ng-reflect-placeholder='Organism']");
	By input = By.cssSelector("input[placeholder='Search']");
	By Panel = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entrydetails/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div[1]/mat-table/mat-row/mat-cell[2]/mat-form-field/div/div[1]/div[3]/mat-select");
	By des_3 = By.xpath("//span[contains(text(),'Organism Panel01')]");  
	By method = By.cssSelector("mat-select[ng-reflect-placeholder='method']");
	By cultureandsensitive = By.xpath("//span[contains(text(),'Culture & Sensitive')]");
	By cafezai = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entrydetails/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/mat-tab-group/div/mat-tab-body/div/div/mat-table/mat-row[1]/td[2]/input");
	By Interpetation = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entrydetails/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/mat-tab-group/div/mat-tab-body/div/div/mat-table/mat-row/mat-cell/mat-form-field/div/div[1]/div[3]/mat-select");
	By savesampleidenti = By.cssSelector("img[title='Submit Sample']");
	By resultentry = By.id("15678");
	By interpretopt = By.xpath("//span[contains(text(),'Susceptible')]"); 
	By resultentydetailseidt = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entry/div[3]/mat-table/mat-row[1]/mat-cell[15]/mat-icon");
	By getmrnre = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-row/mat-cell[1]");
	By Sythaphil = By.xpath("//span[contains(text(),' Staphylococci ')]");
	By descopt = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");
	By getmrnober = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation/div[3]/mat-table/mat-row[1]/mat-cell[1]");
	By getmrn2 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entry/div[3]/mat-table/mat-row[1]/mat-cell[2]");
	By Resultcerification = By.cssSelector("a[ng-reflect-router-link='microbiology,result-entry-vari']"); 
	By approve = By.id("15680"); 
	By editverifi = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-mirco-result-verification/app-micro-result-entry/div[3]/mat-table/mat-row[1]/mat-cell[15]/mat-icon");
	By savbunitrresult = By.cssSelector("img[title='Submit Sample']");
	By verifytheststus = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-mirco-result-verification/app-micro-result-entry/div[3]/mat-table/mat-row[1]/mat-cell[14]");
	By GtestUS = By.xpath("//mat-row[1]/mat-cell[14]/b");
	By opd2 = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/img");
	By EncounterListw=By.xpath("//span[contains(text(),'Encounter List')]");
	By getpataientname = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	By name = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By Checkboixfdd = By.xpath("//div[3]/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	
	By OPD=By.xpath("//span[contains(text(),'OPD')]");
	By OPD3=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/img");
	By Result_entryupbuton = By.xpath("//mat-row[1]/mat-cell[5]");
	By Result_entryupbuton6 = By.xpath("//mat-row[1]/mat-cell[6]");
	By Holdd = By.cssSelector("mat-icon[ng-reflect-message='Hold']");
	
	
	By checkboxx= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entry/div[3]/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");

	
	
	
	
	
	public OPD_registrationn(WebDriver driver)
	{
		this.driver=driver;
	}


	public void OPD_REGISTRATIONmm_1() throws InterruptedException, IOException, AWTException 
	{	  



		DeleteExcelRowWithSelenium  data = new DeleteExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);


		WebDriverWait wait = new WebDriverWait(driver, 30);

		//Clicking on menu Icon
		Thread.sleep(8000);

		//driver.navigate().refresh();
		//Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(4000);
		driver.findElement(OPDMenu).click();

		Thread.sleep(20000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(8000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(4000);
		//click on registration sub menu.
		driver.findElement(subRegistration).click();

		//Click on plus button
		Thread.sleep(2000);
		driver.findElement(PlusButton).click();

		Thread.sleep(5000);

		driver.findElement(PrimaryIdentificationClick).click();
		Thread.sleep(700);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(700);
		driver.findElement(PrimaryIdentificationselOpt).click();

		//Select Primary Id Number
		Thread.sleep(700);

		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());
		Long id=d.getTime();
		Thread.sleep(1000);
		driver.findElement(PrimaryIdNumber).sendKeys("3456787654456");
		//Expire date
		Thread.sleep(700);
		driver.findElement(ExpirayDate).sendKeys("01/07/2029");



		//filling Personal Information
		//Selecting Title
		driver.findElement(TitleClick).click();
		Thread.sleep(700);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(700);
		driver.findElement(TitleSelOpt).click();

		//ENtering data in name filed
		Thread.sleep(700);
		driver.findElement(Fullname).sendKeys(EnterPatientName);


		//date of birth
		Thread.sleep(500);
		driver.findElement(DateOfBirth).sendKeys("01/07/1990");

		//Patient category
		Thread.sleep(500);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(500);
		driver.findElement(PatientCategorySelOpt).click();
		//Tab1
		//Clicking on tab Address and content details
		Thread.sleep(500);
		driver.findElement(AddressAndContactDetail).click();	

		//Scrolling the web page
		Thread.sleep(500);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Selecting Country
		Thread.sleep(500);
		driver.findElement(countryClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(500);
		driver.findElement(countrySelOpt).click();
		//Selecting State
		Thread.sleep(500);
		driver.findElement(StateClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Negeri Sembilan");
		Thread.sleep(1000);
		driver.findElement(StateSelOpt).click();
		//Selecting City
		Thread.sleep(500);
		driver.findElement(cityClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("Seremban");
		Thread.sleep(800);
		driver.findElement(citySelopt).click();

		//Selecting Area
		Thread.sleep(500);
		driver.findElement(AreaClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("");
		Thread.sleep(500);
		driver.findElement(AreaSelOpt).click();

		//Selecting Postcode
		Thread.sleep(500);
		driver.findElement(PostCode).sendKeys("765434567876");
		//Residential Address
		Thread.sleep(500);
		driver.findElement(ResAddress).sendKeys("siafoc palaza");
		//Contact Information
		//Country Code
		Thread.sleep(500);
		driver.findElement(CountryCodeClick).click();
		Thread.sleep(500);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(500);
		driver.findElement(CountryCodeSelOpt).click();

		//Mobile Number
		Thread.sleep(500);
		driver.findElement(MobileNumberClick).sendKeys("876545678765");



		//Clicking on save button	
		Thread.sleep(500);
		driver.findElement(SaveButton).click();


		//Clicking on ok dialog
		Thread.sleep(500);
		driver.findElement(OkDialog).click();
		Thread.sleep(1000);


		Thread.sleep(500);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2500);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(6000);

		//Selecting Encounter Type
		Thread.sleep(2000);
		driver.findElement(EncounterTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(Search).sendKeys("New Case");
		Thread.sleep(1000);
		driver.findElement(EncounterTypeSelOpt).click();

		//Selecting Specialty
		Thread.sleep(1000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(Search).sendKeys("General Surgery");
		Thread.sleep(1000);
		driver.findElement(SpecilitySelOPt).click();
		//Selecting Doctor
		Thread.sleep(1000);
		driver.findElement(DoctorClick).click();
		Thread.sleep(1000);
		driver.findElement(Search).sendKeys("Dr Edward Kerry");
		Thread.sleep(1000);
		driver.findElement(DoctorSelOpt).click();
		//Clinic
		Thread.sleep(500);
		driver.findElement(ClinicClick).click();
		Thread.sleep(500);
		driver.findElement(Search).sendKeys("Consultation Room 1");
		Thread.sleep(500);
		driver.findElement(ClinicSelOpt).click();

		//selecting Tariff
		Thread.sleep(5000);
		driver.findElement(TariffClick).click();
		Thread.sleep(5000);
		driver.findElement(Search).sendKeys("Self Tariff");
		Thread.sleep(5000);
		driver.findElement(TariffSelOpt).click();
		Thread.sleep(5000);

		//Tab 2 Next Of Kin
		//Clicking on Tab
		Thread.sleep(500);
		driver.findElement(NextKinTabClick).click();

		//Next Of Kin details
		//Titles
		Thread.sleep(500);
		driver.findElement(TitleClick).click();
		Thread.sleep(500);
		driver.findElement(Search).sendKeys("Tan Sri Datuk");
		Thread.sleep(500);
		driver.findElement(TitleSelOpt2).click();
		//Name
		Thread.sleep(500);
		driver.findElement(NameClick).sendKeys("munja");
		Thread.sleep(500);
		driver.findElement(addref).click();

		Thread.sleep(500);
		driver.findElement(SaveBUttonClick).click();
		//Click on Ok Button
		Thread.sleep(500);
		driver.findElement(OkButtonClick).click();
		Thread.sleep(4000);

		//String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		String windowHandlee = driver.getWindowHandle();
		ArrayList<Object> tabst = new ArrayList<Object> (driver.getWindowHandles());
		driver.switchTo().window((String) tabst.get(0));
		Thread.sleep(4000);







	}
	
	public void ResultApporvalHold() throws InterruptedException, IOException, AWTException 
	{	  




		Thread.sleep(7000);
		
	     
		// Navigating to the LAB module
		driver.findElement(mainmenu).click();
		Thread.sleep(8000);
		driver.findElement(Lab).click();
		Thread.sleep(13000);
         
          
		// Expanding and searching for a patient
		driver.findElement(Expand).click();
		Thread.sleep(3000);
		driver.findElement(name_3).sendKeys("MICROBILOGYFLOW");
		Thread.sleep(3000);
		driver.findElement(sercahghh).click();
		Thread.sleep(3000);

		// Selecting a record and processing the sample
		driver.findElement(selectreco).click();
		Thread.sleep(1000);
		driver.findElement(selectrecheckbox).click();
		Thread.sleep(2000);
		driver.findElement(Printandsample).click();
		Thread.sleep(2000);
		driver.findElement(saveandsubmit).click();
		// driver.findElement(yes).click();
		Thread.sleep(2000);
		// driver.findElement(saveandsubmit).click();
		Thread.sleep(12000);

		// Handling a new window/tab if opened
		String mainWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0)); // Switch back to the original tab
		Thread.sleep(1000);

		//  driver.findElement(yes).click();


		// Navigating through the sidebar
		driver.findElement(SideBarr).click();
		Thread.sleep(1000);
		driver.findElement(centerreceving).click();
		Thread.sleep(3000);
		driver.findElement(centerrecivecwhck).click();
		Thread.sleep(3000);
		driver.findElement(receiversubmit).click();
		Thread.sleep(1000);
		driver.findElement(receivesample).click();
		Thread.sleep(3000);

		// Continuing with Pathology and Sample Processing
		driver.findElement(SideBarr).click();
		// Thread.sleep(3000);
		// driver.findElement(Pathology).click();
		Thread.sleep(3000);
		driver.findElement(sampleprocessing).click();
		Thread.sleep(3000);
		driver.findElement(checkclcik).click();
		Thread.sleep(3000);
		driver.findElement(Acceptsample).click();
		Thread.sleep(3000);
		driver.findElement(Acceptsamplesave).click();
		Thread.sleep(3000);
		Thread.sleep(2000);

	
	//Thread.sleep(3000);

		//		String kk = driver.findElement(getmrnre).getText();
		driver.findElement(SideBarr).click();
		Thread.sleep(3000);

		driver.findElement(Microbilogy).click();
		Thread.sleep(3000);

		driver.findElement(MediaObservation).click();
		Thread.sleep(3000);

		driver.findElement(Result_entryupbuton).click();
		Thread.sleep(3000);

		driver.findElement(Growth).click();
		Thread.sleep(3000);

		driver.findElement(Growth12).click();
		Thread.sleep(3000);

		driver.findElement(status).click();
		Thread.sleep(3000);

		driver.findElement(Completed).click();
		Thread.sleep(3000);

		driver.findElement(growthrwosec).click();
		Thread.sleep(3000);

		driver.findElement(Growth12).click();
		Thread.sleep(3000);

		driver.findElement(stats2).click();
		Thread.sleep(3000);

		driver.findElement(Completed).click();
		Thread.sleep(3000);

		driver.findElement(cultur).click();
		Thread.sleep(3000);

		driver.findElement(Growth12).click();
		Thread.sleep(3000);

		driver.findElement(status2).click();
		Thread.sleep(3000);

		driver.findElement(Completed).click();
		Thread.sleep(3000);

		driver.findElement(savesample).click();
		Thread.sleep(3000);

		driver.findElement(Yess).click();
		Thread.sleep(3000);

		driver.findElement(SideBarr).click();
		Thread.sleep(3000);

		driver.findElement(Microbilogy).click();
		Thread.sleep(3000);

		//********************result-entry-dashboard*****************//
		driver.findElement(resultentry).click();
		Thread.sleep(3000);
		
		// Strat fro here

	

		driver.findElement(checkboxx).click();
		Thread.sleep(3000);

		driver.findElement(Hold).click();
		Thread.sleep(3000);
		
		
		driver.findElement(Holdd).click();
		Thread.sleep(3000);

		
	
		
		String gg = driver.findElement(GtestUS).getText();

		String Expected = gg;
		String Actaul = gg;

		Assert.assertEquals(Expected, Actaul, "hold");
		
		
		Thread.sleep(3000);
		
		driver.findElement(Result_entryupbuton6).click();
		Thread.sleep(3000);

		driver.findElement(Observation).click();
		Thread.sleep(3000);

		driver.findElement(pushcell).click();
		Thread.sleep(3000);

		driver.findElement(response).click();
		Thread.sleep(3000);

		driver.findElement(formula).click();
		Thread.sleep(3000);

		driver.findElement(addformula).click();
		Thread.sleep(3000);

		driver.findElement(Identificationtab).click();
		Thread.sleep(3000);

		driver.findElement(organism).click();
		Thread.sleep(3000);

		driver.findElement(input).sendKeys("Staphylococci");
		Thread.sleep(3000);

		driver.findElement(Sythaphil).click();
		Thread.sleep(3000);

		driver.findElement(Panel).click();
		Thread.sleep(3000);

		driver.findElement(des_3).click();
		Thread.sleep(3000);

		driver.findElement(method).click();
		Thread.sleep(3000);

		driver.findElement(cultureandsensitive).click();
		Thread.sleep(3000);

		driver.findElement(cafezai).sendKeys("1");
		Thread.sleep(3000);

		driver.findElement(Interpetation).click();
		Thread.sleep(3000);

		driver.findElement(interpretopt).click();
		Thread.sleep(3000);

		driver.findElement(savesampleidenti).click();
		Thread.sleep(3000);

		driver.findElement(SideBarr).click();
		Thread.sleep(3000);

		driver.findElement(Microbilogy).click();
		Thread.sleep(3000);

		driver.findElement(Resultcerification).click();
		Thread.sleep(3000);

		driver.findElement(Result_entryupbuton6).click();
		Thread.sleep(3000);

		driver.findElement(savbunitrresult).click();
		Thread.sleep(3000);

		driver.findElement(SideBarr).click();
		Thread.sleep(3000);

		driver.findElement(Microbilogy).click();
		Thread.sleep(3000);

		driver.findElement(approve).click();
		Thread.sleep(3000);




	}

	public void DoubleEncounter() throws InterruptedException, IOException, AWTException 
	{	  


		DeleteExcelRowWithSelenium  data = new DeleteExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);


		WebDriverWait wait = new WebDriverWait(driver, 30);

		//Clicking on menu Icon
		Thread.sleep(8000);

		//driver.navigate().refresh();
		//Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(4000);
		driver.findElement(OPDMenu).click();

		Thread.sleep(20000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(3000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(3000);
		//click on registration sub menu.
		driver.findElement(subRegistration).click();
		
		
		//search
		
		Thread.sleep(8000);
		driver.findElement(Expand).click();
		Thread.sleep(2000);
		driver.findElement(name_3).sendKeys(EnterPatientName);
		Thread.sleep(2000);
		driver.findElement(sercahghh).click();
		
		//Get the list of window handles

		
		//Selecting Encounter Type
		Thread.sleep(2000);
		driver.findElement(EncounterTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(Search).sendKeys("Follow up");
		Thread.sleep(3000);
		driver.findElement(follwup).click();

		//Selecting Specialty
		Thread.sleep(1000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(Search).sendKeys("General Surgery");
		Thread.sleep(1000);
		driver.findElement(SpecilitySelOPt).click();
		//Selecting Doctor
		Thread.sleep(1000);
		driver.findElement(DoctorClick).click();
		Thread.sleep(1000);
		driver.findElement(Search).sendKeys("Dr Vithya Shini");
		Thread.sleep(1000);
		driver.findElement(sugi).click();
		//Clinic
		Thread.sleep(500);
		driver.findElement(ClinicClick).click();
		Thread.sleep(500);
		driver.findElement(Search).sendKeys("Consultation Room 4");
		Thread.sleep(500);
		driver.findElement(four).click();
/*
		//selecting Tariff
		Thread.sleep(5000);
		driver.findElement(TariffClick).click();
		Thread.sleep(5000);
		driver.findElement(Search).sendKeys("Self Tariff");
		Thread.sleep(5000);
		driver.findElement(TariffSelOpt).click();
		Thread.sleep(5000);
*/
		//Tab 2 Next Of Kin
		//Clicking on Tab
		Thread.sleep(500);
		driver.findElement(NextKinTabClick).click();

		//Next Of Kin details
		//Titles
		Thread.sleep(500);
		driver.findElement(TitleClick).click();
		Thread.sleep(500);
		driver.findElement(Search).sendKeys("Tan Sri Datuk");
		Thread.sleep(500);
		driver.findElement(TitleSelOpt2).click();
		//Name
		Thread.sleep(500);
		driver.findElement(NameClick).sendKeys("munja");
		Thread.sleep(500);
		driver.findElement(addref).click();

		Thread.sleep(500);
		driver.findElement(SaveBUttonClick).click();
		//Click on Ok Button
		Thread.sleep(500);
		driver.findElement(OkButtonClick).click();
		Thread.sleep(4000);

		//String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		String windowHandlee = driver.getWindowHandle();
		ArrayList<Object> tabst = new ArrayList<Object> (driver.getWindowHandles());
		driver.switchTo().window((String) tabst.get(0));
		Thread.sleep(4000);

	}

}

