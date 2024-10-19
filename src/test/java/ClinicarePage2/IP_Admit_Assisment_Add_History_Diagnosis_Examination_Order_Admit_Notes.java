package ClinicarePage2;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class IP_Admit_Assisment_Add_History_Diagnosis_Examination_Order_Admit_Notes 
{
	WebDriver driver=null;

	//----Main Menu---//
	By SearchPatient=By.cssSelector("button[id='Search']");
	//----Serach Name_MPI and add the primary and secodary survey---//
	By Name_MPI=By.id("Name/MPI");
	By Search=By.id("Search");
	By Continue = By.xpath("//*[@id='tokenbutton']");
	By StartConsult=By.xpath("//*[@id='startconsult']");
	By AdmitOrder=By.id("PLAN_ADMIT");
	By StandinNotes=By.cssSelector("textarea[formcontrolname='StandingOrders']");

	By MainMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By SaveAndExit=By.id("SaveExit");
	By AdmitAssisment=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[2]/a");
	By MarkToBill=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[4]/div/div[2]/div/div[1]/button");
	By ContinueBill=By.cssSelector("app-lt-post-button[buttonlabel='Continue']");
	By ContinueBillyes=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/p-confirmdialog/div/div/div[3]/button[2]");

		
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

		
		By clinicalstation = By.cssSelector("img[src='../../../assets/images/master-icons/ClinicalStation.png']");
		By ADT = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li/ul/li[7]/a/span[1]");
		By NewAdmissionn = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/CSNEWADM.png']");
		By IPNEWADMASSE = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPNEWADMASSE.png']");

		By InPatient=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[3]/div[4]/div/img");
		By AdvancedSearch=By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[1]/div/span/button");
		By MRNSearch=By.cssSelector("input[placeholder='Name']");
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
		By SubmitOrder=By.xpath("//p-tabpanel[1]/div/div[1]/div[2]/div/div/div/div/button[2]");
		By ConfirmYes=By.xpath("/html/body/div[5]/div/div[3]/apflex-order-basket/p-confirmdialog/div/div/div[3]/button[2]");
		By CloseSubmitOrder=By.xpath("/html/body/div[5]/div/div[2]/div/button");
		By AdmissionNotes=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-patient-banner/div/div[4]/div/table/tbody/tr[1]/td/div/span[2]/button");
		public IP_Admit_Assisment_Add_History_Diagnosis_Examination_Order_Admit_Notes (WebDriver driver)
	{
		this.driver=driver;
	}
	public void Admit_Notes (String PatientMRN) throws InterruptedException, IOException, AWTException 
	{
				Thread.sleep(8000);
			//........Clinicare DR Fill In PAtient........//				
				// Search Name_MPI and add the primary and secondary survey
				Thread.sleep(10000);
				driver.findElement(MainMenu).click();
				
				Thread.sleep(10000);
				driver.findElement(InPatient).click();
				
				Thread.sleep(5000);
				String windowHandle = driver.getWindowHandle();

				//Get the list of window handles

				ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());	
				driver.switchTo().window((String) tabs.get(1));
				
				Thread.sleep(10000);
				driver.findElement(AdvancedSearch).click();
				
				Thread.sleep(10000);
				driver.findElement(MRNSearch).sendKeys(PatientMRN);
				
				Thread.sleep(10000);
				driver.findElement(FinelSearch).click();
				
				Thread.sleep(10000);
				driver.findElement(SelectPateint).click();
				
				Thread.sleep(5000);
				driver.findElement(AdmitAssisment).click();
								
				// ALLERGY section
				Thread.sleep(5000);
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
				
				Thread.sleep(5000);
				driver.findElement(SubmitOrder).click();
				
				//Thread.sleep(3000);
				//driver.findElement(ConfirmYes).click();
							
				Thread.sleep(3000);				
				driver.findElement(CloseSubmitOrder).click();		
				
				Thread.sleep(3000);				
				driver.findElement(AdmissionNotes).click();				
	}
}
