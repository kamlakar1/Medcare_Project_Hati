package OPDpages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OPDTest.DeleteExcelRowWithSelenium;
import ch.qos.logback.core.joran.action.Action;

public class Cancel_Existing_Appointment_against_doctor {

	WebDriver driver=null;

	//Menu icon 
	By Menu = By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By MainMenuTooltip=By.xpath("/html/body/div[2]");

	//OPD Menu
	By OPDMenu=By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[1]/div[1]/div[1]");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	//AppointmentList
	By AppointmentList=By.cssSelector("a[ng-reflect-router-link='new-appointment,appointment-li']");

	//AdvanceSearch 
	By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//MRN
	By MRN=By.cssSelector("input[ng-reflect-name='MRN']");

	//SearchClick
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	By PatientName = By.cssSelector("input[ng-reflect-name='PatientName']");

	//CheckBox
	By CheckBox=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr/td[1]/mat-checkbox");

	//CancelIcon
	By CancelIcon=By.cssSelector("mat-icon[ng-reflect-message='Cancel Appointment']");

	//Reason
	By ReasonClick=By.cssSelector("mat-select[name='first']");

	//ReasonSelect
	By ReasonSelect=By.xpath("//div[@role='listbox']/mat-option[2]");

	//Remarks 
	By Remarks=By.cssSelector("textarea[ng-reflect-name='remark']");

	//Confirm
	By Confirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");


	By sidebarr = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");


	public Cancel_Existing_Appointment_against_doctor (WebDriver driver)

	{
		this .driver=driver;

	}

	public void AppointmentCancel(String RemarksPar) throws InterruptedException, IOException 

	{

		// Create object and take the data from another class
		DeleteExcelRowWithSelenium  data = new DeleteExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);


		Thread.sleep(3000);

		driver.findElement(sidebarr).click();
		//OPDMenu
		Thread.sleep(5000);

/*

		//SideMenuBar
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement SidebarMenu=driver.findElement(SideBarMenu);
		act.moveToElement(SidebarMenu).build().perform();
*/

		//AppointmentList 
		Thread.sleep(5000);
		driver.findElement(AppointmentList).click();


		//AdvanceSearch
		Thread.sleep(2000);
		driver.findElement(AdvanceSearch).click();

		//MRN
		Thread.sleep(2000);
		driver.findElement(PatientName).sendKeys(EnterPatientName);

		//SearchClick
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();
		
		//CheckBox
		Thread.sleep(2000);
		driver.findElement(CheckBox).click();

		//CancelIcon
		Thread.sleep(2000);
		driver.findElement(CancelIcon).click();

		//Reason
		Thread.sleep(2000);
		driver.findElement(ReasonClick).click();

		//ReasonSelect
		Thread.sleep(2000);
		driver.findElement(ReasonSelect).click();

		//Remarks 
		Thread.sleep(2000);
		driver.findElement(Remarks).sendKeys(RemarksPar);

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();

		//Condition3
		Thread.sleep(5000);
		if(driver.getPageSource().contains(EnterPatientName) && (driver.getPageSource().contains("Cancelled"))) 
		{
			System.out.println("Status Showing as Cancel"); 
		} else 
		{
			System.out.println("Status not showing as cancel"); 
		}

	}
}
