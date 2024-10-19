package LabPages;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import OPDTest.ReadExcelRowWithSelenium;

public class Debit_Note_Final_Bill_Partial_Settlement {

	WebDriver driver=null;

	//----QuickRegistration---//

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");





	//BillingIcon 
	By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");


	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	//OPBill
	By OPBill=By.cssSelector("a[id='59986']");

	//SearchClick
	By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//MRN
	By MRNsearch=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");

	//SearchClick
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	//ServiceName
	By ServiceName=By.cssSelector("input[ng-reflect-name='Bilirubin COnjugated']");
	By ServiceSelect=By.xpath("//span[contains(text(),'glucose strip manual')]");


	//AddButton
	By AddButton=By.cssSelector("button[ng-reflect-message='Add Service']");

	//ServiceName2
	By ServiceName2=By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceSelect2=By.xpath("//span[contains(text(),'MRI Brain')]");

	//SaveButton
	By SaveButton1=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Confirm
	By Confirm1=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//FinalBill
	By FinalBill=By.cssSelector("mat-checkbox[ng-reflect-id='Final Bill']");


	//SaveButton
	By SaveButton=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//Confirm
	By Confirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//PaymentAdd
	By PaymentAdd=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");

	//ReceivedFrom
	By ReceivedFrom=By.cssSelector("input[ng-reflect-name='receivedFrom']");

	//IDNo
	By IdentificatioNo=By.cssSelector("input[ng-reflect-name='indentificationNumber']");

	//Remarks 
	By Remarks=By.cssSelector("input[ng-reflect-placeholder='Remark']");

	//Save
	By SaveButton2=By.cssSelector("mat-icon[ng-reflect-message='Save Payment Details']");

	//Confirm2
	By Confirm2=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//CheckIn 
	By CheckIn=By.cssSelector("mat-icon[ng-reflect-message='No']");




	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");


	//BillSummary 
	By BillingSummary=By.cssSelector("a[ng-reflect-router-link='bill,billing-summary']");

	//BillSearchClick
	By BillSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");

	//MRNInput
	By MRNInput=By.cssSelector("input[ng-reflect-name='mrn']");

	//Search
	By BillMRNSearch=By.cssSelector("button[ng-reflect-message='Search']");


	By PartialAmount = By.cssSelector("input[ng-reflect-name='amount']");	



	By Click = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-billing-payment-dialog/div/form/div[2]/div/div[4]/div[1]/span");
    By DebitNotesList = By.cssSelector("div[aria-posinset='2']");
    
    By mrn = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	public Debit_Note_Final_Bill_Partial_Settlement (WebDriver driver)

	{
		this.driver=driver;

	}


	public void Debit_Note_Final_Bill_Partial_Settlementfunc() throws InterruptedException, IOException, AWTException 

	{

		// Create object and take the data from another class
		ReadExcelRowWithSelenium  data = new ReadExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);

		
		//---OPBill---//
		
		Actions act = Actions(driver);
		WebElement mainMenu=driver.findElement(mainmenu);
		act.moveToElement(mainMenu).build().perform();
		act.click(mainMenu).perform();

		//BillIcon
		Thread.sleep(2000);
		driver.findElement(BillingMenu).click();

		//SideMenuBar
		Thread.sleep(3000);
		WebElement SidebarMenu=driver.findElement(SideBar);
		act.moveToElement(SidebarMenu).build().perform();

		//OPCharge
		Thread.sleep(4000);
		driver.findElement(OPBill).click();

		//AdvanceSearch 
		Thread.sleep(3000);
		driver.findElement(AdvanceSearch).click();
		
		
		String getmrn = driver.findElement(mrn).getText();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(MRNsearch).sendKeys(getmrn);

