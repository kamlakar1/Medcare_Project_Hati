package MRDPages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import OPDTest.DeleteExcelRowWithSelenium;
public class Allocated_Unallocated_Transferred_File_Acceptance_Back_to_MRD_Receive_MRD_Receive
{
	//private static final By UploadImhe = null;
	WebDriver driver=null;
	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By addvolquntity_1 = By.cssSelector("input[ng-reflect-maxlength='2']");
	By mainmenu2=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[2]");
	By mainmenu_2 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[2]");
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


	By Lab=By.xpath("//span[contains(text(),'MRD')]");


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

	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By mrnnn = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By sercahghh = By.cssSelector("button[ng-reflect-message='Search']");

	By mrnnm = By.cssSelector("input['ng-reflect-placeholder='MRN']");

	By Checkboxclick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-request/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr/td[1]/mat-checkbox/label/span[1]");
	By addvoloume = By.id("70106");
	By ExpandCollapse = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	By AddVolume = By.cssSelector("mat-icon[ng-reflect-message='Add Volume']");
	By MRN = By.cssSelector("input[ng-reflect-name='mrn']");
	By Add = By.cssSelector("mat-icon[ng-reflect-message='Add']");
	By addvolquntity = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-add-volume/div[2]/mat-grid-list[1]/div/mat-grid-tile/div/mat-form-field/div/div[1]/div[3]/input");
	By RequisetedBy = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-add-volume/div[2]/mat-grid-list[2]/div/mat-grid-tile/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By jevamela = By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[2]/span");
	By volsave = By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By volback = By.cssSelector("mat-icon[ng-reflect-message='Back']");
	By MRDREQ = By.id("70101");
	By checkboxreq = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-request/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr/td[1]");
	By vollist = By.cssSelector("mat-icon[ng-reflect-message='Volume']");

	By volslistcheckbox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-select-volume/div/div[2]/div/table/tbody/tr[1]/td[1]/mat-checkbox/label/span[1]");
	By voladdd= By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-select-volume/div/div[3]/button/span[1]/mat-icon");
	By Allocate = By.cssSelector("mat-icon[ng-reflect-message='Allocate']");
	By Yessss = By.cssSelector("button[ng-reflect-message='Yes']");	
	By Transfer = By.cssSelector("mat-icon[ng-reflect-message='Transferred']");		
	By Selectreco = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-request/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr/td[1]/mat-checkbox/label/span[1]");
	By FileAcceptance = By.id("70103");
	By Fileacceptancecheckbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-acceptance/mat-tab-group/div/mat-tab-body[1]/div/div[2]/table/tbody/tr/td[1]/mat-checkbox");		
	By backtommrd = By.cssSelector("mat-icon[ng-reflect-message='Back To MRD Receive']");

	By Accept = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-acceptance/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/div/button[1]/span[1]/mat-icon");
	By Unallocate = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-request/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/div/button[2]/span[1]/mat-icon");
	By Requested = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-request/mat-grid-list/div/mat-grid-tile[6]/div/mat-form-field/div/div[1]/div[3]/a/mat-select");
	By Allocatedselect = By.xpath("//span[contains(text(),'Allocated')]");
	By getmrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-request/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr/td[6]");
	By Add_volumee= By.cssSelector("mat-icon[ng-reflect-message='Add Volume']");
	//By RequisetedBy_1 = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-add-volume/div[2]/mat-grid-list[2]/div/mat-grid-tile/div/mat-form-field/div/div[1]/div[3]/mat-select");
	//By RequisetedBy_1 = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-add-volume/div[2]/mat-grid-list[2]/div/mat-grid-tile/div/mat-form-field/div/div[1]/div[3]/mat-select");
	
	By RequisetedBy_1 = By.cssSelector("div[ng-reflect-ng-switch='true']");
	By jevamela_1 = By.xpath("//span[contains(text(),'Jeva  Mela')]");

	By volslistcheckbox_1= By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-select-volume/div/div[2]/div/table/tbody/tr[1]/td[1]");

	By Allocate1 = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-select-volume/div/div[3]/button/span[1]/mat-icon");

