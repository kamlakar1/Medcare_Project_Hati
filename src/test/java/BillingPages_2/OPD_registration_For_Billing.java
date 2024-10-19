package BillingPages_2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OPD_registration_For_Billing
{
	//private static final By UploadImhe = null;


	WebDriver driver;


	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By MainMenuTooltip=By.xpath("/html/body/div[2]");
	By OPDMenu=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By RegistrationMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]/a/span[1]");
	By subRegistration=By.xpath("//*[@id=\"2005\"]/span[1]");
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
	By FacultySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");	

	//Personal Information

	//Title
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By TitleSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");
	//Full Name
	By Fullname=By.cssSelector("input[data-placeholder='Full Name']");
	//gender
	By GenderClick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By GenderSelOpt=By.xpath("//span[contains(text(),'MALE')]");

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
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

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
	By StateSelOpt=By.xpath("//span[contains(text(),'Pahang')]");

	//City
	By cityClick=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
	By citySelopt=By.xpath("//span[contains(text(),'Seremban')]");

	//Area
	By AreaClick=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
	By AreaSelOpt=By.xpath("//span[contains(text(),'Pahang')]");

	//PostCode
	By PostCode=By.cssSelector("input[formcontrolname='pincodePrimary']");

	//Contact Information	

	//Country Code
	By CountryCodeClick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodeSelOpt=By.xpath("//span[contains(text(),'+255')]");
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
	By Country2SelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

	//State
	By State2Click=By.cssSelector("mat-select[ng-reflect-name='employmentState']");
	By State2SelOpt=By.xpath("//span[contains(text(),'Negeri Sembilan')]");

	//City
	By City2Click=By.cssSelector("mat-select[ng-reflect-name='employmentCity']");
	By City2SelOpt=By.xpath("//span[contains(text(),'None')]");

	//PostCode
	By PostCode2=By.cssSelector("input[formcontrolname='employmentPostCode']");

	//Tab3 Health Tourist details
	By Documenttab3Click=By.cssSelector("div[aria-controls='mat-tab-content-2-2']");
	//Health TouristCode
	By HealthTouristCodeClick=By.cssSelector("input[ng-reflect-name='code']");

	//Agent Identification Type
	By AgentIdentificationTypeClick=By.cssSelector("mat-select[ng-reflect-name='identificationType']");
	By AgentIdentificationTypeSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Agent Identification Number
	By AgentIdentificationNumberClick=By.cssSelector("input[ng-reflect-name='identificationNumber']");

	//Agent Name
	By AgentNameClick=By.cssSelector("input[ng-reflect-name='agentName']");

	//Start End Date
	By StartdateClik=By.cssSelector("input[ng-reflect-name='startDate']");
	By EnddateClick=By.cssSelector("input[ng-reflect-name='endDate']");

	//Contact Number
	By ContactNoClick=By.cssSelector("input[formcontrolname='contactNo']");

	//EmailId
	By EmailIdClick=By.cssSelector("input[formcontrolname='emailId']");

	//Address
	By AddressClick=By.cssSelector("input[ng-reflect-name='address']");

	//Country
	By CountryClick=By.cssSelector("mat-select[ng-reflect-name='country']");
	By CountrySelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

	//State
	By StateClick22=By.cssSelector("mat-select[ng-reflect-name='state']");
	By StateSelopt22=By.xpath("//span[contains(text(),'Negeri Sembilan')]");

	//PostCode
	By PostCOdeClick=By.cssSelector("input[ng-reflect-name='postcode']");

	//Add Tourist health List(+)
	By AddTouristClick=By.cssSelector("mat-icon[ng-reflect-message='Add Health Tourist List']");


	//Tab4 Document 
	//Documents
	By Documenttab4Click=By.cssSelector("div[aria-controls='mat-tab-content-2-3']");
	//Save Button
	By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	//OK Dialog
	By OkDialog=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Upload Button
	By UploadButton=By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");
	//Choose Files
	By ChooseFiles=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[2]/table/tr/td/input");
	//File upload last
	By FileUploadFinalclick=By.cssSelector("mat-icon[ng-reflect-message='Upload']");
	//Back Button
	By Back=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[4]/button[1]/span[1]/mat-icon");
	//By comman=By.xpath("//div[@role='listbox']/mat-option[3]");
	public OPD_registration_For_Billing(WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPD_REGISTRATION_updated(String PrimaryIdNumber12,String ExparyDatePar,String SecondaryIdNumber12,String SecondaryExparyDatePar,String FullNamePar,String DateOfBirthPar,String MotherNamePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String EmploymentNoPar,String WorkFromPar,String ContactNumberPar,String ResAddPar,String PostCodePar12) throws InterruptedException, IOException, AWTException 
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

		//filling Personal Information
		//Selecting Title
		driver.findElement(TitleClick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(1000);
		driver.findElement(TitleSelOpt).click();

		//ENtering data in name filed
		Thread.sleep(1000);
		driver.findElement(Fullname).sendKeys(FullNamePar);

		//Selecting gender
		Thread.sleep(1000);
		driver.findElement(GenderClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("MALE");
		Thread.sleep(1000);
		driver.findElement(GenderSelOpt).click();

		//Selecting martial status
		Thread.sleep(1000);
		driver.findElement(MaritalStatusClick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Married");
		Thread.sleep(1000);
		driver.findElement(MaritalStatusSelOpt).click();

		
		//date of birth
		Thread.sleep(1000);
		driver.findElement(DateOfBirth).sendKeys(DateOfBirthPar);

		//Patient category
		Thread.sleep(1000);
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(1000);
		driver.findElement(PatientCategorySelOpt).click();

		


		Thread.sleep(5000);

		Robot robot = new Robot(); for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); }

		//Thread.sleep(900);



		//Tab1

		//Clicking on tab Address and content details
		Thread.sleep(1000);
		//driver.findElement(AddressAndContactDetail).click();	

		//Scrolling the web page

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
		//driver.findElement(AllDropDownSearch).sendKeys("Negeri Sembilan");
		Thread.sleep(2000);
		driver.findElement(comman).click();

		//Selecting City
		Thread.sleep(1000);
		driver.findElement(cityClick).click();
		Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("Seremban");
		Thread.sleep(1000);
		driver.findElement(comman).click();

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
		driver.findElement(SaveButton).click();

		//Clicking on ok dialog
		Thread.sleep(3000);
		driver.findElement(OkDialog).click();


		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.get(0));


	}

}
