package BillingPages;

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
public class OPD_Req_Deposit_Refund_OP_Final_Bill_Patient_Ledger_search_patient_View_Ledger
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
	By RadioButton=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/app-patient-search/div/div/div/table/tbody/tr[1]/td[1]/div/mat-radio-button/label/span[1]/span[1]");

	//DepositAmount
	By DepositAmount=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-deposit/div[3]/div[3]/form/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/input");

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
	By RadioButtonrefund=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-refund-against-deposit/app-patient-search/div/div/div/table/tbody/tr[1]/td[1]/div/mat-radio-button");
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

	//.....OP BILL......//
	By BillClick=By.xpath("//*[@id='31']/img");
	By OPBill=By.cssSelector("a[ng-reflect-router-link='bill,opbill']");
	By AdvancedSearchClick2=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By MRNCLick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick2=By.cssSelector("button[ng-reflect-message='Search']");

	//service Type
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//Service Name
	By ServiceNameClick=By.cssSelector("input[ng-reflect-name='serviceName']");
	By ServiceNameSelOpt=By.xpath("//span[contains(text(),'Laparotomy - exploratory')]");

	//Specialty
	By SpecialityClick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By SpecialitySelOpt=By.xpath("//span[contains(text(),'Rehabilitation')]");

	//Payer
	By PayerClick=By.cssSelector("mat-select[ng-reflect-name='payer']");
	By PayerSelOpt=By.xpath("//span[contains(text(),'Self')]");
	//Add Service Button
	By ServiceButtonClick=By.cssSelector("button[ng-reflect-message='Add Service']");
	//Save Button
	By SaveButtonClick=By.cssSelector("button[type='submit']");
	//Yes Button 
	By YesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Final bill Check box
	By FinalBillClick3=By.cssSelector("mat-checkbox[ng-reflect-name='isFinalBill']");
	//Add payment Details button
	By SavePayementClick3=By.cssSelector("button[data-automation-attribute='button-save-service']");
	//Confirm Button
	By ConfirmYesClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-dynamic-confirm-dialog/div/form/div[3]/div/button[1]/span[1]/mat-icon");
	//Add payment details
	By AddPaymentDetailsBTNClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payment Details']");

	//Save Payment Details
	By SavePaymentDetailClick3=By.cssSelector("button[data-automation-attribute='button-save-payment-details']");
	//Yes Button
	By ConfirmYesClick3=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//Check Out Patient dialog
	By CheckOutDialogClk=By.cssSelector("button[data-automation-attribute='button-cancel-dialog']");

	//Patient ledger
	By PatientLedgerClick=By.xpath("//span[contains(text(),'Patient Ledger')]");
	//Advanced search patient ledger
	By AdvancedSearchPatientLedger=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon");
	//Radio button on patient ledger
	By PatientLedgerRadiobuttonclick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-ledger/app-patient-search/div/div/div/table/tbody/tr[2]/td[1]/div/mat-radio-button");
	public OPD_Req_Deposit_Refund_OP_Final_Bill_Patient_Ledger_search_patient_View_Ledger(WebDriver driver)
	{
		this.driver=driver;
	}
	public void IPD_Patient_Deposit_Add_Agains_Patient_Save_Refund_Patient_Ledger() throws InterruptedException, IOException
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
		Thread.sleep(2000);
		driver.findElement(DepositAmount).sendKeys("10000");

		//DepositRemarks
		Thread.sleep(2000);
		driver.findElement(DepositRemarks).sendKeys("Testing");

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
		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp3= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(screenshot3, new File(".//ScreenShots//ADT_Admission_Form_save_Admission_Deposit_Add_Against_Patient_Save_Refund.png"));
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

		//Over the slide bar in OPD Screen
		Thread.sleep(5000);
		Actions actt = new Actions(driver);
		WebElement overforopdslide5=driver.findElement(SideBarMenuADTScreen);
		actt.moveToElement(overforopdslide5).build().perform();

		//..........OP BILL........//
		
		Thread.sleep(4000);
		driver.findElement(BillmenuClick).click();

		Thread.sleep(4000);
		driver.findElement(OPBill).click();

		Thread.sleep(4000);
		driver.findElement(AdvancedSearchClick2).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick).sendKeys(MRNS);

		Thread.sleep(3000);
		driver.findElement(SearchButtonClick2).click();

		/*//Selecting type of Service
				Thread.sleep(2000);
				driver.findElement(ServiceTypeClick).click();
				//Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("Service");
				Thread.sleep(1000);
				driver.findElement(ServiceSelOpt).click();*/

		//Selecting Service Name
		Thread.sleep(2000);
		driver.findElement(ServiceNameClick).sendKeys("Laparotomy");
		Thread.sleep(2000);
		driver.findElement(ServiceNameSelOpt).click();

		//Selecting type of Specialty
		Thread.sleep(2000);
		driver.findElement(SpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Rehabilitation");
		Thread.sleep(1000);
		driver.findElement(SpecialitySelOpt).click();

		/*//Selecting type of Service
				Thread.sleep(2000);
				driver.findElement(PayerClick).click();
				//Thread.sleep(1000);
				//driver.findElement(AllDropDownSearch).sendKeys("");
				Thread.sleep(1000);
				driver.findElement(PayerSelOpt).click();*/

		//Service button click
		Thread.sleep(2000);
		driver.findElement(ServiceButtonClick).click();

		/*//Save button click
				Thread.sleep(2000);
				driver.findElement(SaveButtonClick).click();

				//Yes Button Click
				Thread.sleep(2000);
				driver.findElement(YesButtonClick).click();*/

		//Check box  click
		Thread.sleep(2000);
		driver.findElement(FinalBillClick3).click();

		//Save 
		Thread.sleep(2000);
		driver.findElement(SavePayementClick3).click();

		//Confirm Save payment click
		Thread.sleep(2000);
		driver.findElement(ConfirmYesClick).click();

		//Add Payment Details

		Thread.sleep(2000);
		driver.findElement(AddPaymentDetailsBTNClick).click();
		//Click on Save payment details
		Thread.sleep(2000);
		driver.findElement(SavePaymentDetailClick3).click();

		Thread.sleep(2000);
		driver.findElement(ConfirmYesClick3).click();

		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshot2, new File(".//ScreenShot//OP_Bill_Full_Settlement_Cash.png"+ dateFormat.format(nowdate)));

		//TabSwitch
		Thread.sleep(5000);
		String windowHandle3 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(8000);
		driver.switchTo().window((String)tabs.get(0));

		Thread.sleep(2000);
		driver.findElement(CheckOutDialogClk).click();

		//Switching On Main Window
		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());
		//Use the list of window handles to switch between windows
		Thread.sleep(1000);
		driver.switchTo().window((String)tabs2.get(0));

		//Over the slide bar in OPD Screen
		Thread.sleep(4000);
		WebElement overforopdslide4=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide4).build().perform();

		//...PATIENT LEDGER...//

		//Clicking on patient ledger
		Thread.sleep(3000);
		driver.findElement(PatientLedgerClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchPatientLedger).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick).sendKeys(MRNS);

		Thread.sleep(2000);
		driver.findElement(SearchButtonClick2).click();

		//Radio button on patient ledger
		Thread.sleep(2000);
		driver.findElement(PatientLedgerRadiobuttonclick).click();
		

		File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot4, new File(".//ScreenShot//ADT_Admission_Form_save_Admission_Deposit_Add_Against_Patient_Save_Refund.png"+ dateFormat.format(nowdate)));








	}
}
