package LabPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
import org.testng.Assert;
import org.testng.annotations.Test;

import OPDTest.DeleteExcelRowWithSelenium;
import OPDTest.ReadExcelRowWithSelenium;

public class OPD_Registration_Encounter {

	WebDriver driver = null;

	By CurrentOrder = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/mat-tab-header/div/div/div/div[1]");
	By currentmrn = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-row[1]/mat-cell[4]");
	By checkbox = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/mat-checkbox");
	// By print =
	// By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/section/div/div/div[1]/button/span[1]/mat-icon");

	By closee = By.xpath(
			"/html/body/div[2]/div[2]/div/mat-dialog-container/app-barcode-scanner/div/form/div[1]/span/mat-icon");

	By sampletrack = By.id("22662");

	By cicrcle = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]");

	By printandsubmit = By.cssSelector("button[ng-reflect-message='Print and Sample']");

	By saveandsub = By.cssSelector("button[value='submit']");

	By Cancel = By.cssSelector("button[ng-reflect-message='Cancel']");

	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By mrnnn = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By sercahghh = By.cssSelector("button[ng-reflect-message='Search']");
	By getmrn = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation/div[3]/mat-table/mat-row[1]/mat-cell[1]");
	By Microbilogy = By.id("1567");
	By MediaObservation = By.id("15677");

	// =======================================
	// Encounter details

	By EncounterType = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[2]/div[1]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By Enttypeopt = By.xpath("//span[contains(text(),'Follow up')]");
	By Speciality = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By septopt = By.xpath("//span[contains(text(),' General Surgery')]");
	By Doctor = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By doctopt = By.xpath("//span[contains(text(),' Dr Edward Kerry')]");
	By Clicnic = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/form/div/div[1]/div[3]/div[2]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]");
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
	By DoctorSelOpt = By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");
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
	By PatientCategoryClick = By.xpath("mat-select[ng-reflect-name='patientCategory']");
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
	By TariffClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr/td[4]/mat-select");
	// By
	// TariffSearch=By.xpath("//*[@id=\"mat-option-4226\"]/span/ngx-mat-select-search/div/input");
	By TariffSelOpt = By.xpath("//span[contains(text(),'Self Tariff')]");

	// Tab 2 Next Of Kin
	By NextKinTabClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[2]/div");

	// Next Of kin Details
	// Titles
	By TitleClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[1]/div[2]/div[1]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// TitleSearch=By.xpath("//*[@id=\"mat-option-4204\"]/span/ngx-mat-select-search/div/input");
	By TitleSelOpt = By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
	// Name
	By NameClick = By.cssSelector("input[ng-reflect-name='name']");
	// Identification Type
	By IdentificationTypeClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[1]/div[2]/div[3]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// IdentificationTypeSearch=By.xpath("//*[@id=\"mat-option-4206\"]/span/ngx-mat-select-search/div/input");
	By IdentificationTypeSelOpt = By.xpath("//span[contains(text(),'Passport')]");
	// Identification Number
	By IdNumber = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[1]/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input");
	// Relation
	By RelationClick = By.cssSelector("mat-select[ng-reflect-name='relation']");
	// By
	// RelationSearch=By.xpath("//*[@id=\"mat-option-4208\"]/span/ngx-mat-select-search/div/input");
	By RelationSelOpt = By.xpath("//span[contains(text(),'Mother')]");
	// Phone Number
	By PhoneNumber = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[1]/div[3]/div[3]/mat-form-field/div/div[1]/div[3]/input");

	// Address Details
	// Address
	By AddressNClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input");
	// Selecting Country
	By CountryNClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[2]/div[2]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// CountryNSearch=By.xpath("//*[@id=\"mat-option-4210\"]/span/ngx-mat-select-search/div/input");
	By CountryNSelOpt = By.xpath("//span[contains(text(),'Malaysia')]");
	// State
	By StateNClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[2]/div[3]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// StateNSearch=By.xpath("//*[@id=\"mat-option-4212\"]/span/ngx-mat-select-search/div/input");
	By StateNSelOpt = By.xpath("//span[contains(text(),' Pulau Pinang ')]");
	// City
	By CityNClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[3]/div[1]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// CityNSearch=By.xpath("//*[@id=\"mat-option-4214\"]/span/ngx-mat-select-search/div/input");
	By CityNSelOpt = By.xpath("//span[contains(text(),' Bukit Mertajam ')]");
	// Area
	By AreaNClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[3]/div[2]/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	// By
	// AreaNSearch=By.xpath("//*[@id=\"mat-option-4216\"]/span/ngx-mat-select-search/div/input");
	By AreaNSelOpt = By.xpath("//span[contains(text(),'None')]");
	// Postcode
	By PostCodeNClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/form/div/div[1]/div[2]/div[3]/div[3]/mat-form-field/div/div[1]/div[3]/input");
	// Referral Button
	By ReferralNButtonClick = By.cssSelector("mat-icon[ng-reflect-message='Add Referral']");

	// Save Button
	By SaveBUttonClick = By.cssSelector("mat-icon[ng-reflect-message='Save']");
	// Ok Button
	By OkButtonClick = By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	// Tab 3 Document
	// Click on Document Tab
	By DocumentTabClick = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[3]/div");

	// Click on Upload button
	By UploadButtonClick = By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");

	// Click on Choose File Button
	By ChooseFIleClick = By
			.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[2]/table/tr/td/input");
	// Upload
	By UploadClick1 = By.xpath(
			"/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[3]/div/button/span[1]/mat-icon");
	By Lab = By.xpath("//span[contains(text(),'Lab')]");
	By SideBarMenu = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");
	// SideBar
	By SideBar = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By getmrnm = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
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
	By MRNsearch = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	// SearchClick
	By SearchClick = By.cssSelector("button[ng-reflect-message='Search']");

	// ServiceName
	By ServiceName = By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceSelect = By.xpath("/html/body/div[2]/div/div/div/mat-option[3]/span");

	// AddButton
	By AddButton = By.cssSelector("button[ng-reflect-message='Add Service']");

	By addref = By.cssSelector("mat-option[ng-reflect-message='Add Referral']");

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
	By Click_on_arrow_Growth = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[1]/mat-cell[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]");
	By select_status_nogrwoth = By.xpath("//mat-select//span[contains(text(),'No Growth')]");
	By Click_on_2arrow_Growth = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[1]/mat-cell[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]");
	By select_2status_nogrwoth = By.xpath("//mat-option//span[contains(text(),'Pending')]");
	By Culture = By.cssSelector("mat-select[ng-reflect-placeholder='Add Culture']");
	By CultureNoGrowth = By.xpath("//mat-option//span[contains(text(),'No Growth')]");
	By Staus = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]");
	By select_status = By.xpath("//mat-option//span[contains(text(),'Pending')]");
	By Save_sample = By.xpath(
			"/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[4]/div/button[3]");
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
	public OPD_Registration_Encounter(WebDriver driver) {
		this.driver = driver;
	}

	By mainmenu = By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	public void Encounter(String EncounterRemarksPar,String AddNotesPar,String NamePar,String IdentificationNOPar,String PhoneNoPar,String AddressPar,String PostcodeParAdetailsPar) throws InterruptedException, IOException, AWTException
	{


		// Create object and take the data from another class
		ReadExcelRowWithSelenium  data = new ReadExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);

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

		/*		

		//Selecting Counter
		Thread.sleep(500);
		driver.findElement(CounterClick).click();
		Thread.sleep(500);
		driver.findElement(Search).sendKeys("REGISTRATION COUNTER 1");
		Thread.sleep(500);
		driver.findElement(CounterSelOpt).click();
		//Encounter Remarks
		Thread.sleep(500);
		driver.findElement(EncounterRemarks).sendKeys(EncounterRemarksPar);
		//Encounter Notes
		Thread.sleep(500);
		driver.findElement(EncounterNotes).click();
		//Add Notes
		Thread.sleep(500);
		driver.findElement(AddNotes).sendKeys(AddNotesPar);
		//Click on Add remark Button
		Thread.sleep(500);
		driver.findElement(AddRemarkButton).click();
		//Click on close button  
		Thread.sleep(500);
		driver.findElement(CloseButton).click();

		//Referral Details
		//Visit Reason
		Thread.sleep(500);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(500);
		driver.findElement(Search).sendKeys("Consultation & Treatment");
		Thread.sleep(500);
		driver.findElement(VisitReasonSelOpt).click();
		//Patient Category
Thread.sleep(1000);
driver.findElement(PatientCategoryClick).click();
Thread.sleep(1000);
driver.findElement(PatientCategorySearch).sendKeys("Senior Citizen");
Thread.sleep(1000);
driver.findElement(PatientCategorySelOpt).click();
		//Referral type
		Thread.sleep(500);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(500);
		driver.findElement(Search).sendKeys("Emergency Referral");
		Thread.sleep(500);
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
driver.findElement(ReferralRemarks12).sendKeys(ReferralRemarksPar);

//Scrolling Encounter web page
Thread.sleep(2000);
Actions actions1 = new Actions(driver);
actions1.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); 

		 */

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
		driver.findElement(Search).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(500);
		driver.findElement(TitleSelOpt).click();
		//Name
		Thread.sleep(500);
		driver.findElement(NameClick).sendKeys("munja");
		//Identification Type
		driver.findElement(addref).click();

		Thread.sleep(500);
		driver.findElement(SaveBUttonClick).click();
		//Click on Ok Button
		Thread.sleep(500);
		driver.findElement(OkButtonClick).click();
		Thread.sleep(1000);

		Thread.sleep(10000);
		String winHandleBefore = driver.getWindowHandle();
		//Thread.sleep(8000);
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(15000);


		Actions act=new Actions(driver);
		WebElement overforopdslide2=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside"));
		act.moveToElement(overforopdslide2).build().perform();

		//Clicking on Encounter List
		Thread.sleep(3000);
		driver.findElement(EncounterList).click();


		String GetMRN = driver.findElement(getmrnm).getText();

		//=======Billing==========================//

		//---OPBill---//


		WebElement mainMenu=driver.findElement(mainmenu);
		act.moveToElement(mainMenu).build().perform();
		act.click(mainMenu).perform();

		//BillIcon
		Thread.sleep(2000);
		driver.findElement(BillingMenu).click();

		//SideMenuBar
		Thread.sleep(3000);
		WebElement SidebarMenu=driver.findElement(SideBar);
		act.moveToElement(SidebarMenu).build().perform();

		//OPCharge
		Thread.sleep(4000);
		driver.findElement(OPBill).click();

		//AdvanceSearch 
		Thread.sleep(3000);
		driver.findElement(AdvanceSearch).click();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(MRNsearch).sendKeys(GetMRN);

		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//ServiceName
		Thread.sleep(2000);
		driver.findElement(ServiceName).sendKeys("Culture Bacterial, Throat Swab | Laboratory | Microbiology");

		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect).click();

		//AddButton 
		Thread.sleep(2000);
		driver.findElement(AddButton).click();
		//OPChargeSave
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm1).click();


		//FinalBill
		Thread.sleep(2000);
		driver.findElement(FinalBill).click();

		//SaveButton
		Thread.sleep(2000);
		driver.findElement(SaveButton).click();

		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs2.get(0));

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();
		Thread.sleep(2000);
		//AddPartialAmmo


		//PaymentAdd
		Thread.sleep(4000);
		driver.findElement(PaymentAdd).click();

		Thread.sleep(6000);
		Robot robot = new Robot(); for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); 

		}


		//Save2
		Thread.sleep(2000);
		driver.findElement(SaveButton2).click();
		Thread.sleep(2000);
		driver.findElement(Confirm2).click();


		//===========Lab microbilogy=====//


		Thread.sleep(5000);
		driver.findElement(mainmenu).click();
		//BillIcon
		Thread.sleep(5000);
		driver.findElement(Lab).click();
		Thread.sleep(8000);
		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		Actions actt= new Actions(driver);
		WebElement overforopdslide19=driver.findElement(SideBar);
		actt.moveToElement(overforopdslide19).build().perform();
		Thread.sleep(5000);
		driver.findElement(Microbilogy).click();
		Thread.sleep(3000);
		driver.findElement(MediaObservation).click();
		Thread.sleep(3000);
		driver.findElement(Expand).click();
		Thread.sleep(5000);
		driver.findElement(mrnnn).sendKeys(GetMRN);
		Thread.sleep(5000);
		driver.findElement(sercahghh).click();
		Thread.sleep(5000);
		driver.findElement(edit).click();
		Thread.sleep(5000);
		driver.findElement(Click_on_arrow_Growth).click();
		Thread.sleep(5000);
		driver.findElement(select_status_nogrwoth).click();
		Thread.sleep(5000);
		driver.findElement(Click_on_2arrow_Growth).click();
		Thread.sleep(5000);
		driver.findElement(select_2status_nogrwoth).click();
		Thread.sleep(5000);
		driver.findElement(Culture).click();
		Thread.sleep(5000);
		driver.findElement(CultureNoGrowth).click();
		Thread.sleep(5000);
		driver.findElement(Staus).click();
		Thread.sleep(5000);
		driver.findElement(select_status).click();
		Thread.sleep(5000);
		driver.findElement(Save_sample).click();
		Thread.sleep(5000);
		driver.findElement(yes).click();
		Thread.sleep(5000);
		driver.findElement(Finalstaus).click();
		Thread.sleep(5000);


		//	String verifymrn = driver.findElement(getmrn).getText();

		String verifymrn = driver.findElement(getmrn).getText();
		String Actualmrn = verifymrn;
		String Expectedmrn = verifymrn;
		Assert.assertEquals(Actualmrn, Expectedmrn, "Returno has been verified sucessfully");



	}
}
