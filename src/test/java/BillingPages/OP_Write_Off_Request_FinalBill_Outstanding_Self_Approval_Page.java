package BillingPages;

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
import org.testng.Assert;
import org.testng.annotations.Test;

public class OP_Write_Off_Request_FinalBill_Outstanding_Self_Approval_Page {
  
	  
	  WebDriver driver=null;
	  
	//----QuickRegistration---//
		
		By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
		By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
		By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
		By RegistrationMenu=By.xpath("//*[@id='2004']");
		By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
		//Quick Registration
		By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

		//Basic Information
		//for all search same xPath
			By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");
			
		//PrimaryID
		By Primaryidclick=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
		By Primaryidselectvalue=By.xpath("//span[contains(text(),' Passport ')]");

		//PrimaryIDnumber
		By PrimaryIDnumberclick=By.cssSelector("input[formcontrolname='primaryNumber']");

		//ExpiryDate
		By Expirydateclick=By.cssSelector("input[formcontrolname='expiryDate']");

		//Title
		By Titleclick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
		By Titleselectvalue=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");

		//Name 
		By Nameclick=By.cssSelector("input[formcontrolname='firstName']");

		//Gender
		By Genderclick=By.cssSelector("mat-select[ng-reflect-name='gender']");
		By Genderselectvalue=By.xpath("//span[contains(text(),' FEMALE ')]");

		//DOB
		By DOBclick=By.cssSelector("input[ng-reflect-name='dateOfBirth']");

		//CountryCode
		By CountryCodeclick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
		By CountryCodeselectvalue=By.xpath("//span[contains(text(),' +213 ')]");

		//MobielNo
		By Mobilenoclick=By.cssSelector("input[formcontrolname='mobileNumber']");
		
		//Encounter Details
		//EncounterType
		By EncoujnterTypeclick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
		By EncounterTypeselectvalue=By.xpath("//span[contains(text(),' New Case ')]");

		//SpecialityField
		By Specialityfieldclick=By.cssSelector("mat-select[ng-reflect-name='department']");
		By Specialityfieldselect=By.xpath("//span[contains(text(),' General Surgery ')]");

		//Doctor
		By Doctorclick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
		By Doctorselect=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");

		//Clinic
		By Clinicclick=By.cssSelector("mat-select[ng-reflect-name='clinic']");
		By Clinicselect=By.xpath("//span[contains(text(),'Consultation Room 1')]");

		//Counter 
		By Counterclick=By.cssSelector("mat-select[ng-reflect-name='cashCounter']");
		By Counterselect=By.xpath("//span[contains(text(),' REGISTRATION COUNTER 1 ')]");

		//ENcounter Remarks
		By EncounterRemarksclick=By.cssSelector("textarea[formcontrolname='remarks']");
		
		//Encounter Notes Button
		By EncounterNotesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Encounter Notes']");
		
		//Add Notes
		By AddNotesClick=By.cssSelector("input[ng-reflect-name='notes']");
		
		//Add Remark Button
		By AddRemarkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");
		
		//Close Button
		By CloseButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Close']");
		
		//Referral Details
		//Visit Reason
		By VisitReasonClick=By.cssSelector("mat-select[ng-reflect-name='visittype']");
		By VisitReasonSelOpt=By.xpath("//span[contains(text(),' Consultation & Treatment ')]");
		
		//ReferralType
		By ReferralTypeClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
		By ReferralTypeSelOpt=By.xpath("//span[contains(text(),' Emergency Referral ')]");
		
		//Referral
		By ReferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
		By ReferralSelOpt=By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain \")]");
		
		//Patient Category
		By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
		By PatientCategorySelOpt=By.xpath("//span[contains(text(),' Senior Citizen ')]");
		
		//Encounter Notes
		By EncounterNotesClick=By.cssSelector("input[formcontrolname='practiceNotes']");
		
		//Patient Notes
		By PatientNotes=By.cssSelector("textarea[formcontrolname='reportRemarks']");
		
		//Referral Remarks
		By ReferralRemarksClick=By.cssSelector("textarea[formcontrolname='referralRemarks']");	
		
		//Tariff
		By Tariffclick12=By.cssSelector("mat-select[aria-labelledby='mat-select-value-55']");
		By Tariffselect12=By.xpath("//span[contains(text(),'Self Tariff')]");	

		//Save 
		By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
		By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	  
		
