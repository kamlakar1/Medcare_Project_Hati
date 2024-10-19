package ClinicarePage2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class OPPatient_SearchInClinicare_OPConsult_StartConsult_Conduct_Q_AddOrders 
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
	By NonOt = By.id("PLAN_NONOT");
	By NonOtCheckBox=By.xpath("//*[@id='this.topType == 1 && !this.searchingItem ? myTop : this.dataProvider']");
	By SaveAndExit=By.id("SaveExit");
	By OtherOrders=By.id("PLAN_OO");
	By SpeechTherpey=By.xpath("//app-other-orders/div/div/div/div/div/div[1]/p-scrollpanel/div/div[1]/div/div/p-panelmenu/div/div[4]");
	By SpeechTherpeyCheckBox=By.xpath("//*[@id='this.catalogueItems']");
	By Audiometry=By.xpath("//app-other-orders/div/div/div/div/div/div[1]/p-scrollpanel/div/div[1]/div/div/p-panelmenu/div/div[5]/div");
	By AudiometryCheckBox=By.xpath("//*[@id='this.catalogueItems']");
	By OccupationalTherepy=By.xpath("//app-other-orders/div/div/div/div/div/div[1]/p-scrollpanel/div/div[1]/div/div/p-panelmenu/div/div[3]/div");
	By OccupationalTherepyCheckBox=By.xpath("//*[@id='this.catalogueItems']");
			// General Condition
	By Consultation=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[3]/div/div[1]/div[1]");
    By ConsultationDropDown=By.xpath("/html/body/div[4]/div/div/div[1]/p-dropdown");
	By ConsultationDropdownSelopt=By.xpath("//span[contains(text(),'1st. Consultation (Specialist)')]");
	By SaveConsulat=By.xpath("/html/body/div[4]/div/div/div[2]/button");
	By MarkToBill=By.xpath("//app-op-banner/div/div/div/div/div[4]/div/div[2]/div/div[1]/button");
	By ContinueBill=By.xpath("/html/body/div[4]/div/div[4]/div/div[2]/app-lt-post-button/button");
	By ContinueBillyes=By.xpath("//p-confirmdialog/div/div/div[3]/button[1]");
	
	//Conduct Q
	By SpeechTherepy1=By.xpath("//app-menu/ul/li[2]/ul/li[2]/a");
	By Select=By.xpath("//tbody/tr[1]/td[1]/button");
	By ConductNotes=By.xpath("//app-administration-conduct/div/div/button");
	By TemplateSearch=By.xpath("//*[@id='template search']/span/button");
	By ConductedNotes=By.xpath("//span[contains(text(),'conducted')]");
	By SAveAndExit=By.xpath("//*[@id='Save & Exit']/button");
	
	By AudioMetry=By.xpath("//app-menu/ul/li[2]/ul/li[3]/a");
	By AudioMetrySelect=By.xpath("//*[@id='pn_id_1029-table']/tbody/tr/td[1]/button");
	By AudioMetryConductedNotes=By.xpath("//span[contains(text(),'test')]");
	By AudioMetrySAveAndExit=By.xpath("//*[@id='Save & Exit']/button");
	
	By ConductQOccupationalTherepy=By.xpath("//app-menu/ul/li[2]/ul/li[4]/a");
	By OccupationalSelect=By.xpath("//*[@id='pn_id_1331-table']/tbody/tr[1]/td[1]/button");
	By OccupationalConductedNotes=By.xpath("//span[contains(text(),'testing')]");
	
	By Result=By.id("RES");
	public OPPatient_SearchInClinicare_OPConsult_StartConsult_Conduct_Q_AddOrders (WebDriver driver)
	{
		this.driver=driver;
	}
	public void Conduct_Q(String PatientMRN) throws InterruptedException, IOException, AWTException 
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
		/*Thread.sleep(5000);
		driver.findElement(StartConsult).click();*/
		
		
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
		driver.findElement(NonOt).click();
		Thread.sleep(3000);
		driver.findElement(NonOtCheckBox).click();
		Thread.sleep(3000);
		driver.findElement(SaveAndExit).click();
		
		Thread.sleep(5000);
		driver.findElement(OtherOrders).click();
		Thread.sleep(7000);
		driver.findElement(SpeechTherpey).click();
		Thread.sleep(5000);
		driver.findElement(SpeechTherpeyCheckBox).click();
		Thread.sleep(3000);
		driver.findElement(SaveAndExit).click();
		
		
		Thread.sleep(5000);
		driver.findElement(OtherOrders).click();
		
		Thread.sleep(7000);
		driver.findElement(Audiometry).click();
		Thread.sleep(5000);
		driver.findElement(AudiometryCheckBox).click();
		Thread.sleep(3000);
		driver.findElement(SaveAndExit).click();
		
		
		Thread.sleep(5000);
		driver.findElement(OtherOrders).click();
		
		Thread.sleep(5000);
		driver.findElement(OccupationalTherepy).click();
		Thread.sleep(5000);
		driver.findElement(OccupationalTherepyCheckBox).click();
		Thread.sleep(5000);
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
		
		Thread.sleep(7000);
		driver.findElement(ContinueBill).click();
		
		Thread.sleep(5000);
		driver.findElement(ContinueBillyes).click();
		
		//Conduct Q
		//Speech Therepy
		Thread.sleep(5000);
		driver.findElement(SpeechTherepy1).click();
		
		Thread.sleep(5000);
		driver.findElement(Select).click();
		
		Thread.sleep(5000);
		driver.findElement(ConductNotes).click();
		
		Thread.sleep(5000);
		driver.findElement(TemplateSearch).click();
		
		Thread.sleep(5000);
		driver.findElement(ConductedNotes).click();
	
		Thread.sleep(5000);
		driver.findElement(SAveAndExit).click();
		
		//AudioMetry
		Thread.sleep(5000);
		driver.findElement(AudioMetry).click();
		
		Thread.sleep(5000);
		driver.findElement(AudioMetrySelect).click();
		
		Thread.sleep(5000);
		driver.findElement(ConductNotes).click();
		
		Thread.sleep(5000);
		driver.findElement(TemplateSearch).click();
	
		Thread.sleep(5000);
		driver.findElement(AudioMetryConductedNotes).click();
		
		Thread.sleep(5000);
		driver.findElement(SAveAndExit).click();
		
		//Occupational Therepy
		Thread.sleep(5000);
		driver.findElement(ConductQOccupationalTherepy).click();
		
		Thread.sleep(5000);
		driver.findElement(OccupationalSelect).click();
		
		Thread.sleep(5000);
		driver.findElement(ConductNotes).click();
		
		Thread.sleep(5000);
		driver.findElement(TemplateSearch).click();
	
		Thread.sleep(5000);
		driver.findElement(OccupationalConductedNotes).click();
		
		Thread.sleep(5000);
		driver.findElement(SAveAndExit).click();
		
		Thread.sleep(7000);
		driver.findElement(ConsultationQ).click();
		
		Thread.sleep(3000);
		driver.findElement(PatientName).sendKeys(PatientMRN);
		
		Thread.sleep(3000);
		driver.findElement(SearchPatient).click();
		
		Thread.sleep(3000);
		driver.findElement(Search).click();
		
		Thread.sleep(3000);
		driver.findElement(Result).click();
				
	}
}
