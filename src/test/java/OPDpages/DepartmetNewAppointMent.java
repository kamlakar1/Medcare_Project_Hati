package OPDpages;

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
import org.testng.annotations.Parameters;

import OPDTest.ReadExcelRowWithSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DepartmetNewAppointMent {

	WebDriver driver = null;

	By tab1 = By.id("tab1");
	By tab2 = By.id("tab2");
	By tab3 = By.id("tab3");
	By tab4 = By.id("tab4");
	By tab5 = By.id("tab5");
	By tab6 = By.id("tab6");
	By tab7  = By.id("tab7");
	By tab8 = By.id("tab8");
	By Menu = By.cssSelector("mat-icon[role='img']");
	By Menu2 =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By mattooltip = By.cssSelector("mat-icon[mattooltip='Menu']");

	By opd = By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	By opd2 = By.xpath("//*[@id=\"mat-menu-panel-6\"]/div/div/div[1]/div[1]/div[1]");


	By sidebar = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");
	By Appointment = By.cssSelector("a[id='200101']");
	By Appointmenttype = By.cssSelector("mat-select[ng-reflect-placeholder='Appointment Type']");
	//By consultation = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[2]/div/div[1]/div[3]/mat-select/div/div[2]");
	By clcini = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");
	By speciality = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[3]");
	By search = By.cssSelector("input[placeholder='Search']");
	By selectdoctor = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/span/button");
	By selectaappontmet = By.xpath("//*[@id='e-appointment-wrapper-6']/div[27]");                          
	By Existing = By.cssSelector("mat-radio-button[ng-reflect-value='registered']");
	By searchh = By.cssSelector("input[placeholder='Search']");
	By PatientName = By.cssSelector("input[ng-reflect-name='PatientName']");
	By clickonsearch = By.cssSelector("button[ng-reflect-message='Search']");
	By radiobuttonr =By.cssSelector("mat-radio-button[ng-reflect-value='1']");
	By gender =By.cssSelector("mat-select[ng-reflect-name='Gender']");
	By save =By.cssSelector("button[ng-reflect-message='Save']");
	By genderinput = By.xpath("//*[@id=\"mat-option-82\"]/span/ngx-mat-select-search/div/input");
	By yes =By.cssSelector("mat-icon[ ng-reflect-message='Yes']");

	By selectval  = By.cssSelector("mat-select[ng-reflect-name='IdType']");
	By passport = By.cssSelector("input[aria-label='dropdown search']");
	By PrimeryIDNumber = By.cssSelector("input[formcontrolname='IdNumber']");
	By ExpiryDate  = By.cssSelector("input[formcontrolname='idExpiry']");
	By Title = By.cssSelector("mat-select[ng-reflect-name='Title']");



	By Titleopt = By.cssSelector("input[aria-label='dropdown search']");
	By FullNmae = By.cssSelector("input[ng-reflect-placeholder='Full Name']");
	By GenderOpt = By.cssSelector("mat-select[ng-reflect-name='Gender']");
	By Gendesend = By.cssSelector("input[aria-label='dropdown search']");
	By dateOfBirth = By.cssSelector("input[ng-reflect-name='DOB']");
	By address = By.cssSelector("input[ng-reflect-placeholder='Residential Address']");
	By email = By.cssSelector("input[ formcontrolname='Email']");

	By countryPrimary = By.cssSelector("mat-select[ng-reflect-name='countryPrimary']");
	By search2 =  By.cssSelector("input[aria-label='dropdown search']");
	By state= By.cssSelector("mat-select[ng-reflect-name='statePrimary']");
	By statesend =  By.cssSelector("input[aria-label='dropdown search']");
	By City = By.cssSelector("mat-select[ng-reflect-name='cityPrimary']");
	By Citysend =  By.cssSelector("input[aria-label='dropdown search']");
	//  By Area =  By.cssSelector("input[mat-select='subDistrictPrimary']");
	//By Area =  By.xpath("//*[@id=\"mat-dialog-0\"]/app-dilog/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/mat-grid-list[4]/div/mat-grid-tile[4]/div/app-master-form-field");
	By Areasearch =  By.cssSelector("input[aria-label='dropdown search']");


	By post = By.cssSelector("input[ng-reflect-name='pincodePrimary']");
	By CountryCode = By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodesend = By.cssSelector("input[aria-label='dropdown search']");
	By mobileNumber = By.cssSelector("input[formcontrolname='HandPhoneNumber']");
	By workcontactno = By.cssSelector("input[formcontrolname='OffciePhoneNumber']");
	By homecontactno = By.cssSelector("input[formcontrolname='HomePhoneNumber']");
	By Country = By.cssSelector("mat-select[id='mat-select-38']");
	By UploadImhe = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-dilog/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/div/div[1]/div/div");

	By UploadImhek = By.cssSelector("input[id='fileAttachment']");

	//Thread.sleep(8000);


	By doctpru = By.xpath("//mat-option//span[contains(text(),'Department')]");
	//
	By Save = By.cssSelector("mat-icon[ng-reflect-message='Save']");

	By needviptratment = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-dilog/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/section/div/input[1]");

	By AppointmentSerach = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/button");
	By Serach = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-appointment-quick-search/div[2]/form/mat-grid-list[4]/div/mat-grid-tile[3]/div/button");
	By selectAppointment = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-appointment-quick-search/div[2]/div[1]/table/tbody/tr[1]");
	By fromDateRange = By.cssSelector("input[ng-reflect-name='fromDateRange']");
	By toDateRange = By.cssSelector("input[ng-reflect-name='toDateRange']");

	By Day = By.cssSelector("button[aria-label='Day']");
	//By Day = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div/ejs-schedule/div[1]/div/div/div[3]/div[3]/button");
	By Next = By.cssSelector("div[title='Next']");
	By Selectappointment_1 = By.xpath("//div[contains(text(),'Clinical Consultation')]");

	By consultation = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[2]/div/div[1]/div[3]/mat-select");

	//By Department = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[4]/span");
	//By doctpru = By.xpath("//mat-option//span[contains(text(),'Doctor')]");
	By department = By.xpath("//mat-option//span[contains(text(),'Department')]");
	By Appointment_1 = By.cssSelector("a[id='2001']");
	public DepartmetNewAppointMent(WebDriver driver) {
		this.driver= driver;

	}
	//String fromDateRangeA,String toDateRangeA, 
	public void NewAppontmetfunc(String AppointmenttypeA, String consultationA,String specialityA, String passportA,String PrimeryIDNumberA,String ExpiryDateA,String TitleoptA,String GendesendA,String dateOfBirthA,String addressA,String countryPrimaryA,String stateA,String CityA,String postA,String CountryCodeA,String AreaA,String mobileNumberA,String workcontactnoA,String homecontactnoA,String emailA) throws InterruptedException, AWTException, IOException {


		WebDriverWait wait = new WebDriverWait(driver, 6000);
		Actions act = new Actions(driver);

		//String kk = Quick_Registration.EnterPatientName;

		// Create object and take the data from another class
		ReadExcelRowWithSelenium  data = new ReadExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);




		driver.findElement(Menu).click();
		Thread.sleep(5000);
		driver.findElement(opd).click();
		Thread.sleep(20000);
		driver.findElement(sidebar).click();
		Thread.sleep(5000);
		driver.findElement(Appointment_1).click();
		Thread.sleep(5000);
		driver.findElement(Appointment).click();
		Thread.sleep(5000);

		Thread.sleep(5000);

		driver.findElement(Appointmenttype).sendKeys(AppointmenttypeA);
		Thread.sleep(3000);
		//driver.findElement(Appointmenttype).sendKeys(Keys.ENTER)

		//driver.findElement(consultation).click();
		
		//driver.findElement(department).click();
		WebElement doctpru1 = wait.until(ExpectedConditions.elementToBeClickable(department));
		doctpru1.click(); 
		Thread.sleep(1500);
		driver.findElement(consultation).click();
		Thread.sleep(500);
		//driver.findElement(search).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(search).sendKeys(consultationA);
		Thread.sleep(500);
		driver.findElement(search).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(speciality).click();
		Thread.sleep(4000);
		driver.findElement(search).sendKeys(specialityA);
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		WebElement Day1 = wait.until(ExpectedConditions.elementToBeClickable(Day));
		Day1.click();
		//driver.findElement(Day).click();
		WebElement Next1 = wait.until(ExpectedConditions.elementToBeClickable(Next));
		Next1.click();
		//	driver.findElement(Next).click();
		WebElement Selectappointment_11 = wait.until(ExpectedConditions.elementToBeClickable(Selectappointment_1));
		Selectappointment_11.click();

		//	driver.findElement(Selectappointment_1).click();

		Thread.sleep(10000);



		Actions action=new Actions(driver);
		WebElement image=driver.findElement(UploadImhe);
		action.moveToElement(image).click().perform();
		Robot rb = new Robot();
		rb.delay(5000);

		// Copy your image path
		String projectpath = System.getProperty("user.dir");
		StringSelection ss = new StringSelection(projectpath + "\\image\\kk.png.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//Paste you image path
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// Release the image path
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//Enter and release
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		WebElement selectval1 = wait.until(ExpectedConditions.elementToBeClickable(selectval));
		selectval1.click();

		//driver.findElement(selectval).click();
		WebElement passport1 = wait.until(ExpectedConditions.elementToBeClickable(passport));
		passport1.sendKeys(passportA);
		//driver.findElement(passport)
		WebElement passport2 = wait.until(ExpectedConditions.elementToBeClickable(passport));
		passport2.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//	driver.findElement(passport)
		WebElement PrimeryIDNumber1 = wait.until(ExpectedConditions.elementToBeClickable(PrimeryIDNumber));
		PrimeryIDNumber1.sendKeys(PrimeryIDNumberA);
		//	driver.findElement(PrimeryIDNumber)
		WebElement ExpiryDate1 = wait.until(ExpectedConditions.elementToBeClickable(ExpiryDate));
		ExpiryDate1.sendKeys(ExpiryDateA);
		//	driver.findElement(ExpiryDate)
		WebElement Title1 = wait.until(ExpectedConditions.elementToBeClickable(Title));
		Title1.click();
		//	driver.findElement(Title).click();
		WebElement Titleopt1 = wait.until(ExpectedConditions.elementToBeClickable(Titleopt));
		Titleopt1.sendKeys(TitleoptA);
		//	driver.findElement(Titleopt)
		WebElement Titleopt2 = wait.until(ExpectedConditions.elementToBeClickable(Titleopt));
		Titleopt2.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//	driver.findElement(Titleopt)
		WebElement FullNmae1 = wait.until(ExpectedConditions.elementToBeClickable(FullNmae));
		FullNmae1.sendKeys(EnterPatientName);
		//	driver.findElement(FullNmae)
		WebElement GenderOpt1 = wait.until(ExpectedConditions.elementToBeClickable(GenderOpt));
		GenderOpt1.click();
		Thread.sleep(1000);
		//	driver.findElement(GenderOpt).click();
		WebElement Gendesend1 = wait.until(ExpectedConditions.elementToBeClickable(Gendesend));
		Gendesend1.sendKeys(GendesendA);
		Thread.sleep(1000);
		//	driver.findElement(Gendesend)
		WebElement Gendesend11 = wait.until(ExpectedConditions.elementToBeClickable(Gendesend));
		Gendesend11.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		//	driver.findElement(Gendesend)
		WebElement dateOfBirth1 = wait.until(ExpectedConditions.elementToBeClickable(dateOfBirth));
		dateOfBirth1.sendKeys(dateOfBirthA);
		//driver.findElement(dateOfBirth)
		WebElement address1 = wait.until(ExpectedConditions.elementToBeClickable(address));
		address1.sendKeys(addressA);
		//	driver.findElement(address)
		WebElement countryPrimary1 = wait.until(ExpectedConditions.elementToBeClickable(countryPrimary));
		countryPrimary1.click();
		//	driver.findElement(countryPrimary).click();
		WebElement search23 = wait.until(ExpectedConditions.elementToBeClickable(search2));
		search23.sendKeys(countryPrimaryA);
		//	driver.findElement(search2)
		WebElement search24 = wait.until(ExpectedConditions.elementToBeClickable(search2));
		search24.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//	driver.findElement(search2)
		WebElement state1 = wait.until(ExpectedConditions.elementToBeClickable(state));
		state1.click();
		//	driver.findElement(state).click();
		WebElement statesend1 = wait.until(ExpectedConditions.elementToBeClickable(statesend));
		statesend1.sendKeys(stateA);
		//	driver.findElement(statesend)
		WebElement statesend11 = wait.until(ExpectedConditions.elementToBeClickable(statesend));
		statesend11.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//	driver.findElement(statesend)
		WebElement City1 = wait.until(ExpectedConditions.elementToBeClickable(City));
		City1.click();
		//	driver.findElement(City).click();
		WebElement Citysend1 = wait.until(ExpectedConditions.elementToBeClickable(Citysend));
		Citysend1.sendKeys(CityA);
		//	driver.findElement(Citysend)
		WebElement  Citysend2 = wait.until(ExpectedConditions.elementToBeClickable(Citysend));
		Citysend2.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//	driver.findElement(Citysend)
		WebElement post1 = wait.until(ExpectedConditions.elementToBeClickable(post));
		post1.sendKeys(postA);
		//driver.findElement(post)
		WebElement CountryCode1 = wait.until(ExpectedConditions.elementToBeClickable(CountryCode));
		CountryCode1.click();
		//driver.findElement(CountryCode).click();
		WebElement CountryCodesend4 = wait.until(ExpectedConditions.elementToBeClickable(CountryCodesend));
		CountryCodesend4.sendKeys(CountryCodeA);
		//	driver.findElement(CountryCodesend)
		WebElement CountryCodesend5 = wait.until(ExpectedConditions.elementToBeClickable(CountryCodesend));
		CountryCodesend5.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//	driver.findElement(CountryCodesend)
		//driver.findElement(Area).click();
		//Thread.sleep(3000);
		//driver.findElement(Areasearch).sendKeys(AreaA);
		//Thread.sleep(1000);
		//driver.findElement(Areasearch).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		WebElement mobileNumber88 = wait.until(ExpectedConditions.elementToBeClickable(mobileNumber));
		mobileNumber88.sendKeys(mobileNumberA);
		//driver.findElement(mobileNumber)
		WebElement workcontactno3 = wait.until(ExpectedConditions.elementToBeClickable(workcontactno));
		workcontactno3.sendKeys(workcontactnoA);
		//	driver.findElement(workcontactno)
		WebElement homecontactno4 = wait.until(ExpectedConditions.elementToBeClickable(homecontactno));
		homecontactno4.sendKeys(homecontactnoA);
		//	driver.findElement(homecontactno)
		WebElement email2 = wait.until(ExpectedConditions.elementToBeClickable(email));
		email2.sendKeys(emailA);
		//	driver.findElement(email)
		Thread.sleep(5000);
		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(1200);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShots//New_appointment_for_department_.png"));
		WebElement save22 = wait.until(ExpectedConditions.elementToBeClickable(save));
		save22.click();
		//	driver.findElement(save).click();
		WebElement yes32 = wait.until(ExpectedConditions.elementToBeClickable(yes));
		yes32.click();
		//	driver.findElement(yes).click();
		Thread.sleep(10000);
		String winHandleBefore = driver.getWindowHandle();
		//Thread.sleep(8000);
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(10000);

	}
}

