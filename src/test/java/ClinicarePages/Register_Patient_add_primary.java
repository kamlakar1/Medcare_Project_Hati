package ClinicarePages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import OPDTest.ReadExcelRowWithSelenium;

public class Register_Patient_add_primary  {

	WebDriver driver=null;

	//----Main Menu---//

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ER=By.cssSelector("img[src='../../../assets/images/master-icons/ER.png']");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");


	//----Serach Name_MPI and add the primary and secodary survey---//
	By Name_MPI=By.id("Name/MPI");
	By Search=By.id("Search");
	By Continue = By.xpath("//p-table/div/div/table/tbody/tr/td[1]/button/span");
	By PrimarySurvey = By.cssSelector("a[aria-label='Primary Survey']");
	// General Condition
	By GeneralCondition = By.cssSelector("img[src='assets/demo/images/icons/General Condition.svg']");
	By HydrationStatusDropdown = By.cssSelector("p-dropdown[formcontrolname='hydration']");
	By HydrationStatusDropdownopt = By.xpath("//ul[@role='listbox']/p-dropdownitem[1]");
	By Nutritional_Status = By.cssSelector("p-dropdown[formcontrolname='nutritional']");
	By Nutritional_Statusopt = By.xpath("//ul[@role='listbox']/p-dropdownitem[1]");
	By Conscious_Level = By.cssSelector("p-dropdown[formcontrolname='conscious']");
	By Conscious_Levelopt = By.xpath("//ul[@role='listbox']/p-dropdownitem[1]");
	By Update = By.xpath("//app-primary-survey/div/div[2]/app-lt-post-button/button");

	// Vitals
	By Vital = By.xpath("//p-table/div/div/table/tbody/tr[2]/td/img");
	By Add_New_Vital = By.xpath("//p-panel/div/div[1]/div[2]/div/div[4]/button");
	By Height = By.id("heightVal");
	By Weight = By.id("weightVal");
	By Temperature = By.id("tempVal");
	By Save = By.id("save");

	// Airways
	By Airways = By.xpath("//p-table/div/div/table/tbody/tr[3]/td/img");
	By Clear_Checkbox = By.xpath("//p-panel/div/div[2]/div/div[1]/div[1]/div[1]/p-checkbox/div/div[2]");
	By SaveAirways = By.xpath("//p-panel/div/div[2]/div/div[3]/div[2]/app-lt-post-button/button");

	// Secondary Survey
	By Secondary_Survey = By.cssSelector("a[aria-label='Secondary Survey']");

	// LabOrder
	By LabOrder = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[3]/div/div/div/div/div/button");
	By LabOrdercheckbox = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-lab-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By Frequency = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-lab-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div/div[1]/p-autocomplete/span/button");
	By Frequencyopt = By.xpath("//span[contains(text(),'Single Dose')]");
	By Duration = By.id("durationNum");
	By Select = By.id("durationUnit");
	By SelectOPT = By.cssSelector("li[aria-label='Days']");
	By SaveANDexit1 = By.id("SaveExit");

	// Radilogy 

	By Addbutton = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[4]/div/div/div/div/div/button");
	By Checkbox = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-radiology-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By Frequncy = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-radiology-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div/div[1]/div/p-autocomplete/span/button");
	By nFrequncyopt   = By.xpath("//ul[@role='listbox']/li[2]");
	By Durationr = By.id("durationNum");
	By Selectr = By.id("durationUnit");
	By SelectOPTr = By.cssSelector("li[aria-label='Days']");
	By ClinicalCommentsRequests = By.id("clinicalComment");
	By SaveANDexitr = By.id("SaveExit");

	// OT Procedure Order

	By Add = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[6]/div/div/div/div/div/button");
	By Mytop = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/p-table/div/div/table/tbody/tr[1]/td[2]");
	By Speciality = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[2]/p-autocomplete/span/input");
	By Specialityopt = By.xpath("//span[contains(text(),'General Medicine')]");
	By Surgeon = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[3]/p-autocomplete/span/input");
	By Surgeonopt = By.xpath("//span[contains(text(),'DATO DR PHIL')]");
	By Asistent = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[2]/div[1]/p-autocomplete/span/input");
	By Asistentopt = By.xpath("//span[contains(text(),'DATO MR SURAZI S S SYED')]");
	By HighRiskCase = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[5]/p-checkbox/div/div[2]");
	By HighRiskCasevalue  = By.id("inpTex");
	By PACcheckbiox = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[6]/p-checkbox[2]/div/div[2]");
	By SaveANDexitot = By.id("SaveExit");
	By OrderBasket = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-patient-banner/div/div[4]/div/table/tbody/tr[2]/td[1]/p-button/button/span[1]");
	By SubmitOrder = By.xpath("/html/body/div[4]/div/div[3]/apflex-order-basket/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[2]/div/div/div/div/button[2]");
    By EncounterSummary = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li/ul/li[1]/a");
    By secondarySERVUY = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li/ul/li[2]/a/img");
	By Close = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-primary-survey-main/div/div/div/app-view-vitals/p-dialog[2]/div/div/div[2]/div/button");
    By Reason1= By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-lab-order/p-dialog[1]/div/div/div[3]/div[1]/textarea");
    By Reason2= By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-radiology-order/p-dialog/div/div/div[3]/div[1]/textarea");
    By Reason3= By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/p-dialog[1]/div/div/div[3]/div/textarea");
    By Yes1 = By.xpath("//span[contains(text(),'Yes')]");
  //  By Yes2  = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-radiology-order/p-dialog/div/div/div[3]/div[2]/div[2]/app-lt-post-button/button/span[2]");
	//By Yes3 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/p-dialog[1]/div/div/div[3]/div/textarea");
    public Register_Patient_add_primary (WebDriver driver)

