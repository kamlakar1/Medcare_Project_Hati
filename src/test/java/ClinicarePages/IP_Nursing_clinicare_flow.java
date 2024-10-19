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
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
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
import io.github.bonigarcia.wdm.WebDriverManager;

public class IP_Nursing_clinicare_flow  {

	WebDriver driver=null;

	//----Main Menu---//

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//============

	// Locators (IP Nursing)
	By NewAdmission = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPDNEWADM.png']");
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

	// Locators for HIST_PMS
	By HIST_PMS = By.id("HIST_PMS");
	By sendkey2 = By.xpath("//p-editor/div/div[2]/div[1]");
	By kSaveExit4 = By.id("SaveExit");

	// Locators for HIST_PD
	By HIST_PD = By.id("HIST_PD");
	By checkbox22 = By.xpath("//tbody/tr[3]/td[2]/p-tablecheckbox/div/div[2]");
	By kSaveExit5 = By.id("SaveExit");



	// HIST_PP  no order available
	//By HIST_PP = By.id("HIST_PP");

	// Locators for HIST_BH
	By HIST_BH = By.id("HIST_BH");
	By sendkey3 = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/input");
	By kSaveExit6 = By.id("SaveExit");

	// Locators for HIST_OncH
	By HIST_OncH = By.id("HIST_OncH");
	By sendkey4 = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div[2]/p-editor/div/div[2]/div[1]");
	By kSaveExit7 = By.id("SaveExit");


	// HIST_FH
	//By HIST_FH = By.id("HIST_FH");
	//By sendkey5 = By.xpath("//p-card/div/div/div/div[2]/div[3]/p-editor/div/div[2]/div[1]");
	//By kSaveExit8 = By.id("SaveExit");

	// Locators
	By HIST_LIFE = By.id("HIST_LIFE");
	By dropdown = By.xpath("//app-smoking/form/div[1]/div[1]/p-dropdown/div");
	By opt = By.xpath("//span[contains(text(),'Current Every Day Smoker')]");
	By Save11 = By.xpath("//app-smoking/form/div[1]/div[9]/div/div[2]/app-lt-post-button/button/span[2]");
	By close_66 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[2]/button[2]");

	By EXAM_PCA = By.id("EXAM_PCA");
	By IsHighAlert = By.id("isAlert");
	By AlertDescription = By.cssSelector("input[id='AlertDescription']");
	By highalertSave = By.id("highalertSave");
	By close = By.xpath("//app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[2]/button[2]");

	By EXAM_V = By.id("EXAM_V");
	By Height = By.id("heightVal");
	By Weight = By.id("weightVal");
	By Save2 = By.xpath("//app-case-sheet/p-dialog/div/div/div[4]/div/app-lt-post-button[1]/button");
	By close2 = By.xpath("//app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[2]/button[2]");

	By EXAM_GC  = By.id("EXAM_GC");
	By Sendkey6 = By.xpath("//div/p-scrollpanel/div/div[1]/div/form/div/div[1]/div[2]/p-editor/div/div[2]/div[1]");
	By kSaveExit8 = By.id("SaveExit");

	// EXAM_EN
	//By EXAM_EN  = By.id("EXAM_EN");

	By EXAM_CF = By.id("EXAM_CF");
	By selectRecord = By.xpath("//div/form/div/div[1]/div/div/div[3]/p-table/div/div/table/tbody/tr[1]/td[3]");
	By ClinicalCourse = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[1]/div[1]/p-dropdown/div/div[2]");
	By opt1 = By.xpath("//span[contains(text(),'Chronic')]");
	By kEpisodicity = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[1]/div[2]/p-dropdown/div/div[2]");
	By opt2 = By.xpath("//span[contains(text(),'New Episode')]");
	By Severity1 = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[1]/div[3]/p-dropdown/div/div[2]");
	By mild = By.xpath("//span[contains(text(),'Mild')]");
	By kSaveExit9 = By.id("SaveExit");

	//By EXAM_As  = By.id("EXAM_As");


