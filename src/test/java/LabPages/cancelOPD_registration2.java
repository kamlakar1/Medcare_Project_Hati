package LabPages;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class cancelOPD_registration2
{
	//private static final By UploadImhe = null;
	WebDriver driver=null;
	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");

	By OPDMenu=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
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
	By ServiceSelect2=By.xpath("/html/body/div[2]/div/div/div/mat-option/span/span[1]");

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
    By currentmrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-row[1]/mat-cell[1]");
    By checkbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/mat-tab-group/div/mat-tab-body[1]/div/div/mat-table/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/mat-checkbox");
    By print = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-phlebotomy/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/section/div/div/div[1]/button/span[1]/mat-icon");





	public cancelOPD_registration2(WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPD_REGISTRATION(String PrimaryIdNumber12,String ExparyDatePar,String FullNamePar,String DateOfBirthPar,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar) throws InterruptedException, IOException, AWTException 
	{	  

		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(5000);
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

		Thread.sleep(1000);
		driver.findElement(PrimaryIdentificationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(1000);
		driver.findElement(PrimaryIdentificationselOpt).click();

		//Select Primary Id Number
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());
		Long id=d.getTime();

		Thread.sleep(1000);
		driver.findElement(PrimaryIdNumber).sendKeys(PrimaryIdNumber12+id);

		//Expire date
		Thread.sleep(1000);
		driver.findElement(ExpirayDate).sendKeys(ExparyDatePar);

		Thread.sleep(2000);
		//filling Personal Information
		//Selecting Title
		driver.findElement(TitleClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(2000);
		driver.findElement(TitleSelOpt).click();

		//ENtering data in name filed
		Thread.sleep(2000);
		driver.findElement(Fullname).sendKeys(FullNamePar);
/*
		//Selecting gender
		Thread.sleep(1000);
		driver.findElement(GenderClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		Thread.sleep(1000);
		driver.findElement(GenderSelOpt).click();

*/
		//Selecting race
		Thread.sleep(1000);
		driver.findElement(Nationalisty).click();
		//Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		Thread.sleep(1000);
		driver.findElement(Algeriya).click();
		Thread.sleep(1000);



		//Selecting race
		Thread.sleep(1000);
		driver.findElement(Race).click();
		//Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		Thread.sleep(2000);
		driver.findElement(healthtourist).click();
		Thread.sleep(1000);


		//Selecting martial status
		Thread.sleep(1000);
		driver.findElement(MaritalStatusClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Married");
		Thread.sleep(1000);
		driver.findElement(MaritalStatusSelOpt).click();

		//Selecting Religion
		Thread.sleep(1000);
		driver.findElement(ReliginClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Islam");
		Thread.sleep(1000);
		driver.findElement(ReliginClickSelOpt).click();	
		//date of birth
		Thread.sleep(1000);
		driver.findElement(DateOfBirth).sendKeys(DateOfBirthPar);

		//Patient category
		Thread.sleep(1000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Public");
		Thread.sleep(1000);
		driver.findElement(PatientCategorySelOpt).click();


		//Tab1

		//Clicking on tab Address and content details
		Thread.sleep(1000);
		driver.findElement(AddressAndContactDetail).click();	

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Selecting Country
		Thread.sleep(1000);
		driver.findElement(countryClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(countrySelOpt).click();

		//Selecting State
		Thread.sleep(2000);
		driver.findElement(StateClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Negeri Sembilan");
		Thread.sleep(2000);
		driver.findElement(StateSelOpt).click();

		//Selecting City
		Thread.sleep(1000);
		driver.findElement(cityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Seremban");
		Thread.sleep(1000);
		driver.findElement(citySelopt).click();

		//Selecting Area
		Thread.sleep(1000);
		driver.findElement(AreaClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(AreaSelOpt).click();

		//Selecting Postcode
		Thread.sleep(1000);
		driver.findElement(PostCode).sendKeys(PostCodePar);
		//Residential Address
		Thread.sleep(2000);
		driver.findElement(ResAddress).sendKeys(ResidentialAddressPar);
		//Contact Information

		//Country Code
		Thread.sleep(1000);
		driver.findElement(CountryCodeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(1000);
		driver.findElement(CountryCodeSelOpt).click();

		//Mobile Number
		Thread.sleep(1000);
		driver.findElement(MobileNumberClick).sendKeys(MobileNumberPar);

		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(SaveButton).click();

		//Clicking on ok dialog
		Thread.sleep(3000);
		driver.findElement(OkDialog).click();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShot//OPDRegistration.png"));  

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(2000);
		driver.findElement(EncounterTab).click();
		//Selecting Encounter Type
		Thread.sleep(1000);
		driver.findElement(EncounterTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(1000);
		driver.findElement(EncounterTypeSelOpt).click();

		//Selecting Specialty
		Thread.sleep(1000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("General Medicine");
		Thread.sleep(1000);
		driver.findElement(SpecilitySelOPt).click();

		//Selecting Doctor
		Thread.sleep(1000);
		driver.findElement(DoctorClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("DATO DR PHIL OSMAN");
		Thread.sleep(1000);
		driver.findElement(DoctorSelOpt).click();
/*
		//selecting Tariff	 
		Thread.sleep(3000);
		driver.findElement(TariffClick).click();	
		Thread.sleep(3000);
		driver.findElement(TariffSelOpt).click();
*/
		Thread.sleep(2000);
		driver.findElement(Dependenttab).click();

		Thread.sleep(2000);
		driver.findElement(Title).click();
		Thread.sleep(2000);
		driver.findElement(TitleSelOpt).click();

		Thread.sleep(2000);
		driver.findElement(Name).sendKeys("radhika");
		Thread.sleep(2000);
		driver.findElement(AddByReferel).click();


		//Click on Save Button
		Thread.sleep(2000);
		driver.findElement(SaveBUttonClick).click();

		//Click on Ok Button
		Thread.sleep(3000);
		driver.findElement(OkButtonClick).click();

		//Switching On Main Window
		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
		//Use the list of window handles to switch between windows
		Thread.sleep(1000);
		driver.switchTo().window((String)tabs.get(0));

		Actions act2=new Actions(driver);
		WebElement overforopdslide2=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside"));
		act2.moveToElement(overforopdslide2).build().perform();

		//Clicking on Encounter List
		Thread.sleep(5000);
		driver.findElement(EncounterList).click();	
		Thread.sleep(5000);
		String getmrn = driver.findElement(mrn).getText();

		//---OPBill---//
/*
		Actions act1 = Actions(driver);
		WebElement mainMenu=driver.findElement(mainmenu);
		act1.moveToElement(mainMenu).build().perform();
		act1.click(mainMenu).perform();
	*/	
		driver.findElement(mainmenu).click();

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
		driver.findElement(MRNsearch).sendKeys(getmrn);

		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//ServiceName
		Thread.sleep(3000);
		driver.findElement(ServiceName).sendKeys("   ");
	//	driver.findElement(ServiceName).sendKeys("Bilirubin COnjugated");

		//ServiceSelect
		Thread.sleep(1000);
		driver.findElement(ServiceSelect).click();
		Thread.sleep(1000);
		

		//AddButton 
		Thread.sleep(1000);
		driver.findElement(AddButton).click();

		//ServiceName
		Thread.sleep(1000);
		driver.findElement(ServiceName2).sendKeys("   ");
	//	driver.findElement(ServiceName2).sendKeys("glucose strip manual");

		//ServiceSelect
		Thread.sleep(1000);
		driver.findElement(ServiceSelect2).click();
		Thread.sleep(1000);
		//driver.findElement(ServiceName).click();

		//AddButton 
		Thread.sleep(1000);
		driver.findElement(AddButton).click();

		//OPChargeSave
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm1).click();




		Thread.sleep(3000);

		//Condition

		String Actual_1 = "Order updated Successfully";
		String Expected_1 = "Order updated Successfully";
		Assert.assertEquals(Actual_1, Expected_1, "Patient Charges Saved and applied");



		//FinalBill
		Thread.sleep(2000);
		driver.findElement(FinalBill).click();

		//SaveButton
		Thread.sleep(2000);
		driver.findElement(SaveButton).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();
		Thread.sleep(2000);
		//AddPartialAmmount
		/*
				WebElement l = driver.findElement(PartialAmount);
				// input text
				l.sendKeys("66");
				// sending Ctrl+a by Keys.Chord()
				String s = Keys.chord(Keys.CONTROL, "a");
				l.sendKeys(s);
				// sending DELETE key
				l.sendKeys(Keys.DELETE);
				Thread.sleep(4000);
				driver.findElement(PartialAmount).sendKeys("1");
		 */
		//PaymentAdd
		Thread.sleep(4000);
		driver.findElement(PaymentAdd).click();

		Thread.sleep(6000);
		Robot robot = new Robot(); for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); 

		}
		/*
				//ReceivedFrom 
				Thread.sleep(5000);
				driver.findElement(ReceivedFrom).sendKeys(ReceivedFromPar);

				//ID
				Thread.sleep(2000);
				driver.findElement(IdentificatioNo).sendKeys(IdentificationNoPar);
				//Remarks 
				Thread.sleep(2000);
				driver.findElement(Remarks).sendKeys(RemarksPar);
		 */
		//Save2
		Thread.sleep(2000);
		driver.findElement(SaveButton2).click();



		Thread.sleep(3000);

		//Condition

		String Actual_2 = "Do you want to proceed?";
		String Expected_2 = "Do you want to proceed?";
		Assert.assertEquals(Actual_2, Expected_2, "Patient Invoice Payement collected");



		//Confirm2
		Thread.sleep(2000);
		driver.findElement(Confirm2).click();



		Thread.sleep(7000);
		String windowHandle7 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs7 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs7.get(0));
/*
		Thread.sleep(2000);
		WebElement HoverSideBar1=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar1).build().perform();
*/
		//CheckIn
		Thread.sleep(3000);
		driver.findElement(CheckIn).click();
		
		Thread.sleep(2000);
		driver.findElement(mainmenu).click();

		//BillIcon
		Thread.sleep(2000);
		driver.findElement(Lab).click();
/*
		//SideMenuBar
		Thread.sleep(3000);
		WebElement SidebarMenuu=driver.findElement(SideBar);
		act.moveToElement(SidebarMenuu).build().perform();
		
	*/	
		Thread.sleep(2000);
		driver.findElement(CurrentOrder).click();
		Thread.sleep(1000);
		driver.findElement(currentmrn).click();
		Thread.sleep(1000);
		driver.findElement(checkbox).click();
		Thread.sleep(1000);
		driver.findElement(print).click();
		Thread.sleep(1000);
		


	}
	private Actions Actions(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

}
