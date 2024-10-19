package BillingPages_2;

import java.awt.AWTException;
import java.awt.Robot;
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

public class ADTAdmissionFormwith_Convert_Charges_OP_To_IP 
{
	WebDriver driver;

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//img[@src='../../../assets/images/master-icons/adt.png']");
	//By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.cssSelector("a[ng-reflect-router-link='admission-form-new']");


	//Main Search
	By MainSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//Click on MRN
	By MRNClick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick=By.cssSelector("button[ng-reflect-message='Search']");

	//Outstanding Click on Ok Button
	By OutstandingOkClick=By.cssSelector("mat-icon[ng-reflect-message='Ok']");

	//Error Outstanding info close dialog
	//By OutstandingInfoClose=By.xpath("/html/body/div[2]/div[4]/div/mat-dialog-container/app-info-dialog/div/form/div[1]/span/mat-icon");

	//Op to Ip Conversion
	//Close button
	By CloseClick=By.cssSelector("mat-icon[ng-reflect-message='Close']");
	//Clcik on Check box
	By CheckBoxClick=By.id("Check All Services");
	//Click on Plus Button Conversion
	By PlusButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Episode Conversion']");

	//Click on Confirmation Yes button
	By ConfirmationYesClick=By.xpath("//span[contains(text(),'Yes')]");


	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//General Information
	By TypeOfAdmissionClick=By.cssSelector("mat-select[ng-reflect-name='typeOfAdmission']");
	By TypeOfAdmissionSelopt=By.xpath("//span[contains(text(),'Elective')]");

	//Reason for admission
	By ReasonForAdmissionClick=By.cssSelector("mat-select[ng-reflect-name='reasonForAdmission']");
	By ReasonForAdmissionSelOpt=By.xpath("//span[contains(text(),'Observation')]");

	//Selecting Doctor Specialty
	By DoctorSpecialityClick=By.cssSelector("mat-select[ng-reflect-name='doctorSpeciality']");
	By DoctorSpecialitySelOpt=By.xpath("//span[contains(text(),'General Surgery')]");

	//Doctor
	By DoctorClick=By.cssSelector("mat-select[formcontrolname='doctor']");
	By DoctorSelOpt=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");

	//Admission Time
	By AdmissionTimeClick=By.cssSelector("input[formcontrolname='admissionTime']");


	//Patient Meal Preferences
	By PatientMealClick=By.cssSelector("mat-select[ng-reflect-name='patientMealPreference']");
	By PatientMealSelOpt=By.xpath("//span[contains(text(),'Children')]");

	//Attendance Meal Reference
	By AttendenceMealClick=By.cssSelector("mat-select[ng-reflect-name=\"attendanceMealReference\"]");
	By AttendenceMealSelOpt=By.xpath("//span[contains(text(),'MAC Vegetarian')]");

	//Length Of Stay
	By LengthStayClick=By.cssSelector("input[formcontrolname='lengthOfStay']");

	//Admitting Diagnosis
	By AdmittingDiagnosisClick=By.cssSelector("input[formcontrolname='admittingDiagnosis']");

	//Admission Notes
	By AdmissionNotesclick=By.cssSelector("mat-icon[ng-reflect-message='Admission Notes']");

	//Add Notes
	By AddNotesclick=By.cssSelector("input[ng-reflect-name='notes']");

	//Add remark Button
	By AddRemarkButtonclick=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");

	//close button
	By CloseButton=By.cssSelector("mat-icon[ng-reflect-message='Close']");

	//Patient Notes
	By PatientNotes=By.cssSelector("input[formcontrolname='patientNotes']");

	//Admission Remark
	By Admissionremark=By.cssSelector("input[formcontrolname='remarks']");

	//Bill Estimation No
	By BillEstimationNoClick=By.cssSelector("input[ng-reflect-placeholder='Bill Estimation No']");

	//Referral Details

	//Referral Type
	By ReferraltypesClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelopt=By.xpath("//span[contains(text(),'Emergency Referral')]");

