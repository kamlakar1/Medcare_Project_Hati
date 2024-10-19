package ADTpages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

public class Admitted_Patient_Clinical_Discharge 
{
	WebDriver driver=null;

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//ADT
	By ADT=By.xpath("//img[contains(@src,'../../../assets/images/master-icons/adt.png')]");

	//AddButton
	By AddButton=By.cssSelector("mat-icon[ng-reflect-message='Add Admission Request']");

	//PrimaryIdentification
	By PriID=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Priselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//PriNumber
	By PriNumber=By.cssSelector("input[ng-reflect-name='primaryDocNo']");

	//Name
	By Name=By.cssSelector("input[ng-reflect-name=\"fullName\"]");

	//ExpiryDate
	By ExpiryDate=By.cssSelector("input[ng-reflect-placeholder='Expiry Date']");

	//Title
	By Title=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titleselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Gender
	By Gender=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Gendersearch=By.cssSelector("input[aria-label='dropdown search']");
	By Genderselect=By.xpath("//span[contains(text(),'MALE')]");

	//DOB
	By DOB=By.cssSelector("Input[ng-reflect-placeholder='Date of Birth']");

	//Mobile 
	By Mobile=By.cssSelector("input[ng-reflect-name='mobileNo']");

	//Email
	By Email=By.cssSelector("input[ng-reflect-name='emailId']");

	//AdmittingDoctor
	By Admdoctor=By.cssSelector("mat-select[ng-reflect-name='primaryCareDoc']");
	By AdmDctselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//AdmittingDepartment 
	By AdmDepartment=By.cssSelector("mat-select[ng-reflect-name='primaryCareDept']");
	By AdmDepselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//AttendingDoctor
	By AttendDoctor=By.cssSelector("mat-select[ng-reflect-name='attendingCareDoc']");
	By AttendDctselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//ReferringDoctor
	By ReferringDoctor=By.cssSelector("mat-select[ng-reflect-name='refferingDoc']");
	By ReferringDctselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//AdmissionType
	By Admissiontype=By.cssSelector("mat-select[ng-reflect-name='typeOfAdmission']");
	By Admissiontypeselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//ReasonAdmission
	By ReasonAdmission=By.cssSelector("mat-select[ng-reflect-name='reasonOfAdmission']");
	By ReasonAdmselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//DOA
	By DOA=By.cssSelector("input[ng-reflect-name='DOA']");

	//Length
	By Length=By.cssSelector("input[ng-reflect-name='ELS'");

	//FinancialClass
	By Financialclass=By.cssSelector("mat-select[ng-reflect-name='financialClass']");
	By Financialselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//BedCategory 
	By Bedcategory=By.cssSelector("mat-select[ng-reflect-name='bedCategory']");
	By Bedcatselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//PayerType
	By Payertype=By.cssSelector("mat-select[ng-reflect-name='paymentEntitlement']");
	By Payertypeselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Save 
	By Save=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//ConfirmButton
	By ConfirmButton=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//CreatedPatient 
	By CreatedPatient=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-request/mat-drawer-container/mat-drawer-content/div/div[2]/table/tbody/tr[1]/td[5]");

	//Edit 

	By Edit=By.cssSelector("mat-icon[ng-reflect-message='Save Admission']");


	//---Registration--//



	//PatientCategory
	By Patientcategory=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");

	//PatientcatSel
	By PatientcatSel=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Address
	By Address=By.cssSelector("input[ng-reflect-name='addressPrimary']");

	//Country
	By Country=By.cssSelector("mat-select[ng-reflect-name='countryPrimary']");
	By Countrysearch=By.cssSelector("input[aria-label='dropdown search']");
	By Countryselect=By.xpath("//span[contains(text(),'Malaysia')]");

	//State
	By State=By.cssSelector("mat-select[ng-reflect-name='statePrimary']");
	By Statesearch=By.cssSelector("input[aria-label='dropdown search']");
	By Stateselect=By.xpath("//span[contains(text(),'Kedah')]");

	//City 
	By City=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
	By Citysearch=By.cssSelector("input[aria-label='dropdown search']");
	By Cityselect=By.xpath("//span[contains(text(),'Kulim')]");

