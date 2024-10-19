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

@SuppressWarnings("deprecation")
public class Enter_media_observation_identification_Save_Submit_Result_Verification_Hold_Unhold
{
	//private static final By UploadImhe = null;
	WebDriver driver=null;
	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	By OPDMenu=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");

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

	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By Collapse = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	By mrnnn = By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	By sercahghh = By.cssSelector("button[ng-reflect-message='Search']");
	By getmrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entry/div[3]/mat-table/mat-row/mat-cell[14]");
	By Microbilogy = By.id("1567");	
	By ResultEntryDashboard = By.id("15678");

	//=======================================
	//Encounter details
	
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
   
    //===============================================================
    
    By Hold =  By.cssSelector("button[ng-reflect-message='Unhold']");
    By checkboxx= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-micro-result-entry/div[3]/mat-table/mat-row/mat-cell[1]/mat-checkbox/label/span[1]");
    By nogroth = By.xpath("//mat-option//span[contains(text(),'No Growth')]");
    By status = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[3]/mat-table/mat-row[1]/mat-cell[3]/mat-form-field/div/div[1]/div[3]/mat-select");
    By Completed = By.xpath("//mat-option//span[contains(text(),'Completed')]");
    By cultur = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
    By status2  = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
    By savesample = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation-details/div[4]/mat-grid-list/div/mat-grid-tile[4]/div/button[3]");
    By Yess = By.cssSelector("mat-icon[ng-reflect-message='Yes']");
    By Saave = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-sample-processing-dialog/div/div/form/div[2]/div/button[1]");   
    By mainmenu2=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[2]");
    public Enter_media_observation_identification_Save_Submit_Result_Verification_Hold_Unhold(WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPD_REGISTRATION() throws InterruptedException, IOException, AWTException 
	{	  
		
	
		

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(50))
		        .pollingEvery(Duration.ofSeconds(7))
		        .ignoring(NoSuchElementException.class);

		Actions act = new Actions(driver);


		Thread.sleep(5000);
		driver.findElement(mainmenu).click();
		//BillIcon
		Thread.sleep(5000);
		driver.findElement(Lab).click();
		Thread.sleep(8000);
		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		Actions actt= new Actions(driver);
		WebElement overforopdslide1=driver.findElement(SideBar);
		actt.moveToElement(overforopdslide1).build().perform();
		WebElement Microbilogy11 = wait.until(ExpectedConditions.elementToBeClickable(Microbilogy));
		Microbilogy11.click();
		//driver.findElement(Microbilogy).click();
		WebElement MediaObservation1 = wait.until(ExpectedConditions.elementToBeClickable(ResultEntryDashboard));
		MediaObservation1.click();
		//Thread.sleep(5000);
		//driver.findElement(MediaObservation).click();
		WebElement Expand1 = wait.until(ExpectedConditions.elementToBeClickable(Expand));
		Expand1.click();
	//	driver.findElement(Expand).click();
		WebElement mrnnn1 = wait.until(ExpectedConditions.elementToBeClickable(mrnnn));
		mrnnn1.sendKeys("HISCKLMRN24512385");
		//driver.findElement(mrnnn)
		WebElement sercahghh1 = wait.until(ExpectedConditions.elementToBeClickable(sercahghh));
		sercahghh1.click();
		//driver.findElement(sercahghh).click();
		//driver.findElement(edit).click();
		WebElement checkboxx1 = wait.until(ExpectedConditions.elementToBeClickable(checkboxx));
		checkboxx1.click();
		//driver.findElement(Growth).click();
		WebElement Hold1 = wait.until(ExpectedConditions.elementToBeClickable(Hold));
		Hold1.click();
		WebElement Saave1 = wait.until(ExpectedConditions.elementToBeClickable(Saave));
		Saave1.click();
	//	driver.findElement(nogroth).click();
		/*
		WebElement status1 = wait.until(ExpectedConditions.elementToBeClickable(status));
		status1.click();
	//	driver.findElement(status).click();
		WebElement Pending1 = wait.until(ExpectedConditions.elementToBeClickable(Completed));
		Pending1.click();
		//driver.findElement(Pending).click();
		WebElement cultur1 = wait.until(ExpectedConditions.elementToBeClickable(cultur));
		cultur1.click();
		Thread.sleep(5000);
		//nogroth1.click();
		WebElement nogroth13 = wait.until(ExpectedConditions.elementToBeClickable(nogroth));
		nogroth13.click();
		//driver.findElement(cultur).click();
		WebElement status21 = wait.until(ExpectedConditions.elementToBeClickable(status2));
		status21.click();
		WebElement Pending21 = wait.until(ExpectedConditions.elementToBeClickable(Completed));
		Pending21.click();
		//driver.findElement(status2).click();
		WebElement savesample1 = wait.until(ExpectedConditions.elementToBeClickable(savesample));
		savesample1.click();
		//driver.findElement(savesample).click();
		WebElement Yess1 = wait.until(ExpectedConditions.elementToBeClickable(Yess));
		Yess1.click();
		//driver.findElement(Yess).click();
		WebElement overforopdslide12=driver.findElement(SideBar);
		actt.moveToElement(overforopdslide12).build().perform();
		Thread.sleep(5000);
		Microbilogy11.click();
		WebElement Microbilogy111 = wait.until(ExpectedConditions.elementToBeClickable(Microbilogy));
		Microbilogy111.click();
		//driver.findElement(Microbilogy).click();
		WebElement MediaObservation11 = wait.until(ExpectedConditions.elementToBeClickable(MediaObservation));
		MediaObservation11.click();
		//driver.findElement(MediaObservation).click();
		WebElement Expand11 = wait.until(ExpectedConditions.elementToBeClickable(Collapse));
		Expand11.click();
	//	driver.findElement(Expand).click();
		WebElement mrnnn11 = wait.until(ExpectedConditions.elementToBeClickable(mrnnn));
		mrnnn11.sendKeys("HISCKL230600444");
		//driver.findElement(mrnnn)
		WebElement sercahghh11 = wait.until(ExpectedConditions.elementToBeClickable(sercahghh));
		sercahghh11.click();
		Thread.sleep(5000);
		//	String verifymrn = driver.findElement(getmrn).getText();

		String verifymrn = driver.findElement(getmrn).getText();
		String Actualmrn = verifymrn;
		String Expectedmrn = verifymrn;
		Assert.assertEquals(Actualmrn, Expectedmrn, "Returno has been verified sucessfully");
*/

	}

}
