package ClinicarePage2;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class IP_Patient_Conduct_Q_Other_Order_Result 
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
	
	// Locators (Encounter Summary)
		By EncounterSummary = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPENC.png']");
		By Name1 = By.id("Name/MPI");
		By Select = By.xpath("//button[contains(text(),'Select')]");
		By Admit_Assessment = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[2]/a/span[1]");

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
		By AdvancedSearch=By.xpath("//app-topbar/div/div[2]/div[2]/ul/li[1]/div/span/button");
		By MRNSearch=By.cssSelector("input[placeholder='Name']");
		By FinelSearch=By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[1]/div/p-scrollpanel/div/div[1]/div/app-app-top-searchbar/div/button[1]");
		By NameOnIPSummery=By.id("Name/MPI");
		
		By SelectPateint=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-in-patient-q/div/div/p-table/div/div/table/tbody/tr/td[1]/button");
		By OtherOrders=By.id("PLAN_OO");
		
		By Re_Assisment=By.id("RA");
		By OccupationalTherepy=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-other-orders/div/div/div/div/div/div[1]/p-scrollpanel/div/div[1]/div/div/p-panelmenu/div/div[3]/div/div/a");
		By OccupationalTherepyCheckBox=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-other-orders/div/div/div/div/div/div[2]/app-occupational-therapy/div/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr/td[2]/p-tablecheckbox/div/div[2]");
		By SaveAndExit=By.id("SaveExit");	
		
		By SpeechTherepy1=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-other-orders/div/div/div/div/div/div[1]/p-scrollpanel/div/div[1]/div/div/p-panelmenu/div/div[4]/div/div/a");
		By LanguageAssistment=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-other-orders/div/div/div/div/div/div[2]/app-speech-therapy/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
		By ConductNotes=By.xpath("//app-administration-conduct/div/div/button");
		By TemplateSearch=By.xpath("//*[@id='template search']/span/button");
		By ConductedNotes=By.xpath("//span[contains(text(),'conducted')]");
		By SAveAndExit=By.xpath("//*[@id='Save & Exit']/button");
		
		By OrderBasket=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-patient-banner/div/div[4]/div/table/tbody/tr[2]/td[1]/p-button/button");
		By SubmitOrder=By.xpath("/html/body/div[4]/div/div[3]/apflex-order-basket/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[2]/div/div/div/div/button[2]");
		By CloseSubmitOrder=By.xpath("/html/body/div[4]/div/div[2]/div/button");
		By ConductQ=By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li[1]/ul/li[7]/a/img");
		public IP_Patient_Conduct_Q_Other_Order_Result (WebDriver driver)
		{
			this.driver=driver;
		}
	public void IP_Patient_Conduct_Q_Other_Order(String PatientMRN) throws InterruptedException, IOException, AWTException 
	{		
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
				
				Thread.sleep(14000);
				driver.findElement(AdvancedSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(MRNSearch).sendKeys(PatientMRN);
				
				Thread.sleep(5000);
				driver.findElement(FinelSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(SelectPateint).click();
					
				Thread.sleep(5000);
				driver.findElement(Re_Assisment).click();
				
				Thread.sleep(5000);
				driver.findElement(OtherOrders).click();
				
				Thread.sleep(5000);
				driver.findElement(OccupationalTherepy).click();
				
				Thread.sleep(5000);			
				driver.findElement(OccupationalTherepyCheckBox).click();
				
				Thread.sleep(5000);
				driver.findElement(SaveAndExit).click();
				
				Thread.sleep(5000);
				driver.findElement(OtherOrders).click();
				
				//Speech Therepy
				Thread.sleep(5000);
				driver.findElement(SpeechTherepy1).click();
				
				Thread.sleep(5000);
				driver.findElement(LanguageAssistment).click();
											
				Thread.sleep(5000);
				driver.findElement(SaveAndExit).click();
				
				Thread.sleep(3000);
				driver.findElement(OrderBasket).click();
				
				Thread.sleep(3000);		
				driver.findElement(SubmitOrder).click();
				
				Thread.sleep(3000);
				driver.findElement(CloseSubmitOrder).click();
				
				Thread.sleep(8000);
				driver.findElement(ConductQ).click();
				
				
	}
}
