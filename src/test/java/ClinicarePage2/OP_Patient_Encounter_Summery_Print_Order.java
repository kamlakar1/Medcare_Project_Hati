package ClinicarePage2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class OP_Patient_Encounter_Summery_Print_Order 
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
	
		// Locators (Encounter Summary)
		By EncounterSummary = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPENC.png']");
		By Name1 = By.id("Name/MPI");
		By Select = By.xpath("//button[contains(text(),'Select')]");
		By Admit_Assessment = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[2]/a/span[1]");
	
		By clinicalstation = By.cssSelector("img[src='../../../assets/images/master-icons/ClinicalStation.png']");
		By ADT = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li/ul/li[7]/a/span[1]");
		By NewAdmissionn = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/CSNEWADM.png']");
		By IPNEWADMASSE = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPNEWADMASSE.png']");

		By InPatient=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[3]/div[4]/div/img");
		By AdvancedSearch=By.xpath("//app-topbar/div/div[2]/div[2]/ul/li[1]/div/span/button");
		By MRNSearch=By.cssSelector("input[placeholder='Name']");
		By FinelSearch=By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[1]/div/p-scrollpanel/div/div[1]/div/app-app-top-searchbar/div/button[1]");
		By NameOnIPSummery=By.id("Name/MPI");
		By Search=By.id("Search");
		By PrintSummery=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-consult-q/div/div/div[2]/p-table/div/div[2]/table/tbody/tr[1]/td[7]/div/button[1]");
		public OP_Patient_Encounter_Summery_Print_Order (WebDriver driver)
	{
		this.driver=driver;
	}
	public void OPConsult_PrintSummery(String PatientMRN) throws InterruptedException, IOException, AWTException 
	{
						
				
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
				driver.findElement(PrintSummery).click();
				
				
				
	}
}