	//Referral
	By RefferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By RefferralSelopt=By.xpath("//span[contains(text(),'Dato' Dr. Jefri Zain')]");

	//Referral Remarks
	By ReferralRemarkClick=By.cssSelector("input[ng-reflect-placeholder='Referral Remarks']");

	//Assigned Bed
	//Click on Add button
	By AddButtonClick=By.xpath("//div[@class='divBedDetails']/b/a[1]");

	//Select ward
	By SelectWardClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Ward']");
	By ALlSelOpt=By.xpath("//span[contains(text(),'Ward W3-A')]");

	//clicking on search
	By SearchClick=By.xpath("//a/mat-icon[contains(text(),'search')]");

	//Select Bed
	By BedClick=By.xpath("//img[@src='../assets/images/Bed-vacant.png'][1]");

	//Click on Save Button
	By SaveButtonClick=By.cssSelector("button[type='submit']");

	//Doctor Specialty
	By AttendingDoctorSpecialityClick=By.cssSelector("mat-select[ng-reflect-name='dept']");
	By AttendingDoctorSpecialitySelOpt=By.xpath("//span[contains(text(),'Cardiology')]");

	//Selecting doctor
	By AttendingDoctorClick=By.cssSelector("mat-select[data-automation-attribute='sltdepartment']");
	By AttendingDoctorSelOpt=By.xpath("//span[contains(text(),'Dr. Salina Yusof')][1]");

	//Add Attending Doctor
	By AddAttendingDoctorclick=By.cssSelector("mat-icon[ng-reflect-message='Add Attending Doctor']");

	//Selecting Tab

	//Selecting Tab1 Payer Details
	By PayerDetailsTabclick=By.cssSelector("div[aria-controls='mat-tab-content-1-0']");

	//Select Tariff
	By TariffClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-payer-list/div/div[2]/table/tbody/tr[2]/td[4]/mat-select");
	By TariffSelOpt=By.xpath("//span[contains(text(),'Self Tariff')]");

	//Clicking on TAb2 Next Of Kin
	By NextOfKinClick=By.xpath("//mat-icon[contains(text(),'how_to_reg')]");