	//Area
	By Area=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
	By Areasearch=By.cssSelector("input[aria-label=\'dropdown search\']");
	By Areaselect=By.xpath("//span[contains(text(),'Sample')]");

	//CheckBox
	By Checkbox=By.xpath("//span[contains(text(),'Same as Residential Address')]");

	//CountryCode
	By Countrycode=By.cssSelector("mat-select[ng-reflect-name='countryCode']");
	By Codeselect=By.xpath("//div[@role='listbox']/mat-option[3]");


	//Save
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Confirmclick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");



	//---Admission Form---//


	//For All Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//DoctorSpecility
	By DoctorSpecility=By.cssSelector("mat-select[ng-reflect-name='doctorSpeciality']");

	//SpecilitySel
	By Specilitysel=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Patient Meal Preferences
	By PatientMealClick=By.cssSelector("mat-select[ng-reflect-name='patientMealPreference']");
	By PatientMealSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Attendance Meal Reference
	By AttendenceMealClick=By.cssSelector("mat-select[ng-reflect-name=\"attendanceMealReference\"]");
	By AttendenceMealSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Length Of Stay
	By LengthStayClick=By.cssSelector("input[formcontrolname='lengthOfStay']");

	//Admitting Diagnosis
	By AdmittingDiagnosisClick=By.cssSelector("input[formcontrolname='admittingDiagnosis']");


	//Patient Notes
	By PatientNotes=By.cssSelector("input[formcontrolname='patientNotes']");

	//Admission Remark
	By Admissionremark=By.cssSelector("input[formcontrolname='remarks']");

	//Bill Estimation No
	By BillEstimationNoClick=By.cssSelector("input[ng-reflect-placeholder='Bill Estimation No']");

	//Referral Details

	//Referral Type
	By ReferraltypesClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelopt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Referral
	By RefferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By RefferralSelopt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Referral Remarks
	By ReferralRemarkClick=By.cssSelector("input[ng-reflect-placeholder='Referral Remarks']");

	//Assigned Bed
	//Click on Add button
	By AddButtonClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[1]/div[2]/div[2]/div[1]/b/a[1]/mat-icon");

	//Select ward
	By SelectWardClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Ward']");
	By ALlSelOpt=By.xpath("//span[contains(text(),'Ward W3-A')]");

	//clicking on search
	By SearchClick=By.xpath("//a/mat-icon[contains(text(),'search')]");

	By BedClick=By.xpath("//img[@src='../assets/images/Bed-vacant.png'][1]");

	//Click on Save Button
	By SaveButtonClick=By.cssSelector("button[type='submit']");

	//Doctor Specialty
	By AttendingDoctorSpecialityClick=By.cssSelector("mat-select[ng-reflect-name='dept']");
	By AttendingDoctorSpecialitySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Selecting doctor
	By AttendingDoctorClick=By.cssSelector("mat-select[data-automation-attribute='sltdepartment']");
	By AttendingDoctorSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Add Attending Doctor
	By AddAttendingDoctorclick=By.cssSelector("mat-icon[ng-reflect-message='Add Attending Doctor']");



	//Select Tariff
	By TariffClick=By.cssSelector("mat-select[data-automation-attribute='encounterTariff0']");
	By TariffSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Clicking on TAb2 Next Of Kin
	By NextOfKinClick=By.xpath("//mat-icon[contains(text(),'how_to_reg')]");

