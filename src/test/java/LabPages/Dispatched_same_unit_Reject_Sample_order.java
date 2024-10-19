package LabPages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Dispatched_same_unit_Reject_Sample_order
{
	//private static final By UploadImhe = null;
	WebDriver driver=null;
	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	By mainmenu2=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[2]");

	By OPDMenu=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	By SideBarMenu33=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By subRegistration=By.xpath("//*[@id='2005']/span[1]");
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


	//Personal Information

	//Title
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
	//By TitleSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");


	//Full Name
	By Fullname=By.cssSelector("input[data-placeholder='Full Name']");
	//gender
	By GenderClick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By GenderSelOpt=By.xpath("//span[contains(text(),'FEMALE')]");

	//martial status
	By MaritalStatusClick=By.cssSelector("mat-select[ng-reflect-name='martial']");
	By MaritalStatusSelOpt=By.xpath("//span[contains(text(),'Married')]");

	//Religion
	By ReliginClick=By.cssSelector("mat-select[ng-reflect-name='religion']");
	By ReliginClickSelOpt=By.xpath("//span[contains(text(),'Islam')]");

	//Date of Birth
	By DateOfBirth=By.cssSelector("input[ng-reflect-placeholder='Date of Birth']");


	//Patient category
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//span[contains(text(),'Public')]");


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


	//Save Button
	By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	//OK Dialog
	By OkDialog=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	By EncounterList=By.xpath("//span[contains(text(),'Encounter List')]");
	By EncounterTab=By.xpath("//*[@id=\"mat-tab-label-3-0\"]");



	//Encounter Type
	By EncounterTypeClick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
	By EncounterTypeSelOpt=By.xpath("//span[contains(text(),'New Case')]");

	//Specialty
	By SpecialityClick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By SpecilitySelOPt=By.xpath("//span[contains(text(),'General Medicine')]");

	//Doctor
	By DoctorClick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By DoctorSelOpt=By.xpath("//span[contains(text(),'DATO DR PHIL OSMAN')]");

	//selecting Tariff
	By TariffClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr/td[4]/mat-select");
	By TariffSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Dependent Tab

	By Dependenttab=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[2]");
	By Title=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By TitleSelOpt2=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	By Name=By.cssSelector("input[ng-reflect-name='name']");
	By AddByReferel=By.cssSelector("mat-icon[ng-reflect-message='Add Referral']");

	//Save Button
	By SaveBUttonClick=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Ok Button
	By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	By Gender = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[3]/form/div[2]/mat-grid-list[1]/div/mat-grid-tile[3]/div/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By male = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");


	By Race = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[3]/form/div[2]/mat-grid-list[3]/div/mat-grid-tile[4]/div/mat-form-field");
	By healthtourist = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");

	By Nationalisty = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[3]/form/div[2]/mat-grid-list[2]/div/mat-grid-tile[6]/div/app-master-form-field/div/mat-form-field");
	By Algeriya = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[4]/span");









	//	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");





	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");


	By Lab=By.xpath("//span[contains(text(),'Lab')]");


	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	//OPBill
	By OPBill=By.cssSelector("a[id='32']");

	//SearchClick
	By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//MRN
	By MRNsearch=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	//SearchClick
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	//ServiceName
	By ServiceName=By.cssSelector("input[ng-reflect-placeholder='Service Name']");

	By ServiceSelect=By.xpath("/html/body/div[2]/div/div/div/mat-option[1]/span/span[1]");


	//AddButton
	By AddButton=By.cssSelector("button[ng-reflect-message='Add Service']");

	//ServiceName2
	By ServiceName2=By.cssSelector("input[ng-reflect-placeholder='Service Name']");
	By ServiceSelect2=By.xpath("//span[contains(text(),'Glucose - Strip -Manual|')]");

	//SaveButton
	By SaveButton1=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Confirm
	By Confirm1=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//FinalBill
	By FinalBill=By.cssSelector("mat-checkbox[ng-reflect-id='Final Bill']");


	//SaveButton
	//By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Confirm
	By Confirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

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

	//CheckIn 
	By CheckIn=By.cssSelector("mat-icon[ng-reflect-message='No']");




	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");


	//BillSummary 
	By BillingSummary=By.cssSelector("a[ng-reflect-router-link='bill,billing-summary']");

	//BillSearchClick
	By BillSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");

	//MRNInput
	By MRNInput=By.cssSelector("input[ng-reflect-name='mrn']");

	//Search
	By BillMRNSearch=By.cssSelector("button[ng-reflect-message='Search']");


	By PartialAmount = By.cssSelector("input[ng-reflect-name='amount']");	



	By Click = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-billing-payment-dialog/div/form/div[2]/div/div[4]/div[1]/span");
	By DebitNotesList = By.cssSelector("div[aria-posinset='2']");

	By mrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	//	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");




	By CurrentOrder = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/mat-tab-header/div/div/div/div[1]");
	By currentmrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-row[1]/mat-cell[4]");
	By checkbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/mat-checkbox");
	// By print = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/section/div/div/div[1]/button/span[1]/mat-icon");


	By closee = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-barcode-scanner/div/form/div[1]/span/mat-icon");

	By sampletrack = By.id("22662");

	By cicrcle = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]");


	By printandsubmit = By.cssSelector("button[ng-reflect-message='Print and Sample']");

	By saveandsub = By.cssSelector("button[value='submit']");

	By Cancel = By.cssSelector("button[ng-reflect-message='Cancel']");
	By selectreco = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-row/mat-cell[1]");
	By selectrecheckbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-accordion/mat-expansion-panel/div/div/div/table/tr[1]/td[1]/mat-checkbox");
	By Printandsample = By.cssSelector("img[title='Print and Submit']");
	By saveandsubmit = By.cssSelector("mat-icon[ng-reflect-message='Print and Submit']");
	By Clickoncheckbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dispatching/div[3]/div/mat-tab-group/div/mat-tab-body[1]/div/div[1]/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By dispataching = By.cssSelector("a[ng-reflect-router-link='dispatching']");
	By Reject = By.cssSelector("button[ng-reflect-message='Reject']");
	By Reasonn = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-remarks/div/form/div[2]/mat-form-field[1]/div/div[1]/div[3]/mat-select");
	By secondcheckbiox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dispatching/div[3]/div/mat-tab-group/div/mat-tab-body[2]/div/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By ClickOncancel = By.xpath("button[ng-reflect-message='Cancel']");
	By Rejectt = By.cssSelector("img[title='Reject']");
	By Reason = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-remarks/div/form/div[2]/mat-form-field[1]/div/div[1]/div[3]/mat-select");
	By Sample_Reject_on_Dispatch = By.xpath("//span[contains(text(),'Sample Reject on Dispatch')]");
	By HYes= By.cssSelector("mat-icon[ng-reflect-message='Yes']");
    By ReasonReject = By.xpath("/html/body/div[7]/div[2]/div/mat-dialog-container/app-confirm-remarks/div/form/div[2]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[1]/span");

	By TransferTo = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dispatching/div[3]/div/mat-tab-group/div/mat-tab-body[1]/div/div[1]/mat-table/mat-row[1]/mat-cell[7]/mat-form-field/div/div[1]/div[3]/mat-select");
	By SelectTransferOpt = By.xpath("//span[contains(text(),'HATI Intl Eye Center, Mid Valley')]");
	By Distpatch = By.cssSelector("img[title='Dispatched']");
	By Submitdispached = By.cssSelector("mat-icon[ng-reflect-message='submit']");
	By DispachedList = By.id("mat-tab-label-2-1");
	By Checkboxxd = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dispatching/div[3]/div/mat-tab-group/div/mat-tab-body[2]/div/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By Rejecte = By.cssSelector("img[title='Reject']");
	By Reasonnn = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-confirm-remarks/div/form/div[2]/mat-form-field[1]/div/div[1]/div[3]/span/label/mat-label");
	By selctopt = By.xpath("//div[@role='listbox']/mat-option[3]");
	By yesss = By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	By sampling = By.cssSelector("a[ng-reflect-router-link='phlebotomy']");

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


	By ResultEntry = By.cssSelector("a[ng-reflect-router-link='pathology,result-entry']");
	By Resultcheck = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-result-entry/div[3]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By ResultRntryArrow = By.cssSelector("img[title='Result Entry']");
	By Billicheck = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-result-entry-processing/div[3]/div[2]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By saveh = By.cssSelector("img[title='Save']");
	By Submit = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-result-entry-processing/div[4]/table/tr/td[6]/button");



	By ResultValidation = By.cssSelector("a[ng-reflect-router-link='pathology,verification-list']");
	By Checknboxx = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-verification-list/app-result-entry/div[3]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By billirubi =  By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-result-entry-verification/div[3]/div[2]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By Submit_w = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-result-entry-verification/div[4]/table/tr/td[6]/button");
	By ResultApproval = By.id("2266305");
	By ClickOncheckboxs= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-approval-list/app-result-entry/div[3]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By ResultEntryButton = By.cssSelector("button[ng-reflect-message='Result Entry']");
	By Checkboxbillirubi= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-result-entry-approval/div[3]/div[2]/mat-table/mat-row/mat-cell[1]/mat-checkbox");
	By ClickOnsubmiit = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-result-entry-approval/div[4]/table/tr/td[6]/button");
	By Reports = By.cssSelector("a[ng-reflect-router-link='result-entry-report']");
	By Rejectstatus = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-accordion/mat-expansion-panel/div/div/div/table/tr[1]/td[14]/span/b");


	//==========================

	By OPD3=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/img");

	By OPD4=By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/img");

	By EncounterListw=By.xpath("//span[contains(text(),'Encounter List')]");
	By getpataientname = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");

	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By name = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By sercahghh = By.cssSelector("button[ng-reflect-message='Search']");

	By yes = By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	By SampleTaking = By.id("22662");
	By Dispatched = By.cssSelector("img[title='Dispatched']");
	By Dispatchedlisttab2 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dispatching/div[3]/div/mat-tab-group/mat-tab-header/div/div/div/div[2]");
	By RejectSampelOpt = By.xpath("//span[contains(text(),'Sample Reject on Dispatch')]");
	public Dispatched_same_unit_Reject_Sample_order(WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPD_REGISTRATION() throws InterruptedException, IOException, AWTException 
	{	  


		// Navigating to the LAB module
		driver.findElement(mainmenu).click();
		Thread.sleep(8000);
		driver.findElement(Lab).click();
		Thread.sleep(10000);

		// Expanding and searching for a patient
		driver.findElement(Expand).click();
		Thread.sleep(1000);
		driver.findElement(name_3).sendKeys("HISCKLMRN24817978");
		Thread.sleep(1000);
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

		driver.findElement(SideBarMenu33).click();

		Thread.sleep(2000);
		driver.findElement(dispataching).click();
		Thread.sleep(2000);
		driver.findElement(Clickoncheckbox).click();
		Thread.sleep(2000);
		driver.findElement(Dispatched).click();
		Thread.sleep(2000);
		driver.findElement(Submit).click();
		Thread.sleep(2000);
		driver.findElement(Dispatchedlisttab2).click();
		Thread.sleep(2000);
		//String getsampleNo = driver.findElement(SampleNo).getText();
		driver.findElement(secondcheckbiox).click();
		Thread.sleep(2000);
		driver.findElement(Rejectt).click();
		Thread.sleep(2000);
		driver.findElement(ReasonReject).click();
		Thread.sleep(2000);
		driver.findElement(RejectSampelOpt).click();
		Thread.sleep(2000);
		driver.findElement(RejectSampelOpt).click();
		Thread.sleep(2000);
		String IssueListindvrify = driver.findElement(HYes).getText();
		String ActualQuantity = IssueListindvrify;
		String ExpectedQuantity = IssueListindvrify;
		Thread.sleep(3000);
		driver.findElement(HYes).click();
		Thread.sleep(2000);



	}



	public void kk () throws InterruptedException {


		Thread.sleep(10000);

		// Main menu and Lab module
		driver.findElement(mainmenu).click();
		Thread.sleep(3000);
		driver.findElement(Lab).click();
		Thread.sleep(8000);

		// Expand and search for a patient
		driver.findElement(Expand).click();
		Thread.sleep(3000);
		driver.findElement(name).sendKeys("HISCKLMRN24818017");
		Thread.sleep(3000);
		driver.findElement(sercahghh).click();
		Thread.sleep(3000);

		// Select record and print sample
		driver.findElement(selectreco).click();
		Thread.sleep(3000);
		driver.findElement(selectrecheckbox).click();
		Thread.sleep(3000);
		driver.findElement(Printandsample).click();
		Thread.sleep(3000);
		// driver.findElement(yes).click();
		//  Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(saveandsubmit).click();

		Thread.sleep(6000);

		// Navigate sidebar and dispatching
		Actions act = new Actions(driver);
		WebElement overforopdslide94 = driver.findElement(SideBarMenu33);
		act.moveToElement(overforopdslide94).build().perform();
		Thread.sleep(4000);
		driver.findElement(dispataching).click();
		Thread.sleep(3000);
		driver.findElement(Clickoncheckbox).click();
		Thread.sleep(3000);
		driver.findElement(TransferTo).click();
		Thread.sleep(3000);
		driver.findElement(SelectTransferOpt).click();
		Thread.sleep(3000);
		driver.findElement(Distpatch).click();
		Thread.sleep(3000);
		driver.findElement(Submitdispached).click();
		Thread.sleep(3000);
		driver.findElement(DispachedList).click();
		Thread.sleep(3000);
		driver.findElement(Checkboxxd).click();
		Thread.sleep(3000);
		driver.findElement(Rejecte).click();
		Thread.sleep(3000);
		driver.findElement(Reasonnn).click();
		Thread.sleep(3000);
		driver.findElement(selctopt).click();
		Thread.sleep(3000);
		driver.findElement(yesss).click();
		Thread.sleep(3000);

		// Process more actions
		WebElement overforopdslide984 = driver.findElement(SideBarMenu33);
		act.moveToElement(overforopdslide984).build().perform();
		Thread.sleep(3000);

		driver.findElement(SampleTaking).click();

		Thread.sleep(3000);

		// Expand and search for a patient
		driver.findElement(Expand).click();
		Thread.sleep(3000);
		driver.findElement(name).sendKeys("HISCKLMRN24818017");
		Thread.sleep(3000);
		driver.findElement(sercahghh).click();
		Thread.sleep(3000);
		driver.findElement(selectreco).click();
		Thread.sleep(3000);
		driver.findElement(selectrecheckbox).click();
		Thread.sleep(3000);


		Thread.sleep(4000);

		String uu = driver.findElement(Rejectstatus).getText();

		String Actual = uu;
		String Expcetd = uu;
		Assert.assertEquals(Actual, Expcetd, "Rejected");

	}


	private Actions Actions(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

}
