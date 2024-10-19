package ClinicarePage2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IP_Patient_Add_Re_Assisment_Save 
{
	WebDriver driver=null;

	//----Main Menu---//

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ER=By.cssSelector("img[src='../../../assets/images/master-icons/ER.png']");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By MainMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By OPConsultant=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	By ConsultationQ=By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li[1]/ul/li[1]/a/span[1]");
	By PatientName=By.cssSelector("input[id='patientname']");
	By SearchPatient=By.cssSelector("button[id='Search']");

	//----Serach Name_MPI and add the primary and secodary survey---//
	By Name_MPI=By.id("Name/MPI");
	By Search=By.id("Search");
	By Continue = By.xpath("//*[@id='tokenbutton']");
	By StartConsult=By.xpath("//*[@id='startconsult']");
	By AdmitOrder=By.id("PLAN_ADMIT");
	By StandinNotes=By.cssSelector("textarea[formcontrolname='StandingOrders']");

	By AdmitNotes=By.cssSelector("textarea[formcontrolname='AdmitNote']");
	By AdmissionType=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-admit-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[1]/p-dropdown");
	By AdmissionTypeSelOpt=By.xpath("//span[contains(text(),'Elective')]");
	By ReasonForAdmission=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-admit-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[2]/p-dropdown");
	By ReasonForAdmissionSelOPt=By.xpath("//span[contains(text(),'Elective Surgery')]");

	By AdmittingDepartment=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-admit-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[4]/p-dropdown");
	By AdmittingDepartmentSelopt=By.xpath("//span[contains(text(),'General Medicine')]");

	By AdmittingPhysician=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-admit-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/div[5]/div[1]/p-dropdown");
	By AdmittingPhysicianSelopt=By.xpath("//span[contains(text(),'PHIL')]");

	By AdmittingFacility=By.xpath("//form/div/div[1]/div/div/div[4]/div[3]/p-dropdown/div/span");
	By AdmittingFacilitySelOpt=By.xpath("//span[contains(text(),'KL')]"); 

	By AdmitToWard=By.xpath("//form/div/div[1]/div/div/div[5]/div[2]/p-dropdown/div/div[2]");
	By AdmitWardSelOpt=By.xpath("//span[contains(text(),'SW_SURGICAL WARD')]");

	By SaveAndExit=By.id("SaveExit");

	By Consultation=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[3]/div/div[1]/div[1]");
	By ConsultationDropDown=By.xpath("/html/body/div[4]/div/div/div[1]/p-dropdown");
	By ConsultationDropdownSelopt=By.xpath("//span[contains(text(),'1st. Consultation (Specialist)')]");
	By SaveConsulat=By.xpath("/html/body/div[4]/div/div/div[2]/button");

	By MarkToBill=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[4]/div/div[2]/div/div[1]/button");
	By ContinueBill=By.cssSelector("app-lt-post-button[buttonlabel='Continue']");
	By ContinueBillyes=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/p-confirmdialog/div/div/div[3]/button[2]");

	By tab1=By.id("tab1");
	By tab2=By.id("tab2");
	By tab3=By.id("tab3");
	By tab4=By.id("tab4");
	By tab5=By.id("tab5");
	By tab6=By.id("tab6");
	By tab7=By.id("tab7");
	By tab8=By.id("tab8");

	By mainmenu1=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[4]/div/img");	
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionDashboard=By.xpath("//*[@id='568401']/img");

	//Advanced Search
	By AdvancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By MRNClick=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	//Search
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	By PatientNameMPI=By.cssSelector("input[placeholder='Name']");
	By SearchPatient1=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-consult-q/div/div/div/div[1]/form/div/div[7]/div/div[2]/button");

	By SaveAdmission=By.cssSelector("mat-icon[ng-reflect-message='Save Admission']");
	By ReasonForAdmissionADT=By.cssSelector("mat-select[ng-reflect-name='reasonForAdmission']");
	By AllDropDown=By.cssSelector("mat-option[ng-reflect-value='[object Object]']");
	By Doctor=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By ADTWard=By.cssSelector("mat-select[ng-reflect-placeholder='Select Ward']");
	By ADTWardSelOPt=By.xpath("//span[contains(text(),'Ward W3-A')]"); 
	By Bed=By.cssSelector("mat-select[ng-reflect-name='bedNo']");
	By BedClick=By.xpath("/html/body/div[5]/div[2]/div/div/div/mat-option[3]");
	By BedSelOPt=By.xpath("//span[contains(text(),'Bed00')]");
	//Save Button
		By SaveBtnClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/div/div/button[2]/span[1]/mat-icon");
		//Yes BUtton
		By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	
		//Clicking on row
		By ROWClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container[2]/mat-drawer-content/div/table/tbody/tr[1]");
		//Update Status
		By UpdateStatus=By.cssSelector("img[ng-reflect-message='Update Status']");

		//Status
		By StatusClick=By.cssSelector("mat-select[ng-reflect-name='first']");
		By StatusSelopt=By.xpath("//span[contains(text(),'ADMITTED')]");

		//Remarks
		By RemarksClick12=By.cssSelector("input[ng-reflect-name='remarks']");

		//Confirm 
		By ConfirmButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Confirm']");

		By StatusUpdated=By.xpath("//span[contains(text(),'Status Updated')]");
		
		By NewAdmission1 = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPDNEWADM.png']");
		By Name = By.id("Name/MPI");
		By Search1 = By.id("Search");
		By AckPending = By.xpath("//span[contains(text(),'Ack Pending')]");
		By Action = By.cssSelector("button[data-pc-name='button']");
		By MarkAcknowledge = By.xpath("//span[contains(text(),'Mark Acknowledge')]");
		By ConfirmBed = By.cssSelector("button[id='Save']");
		By MarkArrival = By.xpath("//span[contains(text(),'Mark Arrival')]");
		By ConfirmBed1 = By.cssSelector("button[id='Save']");

		// Locators (Encounter Summary)
		By EncounterSummary = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPENC.png']");
		By Name1 = By.id("Name/MPI");
		By Select = By.xpath("//button[contains(text(),'Select')]");
		By Admit_Assessment = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[2]/a/span[1]");
		
		// History
		// Locators for HIST_ALLERGY
		By HIST_ALLERGY = By.id("HIST_ALLERGY");
		By Preglodie = By.xpath("//span[contains(text(),'Pergolide')]");
		By SelectReaction = By.xpath("//div[@class='p-multiselect-trigger']");
		By AbdominalPain = By.xpath("//span[contains(text(),'Abdominal Pain')]");
		By Severity = By.xpath("//div[@class='p-dropdown-trigger']");
		By Mild = By.xpath("//span[contains(text(),'Mild')]");
		By kSaveExit1 = By.id("SaveExit");

		// Locators for HIST_COMPLAINT
		By HIST_COMPLAINT = By.id("HIST_COMPLAINT");
		By checkbox1 = By.xpath("//p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
		By kSaveExit2 = By.id("SaveExit");

		// Locators for HIST_HPI
		By HIST_HPI = By.id("HIST_HPI");
		By sendkey1 = By.xpath("//p-editor/div/div[2]/div[1]");
		By kSaveExit3 = By.id("SaveExit");

		//Login
		By tab11 = By.id("tab1");
		By tab21 = By.id("tab2");
		By tab31 = By.id("tab3");
		By tab41 = By.id("tab4");
		By tab51 = By.id("tab5");
		By tab61 = By.id("tab6");
		By tab71 = By.id("tab7");
		By tab81 = By.id("tab8");

		By clinicalstation = By.cssSelector("img[src='../../../assets/images/master-icons/ClinicalStation.png']");
		By ADT = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li/ul/li[7]/a/span[1]");
		By NewAdmissionn = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/CSNEWADM.png']");
		By IPNEWADMASSE = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPNEWADMASSE.png']");

		By InPatient=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[3]/div[4]/div/img");
		By AdvancedSearch=By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[1]/div/span/button");
		By MRNSearch=By.id("patientNameMpi");
		By FinelSearch=By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[1]/div/p-scrollpanel/div/div[1]/div/app-app-top-searchbar/div/button[1]");
		By NameOnIPSummery=By.id("Name/MPI");
		
		By SelectPateint=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-in-patient-q/div/div/p-table/div/div/table/tbody/tr/td[1]/button");
		By ReAssistment=By.id("RA");

		//...Examination..//
		By EXAM_PCA = By.id("EXAM_PCA");
		By IsHighAlert = By.id("isAlert");
		By AlertDescription = By.cssSelector("input[id='AlertDescription']");
		By highalertSave = By.id("highalertSave");
		By close = By.xpath("//app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[2]/button[2]");

		
		//		... Diagnosis....//
		By DIAG_CD = By.id("DIAG_CD");
		By reco = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[1]/form/div[2]/div/p-table/div/div/table/tbody/tr[1]/td[4]");
		By CurrentCondition = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/div/div[2]/form/div[1]/p-dropdown/div/div[2]");
		By OPT9 = By.xpath("//span[contains(text(),'Good')]");
		By Privacy = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/div/div[2]/form/div[2]/p-dropdown/div/div[2]");
		By OPT8 = By.xpath("//span[contains(text(),'Visible to Doctors')]");
		By kSaveExit10 = By.id("SaveExit");

		//............Order..........//
		// PLAN_NO
		By PLAN_NO = By.id("PLAN_NO");
		By checkbox98 = By.xpath("//p-table/div/div/table/tbody/tr/td[2]/p-tablecheckbox/div/div[2]");
		By arroww = By.xpath("//p-tabpanel[1]/div/div/div[2]/div/form/div[1]/div[1]/div/p-autocomplete/span/button");
		By SingleDose = By.xpath("//span[contains(text(),'Single Dose')]");
		By Durationsendkey = By.cssSelector("input[id='durationNum']");
		By selectt = By.xpath("//p-tabpanel[1]/div/div/div[2]/div/form/div[1]/div[2]/div/p-dropdown/div/div[2]");
		By dayopt = By.xpath("//span[contains(text(),'Days')]");
		By kSaveExit92 = By.id("SaveExit");

		By OrderBasket=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-patient-banner/div/div[4]/div/table/tbody/tr[2]/td[1]/p-button/button");
		By SubmitOrder=By.xpath("/html/body/div[4]/div/div[3]/apflex-order-basket/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[2]/div/div/div/div/button[2]");
		By CloseSubmitOrder=By.xpath("/html/body/div[4]/div/div[2]/div/button");
		
		public IP_Patient_Add_Re_Assisment_Save (WebDriver driver)
	{
		this.driver=driver;
	}
	public void Re_Assistment(String PatientMRN) throws InterruptedException, IOException, AWTException 
	{
		Thread.sleep(8000);

		//String currentWindow = driver.getWindowHandle();

		/*// Main Menu
		driver.findElement(mainmenu).click();
		Thread.sleep(8000);
		driver.findElement(ER).click();
		Thread.sleep(10000);*/

		/*// Handling a new window/tab if opened
		String mainWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // Switch back to the original tab
		Thread.sleep(14000);*/

		// Search Name_MPI and add the primary and secondary survey
		Thread.sleep(10000);
		driver.findElement(MainMenu).click();
		Thread.sleep(3000);
		driver.findElement(OPConsultant).click();

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());	
		driver.switchTo().window((String) tabs.get(1));

		Thread.sleep(3000);
		driver.findElement(ConsultationQ).click();

		Thread.sleep(3000);
		driver.findElement(PatientName).sendKeys(PatientMRN);
		Thread.sleep(3000);
		driver.findElement(SearchPatient).click();
		Thread.sleep(3000);
		driver.findElement(Search).click();
		Thread.sleep(5000);
		driver.findElement(Continue).click();
		Thread.sleep(5000);
		driver.findElement(StartConsult).click();

		//Not Ot Procudre Orders

		//Scroll Down

		Thread.sleep(5000);

		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) 
		{
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		Thread.sleep(3000);
		driver.findElement(AdmitOrder).click();

		Thread.sleep(3000);
		driver.findElement(StandinNotes).sendKeys("standing orders promotes consistent and standardized");

		Thread.sleep(3000);
		driver.findElement(AdmitNotes).sendKeys("standing orders promotes consistent and standardized");


		Thread.sleep(3000);
		driver.findElement(AdmissionType).click();	
		Thread.sleep(3000);
		driver.findElement(AdmissionTypeSelOpt).click();

		Thread.sleep(5000);
		driver.findElement(ReasonForAdmission).click();
		Thread.sleep(7000);
		driver.findElement(ReasonForAdmissionSelOPt).click();

		Thread.sleep(5000);
		driver.findElement(AdmittingFacility).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingFacilitySelOpt).click();

		Thread.sleep(3000);
		driver.findElement(AdmittingDepartment).click();	
		Thread.sleep(3000);
		driver.findElement(AdmittingDepartmentSelopt).click();

		Thread.sleep(3000);
		driver.findElement(AdmittingPhysician).click();	
		Thread.sleep(3000);
		driver.findElement(AdmittingPhysicianSelopt).click();

		Thread.sleep(3000);
		driver.findElement(AdmitToWard).click();
		Thread.sleep(3000);
		driver.findElement(AdmitWardSelOpt).click();

		Thread.sleep(3000);
		driver.findElement(SaveAndExit).click();

		Thread.sleep(5000);
		driver.findElement(Consultation).click();

		Thread.sleep(2000);
		driver.findElement(ConsultationDropDown).click();	

		Thread.sleep(3000);
		driver.findElement(ConsultationDropdownSelopt).click();	

		Thread.sleep(5000);
		driver.findElement(SaveConsulat).click();

		Thread.sleep(5000);
		driver.findElement(MarkToBill).click();

		Thread.sleep(5000);
		driver.findElement(ContinueBill).click();

		Thread.sleep(5000);
		driver.findElement(ContinueBillyes).click();

		//TabSwitch
		Thread.sleep(5000);
		String windowHandle2 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs1 = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(5000);
		driver.switchTo().window((String)tabs1.get(0));	

		driver.close();

		//.............Medcare..........	
		driver = new ChromeDriver();
		driver.get("https://mykare-qa.hatiintl.com/Medcare");
		Thread.sleep(2000);
		driver.manage().window().maximize(); 

		Thread.sleep(2000);
		driver.findElement(tab1).sendKeys("1");
		driver.findElement(tab2).sendKeys("0");
		driver.findElement(tab3).sendKeys("0");
		driver.findElement(tab4).sendKeys("2");
		driver.findElement(tab5).sendKeys("1");
		driver.findElement(tab6).sendKeys("2");
		driver.findElement(tab7).sendKeys("3");
		driver.findElement(tab8).sendKeys("4");

		Thread.sleep(2000);
		Actions act3 = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele1=driver.findElement(mainmenu1);
		act3.moveToElement(ele1).build().perform();
		act3.click(ele1).perform();

		Thread.sleep(4000);
		driver.findElement(ADTMenu).click();

		/*//Over the slide bar in Billing menu Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act3.moveToElement(overforopdslide2).build().perform();*/

		/*Thread.sleep(4000);
		driver.findElement(AdmissionDashboard).click();*/

		//Click on Advanced Search
				Thread.sleep(3000);
				driver.findElement(AdvancedSearchClick).click();

				Thread.sleep(3000);
				driver.findElement(MRNClick).sendKeys(PatientMRN);

				Thread.sleep(3000);
				driver.findElement(SearchClick).click();
				
		Thread.sleep(8000);
		driver.findElement(SaveAdmission).click();

		Thread.sleep(3000);
		driver.findElement(ReasonForAdmissionADT).click();

		Thread.sleep(3000);
		driver.findElement(AllDropDown).click();

		Thread.sleep(3000);
		driver.findElement(Doctor).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingPhysicianSelopt).click();

		Thread.sleep(3000);
		driver.findElement(ADTWard).click();
		Thread.sleep(3000);
		driver.findElement(ADTWardSelOPt).click();

		Thread.sleep(3000);
		driver.findElement(Bed).click();
		Thread.sleep(3000);
		driver.findElement(BedClick).click();

		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(SaveBtnClick).click();

		//Clicking on Okay dialog
		Thread.sleep(3000);
		driver.findElement(OkButtonClick).click();
		
		//TabSwitch
				Thread.sleep(5000);
				String windowHandle3 = driver.getWindowHandle();

				//Get the list of window handles

				ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());

				//Use the list of window handles to switch between windows
				Thread.sleep(5000);
				driver.switchTo().window((String)tabs2.get(0));	
				
				//Clicking Row 
				Thread.sleep(5000);
				driver.findElement(ROWClick).click();

				//Clicking update status menu. 
				Thread.sleep(3000);
				driver.findElement(UpdateStatus).click();

				//Clicking on status.
				Thread.sleep(3000);
				driver.findElement(StatusClick).click();
				Thread.sleep(2000);
				driver.findElement(StatusSelopt).click();

				//Adding Remarks
				Thread.sleep(2000);
				driver.findElement(RemarksClick12).sendKeys("Want to do admitted patient");

				//Clicking on confirm button
				Thread.sleep(2000);
				driver.findElement(ConfirmButtonClick).click();
				
				driver.close();			
				
				//.............Medcare..........	
				Thread.sleep(4000);
				driver = new ChromeDriver();
				driver.get("https://mykare-qa.hatiintl.com/Medcare");
				Thread.sleep(8000);
				driver.manage().window().maximize(); 

				Thread.sleep(2000);
				driver.findElement(tab11).sendKeys("1");
				driver.findElement(tab21).sendKeys("0");
				driver.findElement(tab31).sendKeys("7");
				driver.findElement(tab41).sendKeys("2");
				driver.findElement(tab51).sendKeys("1");
				driver.findElement(tab61).sendKeys("0");
				driver.findElement(tab71).sendKeys("7");
				driver.findElement(tab81).sendKeys("2");
				

				Thread.sleep(14000);

				driver.findElement(mainmenu).click();
				Thread.sleep(12000);
				driver.findElement(clinicalstation).click();
				Thread.sleep(10000);
				
				/*// Handling a new window/tab if opened
				String mainWindow = driver.getWindowHandle();
				ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(tabs3.get(1)); // Switch back to the original tab*/
				Thread.sleep(12000);
				driver.findElement(ADT).click();
				
				Thread.sleep(8000);
				// Actions performed step by step with Thread.sleep(3000) after each action
				driver.findElement(NewAdmissionn).click();  // Click on New Admission
				Thread.sleep(5000);

				driver.findElement(Name).sendKeys(PatientMRN);  // Enter name or MPI
				Thread.sleep(3000);

				driver.findElement(Search1).click();  // Click on Search
				Thread.sleep(3000);
				
				driver.findElement(AckPending).click();  // Click on Ack Pending
				Thread.sleep(3000);

				driver.findElement(Action).click();  // Click Action button
				Thread.sleep(3000);

				driver.findElement(MarkAcknowledge).click();  // Click Mark Acknowledge
				Thread.sleep(3000);

				driver.findElement(ConfirmBed).click();  // Confirm Bed Save
				Thread.sleep(3000);

				driver.findElement(Action).click();  // Click Action button
				Thread.sleep(3000);

				driver.findElement(MarkArrival).click();  // Click on Mark Arrival
				Thread.sleep(3000);

				driver.findElement(ConfirmBed1).click();  // Confirm Bed after Arrival
				Thread.sleep(3000);		
				
				driver.close();	
				
			//........Clinicare DR Fill In PAtient........//	
				Thread.sleep(4000);
				driver = new ChromeDriver();
				driver.get("https://mykare-qa.hatiintl.com/Medcare");
				Thread.sleep(8000);
				driver.manage().window().maximize(); 

				Thread.sleep(2000);
				driver.findElement(tab11).sendKeys("1");
				driver.findElement(tab21).sendKeys("0");
				driver.findElement(tab31).sendKeys("5");
				driver.findElement(tab41).sendKeys("7");
				driver.findElement(tab51).sendKeys("1");
				driver.findElement(tab61).sendKeys("0");
				driver.findElement(tab71).sendKeys("5");
				driver.findElement(tab81).sendKeys("7");
				
				// Search Name_MPI and add the primary and secondary survey
				Thread.sleep(10000);
				driver.findElement(MainMenu).click();
				
				Thread.sleep(10000);
				driver.findElement(InPatient).click();
				
				Thread.sleep(10000);
				driver.findElement(AdvancedSearch).click();
				
				Thread.sleep(10000);
				driver.findElement(MRNSearch).sendKeys(PatientMRN);
				Thread.sleep(10000);
				driver.findElement(FinelSearch).click();
				
				Thread.sleep(10000);
				driver.findElement(SelectPateint).click();
				
				
				// ALLERGY section
				driver.findElement(HIST_ALLERGY).click();
				Thread.sleep(3000);

				driver.findElement(Preglodie).click();
				Thread.sleep(3000);

				driver.findElement(SelectReaction).click();
				Thread.sleep(3000);

				driver.findElement(AbdominalPain).click();
				Thread.sleep(3000);

				driver.findElement(Severity).click();
				Thread.sleep(3000);

				driver.findElement(Mild).click();
				Thread.sleep(3000);

				driver.findElement(kSaveExit1).click();
				Thread.sleep(3000);

				// Examination
				driver.findElement(EXAM_PCA).click();
				Thread.sleep(3000);

				driver.findElement(IsHighAlert).click();
				Thread.sleep(3000);

				driver.findElement(AlertDescription).sendKeys("High alert description");
				Thread.sleep(3000);

				driver.findElement(highalertSave).click();
				Thread.sleep(3000);

				driver.findElement(close).click();
				Thread.sleep(3000);

				// Diagnosis
				driver.findElement(DIAG_CD).click();
				Thread.sleep(3000);

				driver.findElement(reco).click();
				Thread.sleep(3000);

				driver.findElement(CurrentCondition).click();
				Thread.sleep(3000);

				driver.findElement(OPT9).click();
				Thread.sleep(3000);

				driver.findElement(Privacy).click();
				Thread.sleep(3000);

				driver.findElement(OPT8).click();
				Thread.sleep(3000);

				driver.findElement(kSaveExit10).click();
				Thread.sleep(3000);

				//.....Orders.......//
				
				Thread.sleep(5000);
				// PLAN_NO actions
				driver.findElement(PLAN_NO).click();
				Thread.sleep(3000);
				driver.findElement(checkbox98).click();
				Thread.sleep(3000);
				driver.findElement(arroww).click();
				Thread.sleep(3000);
				driver.findElement(SingleDose).click();
				Thread.sleep(3000);
				driver.findElement(Durationsendkey).sendKeys("5");
				Thread.sleep(3000);
				driver.findElement(selectt).click();
				Thread.sleep(3000);
				driver.findElement(dayopt).click();
				Thread.sleep(3000);
				driver.findElement(kSaveExit92).click();
				Thread.sleep(3000);
				
				driver.findElement(OrderBasket).click();
				Thread.sleep(3000);
				
				driver.findElement(SubmitOrder).click();
				Thread.sleep(3000);
				
				driver.findElement(CloseSubmitOrder).click();
				Thread.sleep(3000);
				
				
	}
}
