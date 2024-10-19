package MRDPages;
import java.awt.AWTException;
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
public class OPD_registration
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
	By TitleSelOpt=By.xpath("//span[contains(text(),'Tan Sri Dr')]");
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
		
		By Clinic=By.cssSelector("mat-select[ng-reflect-name='clinic']");
		By ClinicSelOpt=By.xpath("//span[contains(text(),'Consultation Room 4')]");

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
		By SaveBUttonClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-registration/div[2]/div[2]/button[3]/span[1]/mat-icon");

		//Ok Button
		By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	public OPD_registration(WebDriver driver)
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
		
		Thread.sleep(2000);
		driver.findElement(PrimaryIdNumber).sendKeys(PrimaryIdNumber12+id);

		//Expire date
		Thread.sleep(2000);
		driver.findElement(ExpirayDate).sendKeys(ExparyDatePar);


		//filling Personal Information
		//Selecting Title
		driver.findElement(TitleClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dr");
		Thread.sleep(1000);
		driver.findElement(TitleSelOpt).click();

		//ENtering data in name filed
		Thread.sleep(1000);
		driver.findElement(Fullname).sendKeys(FullNamePar);

		//Selecting gender
		Thread.sleep(1000);
		driver.findElement(GenderClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		Thread.sleep(1000);
		driver.findElement(GenderSelOpt).click();

		//Selecting martial status
		Thread.sleep(1000);
		driver.findElement(MaritalStatusClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Married");
		Thread.sleep(1000);
		driver.findElement(MaritalStatusSelOpt).click();

		/*//Selecting Religion
		Thread.sleep(1000);
		driver.findElement(ReliginClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Islam");
		Thread.sleep(1000);
		driver.findElement(ReliginClickSelOpt).click();	*/
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

		/*//Selecting Area
		Thread.sleep(1000);
		driver.findElement(AreaClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("");
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
		
		Thread.sleep(5000);
		driver.findElement(Dependenttab).click();
		
		Thread.sleep(2000);
		driver.findElement(Title).click();
		Thread.sleep(2000);
		driver.findElement(TitleSelOpt2).click();
		
		Thread.sleep(2000);
		driver.findElement(Name).sendKeys("radhika");
		
		Thread.sleep(2000);
		driver.findElement(AddByReferel).click();
		
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
		Thread.sleep(2000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("General Medicine");
		Thread.sleep(2000);
		driver.findElement(SpecilitySelOPt).click();

		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(DoctorClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("DATO DR PHIL OSMAN ");
		Thread.sleep(2000);
		driver.findElement(DoctorSelOpt).click();
		
		//Clinic
		
		Thread.sleep(2000);
		driver.findElement(Clinic).click();
		Thread.sleep(2000);
		driver.findElement(ClinicSelOpt).click();
		
		
		/*//selecting Tariff	 
		Thread.sleep(3000);
		driver.findElement(TariffClick).click();	
		Thread.sleep(3000);
		driver.findElement(TariffSelOpt).click();*/

		

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
		Thread.sleep(3000);
		driver.findElement(EncounterList).click();	






	}

}
