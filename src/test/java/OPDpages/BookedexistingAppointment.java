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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import OPDTest.ReadExcelRowWithSelenium;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class BookedexistingAppointment {

	WebDriver driver = null;

	By Menu = By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	//By Menu2 =By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	//By mattooltip = By.cssSelector("mat-icon[mattooltip='Menu']");
	//By opd = By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[1]/div/img");
	By opd2 = By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[1]/div[1]/div[1]");
	By sidebar = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[1]/a");
	By Appointment = By.cssSelector("a[id='200101']");


	By AppointmentList = By.cssSelector("a[id='200102']");
	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By PatientName = By.cssSelector("input[ng-reflect-name='PatientName']");
	By Search = By.cssSelector("button[ng-reflect-message='Search']");
	//By checkbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr/td[1]/mat-checkbox");

	By checkbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr/td[1]/mat-checkbox");
	By CheckIn = By.cssSelector("mat-icon[ng-reflect-message='Check In']");

	By booked = By.xpath("//td//b[contains(text(),'Booked')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By ApponymetList = By.id("200102");
	public BookedexistingAppointment(WebDriver driver) {
		this.driver= driver;

	}

	public void Appointmentarrivedfunc() throws InterruptedException, AWTException, IOException {

		

		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions act = new Actions(driver);
		
		// Create object and take the data from another class
		ReadExcelRowWithSelenium  data = new ReadExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);
		
		
		
		WebElement Menu2 = wait.until(ExpectedConditions.elementToBeClickable(SideBarMenu));
		Menu2.click();

		
		WebElement Menu1 = wait.until(ExpectedConditions.elementToBeClickable(ApponymetList));
		Menu1.click();
		//WebElement opd21 = wait.until(ExpectedConditions.elementToBeClickable(opd2));
		//opd21.click();
		WebElement Expand1 = wait.until(ExpectedConditions.elementToBeClickable(Expand));
		Expand1.click();
		WebElement PatientName1 = wait.until(ExpectedConditions.elementToBeClickable(PatientName));
		PatientName1.sendKeys(EnterPatientName);
		Thread.sleep(2000);
		//driver.findElement(search).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		WebElement Search1 = wait.until(ExpectedConditions.elementToBeClickable(Search));
		Search1.click();
		Thread.sleep(4000);
		
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains("Booked"));
/*		
		Thread.sleep(5000);

		String getbooked = driver.findElement(booked).getText();

		String Actual = getbooked;
		String Expected = getbooked;
		Assert.assertEquals(Actual,Expected,"Appointment has been booked");

		Thread.sleep(700);

		*/
	


	}



}

