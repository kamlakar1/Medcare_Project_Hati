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
public class OPPatient_SearchInClinicare_StartConsult_MedicationOrder_LoginMedcare_Accpet_RIS 
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
	By AdmissionType=By.xpath("//*[@id='pn_id_211_content']/form/div/div[1]/div/div/div[4]/div[1]/p-dropdown");
	By AdmissionTypeSelOpt=By.xpath("//span[contains(text(),'Elective')]");
	By ReasonForAdmission=By.xpath("//*[@id='pn_id_342_content']/form/div/div[1]/div/div/div[4]/div[2]/p-dropdown");
	By ReasonForAdmissionSelOPt=By.xpath("//span[contains(text(),'Elective Surgery')]");
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
		By MRNClick=By.cssSelector("input[ng-reflect-name='mrn']");
		//Search
		By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");
	
	By PatientNameMPI=By.cssSelector("input[placeholder='Name']");
	By SearchPatient1=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-consult-q/div/div/div/div[1]/form/div/div[7]/div/div[2]/button");

	public OPPatient_SearchInClinicare_StartConsult_MedicationOrder_LoginMedcare_Accpet_RIS (WebDriver driver)
	{
		this.driver=driver;
	}
	public void AdmitOrder(String PatientMRN) throws InterruptedException, IOException, AWTException 
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


		/*Thread.sleep(3000);
		driver.findElement(AdmissionType).click();	
		Thread.sleep(3000);
		driver.findElement(AdmissionTypeSelOpt).click();

		Thread.sleep(5000);
		driver.findElement(ReasonForAdmission).click();
		Thread.sleep(7000);
		driver.findElement(ReasonForAdmissionSelOPt).click();*/

		Thread.sleep(5000);
		driver.findElement(AdmittingFacility).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingFacilitySelOpt).click();

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

		driver.quit();

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

		//Over the slide bar in Billing menu Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act3.moveToElement(overforopdslide2).build().perform();

		/*Thread.sleep(4000);
		driver.findElement(AdmissionDashboard).click();*/
		
		//Click on Advanced Search
				Thread.sleep(3000);
				driver.findElement(AdvancedSearchClick).click();
				
				/*Thread.sleep(3000);
				driver.findElement(MRNClick).sendKeys(PatientMRN);*/
				
				Thread.sleep(3000);
				driver.findElement(MRNClick).sendKeys(PatientMRN);
				
				Thread.sleep(3000);
				driver.findElement(SearchClick).click();
	}
}