	//Title
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='kinPrefix']");
	By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Datuk')]");

	//Name
	//By Namejh=By.cssSelector("input[ng-reflect-placeholder='Name']");
	By NameClick=By.cssSelector("input[formcontrolname='kinName']");

	//Relation
	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='kinRelation']");
	By RelationSelOpt=By.xpath("//span[contains(text(),'Wife')]");

	//Primary Identification
	By PrimaryIdentificationClick=By.cssSelector("mat-select[ng-reflect-name='kinIDType']");
	By PrimaryIdentificationSelOpt=By.xpath("//span[contains(text(),'Passport')]");

	//Identification No
	By IdentificationNoClick=By.cssSelector("input[formcontrolname='kinIDDesc']");

	//PhoneNumber
	By PhoneNumberClick=By.cssSelector("input[ng-reflect-name='Kinmobile']");

	//Permanent Address
	//Address
	By AddressClick=By.cssSelector("input[formcontrolname='kinAdress']");

	//Country
	By CountryClick=By.cssSelector("mat-select[formcontrolname='kinCountry']");
	By CountrySelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

	//State
	By StateClick=By.cssSelector("mat-select[formcontrolname='kinState']");
	By StateSelOpt=By.xpath("//span[contains(text(),'Negeri Sembilan')]");

	//city
	By CityClick=By.cssSelector("mat-select[formcontrolname='kinDist']");
	By CitySelOpt=By.xpath("//span[contains(text(),'Nilai')]");

	//Zipcode
	By ZipCodeClick=By.cssSelector("input[formcontrolname='kinPincode']");

	//Tab3 Documents
	By DocumentsClickTab=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[3]");

	//Uplad Document

	By UploadDocClick=By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");

	//Choose Button
	By ChooseButtonClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[2]/table/tr/td/input");

	//Upload Button
	By UploadClick=By.cssSelector("mat-icon[ng-reflect-message='Upload']");

	//Save Button
	By SaveBtnClick=By.xpath("//div[@class='footer-btn-block']/div/button[3]");
	//Yes BUtton
	By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	By AdvancedSearchClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon");
	//MRN
	By MRNSearchClick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchClick12=By.cssSelector("button[ng-reflect-message='Search']");

	By Tableclick=By.cssSelector("tbody[role='rowgroup']");
	//Clicking on row
	By ROWClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]");
	//Update Satus
	By UpdateStatus=By.cssSelector("img[ng-reflect-message='Update Status']");

	//Status
	By StatusClick=By.cssSelector("mat-select[ng-reflect-name='first']");
	By StatusSelopt=By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[2]/span");

	//Remarks
	By RemarksClick12=By.cssSelector("input[ng-reflect-name='remarks']");

	//Confirm 
	By ConfirmButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Confirm']");

	//Taking MRN from dashboard
	By MRNNumberClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");

	//clicking on billing menu
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	//IP Charges
	By IPChargesClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/ul/li[5]/a/span[1]");
	//advanced search
	By AdvancedSearchClick2=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By MRNCLick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick2=By.cssSelector("button[ng-reflect-message='Search']");

	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//img[@src='../../../assets/images/master-icons/out-patient.png']");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By RegistrationMenu=By.cssSelector("a[id='2004']");
	By EncounterList=By.cssSelector("a[id='2006']");

	//Selecting Tab
	//Adding Insurance payer
	//Add insurance button
	By AddInsuranceClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-payer-list/div/div[1]/button/span[1]/mat-icon");
	//Payer Type
	By PayerTypeClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-payer-list/div/div[2]/table/tbody/tr[2]/td[2]/mat-select/div/div[1]");
	By PayerTypeSelOpt=By.xpath("//span[contains(text(),'Insurance (PAYTYPE002)')]");

	//Payer
	By PayerClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-payer-list/div/div[2]/table/tbody/tr[2]/td[3]/mat-select");
	By PayerSelOpt=By.xpath("//span[contains(text(),'AIA Berhad (PAYER002)')]");

	//TariffInsurance2
	By TariffInsuranceClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-payer-list/div/div[2]/table/tbody/tr[2]/td[4]/mat-select");
	By TariffInsuranceSelOpt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//selecting Tariff
	//By TariffClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/table/tbody/tr[2]/td[4]/mat-select");
	//By TariffSelOpt1=By.xpath("//span[contains(text(),'Self Tariff')]");

	//Contract
	By ContractClick=By.cssSelector("mat-select[data-automation-attribute='encounterContract1']");
	By ContractSelOpt=By.xpath("//span[contains(text(),'Allianz Life Insurance Contract')]");

	//Policy Number
	By PolicyNumber=By.cssSelector("input[data-automation-attribute='encounterPolicyNumber0']");

	//Take MRN From Encounter List
	By MRNClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[1]");

	//Select Tariff
	//By TariffClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-payer-list/div/div[2]/table/tbody/tr[2]/td[4]/mat-select");
	//By TariffSelOpt=By.xpath("//span[contains(text(),'Self Tariff')]");
	By comman=By.xpath("//div[@role='listbox']/mat-option[3]");
	By comman1=By.xpath("//div[@role='listbox']/mat-option[5]");

	By TariffClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-payer-list/div/div[2]/table/tbody/tr[1]/td[4]/mat-select");
	By TariffSelOpt1=By.xpath("//span[contains(text(),'Self Tariff')]");

	public void ADT_Admission_Form_Convert_Charges_updated(String LengthOfStayPar,String AdmittingDiagPar,String AddNotesPar,String PatientNotesPar,String AdmissionRemarksPar,String ReferralRemarksPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar) throws InterruptedException, IOException, AWTException
	{
		
		
		/*
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement overforopdslide2=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside"));
		act.moveToElement(overforopdslide2).build().perform();

		//Clicking on Encounter List
		Thread.sleep(3000);
		driver.findElement(EncounterList).click();	
		
		Thread.sleep(10000);
		WebElement MRN1=driver.findElement(MRNClick1);
		String MRNS=MRN1.getText();

		System.out.println("MRN Number:"+MRNS);
		Thread.sleep(3000);
		
		*/
		Thread.sleep(10000);
		Actions act1 = new Actions(driver);
		driver.findElement(mainmenu).click();
		Thread.sleep(5000);
		driver.findElement(ADTMenu).click();
		
	

		Thread.sleep(10000);
	
		//Over the slide bar in OPD Screen
	    Actions act12 = new Actions(driver);
		WebElement overforopdslide52=driver.findElement(SideBarMenuADTScreen);
		act12.moveToElement(overforopdslide52).build().perform();

		//Admission Click
		Thread.sleep(4000);
		driver.findElement(AdmissionForm).click();

		Thread.sleep(4000);

		//Click on search menu
		
		driver.findElement(MainSearchClick).click();

		//Click On MRN Text Field
		Thread.sleep(2000);
		driver.findElement(MRNClick).sendKeys("HISCKLMRN24714247");

		//Click on Search button
		Thread.sleep(2000);
		driver.findElement(SearchButtonClick).click();

		//Click on Check Box
		Thread.sleep(6000);
		driver.findElement(CheckBoxClick).click();

		//Clicking on Plus button
		Thread.sleep(3000);
		driver.findElement(PlusButtonClick).click();

		//Clicking confirmation Yes button
		Thread.sleep(3000);
		driver.findElement(ConfirmationYesClick).click();

		//Selecting type of admission
		Thread.sleep(2000);
		driver.findElement(TypeOfAdmissionClick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Elective");
		Thread.sleep(1000);
		driver.findElement(comman).click();

		//Reason For Admission admission
		Thread.sleep(2000);
		driver.findElement(ReasonForAdmissionClick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Observation");
		Thread.sleep(1000);
		driver.findElement(comman).click();

		//Selecting Doctor Specialty
		Thread.sleep(2000);
		driver.findElement(DoctorSpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(1000);
		driver.findElement(DoctorSpecialitySelOpt).click();

		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(DoctorClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(2000);
		driver.findElement(comman).click();

		//Admission Time
		Thread.sleep(2000);
		//driver.findElement(AdmissionTimeClick).sendKeys("11:00AM");

		//Patient Meal Preference
		Thread.sleep(2000);
		driver.findElement(PatientMealClick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Children");
		Thread.sleep(1000);
		driver.findElement(comman).click();

		//Attendance Meal Preference
		Thread.sleep(2000);
		driver.findElement(AttendenceMealClick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("MAC Vegetarian");
		Thread.sleep(2000);
		driver.findElement(comman).click();

		//Length Of Stay
		Thread.sleep(2000);
		//driver.findElement(LengthStayClick).sendKeys(LengthOfStayPar);

		//Admitting Diagnosis
		Thread.sleep(2000);
		driver.findElement(AdmittingDiagnosisClick).sendKeys(AdmittingDiagPar);

		/*//Click on Admission notes button
		Thread.sleep(2000);
		driver.findElement(AdmissionNotesclick).click();

		//Add Notes
		Thread.sleep(2000);
		driver.findElement(AddNotesclick).sendKeys(AddNotesPar);

		//Click on Add Remark
		Thread.sleep(2000);
		driver.findElement(AddRemarkButtonclick).click();

		//Click on Close button
		Thread.sleep(2000);
		driver.findElement(CloseButton).click(); 

		//Patient Notes
		Thread.sleep(2000);
		driver.findElement(PatientNotes).sendKeys(PatientNotesPar);

		//Admission Remarks
		Thread.sleep(2000);
		driver.findElement(Admissionremark).sendKeys(AdmissionRemarksPar);

		//Bill Estimation NO
		driver.findElement(BillEstimationNoClick).sendKeys("2345");

		//Referral Type
		Thread.sleep(2000);
		driver.findElement(ReferraltypesClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(2000);
		driver.findElement(ReferralTypeSelopt).click();

		//Referral 
		Thread.sleep(2000);
		driver.findElement(RefferralClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Dato");
		Thread.sleep(2000);
		driver.findElement(RefferralSelopt).click();


		//Referral Remarks
		Thread.sleep(2000);
		driver.findElement(ReferralRemarkClick).sendKeys(ReferralRemarksPar);*/

		//Click on Add Button for adding bed
		Thread.sleep(2000);
		driver.findElement(AddButtonClick).click();

		//Selecting Ward
		Thread.sleep(4000);
		driver.findElement(SelectWardClick).click();
		Thread.sleep(4000);
		driver.findElement(AllDropDownSearch).sendKeys("Ward W3-A");

		Thread.sleep(5000);
		driver.findElement(ALlSelOpt).click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(0,0).click().build().perform();
		//Clicking on Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();


		//Bed CLick
		Thread.sleep(2000);
		driver.findElement(BedClick).click();

		//Click on Save Button
		Thread.sleep(2000);
		driver.findElement(SaveButtonClick).click();

	

		Thread.sleep(5000);

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		actions1.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Thread.sleep(900);

		//Selecting TAB1 Payer Details
		//Thread.sleep(2000);
		//driver.findElement(PayerDetailsTabclick).click();
		//Insurance Tariff2
		//Clicking on add button
		Thread.sleep(2000);
		driver.findElement(AddInsuranceClick).click();

		//Clicking on Payer Type
		Thread.sleep(2000);
		driver.findElement(PayerTypeClick).click();
		Thread.sleep(3000);
		//driver.findElement(AllDropDownSearch).sendKeys("Insurance(PAYTYPE002)");
		Thread.sleep(2000);
		driver.findElement(comman).click();	

		//Payer
		Thread.sleep(2000);
		driver.findElement(PayerClick).click();
		//Thread.sleep(3000);
		//driver.findElement(AllDropDownSearch).sendKeys("AIA Berhad (PAYER002)");
		Thread.sleep(2000);
		driver.findElement(comman).click();
		

		
		//Payer
		Thread.sleep(2000);
		driver.findElement(TariffClick).click();
		//Thread.sleep(3000);
	//	driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(comman).click();
		
		
		
		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(SaveBtnClick).click();


		//Clicking on ok dialog
		Thread.sleep(3000);
		driver.findElement(OkButtonClick).click();


		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.get(0));

		//Clicking on advanced search
		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick).click();

		Thread.sleep(1500);
		WebElement MRN=driver.findElement(MRNSearchClick);
		//MRN.sendKeys(MRNS);

		//Click on search button
		Thread.sleep(3000);
		driver.findElement(SearchClick12).click();

		//Clicking Row 
		Thread.sleep(1500);
		driver.findElement(ROWClick).click();

		//Clicking update status menu. 
		Thread.sleep(1500);
		driver.findElement(UpdateStatus).click();

		//Clicking on status.
		Thread.sleep(3000);
		driver.findElement(StatusClick).click();
		Thread.sleep(3000);
		driver.findElement(comman).click();

		//Adding Remarks
		Thread.sleep(1500);
		driver.findElement(RemarksClick12).sendKeys("Want to do admitted patient");

		//Clicking on confirm button
		Thread.sleep(3000);
		driver.findElement(ConfirmButtonClick).click();
		Thread.sleep(5000);




	}
	private static WebElement last() {
		// TODO Auto-generated method stub
		return null;
	}
	public ADTAdmissionFormwith_Convert_Charges_OP_To_IP(WebDriver driver)
	{
		this.driver=driver;
	}

}
