package BillingPages_2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class OPD_REG_Deposit_Refund_against_Account_Billing_summary_CancelRefund
{
	WebDriver driver;
	//----QuickRegistration---//
	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[1]/div[1]/div[1]/div/img");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//*[@id='2004']");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.xpath("//span[contains(text(),'Admission Form')]");
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	//IP Charges
	By IPChargesClick=By.xpath("//*[@id='69999']/span[1]");
	//By ADT=By.xpath("//span[contains(text(),'ADT')]");

	//Take MRN From Encounter List
	By MRNClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	//CReatedMRN
	By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[4]");


	//----Deposit---//

	//Menu icon 
	//By mainmenu1=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	//By MainMenuTooltip=By.xpath("/html/body/div[2]");

	//BillingIcon 
	//By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");

	//Bill Click
	By BillmenuClick=By.xpath("//*[@id='31']/img");
	//SideBar
	By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");


	//BillDisappear
	By BillDisappear=By.cssSelector("a[id='31']");

	//DepositClick
	By DepositClick=By.xpath("//*[@id='30']/img");

	//SelfDepositClick
	By SelfDepositClick=By.xpath("//*[@id='130']/img");

	//DepositAdvanceClick
	By DepositAdvanceClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");

	//PatientMRN
	By PatientMRN=By.cssSelector("input[ng-reflect-name='mrn']");

	//PatientSearch
	By PatientSearch=By.cssSelector("button[ng-reflect-message='Search']");

	//RadioButton
	By RadioButton=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/app-patient-search/div/div/div/table/tbody/tr[2]/td[1]/div/mat-radio-button/label/span[1]/span[1]");

	//DepositAmount
	By DepositAmount=By.xpath("input[ng-reflect-name='amount']");

	//DepositRemarks 
	By DepositRemarks=By.cssSelector("input[ng-reflect-placeholder='Remarks']");

	//DepositSave 
	By DepositSave=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//PaymentAdd
	By PaymentAdd=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");

	//ReceivedFrom
	By ReceivedFrom=By.cssSelector("input[ng-reflect-placeholder='Received From']");
	//ID no
	By IDNo=By.cssSelector("input[ng-reflect-placeholder='Identification No']");
	//PaymentRemarks 
	By PaymentRemarks=By.cssSelector("input[ng-reflect-placeholder='Remark']");
	//PaymentSave
	By PaymentSave=By.cssSelector("mat-icon[ng-reflect-message='Save Payment Details']");
	//PaymentConfirm
	By PaymentConfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//Deposit Against
	By DepositAgainstClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/div[3]/div[3]/form/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By DepositAgainstSelOpt=By.xpath("//span[contains(text(),'Account')]");
	//Visit no
	By VisitNoClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/div[3]/div[3]/form/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
	By VisitNoSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span");
	//Amount
	By AmountClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/div[3]/div[3]/form/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field/div/div[1]/div[3]/input");
	//Remarks
	By RemarksClick1=By.cssSelector("input[formcontrolname='remark']");
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//RefundMenu
	By RefundMenuClick=By.cssSelector("a[id='5998']");
	//Selfmenu
	By SelfMenuClick=By.cssSelector("a[id='5999']");	
	//Add Button
	By AddButtonClick=By.cssSelector("button[data-automation-attribute='button-add-refund']");
	//Advanced Search
	By AdvancedSearch=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon");
	//Patient MRN
	By PatientMRNClick=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	//Search Button
	By SearchButtonClick=By.cssSelector("button[ng-reflect-message='Search']");

	//RefundRadioButton
	By RadioButtonrefund=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-refund-against-deposit/app-patient-search/div/div/div/table/tbody/tr[2]/td[1]/div/mat-radio-button/label/span[1]/span[1]");
	//Check box
	By CheckBoxClick=By.cssSelector("mat-checkbox[ng-reflect-name='checkAll']");
	//Refund Amount CLick
	By RefundClick=By.cssSelector("input[ng-reflect-name='Ramount']");
	//Remarks
	By RemarksClick=By.cssSelector("input[ng-reflect-name='remark']");
	//Save button click
	By SaveBtnClcik=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-refund-against-deposit/div[3]/div[3]/form/mat-grid-list/div/mat-grid-tile[4]/div/button[2]/span[1]/mat-icon");
	//Clickong on Add payment button
	// AddPaymentClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");
	//Save button add payment
	By AddPaymentSaveClick=By.cssSelector("button[data-automation-attribute='button-save-payment-details']");
	//COnfirm Save button
	By ConfirmbtnClick=By.cssSelector("button[data-automation-attribute='button-save-dialog']");	
	//Not print
	By ConfirmNotClick=By.cssSelector("mat-icon[ng-reflect-message='No']");
	//Clicking on Billing menu
	By BillingMenuCliuck=By.cssSelector("a[id='31']");
	//Billing summary
	By BillingSummaryClick=By.cssSelector("a[id='99907']");
	//Refund List
	By refundListClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-billing-summary/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[5]");
	//Row Click
	By RowClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-billing-summary/div[2]/mat-tab-group/div/mat-tab-body[5]/div/div[2]/div/table/tbody/tr[1]");

	//.....Billing summary......//
	By BillClick=By.xpath("//*[@id='31']/img");
	//......Billing summary.....//
	By BillingSummary=By.cssSelector("a[id=99907]");
	//Clicking on Billing menu
	By BillingMenuCliuck1=By.cssSelector("a[id='31']");
	//Billing summary
	By BillingSummaryClick1=By.cssSelector("a[id='99907']");
	//Refund List
	By refundListClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-billing-summary/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[5]");
	//Row Click
	By RowClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-billing-summary/div[2]/mat-tab-group/div/mat-tab-body[5]/div/div[2]/div/table/tbody/tr[1]");
	//Cancel Refund
	//Cancel Refund
			By CancelRefundClick=By.cssSelector("a[ng-reflect-message='Cancel Refund']");
			//Reason 
			By ReasonClick=By.cssSelector("mat-select[ng-reflect-name='first']");
			By ReasonSelOpt=By.xpath("//span[contains(text(),'For Consultation')]");
			
			By SaveDialogClick=By.cssSelector("button[data-automation-attribute='button-save-dialog']");

	public OPD_REG_Deposit_Refund_against_Account_Billing_summary_CancelRefund(WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPD_Patient_Deposit_Add_Agains_Account_Save_Refund_Cancel_Refund() throws InterruptedException, IOException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date nowdate = new Date();

		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();

		//......OPD Menu.....//
		Thread.sleep(5000);
		driver.findElement(OPDMenu).click();

		//.....Over the slide bar in OPD Screen..//
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(5000);
		driver.findElement(RegistrationMenu).click();
		driver.findElement(RegistrationMenu).click();

		Thread.sleep(5000);
		driver.findElement(EncounterListClick).click();

		Thread.sleep(5000);
		WebElement MRN1=driver.findElement(MRNClick1);
		String MRNS=MRN1.getText();
		System.out.println("MRN Number:"+MRNS);


		//------Deposit-----//
		//Menu
		Thread.sleep(8000);
		Actions act3 = new Actions(driver);
		//Thread.sleep(2000);
		WebElement ele3=driver.findElement(mainmenuADTScreen);
		act3.moveToElement(ele3).build().perform();
		act3.click(ele3).perform();

		//BillingIcon 
		Thread.sleep(5000);
		driver.findElement(BillingMenuClik).click();

		//SideBar
		Thread.sleep(3000);
		WebElement overforopdslide3=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide3).build().perform();

		//BillDisappear
		Thread.sleep(3000);
		driver.findElement(BillClick).click();

		//DepositClick
		Thread.sleep(2000);
		driver.findElement(DepositClick).click();

		//SelfDepositClick
		Thread.sleep(2000);
		driver.findElement(SelfDepositClick).click();

		//DepositAdvanceClick
		Thread.sleep(2000);
		driver.findElement(DepositAdvanceClick).click();

		//PatientMRN
		Thread.sleep(2000);
		driver.findElement(PatientMRN).sendKeys(MRNS);

		//PatientSearch
		Thread.sleep(2000);
		driver.findElement(PatientSearch).click();

		//SelectRadio
		Thread.sleep(3000);
		driver.findElement(RadioButton).click();

		//.......DepositAmount........//
		//Against Deposit

		Thread.sleep(2000);
		driver.findElement(DepositAgainstClick).click();
		Thread.sleep(1000);
	//	driver.findElement(AllDropDownSearch).sendKeys("Account");
		Thread.sleep(1000);
		driver.findElement(comman).click();

		//Visit NO
		Thread.sleep(2000);
		driver.findElement(VisitNoClick).click();
		Thread.sleep(2000);
		driver.findElement(VisitNoSelOpt).click();

		Thread.sleep(2000);
		driver.findElement(AmountClick).sendKeys("10000");

		//DepositRemarks
		//Thread.sleep(2000);
		//driver.findElement(DepositRemarks).sendKeys("Testing");

		//DepositSave
		Thread.sleep(2000);
		driver.findElement(DepositSave).click();

		//PaymentAdd
		Thread.sleep(2000);
		driver.findElement(PaymentAdd).click();

		//ReceivedFrom
		Thread.sleep(2000);
		driver.findElement(ReceivedFrom).sendKeys("Admin");

		//IDNo
		Thread.sleep(2000);
		driver.findElement(IDNo).sendKeys("637990");

		//PaymentRemarks 
		Thread.sleep(2000);
		driver.findElement(PaymentRemarks).sendKeys("Testing");

		//PaymentSave
		Thread.sleep(2000);
		driver.findElement(PaymentSave).click();

		//PaymentConfirm 
		Thread.sleep(2000);
		driver.findElement(PaymentConfirm).click();

		//Assertion
		Thread.sleep(1000);
		
		Thread.sleep(3000);

		//Condition
		String Actual_1 = "Do you want to proceed?";
		String Expected_1 = "Do you want to proceed?";
		Assert.assertEquals(Actual_1, Expected_1, "OP Patient Deposit Collected");

		//WindowSwitch
		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList<Object> tabs1 = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window((String) tabs1.get(0));


		//...........Refund Amount.............//
		//Over the slide bar in OPD Screen
		Thread.sleep(4000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		//Click on Refund Menu
		Thread.sleep(3000);
		driver.findElement(RefundMenuClick).click();

		//Clicking on Self menu
		Thread.sleep(3000);
		driver.findElement(SelfMenuClick).click();

		//Clicking on Add button
		Thread.sleep(3000);
		driver.findElement(AddButtonClick).click();

		//Clicking on Advanced Search
		Thread.sleep(3000);
		driver.findElement(AdvancedSearch).click();

		//Clicking on Patient MRN
		Thread.sleep(3000);
		driver.findElement(PatientMRNClick).sendKeys(MRNS);

		//clicking on search button
		Thread.sleep(3000);
		driver.findElement(SearchButtonClick).click();

		//SelectRadio
		Thread.sleep(3000);
		driver.findElement(RadioButtonrefund).click();

		//Clicking on check box
		Thread.sleep(2000);
		driver.findElement(CheckBoxClick).click();

		//Refund field click
		Thread.sleep(3000);
		driver.findElement(RefundClick).sendKeys("100");

		//Remark click
		Thread.sleep(3000);
		driver.findElement(RemarksClick).sendKeys("refund Amount");

		//Clicking on save button
		Thread.sleep(3000);
		driver.findElement(SaveBtnClcik).click();

		//Clicking on Add PaymentClick
		Thread.sleep(3000);
		driver.findElement(PaymentAdd).click();

		//CLicking on add save button
		Thread.sleep(3000);
		driver.findElement(AddPaymentSaveClick).click();

		//Clicking on confirm button
		Thread.sleep(3000);
		driver.findElement(ConfirmbtnClick).click();

		//Confirm Not Click
		Thread.sleep(3000);
		driver.findElement(ConfirmNotClick).click();

		//.........Billing Summary......//
		//Over the slide bar in OPD Screen
		Thread.sleep(5000);
		Actions act2 = new Actions(driver);
		WebElement overforopdslide5=driver.findElement(SideBarMenuADTScreen);
		act2.moveToElement(overforopdslide5).build().perform();

		//Billing summary click
		Thread.sleep(3000);
		driver.findElement(BillingMenuCliuck1).click();

		Thread.sleep(3000);
		driver.findElement(BillingSummaryClick1).click();

		Thread.sleep(2000);
		driver.findElement(refundListClick1).click();

		Thread.sleep(2000);
		driver.findElement(RowClick1).click();   

		Thread.sleep(3000);
		driver.findElement(CancelRefundClick).click();  

		Thread.sleep(2000);
		driver.findElement(ReasonClick).click(); 
		Thread.sleep(2000);
		driver.findElement(ReasonSelOpt).click(); 
		
		Thread.sleep(2000);
		driver.findElement(SaveDialogClick).click(); 
		
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yy-MM-dd");
		Date date = new Date();
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File(".//ScreenShot//OPD_REG_Deposit_Refund_against_patient_Billing_summary_Print_Refund_Report"+ dateFormat1.format(date)));

		//TabSwitch
		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tab = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(8000);
		driver.switchTo().window((String)tab.get(0));




	}
}