	// New locators for EXAM_IM
	By EXAM_IM = By.id("EXAM_IM");
	By EXAM_NN = By.id("EXAM_NN");
	By EXAM_MLC = By.id("EXAM_MLC");
	By MedicoLegalCase = By.xpath("//div/form/div/div[1]/div/div[1]/div[1]/p-checkbox/div/div[2]");
	By BroughtinDead = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[1]/p-radiobutton/div/div[2]");
	By CauseOfDeath = By.xpath("//div/form/div/div[2]/div/div[2]/div/div[1]/p-dropdown/div/div[2]");
	By opt4 = By.xpath("//span[contains(text(),'Found dead')]");
	By save9 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-mlc/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[6]/div[2]/app-lt-post-button/button/span[2]");

	//By TRAN_ORDER = By.id("TRAN_ORDER");


	//By CC = By.id("CC");	


	// New locators for Diagnosis
	By DIAG_CD = By.id("DIAG_CD");
	By reco = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[1]/form/div[2]/div/p-table/div/div/table/tbody/tr[1]/td[4]");
	By CurrentCondition = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/div/div[2]/form/div[1]/p-dropdown/div/div[2]");
	By OPT9 = By.xpath("//span[contains(text(),'Good')]");
	By Privacy = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/div/div[2]/form/div[2]/p-dropdown/div/div[2]");
	By OPT8 = By.xpath("//span[contains(text(),'Visible to Doctors')]");
	By kSaveExit10 = By.id("SaveExit");

	// DIAG_AD  no data
	//By DIAG_AD = By.id("DIAG_AD");
	//By DIAG_CMD  = By.id("DIAG_CMD");
	//By DIAG_AMD  = By.id("DIAG_AMD");

	// Orders

	//PLAN_AM

	//no record available
	//By PLAN_AM = By.id("PLAN_AM");

	//By PLAN_OS  = By.id("PLAN_OS");
	//By selectreco1 = By.xpath("//p-dialog/div/div/div[3]/ng-component/div/div/div/form/div/div[1]/div/div/div[4]/p-table/div/div/table/tbody/tr/td[1]");
	//By checkbox98  = By.xpath("//p-dialog/div/div/div[3]/ng-component/div/div/div/form/div/div[2]/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]");
	//By Confirm7 = By.xpath("//span[contains(text(),'Confirm')]");
	//By close3 = By.xpath("//app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[2]/button[2]");

	// PLAN_MO
	//By PLAN_MO = By.id("PLAN_MO");


	// PLAN_NO
	By PLAN_NO = By.id("PLAN_NO");
	By checkbox98 = By.xpath("//p-table/div/div/table/tbody/tr/td[2]/p-tablecheckbox/div/div[2]");
	By arroww = By.xpath("//p-tabpanel[1]/div/div/div[2]/div/form/div[1]/div[1]/div/p-autocomplete/span/button");
	By SingleDose = By.xpath("//span[contains(text(),'Single Dose')]");
	By Durationsendkey = By.cssSelector("input[id='durationNum']");
	By selectt = By.xpath("//p-tabpanel[1]/div/div/div[2]/div/form/div[1]/div[2]/div/p-dropdown/div/div[2]");
	By dayopt = By.xpath("//span[contains(text(),'Days')]");
	By kSaveExit92 = By.id("SaveExit");

	// PLAN_RO
	By PLAN_RO = By.id("PLAN_RO");
	By selctreocd = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By Frequency = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div/div[1]/div/p-autocomplete/span/button/chevrondownicon");
	By opt88 = By.xpath("//span[contains(text(),'ON')]");
	By Duration1sendkey = By.cssSelector("input[id='durationNum']");
	By slectre = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div/div[2]/div/p-dropdown/div/div[2]");
	By dayoptt = By.xpath("//span[contains(text(),'Days')]");
	By ClinicalCommentsRequestsSendkeys = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div/div[9]/div/textarea");
	By kSaveExit93 = By.id("SaveExit");

	// PLAN_NONOT
	By PLAN_NONOT = By.id("PLAN_NONOT");
	By recselect = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By Frequencyk = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div[2]/p-autocomplete/span/button");
	By SingleDose_1 = By.xpath("//span[contains(text(),'Single Dose')]");
	By Duration2sendkey = By.cssSelector("input[id='durationNum']");
	By selectrec = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div[3]/div/p-dropdown/div/div[2]");
	By dayopttt = By.xpath("//span[contains(text(),'Days')]");
	By kSaveExit94 = By.id("SaveExit");

