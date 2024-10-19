package OPDpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
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

public class OPD_Reg_With_Passport_ID_With_VIP_Patient 
{
	//private static final By UploadImhe = null;


		WebDriver driver=null;


		//By Search=By.xpath("mat-icon[mattooltip='Search']");
		By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
		By MainMenuTooltip=By.xpath("/html/body/div[2]");
		By OPDMenu=By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/div/div[1]/div[1]/div[1]/div/img");
		By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
		By RegistrationMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]/a/span[1]");
		By subRegistration=By.xpath("//*[@id=\"2005\"]/span[1]");
		By PlusButton=By.xpath("//*[@id='Add Patient']");	

		
		//Basic Information

	
		//Locator of Primary Identification Drop down
		By PrimaryIdentificationClick=By.cssSelector("mat-select[formcontrolname='primaryId']");
		By PrimaryIdentificationselOpt=By.xpath("//div[@role='listbox']/mat-option[2]");

		//Primary Id Number
		By PrimaryIdNumber=By.cssSelector("input[formcontrolname='primaryNumber']");
		
		
		//Issuing country
		By Issuingcountryclick=By.cssSelector("mat-select[ng-reflect-name='issuedCountryPrimary']");
		By IssuingcountrySelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

	
		//Secondary Expiray Date
		By SecExpirayDate=By.cssSelector("input[formcontrolname='secondaryExpirydate']");

	

		//Personal Information

		//Title
		By RegTitleClick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
		By RegTitleSelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");
		//Full Name
		By Fullname=By.cssSelector("input[data-placeholder='Full Name']");
		//gender
		By GenderClick=By.cssSelector("mat-select[ng-reflect-name='gender']");
		By GenderSelOpt=By.xpath("//div[@role='listbox']/mat-option[4]");

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
		By RegPatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
		By RegPatientCategorySelOpt=By.xpath("//div[@role='listbox']/mat-option[3]");

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
		By StateSelOpt=By.xpath("//div[@role='listbox']/mat-option[4]");

		//City
		By cityClick=By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
		By citySelopt=By.xpath("//div[@role='listbox']/mat-option[4]");

		//Area
		By AreaClick=By.cssSelector("mat-select[ng-reflect-name='subDistrictPrimary']");
		By AreaSelOpt=By.xpath("//span[contains(text(),'Pahang')]");

		//PostCode
		By PostCode=By.cssSelector("input[formcontrolname='pincodePrimary']");

		//Contact Information	

		//Country Code
		By CountryCodeClick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
		By CountryCodeSelOpt=By.xpath("//div[@role='listbox']/mat-option[4]");
		//Mobile Number
		By MobileNumberClick=By.cssSelector("input[formcontrolname='mobileNumber']");

		//VIP
		By VIP=By.cssSelector("mat-checkbox[ng-reflect-name='isVip']");
		
		//RegSave
		By RegSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		
		//SaveConfirm
		By SaveConfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		
		public OPD_Reg_With_Passport_ID_With_VIP_Patient (WebDriver driver)
		{
			this.driver=driver;
		}
		public void OPD_Reg_With_Passport_VIP_Patient(String PrimaryIdNumber12,String FullNamePar,String ExparyDatePar,String SecondaryIdNumber12,String SecondaryExparyDatePar,String DateOfBirthPar,String MotherNamePar,String PatientNotes,String ResidentialAddressPar,String PostCodePar,String MobileNumberPar,String Emailpar,String PersonalFaxpar,String WorkFaxpar,String WorkContactNopar,String HomeContactNopar,String EmploymentNoPar,String WorkFromPar,String ContactNumberPar,String ResAddPar,String PostCodePar12,String Healthtouristcodepar,String AgentIdNoPar,String AgentNamePar,String StartDatePar,String EndDatePar,String ContactNoPar4,String EmailIdPar4,String Address23Par,String PostCodePar34) throws InterruptedException, IOException, AWTException 
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
			Thread.sleep(3000);
			driver.findElement(PrimaryIdentificationselOpt).click();

			//Select Primary Id Number
			Date d=new Date(System.currentTimeMillis()+ System.nanoTime());
			Long id=d.getTime();
			Thread.sleep(1000);
			driver.findElement(PrimaryIdNumber).sendKeys(PrimaryIdNumber12+id);

			
			//filling Personal Information
			//Selecting Title
			driver.findElement(RegTitleClick).click();
			Thread.sleep(3000);
			driver.findElement(RegTitleSelOpt).click();

			//ENtering data in name filed
			Thread.sleep(1000);
			driver.findElement(Fullname).sendKeys(FullNamePar);

			//Selecting gender
			Thread.sleep(1000);
			driver.findElement(GenderClick).click();
			Thread.sleep(3000);
			driver.findElement(GenderSelOpt).click();

			//Selecting martial status
			Thread.sleep(1000);
			driver.findElement(MaritalStatusClick).click();
			Thread.sleep(3000);
			driver.findElement(MaritalStatusSelOpt).click();

			
			//date of birth
			Thread.sleep(1000);
			driver.findElement(DateOfBirth).sendKeys(DateOfBirthPar);

		

			//Tab1

			//Clicking on tab Address and content details
			Thread.sleep(1000);
			//driver.findElement(AddressAndContactDetail).click();	

			//Scrolling the web page

			//Selecting Country
			/*Thread.sleep(1000);
			driver.findElement(countryClick).click();
			Thread.sleep(1000);
			driver.findElement(countrySelOpt).click();*/

			//Selecting State
			Thread.sleep(2000);
			driver.findElement(StateClick).click();
			Thread.sleep(2000);
			driver.findElement(StateSelOpt).click();

			//Selecting City
			Thread.sleep(1000);
			driver.findElement(cityClick).click();
			Thread.sleep(3000);
			driver.findElement(citySelopt).click();

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

			//VIP
			Thread.sleep(3000);
			driver.findElement(VIP).click();
		
			//Clicking on save button	
			Thread.sleep(2000);
			driver.findElement(RegSave).click();

			//Clicking on ok dialog
			Thread.sleep(3000);
			driver.findElement(SaveConfirm).click();


		}
}