	{
		this.driver=driver;

	}


	public void ers() throws InterruptedException, IOException, AWTException 

	{

		Thread.sleep(8000);

		//String currentWindow = driver.getWindowHandle();


		// Main Menu
		driver.findElement(mainmenu).click();
		Thread.sleep(8000);
		driver.findElement(ER).click();
		Thread.sleep(10000);

		// Handling a new window/tab if opened
		String mainWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // Switch back to the original tab
		Thread.sleep(14000);

		// Search Name_MPI and add the primary and secondary survey
		
		driver.findElement(secondarySERVUY).click();
		Thread.sleep(3000);
		driver.findElement(EncounterSummary).click();
		Thread.sleep(3000);
		driver.findElement(Name_MPI).sendKeys("UNKNOWN-16:16:23:44");
		Thread.sleep(3000);
		driver.findElement(Search).click();
		Thread.sleep(3000);
		driver.findElement(Continue).click();
		Thread.sleep(3000);

		// General Condition
		driver.findElement(PrimarySurvey).click();
		Thread.sleep(3000);
		driver.findElement(GeneralCondition).click();
		Thread.sleep(3000);
		driver.findElement(HydrationStatusDropdown).click();
		Thread.sleep(3000);
		driver.findElement(Nutritional_Status).click();
		Thread.sleep(3000);
		driver.findElement(Nutritional_Statusopt).click();
		Thread.sleep(3000);
		driver.findElement(Conscious_Level).click();
		Thread.sleep(3000);
		driver.findElement(Conscious_Levelopt).click();
		Thread.sleep(3000);
		driver.findElement(Update).click();
		Thread.sleep(6000);
		
		
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(900);

		// Vitals
		driver.findElement(Vital).click();
		Thread.sleep(3000);
		driver.findElement(Add_New_Vital).click();
		Thread.sleep(3000);
		driver.findElement(Height).sendKeys("5.7");
		Thread.sleep(3000);
		driver.findElement(Weight).sendKeys("70");
		Thread.sleep(3000);
		driver.findElement(Temperature).sendKeys("32");
		Thread.sleep(3000);
		driver.findElement(Save).click();
		Thread.sleep(3000);
		driver.findElement(Close).click();
		Thread.sleep(3000);
		
		
		
		Thread.sleep(5000);
		
		Robot robot1 = new Robot();
		for (int i = 0; i < 2; i++) {
			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_SUBTRACT);
			robot1.keyRelease(KeyEvent.VK_SUBTRACT);
			robot1.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(900);

		// Airways
		driver.findElement(Airways).click();
		Thread.sleep(3000);
		driver.findElement(Clear_Checkbox).click();
		Thread.sleep(3000);
		driver.findElement(SaveAirways).click();
		Thread.sleep(3000);

		// Secondary Survey
		driver.findElement(Secondary_Survey).click();
		Thread.sleep(8000);

		// Lab Order
		driver.findElement(LabOrder).click();
		Thread.sleep(3000);
		driver.findElement(LabOrdercheckbox).click();
		Thread.sleep(3000);
		driver.findElement(Frequency).click();
		Thread.sleep(3000);
		driver.findElement(Frequencyopt).click();
		Thread.sleep(3000);
		driver.findElement(Duration).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(Select).click();
		Thread.sleep(3000);
		driver.findElement(SelectOPT).click();
		Thread.sleep(3000);
		driver.findElement(SaveANDexit1).click();
		Thread.sleep(3000);
		driver.findElement(Reason1).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(Yes1).click();
		Thread.sleep(5000);

		// Radiology
		driver.findElement(Addbutton).click();
		Thread.sleep(3000);
		driver.findElement(Checkbox).click();
		Thread.sleep(3000);
		driver.findElement(Frequncy).click();
		Thread.sleep(3000);
		driver.findElement(nFrequncyopt).click();
		Thread.sleep(3000);
		driver.findElement(Durationr).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(Selectr).click();
		Thread.sleep(3000);
		driver.findElement(SelectOPTr).click();
		Thread.sleep(3000);
		driver.findElement(ClinicalCommentsRequests).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(SaveANDexitr).click();
		Thread.sleep(3000);
		driver.findElement(Reason2).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(Yes1).click();
		Thread.sleep(5000);
		

		// OT Procedure Order
		driver.findElement(Add).click();
		Thread.sleep(3000);
		driver.findElement(Mytop).click();
		Thread.sleep(3000);
		driver.findElement(Speciality).sendKeys("General Medicine");
		Thread.sleep(3000);
		driver.findElement(Specialityopt).click();
		Thread.sleep(3000);
		driver.findElement(Surgeon).sendKeys("DATO DR PHIL");
		Thread.sleep(3000);
		driver.findElement(Surgeonopt).click();
		Thread.sleep(3000);
		driver.findElement(Asistent).sendKeys("DATO MR SURAZI S S SYED");
		Thread.sleep(3000);
		driver.findElement(Asistentopt).click();
		Thread.sleep(3000);
		driver.findElement(HighRiskCase).click();
		Thread.sleep(3000);
		driver.findElement(HighRiskCasevalue).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(PACcheckbiox).click();
		Thread.sleep(3000);
		driver.findElement(SaveANDexitot).click();
		Thread.sleep(3000);
		driver.findElement(Reason3).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(Yes1).click();
		Thread.sleep(3000);
		driver.findElement(OrderBasket).click();
		Thread.sleep(3000);
		driver.findElement(SubmitOrder).click();
		Thread.sleep(3000);



	}
}
