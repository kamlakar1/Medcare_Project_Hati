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
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import OPDTest.DeleteExcelRowWithSelenium;
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


public class Department_Reschedule_Appointment {

	WebDriver driver = null;

	//Search booked appointment 
	By Menuu = By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	//By Menu2 =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	//By mattooltip = By.cssSelector("mat-icon[mattooltip='Menu']");
	//By opd = By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	//By opd = By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]");
	By opd2 = By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[1]/div[1]/div[1]");
	By sidebar = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");
	By Appointment = By.cssSelector("a[id='200101']");


	By AppointmentList = By.cssSelector("a[id='200102']");
	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By PatientName = By.cssSelector("input[ng-reflect-name='PatientName']");
	By Search = By.cssSelector("button[ng-reflect-message='Search']");

	By checkbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr/td[1]/mat-checkbox");
	By CheckIn = By.cssSelector("mat-icon[ng-reflect-message='Check In']");



	// Click on Reschedule button
	By RescheduleButton =By.cssSelector("mat-icon[ng-reflect-message='Reschedule Appointment']");
	// RescheduleAppointment locators
	By Selectdoctor = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/span/button");
	By Day = By.cssSelector("button[aria-label='Day']");
	By Next = By.cssSelector("div[title='Next']");
	By Selectappointment = By.xpath("//div[contains(text(),'Clinical Consultation')]");
	By GenderOpt = By.cssSelector("mat-select[ng-reflect-name='Gender']");
	By Gendesend = By.cssSelector("input[aria-label='dropdown search']");
	By Save = By.cssSelector("button[ng-reflect-message='Save']");
	By yes =By.cssSelector("mat-icon[ ng-reflect-message='Yes']");

	By CollapseSerach =By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	By Appointmentleftpannel = By.cssSelector("a[id='200101']");

	//By checkbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr/td[1]/mat-checkbox");
	By sidebarr = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");

	By Appointmenttypeclick = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[1]");
	//By Appointmenttype = By.cssSelector("mat-select[ng-reflect-placeholder='Department']");
	By consultation = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[2]");
	By speciality = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[3]");
	By search = By.cssSelector("input[placeholder='Search']");
	By selectdoctor = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/span/button");
	By selectaappontmet = By.xpath("//*[@id='e-appointment-wrapper-6']/div[27]");                          
	By Existing = By.cssSelector("mat-radio-button[ng-reflect-value='registered']");
	By searchh = By.cssSelector("input[placeholder='Search']");

	By clickonsearch = By.cssSelector("button[ng-reflect-message='Search']");
	By radiobuttonr =By.cssSelector("mat-radio-button[ng-reflect-value='1']");
	By gender =By.cssSelector("mat-select[ng-reflect-name='Gender']");
	By save =By.cssSelector("button[ng-reflect-message='Save']");
	By genderinput = By.xpath("//*[@id=\"mat-option-82\"]/span/ngx-mat-select-search/div/input");
	//By yes =By.cssSelector("mat-icon[ ng-reflect-message='Yes']");

	public Department_Reschedule_Appointment(WebDriver driver) {
		this.driver= driver;

	}

	public void Resheduleappointmetfunc(String selectgender) throws InterruptedException, AWTException, IOException {


		// Create object and take the data from another class
		// Create object and take the data from another class
		DeleteExcelRowWithSelenium  data = new DeleteExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);


		/*
		driver.findElement(Menuu).click();
		Thread.sleep(8000);
		driver.findElement(opd2).click();

		Thread.sleep(20000);
		 */		

		Thread.sleep(4000);
		driver.findElement(sidebarr).click();
		//Thread.sleep(4000);
		//driver.findElement(Appointment).click();
		Thread.sleep(4000);
		driver.findElement(AppointmentList).click();
		Thread.sleep(2000);
		driver.findElement(Expand).click();
		Thread.sleep(2000);
		driver.findElement(PatientName).sendKeys(EnterPatientName);
		Thread.sleep(2000);
		driver.findElement(Search).click();
		Thread.sleep(6000);
		driver.findElement(checkbox).click();
		Thread.sleep(5000);
		driver.findElement(RescheduleButton).click();
		Thread.sleep(5000);

		driver.findElement(Appointmenttypeclick).click();
		Thread.sleep(500);
		driver.findElement(search).sendKeys("Department");
		Thread.sleep(500);
		driver.findElement(search).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		// driver.findElement(Appointmenttype).sendKeys(Keys.ENTER);

		driver.findElement(consultation).click();
		Thread.sleep(500);
		//driver.findElement(search).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(search).sendKeys("Clinical Consultation");
		Thread.sleep(500);
		driver.findElement(search).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(speciality).click();
		Thread.sleep(1500);
		driver.findElement(search).sendKeys("Cardiology");
		Thread.sleep(1000);
		driver.findElement(search).sendKeys(Keys.ENTER);

		//Thread.sleep(4000);
		//driver.findElement(Selectdoctor).click();
		Thread.sleep(4000);
		driver.findElement(Day).click();
		Thread.sleep(4000);
		driver.findElement(Next).click();
		Thread.sleep(4000);
		driver.findElement(Selectappointment).click();
		Thread.sleep(4000);

		driver.findElement(GenderOpt).click();
		Thread.sleep(900);
		driver.findElement(Gendesend).sendKeys(selectgender);
		Thread.sleep(900);
		driver.findElement(Gendesend).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(8000);
		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("mat-select[ng-reflect-name='first']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@role='listbox']/mat-option[4]")).click();
		Thread.sleep(4000);
		driver.findElement(Save).click();
		Thread.sleep(4000);
		driver.findElement(yes).click();
		Thread.sleep(10000);
		String winHandleBefore = driver.getWindowHandle();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(10000);
		driver.findElement(sidebarr).click();
		//Thread.sleep(4000);
		//driver.findElement(Appointment).click();
		Thread.sleep(4000);
		driver.findElement(AppointmentList).click();
		Thread.sleep(4000);
		driver.findElement(CollapseSerach).click();
		Thread.sleep(4000);
		driver.findElement(PatientName).sendKeys(EnterPatientName);
		Thread.sleep(2000);
		driver.findElement(Search).click();

		if(driver.getPageSource().contains("Rescheduled")) 
		{
			System.out.println("Appointment Rescheduled succesfully"); 
		} else 
		{
			System.out.println("Appointment not Rescheduled"); 
		}
		Thread.sleep(2000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShots//Appointment_Rescheduled_against_Department.png"));
		Thread.sleep(4000);


	}



}