//----OPBill----//
		
		//BillingIcon 
				By BillingMenu=By.xpath("//span[contains(text(),'Billing')]");
				
				
				//SideBar
				By SideBar=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
				
				//OPBill
				By OPBill=By.cssSelector("a[ng-reflect-router-link='bill,opbill']");
				
				//SearchClick
				By AdvanceSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
				
				//MRN
				By MRNsearch=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
				
				//SearchClick
				By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");
				
				//ServiceName
				By ServiceName=By.cssSelector("input[ng-reflect-name='serviceName']");
				By ServiceSelect=By.xpath("//span[contains(text(),'CT Brain')]");
				
				
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
				
	//--WriteOffRequest--//
				
				
				//BillDisappear
				By BillDisappear=By.cssSelector("a[id='31']");
				
				//WriteOffIcon
				By WriteOffIcon=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[10]");
				
				//WriteoffRequest
				By WriteofRequest=By.cssSelector("a[ng-reflect-router-link='writeoff,writeoff']");
				
				
				//AddWriteoff
				By AddWriteOff=By.cssSelector("mat-icon[ng-reflect-message='Add Contract']");
				
				//PayerType
				
				By PayerTypeClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-write-off/div[1]/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div/div[1]/div[3]/mat-select");
				
				//PayerTypeSel
				By PayerTypeSel=By.xpath("//span[contains(text(),'Self Pay')]");
				
				//PayerClick
				By PayerClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-write-off/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field/div/div[1]/div[3]/mat-select");
				
				//PayerSele
				By PayerSele=By.xpath("//mat-option//span[contains(text(),'Self')]");

			
				//RequestTypeClick
				By requestTypeClick=By.cssSelector("mat-select[ng-reflect-name='requestType']");
				
				
				//RequestType
				By RequestType=By.xpath("//span[contains(text(),'Exemption')]");
				
				//AddRecord
				By AddRecord=By.cssSelector("mat-icon[ng-reflect-message='Add Contract']");
				
				//MRNField
				By MRNField=By.cssSelector("input[ng-reflect-placeholder='MRN']");
				
				//WriteOffMRNSearch 
				
				By WriteOffMRNSearch=By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-invoice/div[2]/div[1]/mat-grid-list/div/mat-grid-tile[6]");

				
				//ActionAdd
				By ActionAdd=By.cssSelector("a[ng-reflect-message='Add']");
				
				//InvoiceSave
				By InvoiceSave=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-add-invoice/div[2]/div[3]/mat-grid-list/div/mat-grid-tile[2]");
				
				//ReasonClick
				By ReasonClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-write-off/div[2]/table/tbody/tr/td[14]");
				
				//ReasonSelect
				By ReasonSelect=By.xpath("//span[contains(text(),'For Follow Up')]");
				
			
				//Submit
				By Submit=By.cssSelector("mat-icon[ng-reflect-message='Save & Submit']");
				
				//SubmitConfirm
				By SubmitConfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

				
				//CReatedMRN
				By CreatedMRN=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
				
				
			
			
		
	public OP_Write_Off_Request_FinalBill_Outstanding_Self_Approval_Page (WebDriver driver)
	{
		this.driver=driver;
			
	}
		
	public void OPWriteOffRequestSubmitSelf(String QuickPrimaryIdNumberPar,String QuickExparyDatePar,String QuickFullNamePar,String QuickDateOfBirthPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar,String ServiceNamePar,String ServiceName2Par,String ReceivedFromPar,String IdentificationNoPar,String RemarksPar) throws InterruptedException, IOException
	{
		//---QuickRegistration---//
		  
			//Clicking on menu Icon
					Thread.sleep(3000);
					Actions act = new Actions(driver);
					//Thread.sleep(2000);
					WebElement ele=driver.findElement(mainmenu);
					act.moveToElement(ele).build().perform();
					act.click(ele).perform();
					
					//Thread.sleep(2000);
					Thread.sleep(4000);
					driver.findElement(OPDMenu).click();

					//Over the slide bar in OPD Screen
					Thread.sleep(3000);
					WebElement overforopdslide1=driver.findElement(SideBarMenu);
					act.moveToElement(overforopdslide1).build().perform();
					Thread.sleep(4000);
					driver.findElement(RegistrationMenu).click();
					Thread.sleep(4000);
					driver.findElement(QuickRegistrationClick).click();

					//Condition1
					Thread.sleep(5000);
					   if(driver.getPageSource().contains("Basic Information")) 
					   {
					   System.out.println("Quick Registration page has been launched successfully"); 
					   } else 
					   {
					   System.out.println("Quick Registration page failed"); 
					   }
					
					   
						Thread.sleep(1000);
						
						File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(screenshot, new File(".//ScreenShots//OP_Write_Off_FinalBill_Outstanding_Self_Submit_Test_QuickRegisterationForm.png")); 
					   
						
						//Adding Basic Information
						//Primary Identification
						
					Thread.sleep(2000);  
					driver.findElement(Primaryidclick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("Passport");
					Thread.sleep(500);
					driver.findElement(Primaryidselectvalue).click();

					//Primary Id number
					Thread.sleep(500);
					driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar);
					//Expire Date
					Thread.sleep(500);
					driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);

					//Title
					Thread.sleep(500);
					driver.findElement(Titleclick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
					Thread.sleep(500);
					driver.findElement(Titleselectvalue).click();
					//Add Full Name
					Thread.sleep(500);
					driver.findElement(Nameclick).sendKeys(QuickFullNamePar);
					
					//Clicking on DOB
					Thread.sleep(500);
					driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
					//Country Code
					Thread.sleep(500);
					driver.findElement(CountryCodeclick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("+213");
					Thread.sleep(500);
					driver.findElement(CountryCodeselectvalue).click();
					//Mobile Number
					Thread.sleep(500);
					driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);
					Thread.sleep(500);
					//Encounter Details
					//Encounter Type
					Thread.sleep(500);
					driver.findElement(EncoujnterTypeclick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("New Case");
					Thread.sleep(500);
					driver.findElement(EncounterTypeselectvalue).click();

					//Select Specialty
					Thread.sleep(500);
					driver.findElement(Specialityfieldclick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
					Thread.sleep(500);
					driver.findElement(Specialityfieldselect).click();
					//Selecting Doctor
					Thread.sleep(500);
					driver.findElement(Doctorclick).click();
					Thread.sleep(900);
					driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
					Thread.sleep(900);
					driver.findElement(Doctorselect).click();
					//Selecting Clinic
					Thread.sleep(900);
					driver.findElement(Clinicclick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
					Thread.sleep(500);
					driver.findElement(Clinicselect).click();
					//Selecting Counter
					Thread.sleep(500);
					driver.findElement(Counterclick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
					Thread.sleep(500);
					driver.findElement(Counterselect).click();
					//Encounter Remarks
					Thread.sleep(500);
					driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);

					//Referral Details
					//Visit Reason	
					Thread.sleep(500);
					driver.findElement(VisitReasonClick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("Consultation & Treatment");
					Thread.sleep(500);
					driver.findElement(VisitReasonSelOpt).click();
					//Referral Type
					Thread.sleep(500);
					driver.findElement(ReferralTypeClick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
					Thread.sleep(500);
					driver.findElement(ReferralTypeSelOpt).click();
					//Referral
					Thread.sleep(500);
					driver.findElement(ReferralClick).click();
					Thread.sleep(1000);
					driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
					Thread.sleep(1000);
					driver.findElement(ReferralSelOpt).click();
					//Patient Category
					Thread.sleep(500);
					driver.findElement(PatientCategoryClick).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
					Thread.sleep(500);
					driver.findElement(PatientCategorySelOpt).click();
					//Encounter Notes
					Thread.sleep(500);
					driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
					//Patient Notes
					Thread.sleep(500);
					driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);
					//Referral Remarks
					Thread.sleep(500);
					driver.findElement(ReferralRemarksClick).sendKeys(QuickReferralRemarksPar);

					//Scrolling the web page
					Thread.sleep(4000);
					Actions actions = new Actions(driver);
					actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

					//Selecting Tariff
					Thread.sleep(500);
					driver.findElement(Tariffclick12).click();
					Thread.sleep(500);
					driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
					Thread.sleep(500);
					driver.findElement(Tariffselect12).click();


					//Clicking on save button
					Thread.sleep(500);
					driver.findElement(Saveclick).click();

					//Clicking on OK Button
					Thread.sleep(500);
					driver.findElement(Saveconfirm).click();


					 //Assertion1
					Thread.sleep(3000);
				      String URL = driver.getCurrentUrl();
				      Assert.assertEquals(URL, "https://medcare-productqa.hatiintl.com/#/OPD/patient/patient-sampleregistration" );
				     
				      Thread.sleep(1000);
				      File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				      String timestamp1= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
				      FileUtils.copyFile(screenshot1, new File(".//ScreenShots//OP_Write_Off_FinalBill_Outstanding_Self_Submit_Test_QuickRegistrationSaved.png"));
				      
					
					Thread.sleep(5000);
					String windowHandle1 = driver.getWindowHandle();

					//Get the list of window handles

					ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
					Thread.sleep(2000);
					driver.switchTo().window((String) tabs.get(0));

					Thread.sleep(2000);
					WebElement overforopdslide2=driver.findElement(SideBarMenu);
					act.moveToElement(overforopdslide2).build().perform();

					Thread.sleep(2000);
					driver.findElement(EncounterListClick).click();
					
					//CreatedMRN
					  Thread.sleep(2000);
					  WebElement MRNSearch=driver.findElement(CreatedMRN);
					  String MRNS=MRNSearch.getText();
					  
					  System.out.println("MRN"+MRNS);
					  
					  
					  //Condition2
					  Thread.sleep(5000);
					   if(driver.getPageSource().contains("Open Encounters")) 
					   {
					   System.out.println("Encounter List Screen Appear"); 
					   } else 
					   {
					   System.out.println("Encounter List Screen Not Appear"); 
					   }
					
					   
						Thread.sleep(1000);
						
						File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(screenshot3, new File(".//ScreenShots//OP_Write_Off_FinalBill_Outstanding_Self_Submit_Test_EncounterListScreen.png")); 
					  
						
						
		//---OPBill---//
						
						   
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
						  
						  //PatientMRN
						  Thread.sleep(2000);
						  driver.findElement(MRNsearch).sendKeys(MRNS);
						  
						  //Search
						  Thread.sleep(2000);
						  driver.findElement(SearchClick).click();
						  
						  //ServiceName
						  Thread.sleep(2000);
						  driver.findElement(ServiceName).sendKeys(ServiceNamePar);
						  
						  //ServiceSelect
						  Thread.sleep(2000);
						  driver.findElement(ServiceSelect).click();
						  
						//AddButton 
						  Thread.sleep(2000);
						  driver.findElement(AddButton).click();
						  
						//ServiceName
						  Thread.sleep(2000);
						  driver.findElement(ServiceName2).sendKeys(ServiceName2Par);
						  
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
						  
						  
						  //Assertion
						  Thread.sleep(1000);
					      File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					      String timestamp4= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
					      FileUtils.copyFile(screenshot4, new File(".//ScreenShots//OP_Write_Off_FinalBill_Outstanding_Self_Submit_Test_ChargesSave2.png"));
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
						
						  
						//ReceivedFrom 
						  Thread.sleep(2000);
						  driver.findElement(ReceivedFrom).sendKeys(ReceivedFromPar);
						
						  //ID
						  Thread.sleep(2000);
						  driver.findElement(IdentificatioNo).sendKeys(IdentificationNoPar);
						  //Remarks 
						  Thread.sleep(2000);
						  driver.findElement(Remarks).sendKeys(RemarksPar);
						  
						  //Save2
						  Thread.sleep(2000);
						  driver.findElement(SaveButton2).click();
						  
						  Thread.sleep(1000);
					      File screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					      String timestamp5= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
					      FileUtils.copyFile(screenshot5, new File(".//ScreenShots//OP_Write_Off_FinalBill_Outstanding_Self_Submit_Test_OP Final Bill Generated As Outstanding.png"));
					      Thread.sleep(3000);
						  
						  //Condition
						  String Actual_2 = "Do you want to proceed?";
					      String Expected_2 = "Do you want to proceed?";
					      Assert.assertEquals(Actual_2, Expected_2, "Patient Invoice Payement collected");
						
						  
						  //Confirm2
						  Thread.sleep(2000);
						  driver.findElement(Confirm2).click();
						
					       
					      //Window
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
							
							//SideBar
							Thread.sleep(2000);
							WebElement overforopdslide3=driver.findElement(SideBarMenu);
							act.moveToElement(overforopdslide3).build().perform();
							
						  
							//BillDisappear
							Thread.sleep(2000);
							driver.findElement(BillDisappear).click();
							
							//WriteOffIcon
							Thread.sleep(2000);
							driver.findElement(WriteOffIcon).click();
							
							//WriteoffRequest
							Thread.sleep(2000);
							driver.findElement(WriteofRequest).click();
							
							//AddWriteoff
							Thread.sleep(2000);
							driver.findElement(AddWriteOff).click();
							
							//PayerType
							Thread.sleep(2000);
							driver.findElement(PayerTypeClick).click();
							
							//PayerTypeSel
							Thread.sleep(2000);
							driver.findElement(PayerTypeSel).click();
							
							//PayerClick
							Thread.sleep(2000);
							driver.findElement(PayerClick).click();
							
							//PayerSele
							Thread.sleep(2000);
							driver.findElement(PayerSele).click();
							
							//RequestTypeClick
							Thread.sleep(2000);
							driver.findElement(requestTypeClick).click();
							
							//RequestType
							Thread.sleep(2000);
							driver.findElement(RequestType).click();
							
							//AddRecord
							Thread.sleep(2000);
							driver.findElement(AddRecord).click();
							
							//MRNField
							Thread.sleep(2000);
							driver.findElement(MRNField).sendKeys(MRNS);
							
							//WriteOffMRNSearch
							/*Thread.sleep(2000);
							driver.findElement(WriteOffMRNSearch).click();*/
							
							//ActionAdd
							Thread.sleep(2000);
							driver.findElement(ActionAdd).click();
							
							//InvoiceSave
							Thread.sleep(2000);
							driver.findElement(InvoiceSave).click();
							
							//ReasonClick
							Thread.sleep(2000);
							driver.findElement(ReasonClick).click();
							
							//ReasonSelect
							Thread.sleep(2000);
							driver.findElement(ReasonSelect).click();
				
							
							//Submit
							Thread.sleep(2000);
							driver.findElement(Submit).click();
							
							//Assertion
							 Thread.sleep(1000);
						      File screenshot7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
						      String timestamp7= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
						      FileUtils.copyFile(screenshot7, new File(".//ScreenShots//OP_Write_Off_FinalBill_Outstanding_Self_Submit_Test.Write Off Request Submit.png"));
						      Thread.sleep(3000);
							  
							  //Condition
							  String Actual_4 = "Do you want to proceed?";
						      String Expected_4 = "Do you want to proceed?";
						      Assert.assertEquals(Actual_4, Expected_4, "Write Off Request Submited");

	
							//SubmitConfirm
							Thread.sleep(2000);
							driver.findElement(SubmitConfirm).click();
			
	}
  }

