package OPDpages;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
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
import OPDTest.ReadExcelRowWithSelenium;

public class OPD_ExistingRegWithOldIC
{
	//private static final By UploadImhe = null;


	WebDriver driver=null;


	//By Search=By.xpath("mat-icon[MatTooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By MainMenuTooltip=By.xpath("/html/body/div[2]");
	By OPDMenu=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By RegistrationMenu=By.xpath("//ul[@class='navigation']/li[3]");
	By subRegistration=By.xpath("//*[@id=\"2005\"]/span[1]");
	By PlusButton=By.xpath("//*[@id='Add Patient']");	

	//Image Uploading
	//Clicking for Uploading
	By ClickImageUplaod=By.xpath("//*[@id=\"registration\"]/form/div[1]/div/div[1]/div/img");
	By UploadImageClick=By.xpath("//*[@id=\"btnUploadPhoto\"][3]");
	By SaveButtonClickIamge=By.xpath("//*[@id=\"mat-dialog-0\"]/app-camera-dialog/div/div[2]/div[2]/div[2]/button[3]");

	//Basic Information

	//for all search same Xpath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//Locator of Primary Identification Drop down
	By PrimaryIdentificationClick=By.cssSelector("mat-select[formcontrolname='primaryId']");
	By PrimaryIdentificationselOpt=By.xpath("//span[contains(text(),'Old IC')]");

	//Primary Id Number
	By PrimaryIdNumber=By.cssSelector("input[formcontrolname='primaryNumber']");
	//ExpirayDate
	By ExpirayDate=By.cssSelector("input[formcontrolname='expiryDate']");

