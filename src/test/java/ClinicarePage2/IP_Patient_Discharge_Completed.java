package ClinicarePage2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IP_Patient_Discharge_Completed 
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


		
		By AdmitAssisment=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[2]/a");
		By MarkToBill=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[4]/div/div[2]/div/div[1]/button");
		By ContinueBill=By.cssSelector("app-lt-post-button[buttonlabel='Continue']");
		By ContinueBillyes=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/p-confirmdialog/div/div/div[3]/button[2]");

		By OtherActions=By.xpath("//app-patient-banner/div/div[4]/div/table/tbody/tr[2]/td[2]/p-splitbutton/div/button[2]");
		By DischargeInitiateDr=By.xpath("/html/body/div[4]/p-tieredmenusub/ul/li[2]/div/a/span[1]");	
		By DischargeType=By.id("dischargeType");
		By DischargeTypeSelOpt=By.xpath("/html/body/div[5]/div/div/div/ul/p-dropdownitem[1]/li");
		By DispotionType=By.id("dispositionTypes");
		By DispotionTypeSelOpt=By.xpath("/html/body/div[5]/div/div/div/ul/p-dropdownitem[1]/li");
		By InitiateDischargeBtn=By.xpath("/html/body/div[4]/div/div[3]/app-initiate-discharge/form/div/div/div/div[5]/app-lt-post-button/button");
		
		By DischargeComplete=By.xpath("/html/body/div[4]/p-tieredmenusub/ul/li[3]");
		By MedicalCertificate=By.cssSelector("p-checkbox[formcontrolname='medical']");
		By PatientValuable=By.cssSelector("p-checkbox[formcontrolname='patient']");
		By FollowUpAppointment=By.cssSelector("p-checkbox[formcontrolname='follow']");
		
		//Nurse Login
		//Login
				By tab11 = By.id("tab1");
				By tab21 = By.id("tab2");
				By tab31 = By.id("tab3");
				By tab41 = By.id("tab4");
				By tab51 = By.id("tab5");
				By tab61 = By.id("tab6");
				By tab71 = By.id("tab7");
				By tab81 = By.id("tab8");
				
				
		public IP_Patient_Discharge_Completed (WebDriver driver)
	{
		this.driver=driver;
	}
	public void IP_Patient_DischargeCompleted(String PatientMRN) throws InterruptedException, IOException, AWTException 
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
				
				Thread.sleep(10000);
				driver.findElement(AdvancedSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(MRNSearch).sendKeys(PatientMRN);
				Thread.sleep(5000);
				driver.findElement(FinelSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(SelectPateint).click();			
		
				//Discharge Initiated
				
				Thread.sleep(5000);
				driver.findElement(OtherActions).click();	
				
				Thread.sleep(5000);
				driver.findElement(DischargeInitiateDr).click();	
				
				Thread.sleep(5000);
				driver.findElement(DischargeType).click();
				
				Thread.sleep(5000);
				driver.findElement(DischargeTypeSelOpt).click();
				
				Thread.sleep(5000);
				driver.findElement(DispotionType).click();
				
				Thread.sleep(5000);
				driver.findElement(DispotionTypeSelOpt).click();
				
				Thread.sleep(5000);
				driver.findElement(InitiateDischargeBtn).click();
				
				
			//Mark Discharge Completed	
				Thread.sleep(10000);
				driver.findElement(AdvancedSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(MRNSearch).sendKeys(PatientMRN);
				Thread.sleep(5000);
				driver.findElement(FinelSearch).click();
				
				Thread.sleep(5000);
				driver.findElement(SelectPateint).click();			
				
				Thread.sleep(5000);
				driver.findElement(OtherActions).click();	
				
				Thread.sleep(5000);
				driver.findElement(DischargeComplete).click();
				
				Thread.sleep(5000);
				driver.findElement(MedicalCertificate).click();
				
				
				
				
				
				Thread.sleep(10000);
				driver.close();			
				
				//.............Clinicare Nurse login..........	
				Thread.sleep(5000);
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
				
				// Handling a new window/tab if opened
				String mainWindow = driver.getWindowHandle();
				ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(tabs3.get(1)); // Switch back to the original tab
				
				Thread.sleep(12000);
				driver.findElement(ADT).click();
				
				
							
				
	}
}