	// PLAN_OT
	By PLAN_OT = By.id("PLAN_OT");
	By record2 = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/p-table/div/div/table/tbody/tr[1]/td[2]");
	By SpecialitySendkys = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[2]/p-autocomplete/span/input");
	By GnerlaMedicine = By.xpath("//span[contains(text(),'General Medicine')]");
	By DATOMRSURAZISSSYED = By.xpath("//span[contains(text(),'DATO MR SURAZI S S SYED')]");
	By Assistant = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[2]/div[1]/p-autocomplete/span/button");
	By DATODRPHIL = By.xpath("//span[contains(text(),'DATO DR PHIL')]");
	By kSaveExit95 = By.id("SaveExit");

	// PLAN_OO
	By PLAN_OO = By.id("PLAN_OO");
	By Physiotherapy = By.cssSelector("div[aria-label='Physiotherapy']");
	By cehcbox001 = By.xpath("//p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By Quantitysendkeys = By.cssSelector("input[inputmode='decimal']");
	By kSaveExit96 = By.id("SaveExit");

	// PLAN_RC
	By PLAN_RC = By.id("PLAN_RC");
	By Specialization = By.xpath("//p-card/div/div/div/div[2]/div[1]/div[1]/p-autocomplete/span/button");
	By PrimaryCareMedicine = By.xpath("//span[contains(text(),'Primary Care Medicine')]");
	By ReferralReason = By.xpath("//p-card/div/div/div/div[2]/div[2]/p-autocomplete/span/button");
	By Forspecializedtreatment = By.xpath("//span[contains(text(),'For specialized treatment')]");
	By kSaveExit97 = By.id("SaveExit");

	// PLAN_IMM
	By PLAN_IMM = By.id("PLAN_IMM");
	By record3 = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div/div[4]/p-table/div/div/table/tbody/tr/td[1]");
	By DoseSendkey = By.cssSelector("input[id='dose']");
	By RouteofAdministration = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[1]/div[3]/p-dropdown/div/div[2]");
	By RouteofAdministrationopt = By.xpath("//span[contains(text(),'Left Vastus Lateralis')]");
	By kSaveExit98 = By.id("SaveExit");

	// PLAN_HMD
	By PLAN_HMD = By.id("PLAN_HMD");
	By records = By.xpath("//p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By Frequency_3 = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div/div[2]/div/p-autocomplete/span/button");
	By everymorning = By.xpath("//span[contains(text(),'every morning')]");
	By Duration3Sendky = By.cssSelector("input[id='durationNum']");
	By select7 = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div/div[3]/div/p-dropdown/div/div[2]");
	By dayoptttt = By.xpath("//span[contains(text(),'Days')]");
	By kSaveExit99 = By.id("SaveExit");

	// DIET_ORDER
	By DIET_ORDER = By.id("DIET_ORDER");
	By recordss = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div/div[3]/p-table/div/div/table/tbody/tr/td[1]");
	By ApplicableSchedule = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div[1]/p-autocomplete/span/button");
	By ApplicableScheduleopt = By.xpath("//span[contains(text(),'Breakfast')]");
	By MenuItem = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div[2]/p-autocomplete/span/button");
	By Chapatti = By.xpath("//span[contains(text(),'Chapatti')]");
	By Dietician = By.xpath("//app-diet-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div[4]/p-autocomplete/span/button");
	By DIANASDSELLAPAN = By.xpath("//span[contains(text(),'DIANA S D SELLAPAN')]");
	By kSaveExit901 = By.id("SaveExit");

	// TRANS_ORD
	By TRANS_ORD = By.id("TRANS-ORD");
	By TransferType = By.xpath("//p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div[1]/div[1]/p-dropdown/div/div[2]");
	By TransferTypeopt = By.xpath("//span[contains(text(),'Ward Transfer')]");
	By kSaveExit902 = By.id("SaveExit");


	//Login
	By tab1 = By.id("tab1");
	By tab2 = By.id("tab2");
	By tab3 = By.id("tab3");
	By tab4 = By.id("tab4");
	By tab5 = By.id("tab5");
	By tab6 = By.id("tab6");
	By tab7 = By.id("tab7");
	By tab8 = By.id("tab8");

	By clinicalstation = By.cssSelector("img[src='../../../assets/images/master-icons/ClinicalStation.png']");
	By ADT = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li/ul/li[7]/a");
	By NewAdmissionn = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/CSNEWADM.png']");
	By IPNEWADMASSE = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPNEWADMASSE.png']");

	public IP_Nursing_clinicare_flow (WebDriver driver)

	{
		this.driver=driver;

	}


	public void mjs() throws InterruptedException, IOException, AWTException 

	{

		Thread.sleep(14000);

		driver.findElement(mainmenu).click();
		Thread.sleep(12000);
		driver.findElement(clinicalstation).click();
		Thread.sleep(10000);
		// Handling a new window/tab if opened
		String mainWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // Switch back to the original tab
		Thread.sleep(14000);


		driver.findElement(ADT).click();
		Thread.sleep(8000);
		// Actions performed step by step with Thread.sleep(3000) after each action
		driver.findElement(NewAdmissionn).click();  // Click on New Admission
		Thread.sleep(5000);

		driver.findElement(Name).sendKeys("HISCKLMRN241018944");  // Enter name or MPI
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
		 
		driver.quit();

		Thread.sleep(5000);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mykare-qa.hatiintl.com/Medcare/#/");
		Thread.sleep(10000);
		driver.manage().window().maximize(); 
		// Login to clinicare

		// Login to Nurse IP 
		driver.findElement(tab1).sendKeys("1");
		driver.findElement(tab2).sendKeys("0");
		driver.findElement(tab3).sendKeys("5");
		driver.findElement(tab4).sendKeys("7");
		driver.findElement(tab5).sendKeys("1");
		driver.findElement(tab6).sendKeys("0");
		driver.findElement(tab7).sendKeys("5");
		driver.findElement(tab8).sendKeys("7");

		Thread.sleep(14000);

		driver.findElement(mainmenu).click();
		Thread.sleep(12000);
		driver.findElement(clinicalstation).click();
		// Handling a new window/tab if opened
		String mainWindow1 = driver.getWindowHandle();
		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1)); // Switch back to the original tab
		Thread.sleep(14000);


