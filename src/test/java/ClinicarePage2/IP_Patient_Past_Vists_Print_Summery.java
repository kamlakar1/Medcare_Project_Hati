package ClinicarePage2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class IP_Patient_Past_Vists_Print_Summery 
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
		By ReAssistment=By.id("RA");
//......Vital Details......//
		By Vitals=By.id("PV");
		By AddNewVitals=By.xpath("//app-vital-case-sheet/div/div/div/app-view-vitals/div/div/p-panel/div/div[1]/div[2]/div/div[5]/button");
		By Height=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-vital-case-sheet/div/div/div/app-view-vitals/p-dialog[2]/div/div/div[3]/app-vital-add/form/div/div[3]/div[1]/div/div/input");
		By Weight=By.id("weightVal");
		By Tempture=By.id("tempVal");
		By PulseRate=By.id("pulseVal");
		By BloodClocuse=By.id("bgVal");
		By Save=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-vital-case-sheet/div/div/div/app-view-vitals/p-dialog[2]/div/div/div[3]/app-vital-add/form/div/div[6]/div/div[2]/app-lt-post-button/button");
		By Close=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-vital-case-sheet/div/div/div/app-view-vitals/p-dialog[2]/div/div/div[2]/div/button");
	//.....Past Visits.....Print Summary.....//
		By PastVisits=By.id("PV");
		By PrintSummery=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-past-visit/div/div/div[1]/p-panel/div/div[2]/div/div/div[2]/div/p-table/div/div/table/tbody/tr/td[7]/button");
		
		public IP_Patient_Past_Vists_Print_Summery (WebDriver driver)
	{
		this.driver=driver;
	}
	public void Past_Vists_Print_Summery(String PatientMRN) throws InterruptedException, IOException, AWTException 
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
				driver.findElement(Vitals).click();
				
				Thread.sleep(6000);
				driver.findElement(AddNewVitals).click();
				
				Thread.sleep(5000);
				driver.findElement(Height).sendKeys("6.1");
				
				Thread.sleep(5000);
				driver.findElement(Weight).sendKeys("70");
				
				Thread.sleep(5000);
				driver.findElement(Tempture).sendKeys("70");
				
				Thread.sleep(5000);
				driver.findElement(PulseRate).sendKeys("80");
				
				Thread.sleep(5000);
				driver.findElement(BloodClocuse).sendKeys("120");
				
				Thread.sleep(5000);
				driver.findElement(Save).click();
				
				Thread.sleep(5000);
				driver.findElement(Close).click();
				
				//.....Past Visits.....Print Summary.....//
				
				Thread.sleep(5000);
				driver.findElement(PastVisits).click();
				
				Thread.sleep(5000);
				driver.findElement(PrintSummery).click();
				
				
	}
}