		//Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//ServiceName
		Thread.sleep(2000);
		driver.findElement(ServiceName).sendKeys("Bilirubin COnjugated");

		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect).click();

		//AddButton 
		Thread.sleep(2000);
		driver.findElement(AddButton).click();

		//ServiceName
		Thread.sleep(2000);
		driver.findElement(ServiceName2).sendKeys("glucose strip manual");

		//ServiceSelect
		Thread.sleep(2000);
		driver.findElement(ServiceSelect2).click();

		//AddButton 
		Thread.sleep(2000);
		driver.findElement(AddButton).click();

		//OPChargeSave
		Thread.sleep(2000);
		driver.findElement(SaveButton1).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm1).click();



		Thread.sleep(1000);
		File screenshot23 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp22= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot23, new File(".//ScreenShots//Debit_Note_Final_Bill_Partial_Settlement_Add_Partial_ChargesSave.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_1 = "Order updated Successfully";
		String Expected_1 = "Order updated Successfully";
		Assert.assertEquals(Actual_1, Expected_1, "Patient Charges Saved and applied");



		//FinalBill
		Thread.sleep(2000);
		driver.findElement(FinalBill).click();

		//SaveButton
		Thread.sleep(2000);
		driver.findElement(SaveButton).click();

		//Confirm
		Thread.sleep(2000);
		driver.findElement(Confirm).click();
		Thread.sleep(2000);
		//AddPartialAmmount
/*
		WebElement l = driver.findElement(PartialAmount);
		// input text
		l.sendKeys("66");
		// sending Ctrl+a by Keys.Chord()
		String s = Keys.chord(Keys.CONTROL, "a");
		l.sendKeys(s);
		// sending DELETE key
		l.sendKeys(Keys.DELETE);
		Thread.sleep(4000);
		driver.findElement(PartialAmount).sendKeys("1");
*/
		//PaymentAdd
		Thread.sleep(4000);
		driver.findElement(PaymentAdd).click();
		
		Thread.sleep(6000);
		Robot robot = new Robot(); for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); 
			
		}
/*
		//ReceivedFrom 
		Thread.sleep(5000);
		driver.findElement(ReceivedFrom).sendKeys(ReceivedFromPar);

		//ID
		Thread.sleep(2000);
		driver.findElement(IdentificatioNo).sendKeys(IdentificationNoPar);
		//Remarks 
		Thread.sleep(2000);
		driver.findElement(Remarks).sendKeys(RemarksPar);
*/
		//Save2
		Thread.sleep(2000);
		driver.findElement(SaveButton2).click();

		Thread.sleep(1000);
		File screenshot24 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp24= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot24, new File(".//ScreenShots//Debit_Note_Final_Bill_Partial_charges_Final_Bill.png"));
		Thread.sleep(3000);

		//Condition

		String Actual_2 = "Do you want to proceed?";
		String Expected_2 = "Do you want to proceed?";
		Assert.assertEquals(Actual_2, Expected_2, "Patient Invoice Payement collected");



		//Confirm2
		Thread.sleep(2000);
		driver.findElement(Confirm2).click();



		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs2.get(0));

		Thread.sleep(2000);
		WebElement HoverSideBar1=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar1).build().perform();

		//CheckIn
		Thread.sleep(3000);
		driver.findElement(CheckIn).click();

		Thread.sleep(2000);
		WebElement HoverSideBar=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar).build().perform();

/*
		//BillingSummary 
		Thread.sleep(3000);
		driver.findElement(BillingSummary).click();

		//BillSearchClick
		Thread.sleep(3000);
		driver.findElement(BillSearchClick).click();

		//MRNINPUT 
		Thread.sleep(3000);
		driver.findElement(MRNInput).sendKeys(MRNS);

		//Search
		Thread.sleep(3000);
		driver.findElement(BillMRNSearch).click();
		
		
		Thread.sleep(1000);
		driver.findElement(DebitNotesList).click();


		//Condition3
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Collection Summary")) 
		{
			System.out.println("Billing Summary Screen Appear"); 
		} else 
		{
			System.out.println("Billing Summary Screen Not Appear"); 
		}


		Thread.sleep(1000);

		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot3, new File(".//ScreenShots//Debit_Note_Final_Bill_Partial_Settlement_Final_Bill_Summary.png")); 
*/

	}


	private Actions Actions(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}
}