	//Issuing country
	By Issuingcountryclick=By.cssSelector("mat-select[ng-reflect-name='issuedCountryPrimary']");
	By IssuingcountrySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

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
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");
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
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//span[contains(text(),'Senior Citizen')]");

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
	By RaceClick=By.cssSelector("mat-select[ng-reflect-name='race']");
	By RaceSelOpt=By.xpath("//span[contains(text(),'Health Touris')]");

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
	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='contactRelation']");
	By RelationSelOpt=By.xpath("//span[contains(text(),'Wife')]");
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

	By EmploymentDetailsTab=By.xpath("//div[@class='mat-tab-labels']/div[2]");
	//Employeer
	By EmployeerClick=By.cssSelector("mat-select[ng-reflect-name='employerName']");
	By EmployeerSelOpt=By.xpath("//span[contains(text(),'GLOBAL DOCTORS')]");

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
	By Documenttab3Click=By.cssSelector("div[aria-controls='mat-tab-content-2-3']");
	//Save Button
	By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	//OK Dialog
	By OkDialog=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Upload Button
	By UploadButton=By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");
	//Choose Files
	By ChooseFiles=By.xpath("//*[@id='fileUpload']");
	//File upload last
	By FileUploadFinalclick=By.cssSelector("mat-icon[ng-reflect-message='Upload']");
	//Back Button
	By Back=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[4]/button[1]/span[1]/mat-icon");

	public OPD_ExistingRegWithOldIC(WebDriver driver)
	{
		this.driver=driver;
	}


	public void OPD_REGISTRATIONWithOldIC(String PrimaryIdNumber12,String ExparyDatePar,String SecondaryIdNumber12,String SecondaryExparyDatePar,String DateOfBirthPar,String MotherNamePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String EmploymentNoPar,String WorkFromPar,String ContactNumberPar,String ResAddPar,String PostCodePar12) throws InterruptedException, IOException, AWTException 
	{	  


		//String kk = Quick_Registration.EnterPatientName;

		// Create object and take the data from another class
		ReadExcelRowWithSelenium  data = new ReadExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);

		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(4000);
		driver.findElement(OPDMenu).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Over the slide bar in OPD Screen
	//	Thread.sleep(20000);
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

		Robot robot = new Robot(); for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); }



		
		//Select Primary Identification drop down

		Thread.sleep(1000);
		driver.findElement(PrimaryIdentificationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Old IC");
		Thread.sleep(1000);
		driver.findElement(PrimaryIdentificationselOpt).click();
		
		
		//Thread.sleep(5000);
		
		//Select Primary Id Number
		Thread.sleep(1000);
		driver.findElement(PrimaryIdNumber).sendKeys(PrimaryIdNumber12);
		//Expire date
		/*Thread.sleep(1000);
		driver.findElement(ExpirayDate).sendKeys(ExparyDatePar);*/

		//Selecting Issuing country
		Thread.sleep(1000);
		driver.findElement(Issuingcountryclick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(IssuingcountrySelOpt).click();

		//Secondary Identification
		Thread.sleep(1000);
		driver.findElement(SecondaryIdentificationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Work Permit");
		Thread.sleep(1000);
		driver.findElement(SecondaryIdentificationSelOpt).click();

		//Secondary Id number
		Thread.sleep(1000);
	//	driver.findElement(SecondaryIDNumClick).sendKeys(SecondaryIdNumber12);

		//Secondary Expire date
		Thread.sleep(1000);
		driver.findElement(SecExpirayDate).sendKeys(SecondaryExparyDatePar);

		//Faculty selection
		Thread.sleep(1000);
		driver.findElement(FacultyClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("FAKULTI KEMANUSIAAN, SENI DAN WARISAN");
		Thread.sleep(1000);
		driver.findElement(FacultySelOpt).click();

		//filling Personal Information
		//Selecting Title
		driver.findElement(TitleClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(1000);
		driver.findElement(TitleSelOpt).click();

		//ENtering data in name filed
		Thread.sleep(1000);
		driver.findElement(Fullname).sendKeys(EnterPatientName);

		//Selecting gender
		//Thread.sleep(1000);
		//driver.findElement(GenderClick).click();
		//Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		//Thread.sleep(1000);
		//driver.findElement(GenderSelOpt).click();

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
		driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(1000);
		driver.findElement(PatientCategorySelOpt).click();

		//Preferred Language
		Thread.sleep(1000);
		driver.findElement(PreferredLanguageClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Mandarin");
		Thread.sleep(1000);
		driver.findElement(PreferredLanguageSelOpt).click();

		//Selecting Nationality
		Thread.sleep(1000);
		driver.findElement(NationalityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Albania");
		Thread.sleep(1000);
		driver.findElement(NationalitySelOpt).click();

		//Adding Mother Name	
		Thread.sleep(1000);
		driver.findElement(MotherNameCLick).sendKeys(MotherNamePar);

		//Selecting Education
		Thread.sleep(1000);
		driver.findElement(EducationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Bachelor of Medicine and Bachelor of Surgery (MBBS)");
		Thread.sleep(1000);
		driver.findElement(EducationSelOpt).click();

		//Occupation
		Thread.sleep(1000);
		driver.findElement(OccupationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Mining");
		Thread.sleep(1000);
		driver.findElement(OccupationSelOpt).click();

		//Race
		Thread.sleep(1000);
		driver.findElement(RaceClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Health Tourist");
		Thread.sleep(1000);
		driver.findElement(RaceSelOpt).click();

		//Ethnic
		Thread.sleep(2000);
		driver.findElement(EthnicClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Malay");
		Thread.sleep(2000);
		driver.findElement(EthnicSelOpt).click();

		//Birth Place
		Thread.sleep(2000);
		driver.findElement(BirthPlaceClick).sendKeys("Pune");

		//Blood Group
		Thread.sleep(1000);
		driver.findElement(BloodGroupClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("A RhD positive (A+)");
		Thread.sleep(1000);
		driver.findElement(BloodGroupSelOpt).click();

		//Source
		Thread.sleep(1000);
		driver.findElement(SourceClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Exhibition");
		Thread.sleep(1000);
		driver.findElement(SourceSelOpt).click();

		//Employment Status
		Thread.sleep(1000);
		driver.findElement(EmploymentStatusClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Employed");
		Thread.sleep(1000);
		driver.findElement(EmploymentStatusSelOpt).click();

		//Patient Notes
		Thread.sleep(1000);
		driver.findElement(PatientNotesClick).sendKeys(PatientNotes);



		//Tab1


		//Clicking on tab Address and content details
		Thread.sleep(1000);
	//	driver.findElement(AddressAndContactDetail).click();	

/*
		//Selecting Country
		Thread.sleep(1000);
		driver.findElement(countryClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(countrySelOpt).click();
	*/
		//Selecting State
		Thread.sleep(1000);
		driver.findElement(StateClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Negeri Sembilan");
		Thread.sleep(1000);
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

		//Relation
		Thread.sleep(1000);
		driver.findElement(RelationClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Wife");
		Thread.sleep(1000);
		driver.findElement(RelationSelOpt).click();

		//Email
		Thread.sleep(1000);
		driver.findElement(EmailClick).sendKeys(Emailpar);
		//Personal Fax
		Thread.sleep(1000);
		driver.findElement(PersonalFax).sendKeys(PersonalFaxpar);
		//Work Fax
		Thread.sleep(1000);
		driver.findElement(WorkFax).sendKeys(WorkFaxpar);
		//Work Contact Number
		Thread.sleep(1000);
		driver.findElement(WorkContactNo).sendKeys(WorkContactNopar);
		//Home Contact Number
		Thread.sleep(1000);
		driver.findElement(HomeContactNo).sendKeys(HomeContactNopar);  

		//Tab2	

		//Clicking on Tab2 Employment Details

		Thread.sleep(2000);
		driver.findElement(EmploymentDetailsTab).click();
		//Selecting Employer
		Thread.sleep(1000);
		driver.findElement(EmployeerClick).click();
		//Thread.sleep(1000);
		//driver.findElement(EmployeerSearch).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(EmployeerSelOpt).click();
		//Employment no
		Thread.sleep(1000);
		driver.findElement(EmploymentNo).sendKeys(EmploymentNoPar);
		//Working From
		Thread.sleep(1000);
		driver.findElement(WorkingFrom).sendKeys(WorkFromPar);
		//Contact Number
		Thread.sleep(1000);
		driver.findElement(ContactNo).sendKeys(ContactNumberPar);
		//Employment Address
		Thread.sleep(1000);
		driver.findElement(EmpAdd).sendKeys(ResAddPar);
		//Country
		Thread.sleep(1000);
		driver.findElement(Country2Click).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(1000);
		driver.findElement(Country2SelOpt).click();
		/*// Not working //State
		Thread.sleep(1000);
		driver.findElement(State2Click).click();
		Thread.sleep(1000);
		driver.findElement(State2Search).sendKeys("Negeri Sembilan");
		Thread.sleep(1000);
		driver.findElement(State2SelOpt).click();
		// Not working //City
		Thread.sleep(1000);
		driver.findElement(City2Click).click();
		Thread.sleep(1000);
		driver.findElement(City2Search).sendKeys("None");
		Thread.sleep(1000);
		driver.findElement(City2SelOpt).click();*/
		//Pass code
		Thread.sleep(1000);
		driver.findElement(PostCode2).sendKeys(PostCodePar12); 

		//Tab3
		//Documents
		/*Thread.sleep(4000);
		driver.findElement(Documenttab3Click).click();
		//Click on Upload document button

		Thread.sleep(8000);
		driver.findElement(UploadButton).click();

		Thread.sleep(3000);
		WebElement browse = driver.findElement(ChooseFiles);
		//click on ‘Choose file’ to upload the desired file
		browse.sendKeys("C:\\Users\\SDGT Guest\\Desktop\\New Text Document(2).txt");

		Thread.sleep(3000);
		driver.findElement(FileUploadFinalclick).click();*/


		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(SaveButton).click();


		//Clicking on ok dialog
		Thread.sleep(3000);
		driver.findElement(OkDialog).click();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShots//OPDRegistration.png"));  

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.get(0));


	}

}
