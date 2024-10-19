package ClinicarePage2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class IP_PAtient_Non_OT_Procedure_ResultsAndReports 
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
		By EncounterSummary = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li[1]/ul/li[1]/a/img");
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
		By AdmitAssisment=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[2]/a");
		By NonOt = By.id("PLAN_NONOT");
		By NonOtCheckBox=By.xpath("//*[@id='this.topType == 1 && !this.searchingItem ? myTop : this.dataProvider']");
		By SaveAndExit=By.id("SaveExit");	
		
		By OrderBasket=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-patient-banner/div/div[4]/div/table/tbody/tr[2]/td[1]/p-button/button");
		By SubmitOrder=By.xpath("/html/body/div[5]/div/div[3]/apflex-order-basket/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[2]/div/div/div/div/button[2]");
		By CloseBasketOrder=By.xpath("/html/body/div[4]/div/div[2]/div/button");
		
		By NonOTProcedure=By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li[1]/ul/li[6]/a/img");
		By PatientMRNName=By.cssSelector("input[formcontrolname='patientName']");
		By NonOTSearchPatient=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-nursing-care-q/div/form/div[1]/div[7]/div/div[1]/button");
		By SelectPatient=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-nursing-care-q/div/div/div/div/div/p-table/div/div/table/tbody/tr/td[1]/button");
		By ConductNotes=By.xpath("//app-administration-nonot/div/div/div[2]/div[1]/app-administration-conduct/div/div/button");
		By AddTemplate=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-administration-banner/div[1]/div[2]/app-administration-nonot/div/div/div[2]/div[1]/app-administration-conduct/p-dialog[1]/div/div/div[3]/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/p-editor/div/div[2]/div[1]/p");
		By SaveExit=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-administration-banner/div[1]/div[2]/app-administration-nonot/div/div/div[2]/div[1]/app-administration-conduct/p-dialog[1]/div/div/div[4]/div/div[5]/app-lt-post-button/button");
		By MarkConducted=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-administration-banner/div[1]/app-administration-casesheet/div/div/div/div/div[3]/div/div[3]/div[2]/app-lt-post-button/button");
		By MarkConductedYes=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-administration-banner/div[1]/app-administration-casesheet/p-confirmdialog/div/div/div[3]/button[2]");
		By EncounterSummery=By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li[1]/ul/li[1]/a");
		By PastVisist=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-administration-banner/div[1]/div[1]/p-tabmenu/div/div/div/ul/li[4]/a/span[1]");
		By ViewPAtient=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-nursing-care-q/div/div/div/div/div/p-table/div/div/table/tbody/tr/td[1]/button");
		By AdvancedSearch1=By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[1]/div/span/button");
		By NameMRN=By.cssSelector("input[formcontrolname='patientNameMpi']");
		By FinalSearch1=By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[1]/div/p-scrollpanel/div/div[1]/div/app-app-top-searchbar/div/button[1]");
		By PrintSummery=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-past-visit/div/div/div[1]/p-panel/div/div[2]/div/div/div[2]/div/p-table/div/div/table/tbody/tr/td[7]/button");
		
		By ResultsReports=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[8]/a");
		By NonOTReports=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-view-result/div/div[1]/p-tabview/div/div[1]/div/ul/li[4]/a");
		
		public IP_PAtient_Non_OT_Procedure_ResultsAndReports (WebDriver driver)
	{
		this.driver=driver;
	}
	public void Non_OT_Procedure_ResultsAndReports(String PatientMRN) throws InterruptedException, IOException, AWTException 
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
			
				//......Vital Details......//
				
				Thread.sleep(5000);
				driver.findElement(AdmitAssisment).click();
				
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
				driver.findElement(NonOt).click();
				Thread.sleep(3000);
				driver.findElement(NonOtCheckBox).click();
				Thread.sleep(3000);
				driver.findElement(SaveAndExit).click();
				
				Thread.sleep(3000);
				driver.findElement(OrderBasket).click();
				
				Thread.sleep(3000);
				driver.findElement(SubmitOrder).click();
				
				Thread.sleep(3000);
				driver.findElement(CloseBasketOrder).click();
				
				Thread.sleep(3000);
				driver.findElement(NonOTProcedure).click();
				
				Thread.sleep(5000);
				driver.findElement(PatientMRNName).sendKeys(PatientMRN);
				
				Thread.sleep(3000);
				driver.findElement(NonOTSearchPatient).click();				
				
				Thread.sleep(3000);
				driver.findElement(SelectPatient).click();
				
				Thread.sleep(8000);
				driver.findElement(ConductNotes).click();
				
				Thread.sleep(3000);
				driver.findElement(AddTemplate).sendKeys("Adding conduct notes");
				
				Thread.sleep(3000);
				driver.findElement(SaveExit).click();
				
				Thread.sleep(4000);
				driver.findElement(MarkConducted).click();
				
				Thread.sleep(3000);
				driver.findElement(MarkConductedYes).click();
			
				Thread.sleep(3000);
				driver.findElement(EncounterSummary).click();			
							
				Thread.sleep(14000);
				driver.findElement(AdvancedSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(MRNSearch).sendKeys(PatientMRN);
				
				Thread.sleep(5000);
				driver.findElement(FinelSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(SelectPateint).click();
				
				Thread.sleep(5000);
				driver.findElement(ResultsReports).click();
				
				Thread.sleep(5000);
				driver.findElement(NonOTReports).click();
								
	}
}