	//Title
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='kinPrefix']");
	By TitleSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Name
	By NameClick=By.cssSelector("input[formcontrolname='kinName']");

	//Relation
	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='kinRelation']");
	By RelationSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Primary Identification
	By PrimaryIdentificationClick=By.cssSelector("mat-select[ng-reflect-name='kinIDType']");
	By PrimaryIdentificationSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

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
	By StateSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//city
	By CityClick=By.cssSelector("mat-select[formcontrolname='kinDist']");
	By CitySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

	//ZipCode
	By ZipCodeClick=By.cssSelector("input[formcontrolname='kinPincode']");

	//AddKin
	By AddKin=By.cssSelector("mat-icon[ng-reflect-message='Add new kin']");

	//Save Button
	By SaveBtnClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/div/div/button[3]/span[1]/mat-icon");

	//Yes BUtton
	By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	//AdmissionStatusChanged 

	//CreatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container[2]/mat-drawer-content/div/table/tbody/tr/td[2]");

	By AdvancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	By MRNSearchClick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchClick12=By.cssSelector("button[ng-reflect-message='Search']");

	//Clicking on row
	By ROWClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr");
	//Update Status
	By UpdateStatus=By.cssSelector("img[ng-reflect-message='Update Status']");

	//Status
	By StatusClick=By.cssSelector("mat-select[ng-reflect-name='first']");
	By StatusSelopt=By.xpath("//span[contains(text(),'ADMITTED')]");

	//Remarks
	By RemarksClick12=By.cssSelector("input[ng-reflect-name='remarks']");

	//Confirm 
	By ConfirmButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Confirm']");


	//---ClinicalDischarge---//


	//ClinicalDischarge
	By ClinicalDischarge=By.cssSelector("img[ng-reflect-message='Clinical Discharge']");

	//DischargingType
	By DischargingType=By.cssSelector("mat-select[ng-reflect-name='dischargeType']");
	By Dischargingtypeselect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//Destination 
	By Destination=By.cssSelector("mat-select[ng-reflect-name='dischargeDestination']");
	By DestinationSelect=By.xpath("//div[@role='listbox']/mat-option[3]");

	//DischargeDate 
	By DischargeDate=By.cssSelector("input[ng-reflect-name='dischargeDate']");

	//DischargeTime 
	By DischargeTime=By.cssSelector("input[ng-reflect-name='dischargeTime']");

	//Instruction
	By Instruction=By.cssSelector("input[ng-reflect-name='instructions']");

	//Remarks 
	By ClincialRemarks=By.cssSelector("input[ng-reflect-name='remarks']");

	//ClincialSave
	By ClincialSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");




	By MaritalStatus = By.cssSelector("app-master-form-field[ng-reflect-label='Marital Status']");
	By Maritalsattus = By.xpath("//div[@role='listbox']/mat-option[5]");

	public void AdmittedPatientClinicalDischarge(String PriNumberPar,String PatientNamePar,String DOBPar,String MobilePar,String EmailPar,String LengthPar,String NotesPar,String RemarksPar,String RegAddressPar,String LengthOfStayPar,String AdmittingDiagPar,String AddNotesPar,String PatientNotesPar,String AdmissionRemarksPar,String BillEstimationPar,String ReferralRemarksPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar,String ZipCodePar,String InstructionPar,String ClincialRemarksPar) throws InterruptedException, IOException 

	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();
		//Thread.sleep(2000);

		//ADT
		Thread.sleep(3000);
		driver.findElement(ADT).click();


		//AddButtonmale
		Thread.sleep(8000);
		driver.findElement(AddButton).click();


		//PrimaryID
		Thread.sleep(2000);
		driver.findElement(PriID).click();
		driver.findElement(Priselect).click();


		//Select Primary Id Number
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());
		Long id=d.getTime();
		Thread.sleep(2000);
		driver.findElement(PriNumber).sendKeys(PriNumberPar+id);


		//Name
		Thread.sleep(3000);
		driver.findElement(Name).sendKeys(PatientNamePar);

		//ExpiryDate
		// Thread.sleep(2000);
		//  driver.findElement(ExpiryDate).sendKeys(ExpiryDatePar);

		//Title
		Thread.sleep(3000);
		driver.findElement(Title).click(); 
		driver.findElement(Titleselect).click();

		//Gender
		Thread.sleep(3000);
		driver.findElement(Gender).click();
		driver.findElement(Gendersearch).sendKeys("MALE");
		driver.findElement(Genderselect).click();

		//DOB
		Thread.sleep(2000);
		driver.findElement(DOB).sendKeys(DOBPar);



		//CountryCode
		Thread.sleep(3000);
		driver.findElement(Countrycode).click();
		driver.findElement(Codeselect).click();


		//Mobile 
		Thread.sleep(3000);
		driver.findElement(Mobile).sendKeys(MobilePar);

		//Email
		Thread.sleep(3000);
		driver.findElement(Email).sendKeys(EmailPar);

		//AdmittingDoctor
		Thread.sleep(3000);
		driver.findElement(Admdoctor).click();
		driver.findElement(AdmDctselect).click();


		//AdmittingDepartment
		Thread.sleep(3000);
		driver.findElement(AdmDepartment).click();
		driver.findElement(AdmDepselect).click();

		//AttendingDoctor
		Thread.sleep(3000);
		driver.findElement(AttendDoctor).click();
		driver.findElement(AttendDctselect).click();

		//RefDoctor
		Thread.sleep(3000);
		driver.findElement(ReferringDoctor).click();
		driver.findElement(ReferringDctselect).click();

		//AdmissionType
		Thread.sleep(3000);
		driver.findElement(Admissiontype).click();
		driver.findElement(Admissiontypeselect).click();

		//ReasonAdmission
		Thread.sleep(3000);
		driver.findElement(ReasonAdmission).click();
		driver.findElement(ReasonAdmselect).click();

		//CurrentDate
		LocalDateTime dt = LocalDateTime.now();

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String myDate = dt.format(df);


		//DOA
		Thread.sleep(2000);
	  driver.findElement(DOA).sendKeys(DOAPar);

		//DOA
		Thread.sleep(3000);
		driver.findElement(DOA).sendKeys(myDate);

		//Length
		Thread.sleep(3000);
		driver.findElement(Length).sendKeys(LengthPar);

		//FinancialClass
		Thread.sleep(3000);
		driver.findElement(Financialclass).click();
		driver.findElement(Financialselect).click();

		//BedCategory 
		Thread.sleep(3000);
		driver.findElement(Bedcategory).click();
		driver.findElement(Bedcatselect).click();

		//PayerType
		Thread.sleep(3000);
		driver.findElement(Payertype).click();
		driver.findElement(Payertypeselect).click();


		//Save
		Thread.sleep(3000);
		driver.findElement(Save).click();


		//ConfirmButton
		Thread.sleep(2000);
		driver.findElement(ConfirmButton).click();

		//CreatedMRN
		Thread.sleep(5000);
		WebElement Patient=driver.findElement(CreatedPatient);
		String PatientName=Patient.getText();

		System.out.println("MRN"+PatientName);



		//Edit 
		Thread.sleep(5000);
		driver.findElement(Edit).click();



		//-----Registration---//





		//Address
		Thread.sleep(6000);
		driver.findElement(Address).sendKeys(RegAddressPar);

		//Country
		// Thread.sleep(3000);
		//  driver.findElement(Country).click();
		// driver.findElement(Countrysearch).sendKeys("Malaysia");
		//  driver.findElement(Countryselect).click();

		//State
		Thread.sleep(3000);
		driver.findElement(State).click();
		driver.findElement(Statesearch).sendKeys("Kedah");
		driver.findElement(Stateselect).click();

		//City
		Thread.sleep(3000);
		driver.findElement(City).click();
		driver.findElement(Citysearch).sendKeys("Kulim");
		driver.findElement(Cityselect).click();

		//Area
		Thread.sleep(3000);
		driver.findElement(Area).click();
		driver.findElement(Areasearch).sendKeys("Sample");
		driver.findElement(Areaselect).click();

		//CheckBox
		Thread.sleep(3000);
		driver.findElement(Checkbox).click();




		Thread.sleep(5000);
		driver.findElement(MaritalStatus).click();
		//driver.findElement(Gender1search).sendKeys("MALE");
		driver.findElement(Maritalsattus).click();


		//CountryCode
		// Thread.sleep(3000);
		//  driver.findElement(Countrycode).click();
		//  driver.findElement(Codeselect).click();

		//PatientCategory
		Thread.sleep(3000);
		driver.findElement(Patientcategory).click();
		driver.findElement(PatientcatSel).click();




		//Gender
		Thread.sleep(5000);
	  driver.findElement(Gender1).click();
	  driver.findElement(Gender1search).sendKeys("MALE");
	  driver.findElement(Gender1select).click();

		//Save
		Thread.sleep(3000);
		driver.findElement(Saveclick).click();
		driver.findElement(Confirmclick).click();

		//TabSwitch
		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(1000);
		driver.switchTo().window((String)tabs.get(0));

		Thread.sleep(4000);



		//-----AdmissionFrom---//


		//DoctorSpecility
		Thread.sleep(3000);
		driver.findElement(DoctorSpecility).click();

		Thread.sleep(3000);
		driver.findElement(Specilitysel).click();


		//Patient Meal Preference
		Thread.sleep(3000);
		driver.findElement(PatientMealClick).click();
		Thread.sleep(3000);
		driver.findElement(PatientMealSelOpt).click();

		//Attendance Meal Preference
		Thread.sleep(3000);
		driver.findElement(AttendenceMealClick).click();
		Thread.sleep(3000);
		driver.findElement(AttendenceMealSelOpt).click();

		//Length Of Stay
		Thread.sleep(3000);
		driver.findElement(LengthStayClick).sendKeys(LengthOfStayPar);

		//Admitting Diagnosis
		Thread.sleep(3000);
		driver.findElement(AdmittingDiagnosisClick).sendKeys(AdmittingDiagPar);


		//Patient Notes
		Thread.sleep(3000);
		driver.findElement(PatientNotes).sendKeys(PatientNotesPar);

		//Admission Remarks
		Thread.sleep(3000);
		driver.findElement(Admissionremark).sendKeys(AdmissionRemarksPar);

		//Bill Estimation NO
		driver.findElement(BillEstimationNoClick).sendKeys(BillEstimationPar);

		//Referral Type
		Thread.sleep(3000);
		driver.findElement(ReferraltypesClick).click();
		Thread.sleep(3000);
		driver.findElement(ReferralTypeSelopt).click();

		//Referral 
		Thread.sleep(3000);
		driver.findElement(RefferralClick).click();
		Thread.sleep(3000);
		driver.findElement(RefferralSelopt).click();


		//Referral Remarks
		Thread.sleep(3000);
		driver.findElement(ReferralRemarkClick).sendKeys(ReferralRemarksPar);

		//Click on Add Button for adding bed
		Thread.sleep(3000);
		driver.findElement(AddButtonClick).click();


		//Selecting Ward
		Thread.sleep(4000);
		driver.findElement(SelectWardClick).click();
		Thread.sleep(4000);
		driver.findElement(AllDropDownSearch).sendKeys("Ward W3-A");

		Thread.sleep(2000);
		driver.findElement(ALlSelOpt).click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(0,0).click().build().perform();

		//Clicking on Search
		Thread.sleep(3000);
		driver.findElement(SearchClick).click();

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Bed CLick
		Thread.sleep(3000);
		driver.findElement(BedClick).click();

		//Click on Save Button
		Thread.sleep(3000);
		driver.findElement(SaveButtonClick).click();

		//Selecting Doctor Specialty
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorSpecialityClick).click();
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorSpecialitySelOpt).click();

		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorClick).click();
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorSelOpt).click();

		//Clicking Add Attending Doctor button
		Thread.sleep(2000);
		driver.findElement(AddAttendingDoctorclick).click();


		//Scrolling 
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		actions1.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Selecting Tariff
		Thread.sleep(2000);
		driver.findElement(TariffClick).click();
		Thread.sleep(2000);
		driver.findElement(TariffSelOpt).click();

		//Clicking on TAb2 Next Of Kin
		Thread.sleep(2000);
		driver.findElement(NextOfKinClick).click();

		//Clicking on title
		Thread.sleep(2000);
		driver.findElement(TitleClick).click();
		Thread.sleep(2000);
		driver.findElement(TitleSelOpt).click();

		//Adding Name
		Thread.sleep(2000);
		driver.findElement(NameClick).sendKeys(NamePar);

		//Selecting Relation
		Thread.sleep(2000);
		driver.findElement(RelationClick).click();
		Thread.sleep(2000);
		driver.findElement(RelationSelOpt).click();

		//Selecting Primary Identification
		Thread.sleep(2000);
		driver.findElement(PrimaryIdentificationClick).click();
		Thread.sleep(2000);
		driver.findElement(PrimaryIdentificationSelOpt).click();

		//Adding Identification NO
		Thread.sleep(2000);
		driver.findElement(IdentificationNoClick).sendKeys(IdentificationNOPar);

		//Phone Number
		Thread.sleep(2000);
		driver.findElement(PhoneNumberClick).sendKeys(PhoneNumberPar);

		//Address
		Thread.sleep(2000);
		driver.findElement(AddressClick).sendKeys(AddressPar);

		//Selecting Country
		Thread.sleep(2000);
		driver.findElement(CountryClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(2000);
		driver.findElement(CountrySelOpt).click();

		//Selecting State
		Thread.sleep(2000);
		driver.findElement(StateClick).click();
		Thread.sleep(2000);
		driver.findElement(StateSelOpt).click();

		//Selecting City
		Thread.sleep(2000);
		driver.findElement(CityClick).click();
		Thread.sleep(2000);
		driver.findElement(CitySelOpt).click();

		//Adding Name
		Thread.sleep(2000);
		driver.findElement(NameClick).sendKeys(NamePar);

		//Adding ZipCode
		Thread.sleep(2000);
		driver.findElement(ZipCodeClick).sendKeys(ZipCodePar);



		//AddKin
		Thread.sleep(3000);
		driver.findElement(AddKin).click();

		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(SaveBtnClick).click();


		//Clicking on Okay dialog
		Thread.sleep(3000);
		driver.findElement(OkButtonClick).click(); 


		//TabSwitch
		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs1 = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(1000);
		driver.switchTo().window((String)tabs1.get(0));



		//CreatedMRN
		Thread.sleep(2000);
		WebElement PatientMRN=driver.findElement(CreatedMRN);
		String MRNS=PatientMRN.getText();

		System.out.println("MRN"+MRNS);

		//AdvancedSearchClick
		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick).click();

		//MRNSearch
		Thread.sleep(3000);
		driver.findElement(MRNSearchClick).sendKeys(MRNS);

		//Search
		Thread.sleep(3000);
		driver.findElement(SearchClick12).click();


		//Clicking Row 
		Thread.sleep(3000);
		driver.findElement(ROWClick).click();

		//Clicking update status menu. 
		Thread.sleep(1500);
		driver.findElement(UpdateStatus).click();

		//Clicking on status.
		Thread.sleep(1500);
		driver.findElement(StatusClick).click();
		Thread.sleep(1500);
		driver.findElement(StatusSelopt).click();

		//Adding Remarks
		Thread.sleep(1500);
		driver.findElement(RemarksClick12).sendKeys("Want to do admitted patient");

		//Clicking on confirm button
		Thread.sleep(1500);
		driver.findElement(ConfirmButtonClick).click();


		//----ClinicalDischarge---//


		//Clicking Row 
		Thread.sleep(3000);
		driver.findElement(ROWClick).click();

		//ClinicalDischareIcon
		Thread.sleep(3000);
		driver.findElement(ClinicalDischarge).click();

		//DischargingType
		Thread.sleep(3000);
		driver.findElement(DischargingType).click();
		Thread.sleep(2000);
		driver.findElement(Dischargingtypeselect).click();

		//Destination 
		Thread.sleep(3000);
		driver.findElement(Destination).click();
		Thread.sleep(2000);
		driver.findElement(DestinationSelect).click();


		//CurrentDate
		LocalDateTime dt2 = LocalDateTime.now();

		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String myDate2 = dt2.format(df2);


		//DischargeDate
		Thread.sleep(3000);
		driver.findElement(DischargeDate).sendKeys(myDate2);


		//CurrentTIme 
		Date date2 = new Date();
		SimpleDateFormat formatTime2 = new SimpleDateFormat("hh:mma");
		String time2 = formatTime2.format(date2);


		//DischargeTime
		Thread.sleep(3000);
		driver.findElement(DischargeTime).sendKeys(time2);

		//Instruction
		Thread.sleep(3000);
		driver.findElement(Instruction).sendKeys(InstructionPar);

		//Remarks
		Thread.sleep(3000);
		driver.findElement(ClincialRemarks).sendKeys(ClincialRemarksPar);

		//ClinicalSave
		Thread.sleep(3000);
		driver.findElement(ClincialSave).click();


		//TabSwitch
		Thread.sleep(5000);
		String windowHandle4 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(1000);
		driver.switchTo().window((String)tabs2.get(0));
		
		
		
		      
	}

	public Admitted_Patient_Clinical_Discharge(WebDriver driver)

	{
		this .driver=driver;

	}

}