		driver.findElement(IPNEWADMASSE).click();

		Thread.sleep(5000);

		// Actions performed step by step with Thread.sleep(3000) after each action
		driver.findElement(EncounterSummary).click();  // Click on Encounter Summary
		Thread.sleep(5000);

		driver.findElement(Name1).sendKeys("HISCKLMRN241018944");  // Enter name or MPI
		Thread.sleep(3000);

		driver.findElement(Search1).click();  // Click on Select button
		Thread.sleep(3000);

		driver.findElement(Select).click();  // Click on Select button
		Thread.sleep(3000);

		driver.findElement(Admit_Assessment).click();  // Click on Admit Assessment tab
		Thread.sleep(3000);



		Thread.sleep(5000);

		Robot robot = new Robot(); for (int i = 0; i < 7; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); }

		Thread.sleep(4000);


		// HIST_ALLERGY section
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

		// HIST_COMPLAINT section
		driver.findElement(HIST_COMPLAINT).click();
		Thread.sleep(3000);

		driver.findElement(checkbox1).click();
		Thread.sleep(3000);

		driver.findElement(kSaveExit2).click();
		Thread.sleep(3000);

		// HIST_HPI section
		driver.findElement(HIST_HPI).click();
		Thread.sleep(3000);

		driver.findElement(sendkey1).sendKeys("Test HPI text");
		Thread.sleep(3000);

		driver.findElement(kSaveExit3).click();
		Thread.sleep(3000);

		// HIST_PMS section
		driver.findElement(HIST_PMS).click();
		Thread.sleep(3000);

		driver.findElement(sendkey2).sendKeys("Test PMS text");
		Thread.sleep(3000);

		driver.findElement(kSaveExit4).click();
		Thread.sleep(3000);

		// HIST_PD section
		driver.findElement(HIST_PD).click();
		Thread.sleep(3000);

		driver.findElement(checkbox22).click();
		Thread.sleep(3000);

		driver.findElement(kSaveExit5).click();
		Thread.sleep(3000);

		// HIST_BH section
		driver.findElement(HIST_BH).click();
		Thread.sleep(3000);

		driver.findElement(sendkey3).sendKeys("Test BH input");
		Thread.sleep(3000);

		driver.findElement(kSaveExit6).click();
		Thread.sleep(3000);

		// HIST_OncH section
		driver.findElement(HIST_OncH).click();
		Thread.sleep(3000);

		driver.findElement(sendkey4).sendKeys("Test OncH input");
		Thread.sleep(3000);

		driver.findElement(kSaveExit7).click();
		Thread.sleep(3000);


		// HIST_LIFE interaction
		driver.findElement(HIST_LIFE).click();
		Thread.sleep(3000);

		// Dropdown interaction
		driver.findElement(dropdown).click();
		Thread.sleep(3000);

		// Selecting option
		driver.findElement(opt).click();
		Thread.sleep(3000);

		// Save action
		driver.findElement(Save11).click();
		Thread.sleep(8000);

		driver.findElement(close_66).click();
		Thread.sleep(8000);

	//	Thread.sleep(8000);
		// Examination interactions
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

		// EXAM_V interactions
		driver.findElement(EXAM_V).click();
		Thread.sleep(3000);

		driver.findElement(Height).sendKeys("180");
		Thread.sleep(3000);

		driver.findElement(Weight).sendKeys("75");
		Thread.sleep(3000);

		driver.findElement(Save2).click();
		Thread.sleep(3000);

		driver.findElement(close2).click();
		Thread.sleep(3000);

		// EXAM_GC interactions
		//driver.findElement(EXAM_GC).click();
		//Thread.sleep(3000);

		//driver.findElement(Sendkey6).sendKeys("Some text");
		//Thread.sleep(3000);

		//driver.findElement(kSaveExit8).click();
		//Thread.sleep(3000);

		// EXAM_CF interactions
		driver.findElement(EXAM_CF).click();
		Thread.sleep(3000);

		driver.findElement(selectRecord).click();
		Thread.sleep(3000);

		driver.findElement(ClinicalCourse).click();
		Thread.sleep(3000);

		driver.findElement(opt1).click();
		Thread.sleep(3000);

		driver.findElement(kEpisodicity).click();
		Thread.sleep(3000);

		driver.findElement(opt2).click();
		Thread.sleep(3000);

		driver.findElement(Severity1).click();
		Thread.sleep(3000);

		driver.findElement(mild).click();
		Thread.sleep(3000);

		driver.findElement(kSaveExit9).click();
		Thread.sleep(3000);

		// EXAM_MLC interactions

		driver.findElement(EXAM_MLC).click();
		Thread.sleep(3000);

		driver.findElement(MedicoLegalCase).click();
		Thread.sleep(3000);

		driver.findElement(BroughtinDead).click();
		Thread.sleep(3000);

		driver.findElement(CauseOfDeath).click();
		Thread.sleep(3000);

		driver.findElement(opt4).click();
		Thread.sleep(3000);

		driver.findElement(save9).click();
		Thread.sleep(8000);

		// Diagnosis interactions
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

		// PLAN_RO actions
		driver.findElement(PLAN_RO).click();
		Thread.sleep(3000);

		// Select record checkbox
		driver.findElement(selctreocd).click();
		Thread.sleep(3000);

		// Click Frequency button
		driver.findElement(Frequency).click();
		Thread.sleep(3000);

		// Select ON option
		driver.findElement(opt88).click();
		Thread.sleep(3000);

		// Send duration input
		driver.findElement(Duration1sendkey).sendKeys("10");
		Thread.sleep(3000);

		// Select record dropdown
		driver.findElement(slectre).click();
		Thread.sleep(3000);

		// Select days option
		driver.findElement(dayoptt).click();
		Thread.sleep(3000);

		// Send clinical comments
		driver.findElement(ClinicalCommentsRequestsSendkeys).sendKeys("Clinical comments here.");
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit93).click();
		Thread.sleep(3000);

		// PLAN_NONOT actions
		driver.findElement(PLAN_NONOT).click();
		Thread.sleep(3000);

		// Select record checkbox
		driver.findElement(recselect).click();
		Thread.sleep(3000);

		// Click Frequency button
		driver.findElement(Frequencyk).click();
		Thread.sleep(3000);

		// Select Single Dose option
		driver.findElement(SingleDose_1).click();
		Thread.sleep(3000);

		// Send duration input
		driver.findElement(Duration2sendkey).sendKeys("5");
		Thread.sleep(3000);

		// Select record dropdown
		driver.findElement(selectrec).click();
		Thread.sleep(3000);

		// Select days option
		driver.findElement(dayopttt).click();
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit94).click();
		Thread.sleep(3000);

		// PLAN_OT actions
		driver.findElement(PLAN_OT).click();
		Thread.sleep(3000);

		// Select record
		driver.findElement(record2).click();
		Thread.sleep(3000);

		// Send input for specialty
		driver.findElement(SpecialitySendkys).sendKeys("General Medicine");
		Thread.sleep(3000);

		// Select General Medicine option
		driver.findElement(GnerlaMedicine).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[3]/p-autocomplete/span/button")).click();

		// Click on the button to add another specialty
		driver.findElement(DATOMRSURAZISSSYED).click();
		Thread.sleep(3000);

		// Select assistant input
		driver.findElement(Assistant).click();
		Thread.sleep(3000);

		// Choose DATO DR PHIL from the options
		driver.findElement(DATODRPHIL).click();
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit95).click();
		Thread.sleep(3000);
	
		// PLAN_OO actions
		driver.findElement(PLAN_OO).click();
		Thread.sleep(3000);

		// Select Physiotherapy option
		driver.findElement(Physiotherapy).click();
		Thread.sleep(3000);

		// Select checkbox for the first record
		driver.findElement(cehcbox001).click();
		Thread.sleep(3000);

		// Send quantity input
		driver.findElement(Quantitysendkeys).clear();
		Thread.sleep(3000);

		// Send quantity input
		driver.findElement(Quantitysendkeys).sendKeys("2");
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit96).click();
		Thread.sleep(3000);

		// PLAN_RC actions
		driver.findElement(PLAN_RC).click();
		Thread.sleep(3000);

		// Click to select specialization
		driver.findElement(Specialization).click();
		Thread.sleep(3000);

		// Select Primary Care Medicine option
		driver.findElement(PrimaryCareMedicine).click();
		Thread.sleep(3000);

		// Click to select referral reason
		driver.findElement(ReferralReason).click();
		Thread.sleep(3000);

		// Select For specialized treatment option
		driver.findElement(Forspecializedtreatment).click();
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit97).click();
		Thread.sleep(3000);

		// PLAN_HMD actions
		driver.findElement(PLAN_HMD).click();
		Thread.sleep(3000);

		// Select record checkbox
		driver.findElement(records).click();
		Thread.sleep(3000);

		// Click Frequency button
		driver.findElement(Frequency_3).click();
		Thread.sleep(3000);

		// Select every morning option
		driver.findElement(everymorning).click();
		Thread.sleep(3000);

		// Send duration input
		driver.findElement(Duration3Sendky).sendKeys("7");
		Thread.sleep(3000);

		// Select dropdown option
		driver.findElement(select7).click();
		Thread.sleep(3000);

		// Select days option
		driver.findElement(dayoptttt).click();
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit99).click();
		Thread.sleep(3000);