	By Allocate_2 = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-mrd-request/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/div/button[1]/span[1]/mat-icon");
	public Allocated_Unallocated_Transferred_File_Acceptance_Back_to_MRD_Receive_MRD_Receive(WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPD_REGISTRATION() throws InterruptedException, IOException, AWTException 
	{	  


		// Create object and take the data from another class
		DeleteExcelRowWithSelenium  data = new DeleteExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);

		driver.navigate().refresh();

		Thread.sleep(8000);


	
		driver.findElement(mainmenu).click();

		//BillIcon
		Thread.sleep(5000);
		driver.findElement(Lab).click();
		Thread.sleep(5000);

		String kk = driver.findElement(getmrn).getText();

		driver.findElement(Expand).click();
		Thread.sleep(5000);
		driver.findElement(mrnnn).sendKeys(kk);
		Thread.sleep(5000);
		driver.findElement(sercahghh).click();
		Thread.sleep(5000);


		Actions actt = new Actions(driver);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		actt.moveToElement(overforopdslide1).perform();
		Thread.sleep(5000);
		driver.findElement(addvoloume).click();
		Thread.sleep(5000);
		driver.findElement(Add_volumee).click();
		Thread.sleep(5000);
		driver.findElement(ExpandCollapse).click();
		Thread.sleep(5000);
		driver.findElement(MRN).sendKeys(kk);
		Thread.sleep(5000);
		driver.findElement(sercahghh).click();
		//Thread.sleep(5000);
		//  driver.findElement(AddVolume).click();
		// Thread.sleep(5000);
		// driver.findElement(Expand).click();
		//Thread.sleep(5000);
		// driver.findElement(MRN).sendKeys(kk);
		// Thread.sleep(5000);
		//driver.findElement(sercahghh).click();
		Thread.sleep(5000);
		driver.findElement(Add).click();
		Thread.sleep(5000);
		driver.findElement(addvolquntity_1).sendKeys("2");
		Thread.sleep(5000);
		driver.findElement(RequisetedBy_1).click();
		Thread.sleep(5000);
		driver.findElement(jevamela_1).click();
		Thread.sleep(5000);
		driver.findElement(volsave).click();
		Thread.sleep(5000);
		driver.findElement(volback).click();
		Thread.sleep(5000);
		WebElement overforopdslide7=driver.findElement(SideBarMenu);
		actt.moveToElement(overforopdslide7).build().perform();
		Thread.sleep(5000);
		driver.findElement(MRDREQ).click();
		Thread.sleep(5000);
		driver.findElement(Expand).click();
		Thread.sleep(5000);
		driver.findElement(mrnnn).sendKeys(kk);
		Thread.sleep(5000);
		driver.findElement(sercahghh).click();
		Thread.sleep(5000);

		driver.findElement(checkboxreq).click();
		Thread.sleep(8000);

		Robot robot = new Robot(); for (int i = 0; i < 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); }





		Thread.sleep(5000);
		driver.findElement(vollist).click();
		Thread.sleep(5000);
		driver.findElement(volslistcheckbox_1).click();
		Thread.sleep(5000);
		//driver.findElement(voladdd).click();
		Thread.sleep(5000);



		driver.findElement(Allocate1).click();
		Thread.sleep(5000);
		driver.findElement(Allocate_2).click();
		
		driver.findElement(Yessss).click();
		Thread.sleep(5000);



		//	driver.findElement(Requested).click();
		//	Thread.sleep(5000);
		//	driver.findElement(Allocatedselect).click();

		Thread.sleep(5000);
		driver.findElement(checkboxreq).click();
		Thread.sleep(5000);
		driver.findElement(Unallocate).click();
		Thread.sleep(5000);
		driver.findElement(Yessss).click();
		Thread.sleep(5000);


		/*
		driver.findElement(Selectreco).click();
		Thread.sleep(5000);
		driver.findElement(Transfer).click();
		Thread.sleep(5000);
		driver.findElement(Yessss).click();
		Thread.sleep(5000);
		Actions acttt= new Actions(driver);
		WebElement overforopdslide10=driver.findElement(SideBarMenu);
		acttt.moveToElement(overforopdslide10).build().perform();
		Thread.sleep(5000);
		driver.findElement(FileAcceptance).click();
		Thread.sleep(5000);
		driver.findElement(Expand).click();
		Thread.sleep(5000);
		driver.findElement(mrnnn).sendKeys(Secondday);
		Thread.sleep(5000);
		driver.findElement(sercahghh).click();
		Thread.sleep(5000);
		driver.findElement(Fileacceptancecheckbox).click();
		Thread.sleep(5000);
		driver.findElement(Accept).click();
		Thread.sleep(5000);
		driver.findElement(Yessss).click();
		Thread.sleep(5000);
		driver.findElement(Fileacceptancecheckbox).click();
		Thread.sleep(5000);
		driver.findElement(backtommrd).click();
		Thread.sleep(5000);
		driver.findElement(Yessss).click();

		 */

	}
	private Actions Actions(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

}