/*
		// DIET_ORDER actions
		driver.findElement(DIET_ORDER).click();
		Thread.sleep(3000);

		// Select record checkbox
		driver.findElement(recordss).click();
		Thread.sleep(3000);

		// Click Applicable Schedule button
		driver.findElement(ApplicableSchedule).click();
		Thread.sleep(3000);

		// Select Breakfast option
		driver.findElement(ApplicableScheduleopt).click();
		Thread.sleep(3000);

		// Click Menu Item button
		driver.findElement(MenuItem).click();
		Thread.sleep(3000);

		// Select Chapatti option
		driver.findElement(Chapatti).click();
		Thread.sleep(3000);

		// Click Dietician button
		driver.findElement(Dietician).click();
		Thread.sleep(3000);

		// Select DIANA S D SELLAPAN option
		driver.findElement(DIANASDSELLAPAN).click();
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit901).click();
		Thread.sleep(3000);

		// TRANS_ORD actions
		driver.findElement(TRANS_ORD).click();
		Thread.sleep(3000);

		// Click Transfer Type dropdown
		driver.findElement(TransferType).click();
		Thread.sleep(3000);

		// Select Ward Transfer option
		driver.findElement(TransferTypeopt).click();
		Thread.sleep(3000);

		// Save and exit
		driver.findElement(kSaveExit902).click();
		Thread.sleep(3000);
*/




	}
}
