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

public class Op_Consult_page  {

	WebDriver driver=null;

	//----Main Menu---//

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ConsultQMODULE=By.cssSelector("img[src='../../../assets/images/master-icons/OPConsult.png']");
	By ConsultQ=By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li[1]/ul/li[1]/a/img");


	//----Serach Name_MPI and add the primary and secodary survey---//
	By Name_MPI=By.id("patientname");
	By Search=By.id("Search");
	By Continue = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-consult-q/div/div/div[2]/p-table/div/div[2]/table/tbody/tr/td[1]/div/button");
	By PrimarySurvey = By.cssSelector("a[aria-label='Primary Survey']");


	// History (Subjective)
	By Allergies = By.id("HIST_ALLERGY");

	By AddPatinetAllergies = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[1]/div/div[4]/p-table/div/div/table/tbody/tr[1]/td[3]");
	By kSelectReaction = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/div/div[1]/div[1]/p-multiselect/div/div[2]/div");
	By kSelectReactionopt = By.xpath("/html/body/div[4]/div/div/div[2]/ul/p-multiselectitem[1]/li");
	By Severity = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/div/div[1]/div[2]/p-dropdown/div/span");
	By Severityopt = By.xpath("//span[contains(text(),'Mild')]");
	By kSaveExit = By.id("SaveExit");



	By Patient_Complaints = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[2]/div/div/div/div/div/button/span[1]");
	By AddPatientcomplaint = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-patient-complaints/div[2]/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/div/div[1]/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By kSaveExit1 = By.id("SaveExit");


	By HPI = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[3]/div/div/div/div/div/button/span[1]");
	By Addhip = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div[2]/p-editor/div/div[2]/div[1]");
	By kSaveExit2 = By.id("SaveExit");


	By Past_Medical_History = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[4]/div/div/div/div/div/button/span[1]");
	By AddPast_Medical_History = By.xpath("//p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[1]/div[2]/p-editor/div/div[2]/div[1]");
	By kSaveExit3 = By.id("SaveExit");



	By Past_Diagnosis = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[5]/div/div/div/div/div/button/span[1]");
	By CheckPast_Diagnosis = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-past-diagnosis/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/div/div[1]/form/div[4]/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By kSaveExit4 = By.id("SaveExit");

	By Past_Multiaxial_Diagnosis = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[6]/div/div/div/div/div/button/span[1]");
	By checkkPast_Multiaxial_Diagnosis = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-current-multiaxial-diagnosis/div/div/div/div[2]/app-axis-i/form/p-scrollpanel/div/div[1]/div/div/div[1]/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By kSaveExit5 = By.id("SaveExit");

	By Past_Procedures = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[7]/div/div/div/div/div/button/span[1]");
	By seelctkPast_Procedures = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div[4]/p-table/div/div/table/tbody/tr[1]/td[2]");
	By Specilaity= By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div[1]/div[2]/p-autocomplete/span/input");
	By Specilaityopt = By.xpath("//span[contains(text(),'General Medicine')]");
	By MainSurgeon= By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div[1]/div[3]/p-autocomplete/span/input");
	By MainSurgeonopt = By.xpath("//span[contains(text(),'DATO DR PHIL')]");
	By HeighRisk = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div[4]/div[1]/div/p-checkbox/div/div[2]");
	By HighRskCaseComment = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div[4]/div[2]/input");
	By kSaveExit6 = By.id("SaveExit");


	By Past_Refraction = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[8]/div/div/div/div/div/button/span[1]");
	By Past_Refractionsend = By.cssSelector("input[id='distantrighteyesph']");
	By kSaveExit7 = By.id("SaveExit");



	By Birth_Details =   By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[9]/div/div/div/div/div/button/span[1]");
	By PlaceOfBirth = By.cssSelector("input[formcontrolname='birthPlace']");
	By kSaveExit8 = By.id("SaveExit");



	By Oncology_History = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[13]/div/div/div/div/div/button");
	By Oncology_Historysend = By.xpath("//p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[1]/div[2]/p-editor/div/div[2]/div[1]");
	By kSaveExit9 = By.id("SaveExit");


	By Family_History = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[14]/div/div/div/div/div/button");
	By Relationship = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/p-card/div/div/div/div[2]/div[1]/p-autocomplete/span/button");
	By sRelationshipopt = By.xpath("//span[contains(text(),'Maternal Aunt')]");
	By Condition = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/p-card/div/div/div/div[2]/div[3]/p-editor/div/div[2]/div[1]");
	By kSaveExit10 = By.id("SaveExit");

	By Lifestyle_History = By.xpath("//app-case-sheet/div[2]/div/div[1]/app-soap-comp-header/div[15]/div/div/div/div/div/button");
	By ConsumptionStatus = By.xpath("//app-lifestyle-history/div/div/div/div[2]/app-tobacco/div[2]/app-smoking/form/div[1]/div[1]/p-dropdown/div/span");
	By ConsumptionStatusopt = By.xpath("//span[contains(text(),'Chain Smoker')]");
	By save = By.xpath("//span[contains(text(),'Save')]");
	By Close = By.xpath("//app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[2]/button[2]/span");

	// Examination (Objective)
	By Patient_Triage = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[1]/div/div/div/div/div/button");
	By Patient_Triagecheck = By.xpath("//app-patient-triage/p-scrollpanel/div/div[1]/div/div/div/div[1]/div[2]/p-checkbox/div/div[2]");
	By AlertDescriptionsend = By.cssSelector("input[id='AlertDescription']");
	By highalertSave = By.cssSelector("app-lt-post-button[id='highalertSave']");
	By Close1 = By.xpath("//app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[2]/button[2]");


	By Vitals = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[2]/div/div/div/div/div/button");
	By Heightsend = By.cssSelector("input[id='heightVal']");
	By kSaveExit11 = By.id("SaveExit");

	//By GrowthChart = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[3]/div/div/div/div/div/button");

	By Examination_Notes = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[4]/div/div/div/div/div/button");
	By Examination_Notessedn = By.xpath("//p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[1]/div[2]/p-editor/div/div[2]/div[1]");
	By kSaveExit12 = By.id("SaveExit");


	By Clinical_Findings = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[5]/div/div/div/div/div/button");
	By Clinical_Findingsopt = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div/div[3]/p-table/div/div/table/tbody/tr[1]/td[3]");
	By ClinicalCourse = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-clinical-findings/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[1]/div[1]/p-dropdown/div/span");
	By Chronic = By.xpath("//span[contains(text(),'Chronic')]");
	By episodicityBy= By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-clinical-findings/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[1]/div[2]/p-dropdown/div/span");
	By NewEpisod = By.xpath("//span[contains(text(),'New Episod')]");
	By Severity1 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-clinical-findings/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[1]/div[3]/p-dropdown/div/span");
	By Mild = By.xpath("//span[contains(text(),'Mild')]");
	By kSaveExit13 = By.id("SaveExit");


	//By Assessment = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[10]/div/div/div/div/div/button");
	By DentalChart = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[11]/div/div/div/div/div/button");
	By Update_Exit = By.xpath("//span[contains(text(),'Update & Exit')]");



	By HardTissueEvaluation = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[12]/div/div/div/div/div/button");
	By kSaveExit14 = By.id("SaveExit");

	//By PeriodontalChart = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[13]/div/div/div/div/div/button");
	By Refraction = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[14]/div/div/div/div/div/button");
	By Update_Exit1 = By.xpath("//span[contains(text(),'Update & Exit')]");


	//By Image_Drawing = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[15]/div/div/div/div/div/button");
	//By NursingNotes = By.xpath("//app-case-sheet/div[2]/div/div[2]/app-soap-comp-header/div[16]/div/div/div/div/div/button");

	// Diagnosis (Assessment)	
	By CurrentDiagnosis = By.xpath("//app-case-sheet/div[2]/div/div[3]/app-soap-comp-header/div[1]/div/div/div/div/div/button");
	By CurrentDiagnosischk = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[1]/form/div/div[4]/p-table/div/div/table/tbody/tr[1]/td[4]");
	By kSaveExit15 = By.id("SaveExit");




	//By ActiveDiagnosis = By.xpath("//app-case-sheet/div[2]/div/div[3]/app-soap-comp-header/div[2]/div/div/div/div/div/button");
	By CurrentMultiaxialDiagnosis = By.xpath("//app-case-sheet/div[2]/div/div[3]/app-soap-comp-header/div[3]/div/div/div/div/div/button");
	By CurrentMultiaxialDiagnosisopt = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[1]/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By kSaveExit16 = By.id("SaveExit");



	//	By ActiveMultiaxialDiagnosis = By.xpath("//app-case-sheet/div[2]/div/div[3]/app-soap-comp-header/div[4]/div/div/div/div/div/button");


	// Orders (Plan)

	By TreatmentPlanNote = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[1]/div/div/div/div/div/button");
	By TreatmentPlanNotesend = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div[2]/p-editor/div/div[2]/div[1]");	








	By HomeActiveMedications= By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[2]/div/div/div/div/div/button");
	By HomeActiveMedicationscheck = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div/div[4]/p-table/div/div/table/tbody/tr/td[3]");
	By dosesend = By.id("input[id='dose']");
	By Select = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[2]/div[1]/div/p-autocomplete/span/button/chevrondownicon");
	By injection = By.xpath("//span[contains(text(),'injection')]");
	By Route = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[2]/div[2]/p-dropdown/div/span");
	By Intravenous = By.xpath("//span[contains(text(),'Intravenous')]");
	By Frequency = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[2]/div[3]/p-autocomplete/span/button");
	By everymorning = By.xpath("//span[contains(text(),'every morning')]");
	By Durationsend = By.cssSelector("input[id='duration']");
	By Durationselct = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div/p-dropdown/div/div[2]");
	By Days = By.xpath("//span[contains(text(),'Days')]");
	By kSaveExit17 = By.id("SaveExit");



	By LabOrders =By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[5]/div/div/div/div/div/button");
	By checknx = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[3]");
	By Frequency1 = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div/div[1]/p-autocomplete/span/button/chevrondownicon");
	By Frequencyeverymorning1 = By.xpath("//span[contains(text(),'every morning')]");
	By dURATION1send = By.cssSelector("input[id='durationNum']");
	By select = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div/div[2]/div/p-dropdown/div/div[2]");
	By Days1 = By.xpath("//span[contains(text(),'Days')]");
	By kSaveExit18 = By.id("SaveExit");


	By NursingOrders = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[6]/div/div/div/div/div/button");
	By checkbx = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[3]");
	By fre = By.xpath("//p-tabpanel[1]/div/div/div[2]/div/form/div[1]/div[1]/div/p-autocomplete/span/button/chevrondownicon");
	By Frequencyeverymorning2 = By.xpath("//span[contains(text(),'every morning')]");
	By dURATION2send = By.cssSelector("input[id='durationNum']");
	By select2 = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/div/div[2]/div/form/div[1]/div[2]/div/p-dropdown/div/div[2]");
	By Days2 = By.xpath("//span[contains(text(),'Days')]");
	By kSaveExit19 = By.id("SaveExit");

	By RadiologyOrders = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[7]/div/div/div/div/div/button");
	By mcjehclk = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/div/div[2]");
	By Frequency3 = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div/div[1]/div/p-autocomplete/span/button");
	By Frequencyeverymorning3 = By.xpath("//span[contains(text(),'every morning')]");
	By dURATION2send3 = By.cssSelector("input[id='durationNum']");
	By select3 = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div/div[2]/div/p-dropdown/div/span");
	By Days3 = By.xpath("//span[contains(text(),'Days')]");
	By xclinicalComment = By.cssSelector("textarea[id='clinicalComment']");
	By kSaveExit20 = By.id("SaveExit");


	By NonOTProcedureOrders = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[8]/div/div/div/div/div/button");
	By checkbxa = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[1]/div/div/p-table/div/div/table/tbody/tr[1]/td[3]");
	By Frequencyeverymorning4 = By.xpath("//span[contains(text(),'every morning')]");
	By Duration4 = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div[4]/div/input");
	By select4 = By.xpath("//p-scrollpanel/div/div[1]/div/form/div/div[2]/div/div/div[4]/div/p-dropdown/div/span");
	By Days4 = By.xpath("//span[contains(text(),'Days')]");
	By kSaveExit21 = By.id("SaveExit");


	By OTProcedureOrders = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[9]/div/div/div/div/div/button");
	By checjkjk = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/p-table/div/div/table/tbody/tr[1]/td[2]");
	By Speciality5 = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[2]/p-autocomplete/span/button");	
	By PrimaryCareMedicine = By.xpath("//span[contains(text(),'General Medicine')]");
	By Suregon = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[3]/p-autocomplete/span/button");
	By DATOMRSURAZISYED = By.xpath("//span[contains(text(),'DATO MR SURAZI S S SYED')]");
	By Assistantsend = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[2]/div[1]/p-autocomplete/span/input");
	By DATOMRSURAZISYED5 = By.xpath("//span[contains(text(),'DATO DR PHIL')]");
	By HighRiskCase = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[5]/p-checkbox/div/div[2]");
	By HighRiskCase1send = By.cssSelector("input[id='inpTex']");
	By kSaveExit22 = By.id("SaveExit");

	By OtherOrders = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[10]/div/div/div/div/div/button");
	By Admit = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[11]/div/div/div/div/div/button");
	By ReferralConsultation = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[12]/div/div/div/div/div/button");
	By Immunization = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[13]/div/div/div/div/div/button");
	By SickLeave = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[14]/div/div/div/div/div/button");
	By RefractionOrder = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[15]/div/div/div/div/div/button");
	By Haemodialysis = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[16]/div/div/div/div/div/button");
	By DietOrder = By.xpath("//app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[17]/div/div/div/div/div/button");



	//By k= By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[3]/div/div[1]/div[1]/small");





	By Consultan = By.xpath("//span/app-op-banner/div/div/div/div/div[4]/div/div[2]/div/div[1]/button/span[1]");
	By arrow = By.xpath("/html/body/div[4]/div/div/div[1]/p-dropdown/div/span");
	By Blood = By.xpath("//span[contains(text(),'Blood Grouping')]");
	By savw = By.xpath("/html/body/div[4]/div/div/div[2]/button/span[2]");

	By MarkToBill = By.xpath("//span[contains(text(),'Mark To bill ')]");
	By Continuee = By.xpath("/html/body/div[4]/div/div[4]/div/div[2]/app-lt-post-button/button/span[2]");


	By StartConsultv = By.xpath("//span[contains(text(),'Start-Consult')]");
	By Start = By.xpath("//span[contains(text(),'Start')]");



	public Op_Consult_page (WebDriver driver)

	{
		this.driver=driver;

	}


	public void krs() throws InterruptedException, IOException, AWTException 

	{

		Thread.sleep(14000);

		//----Main Menu---//

		driver.findElement(mainmenu).click();
		Thread.sleep(12000);
		driver.findElement(ConsultQMODULE).click();
		Thread.sleep(10000);
		
		
		// Handling a new window/tab if opened
		String mainWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // Switch back to the original tab
		Thread.sleep(14000);
		
		driver.findElement(ConsultQ).click();
		Thread.sleep(10000);
		Thread.sleep(5000);

		Robot robot = new Robot(); for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); }

		Thread.sleep(4000);
		
		
		driver.navigate().refresh();

		Thread.sleep(25000);

		//----Serach Name_MPI and add the primary and secodary survey---//

		driver.findElement(Name_MPI).sendKeys("PPPSON");
		Thread.sleep(3000);
		driver.findElement(Search).click();
		Thread.sleep(3000);
		driver.findElement(StartConsultv).click();
		Thread.sleep(8000);
		driver.findElement(Start).click();
		Thread.sleep(8000);
		driver.findElement(Continue).click();
		Thread.sleep(3000);
		//driver.findElement(PrimarySurvey).click();
		Thread.sleep(14000);
		
		// History (Subjective)

		driver.findElement(Allergies).click();
		Thread.sleep(3000);
		driver.findElement(AddPatinetAllergies).click();
		Thread.sleep(3000);
		driver.findElement(kSelectReaction).click();
		Thread.sleep(3000);
		driver.findElement(kSelectReactionopt).click();
		Thread.sleep(3000);
		driver.findElement(Severity).click();
		Thread.sleep(3000);
		driver.findElement(Severityopt).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit).click();
		Thread.sleep(3000);
		driver.findElement(Patient_Complaints).click();
		Thread.sleep(3000);
		driver.findElement(AddPatientcomplaint).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit1).click();
		Thread.sleep(3000);
		// HPI Section
		driver.findElement(HPI).click();
		Thread.sleep(3000);
		driver.findElement(Addhip).sendKeys("Add HPI details");
		Thread.sleep(3000);
		driver.findElement(kSaveExit2).click();
		Thread.sleep(3000);
		// Past Medical History Section
		driver.findElement(Past_Medical_History).click();
		Thread.sleep(3000);
		driver.findElement(AddPast_Medical_History).sendKeys("Add Past Medical History");
		Thread.sleep(3000);
		driver.findElement(kSaveExit3).click();
		Thread.sleep(3000);

		// Past Diagnosis Section
		driver.findElement(Past_Diagnosis).click();
		Thread.sleep(3000);
		driver.findElement(CheckPast_Diagnosis).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit4).click();
		Thread.sleep(3000);

		// Past Multiaxial Diagnosis Section
		driver.findElement(Past_Multiaxial_Diagnosis).click();
		Thread.sleep(3000);
		driver.findElement(checkkPast_Multiaxial_Diagnosis).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit5).click();
		Thread.sleep(3000);

		// Past Procedures Section
		driver.findElement(Past_Procedures).click();
		Thread.sleep(3000);
		driver.findElement(seelctkPast_Procedures).click();
		Thread.sleep(3000);
		driver.findElement(Specilaity).sendKeys("General Medicine");
		Thread.sleep(3000);
		driver.findElement(Specilaityopt).click();
		Thread.sleep(3000);
		driver.findElement(MainSurgeon).sendKeys("DATO DR PHIL");
		Thread.sleep(3000);
		driver.findElement(MainSurgeonopt).click();
		Thread.sleep(3000);
		driver.findElement(HeighRisk).click();
		Thread.sleep(3000);
		driver.findElement(HighRskCaseComment).sendKeys("High Risk Comments");
		Thread.sleep(3000);
		driver.findElement(kSaveExit6).click();
		Thread.sleep(3000);

		// Past Refraction Section
		driver.findElement(Past_Refraction).click();
		Thread.sleep(3000);
		driver.findElement(Past_Refractionsend).sendKeys("Refraction details");
		Thread.sleep(3000);
		driver.findElement(kSaveExit7).click();
		Thread.sleep(3000);

		// Birth Details Section
		driver.findElement(Birth_Details).click();
		Thread.sleep(3000);
		driver.findElement(PlaceOfBirth).sendKeys("Place of Birth");
		Thread.sleep(3000);
		driver.findElement(kSaveExit8).click();
		Thread.sleep(3000);

		// Oncology History Section
		driver.findElement(Oncology_History).click();
		Thread.sleep(3000);
		driver.findElement(Oncology_Historysend).sendKeys("Oncology History");
		Thread.sleep(3000);
		driver.findElement(kSaveExit9).click();
		Thread.sleep(3000);

		// Family History Section
		driver.findElement(Family_History).click();
		Thread.sleep(3000);
		driver.findElement(Relationship).click();
		Thread.sleep(3000);
		driver.findElement(sRelationshipopt).click();
		Thread.sleep(3000);
		driver.findElement(Condition).sendKeys("Family Condition");
		Thread.sleep(3000);
		driver.findElement(kSaveExit10).click();
		Thread.sleep(3000);

		// Lifestyle History Section
		driver.findElement(Lifestyle_History).click();
		Thread.sleep(3000);
		driver.findElement(ConsumptionStatus).click();
		Thread.sleep(3000);
		driver.findElement(ConsumptionStatusopt).click();
		Thread.sleep(3000);
		driver.findElement(save).click();
		Thread.sleep(3000);
		driver.findElement(Close).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(5000);

		Robot robot1 = new Robot(); for (int i = 0; i < 5; i++) {
			robot1.keyPress(KeyEvent.VK_CONTROL); robot1.keyPress(KeyEvent.VK_SUBTRACT);
			robot1.keyRelease(KeyEvent.VK_SUBTRACT);
			robot1.keyRelease(KeyEvent.VK_CONTROL); }

		Thread.sleep(4000);


		// Examination (Objective) Section
		driver.findElement(Patient_Triage).click();
		Thread.sleep(5000);
		//driver.findElement(Patient_Triagecheck).click();
		Thread.sleep(4000);
		driver.findElement(AlertDescriptionsend).sendKeys("High alert description");
		Thread.sleep(3000);
		driver.findElement(highalertSave).click();
		Thread.sleep(3000);
		driver.findElement(Close1).click();
		Thread.sleep(3000);

		// Vitals Section
		driver.findElement(Vitals).click();
		Thread.sleep(3000);
		driver.findElement(Heightsend).sendKeys("180");
		Thread.sleep(3000);
		driver.findElement(kSaveExit11).click();
		Thread.sleep(3000);
		
		// Examination Notes Section
		driver.findElement(Examination_Notes).click();
		Thread.sleep(3000);
		driver.findElement(Examination_Notessedn).sendKeys("Examination notes details");
		Thread.sleep(3000);
		driver.findElement(kSaveExit12).click();
		Thread.sleep(3000);

		// Clinical Findings Section
		driver.findElement(Clinical_Findings).click();
		Thread.sleep(3000);
		driver.findElement(Clinical_Findingsopt).click();
		Thread.sleep(3000);
		driver.findElement(ClinicalCourse).click();
		Thread.sleep(3000);
		driver.findElement(Chronic).click();
		Thread.sleep(3000);
		driver.findElement(episodicityBy).click();
		Thread.sleep(3000);
		driver.findElement(NewEpisod).click();
		Thread.sleep(3000);
		driver.findElement(Severity1).click();
		Thread.sleep(3000);
		driver.findElement(Mild).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit13).click();
		Thread.sleep(3000);

		// Dental Chart Section
		driver.findElement(DentalChart).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit14).click();
		Thread.sleep(3000);

		// Hard Tissue Evaluation Section
		driver.findElement(HardTissueEvaluation).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit14).click();
		Thread.sleep(3000);

		// Refraction Section
		driver.findElement(Refraction).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[formcontrolname='distantrighteyesph']")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(kSaveExit14).click();
		Thread.sleep(3000);

		// Current Diagnosis Section
		driver.findElement(CurrentDiagnosis).click();
		Thread.sleep(3000);
		driver.findElement(CurrentDiagnosischk).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit15).click();
		Thread.sleep(3000);

		// Current Multiaxial Diagnosis Section
		driver.findElement(CurrentMultiaxialDiagnosis).click();
		Thread.sleep(3000);
		driver.findElement(CurrentMultiaxialDiagnosisopt).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit16).click();
		Thread.sleep(3000);

		// Treatment Plan Note Section
		driver.findElement(TreatmentPlanNote).click();
		Thread.sleep(3000);
		driver.findElement(TreatmentPlanNotesend).sendKeys("Your Treatment Plan Notes here");
		Thread.sleep(3000);

		// Home Active Medications Section
		driver.findElement(HomeActiveMedications).click();
		Thread.sleep(3000);
		driver.findElement(HomeActiveMedicationscheck).click();
		Thread.sleep(3000);
		driver.findElement(dosesend).sendKeys("5 mg");
		Thread.sleep(3000);
		driver.findElement(Select).click();
		Thread.sleep(3000);
		driver.findElement(injection).click();
		Thread.sleep(3000);
		driver.findElement(Route).click();
		Thread.sleep(3000);
		driver.findElement(Intravenous).click();
		Thread.sleep(3000);
		driver.findElement(Frequency).click();
		Thread.sleep(3000);
		driver.findElement(everymorning).click();
		Thread.sleep(3000);
		driver.findElement(Durationsend).sendKeys("7");
		Thread.sleep(3000);
		driver.findElement(Durationselct).click();
		Thread.sleep(3000);
		driver.findElement(Days).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit17).click();
		Thread.sleep(3000);

		// Lab Orders Section
		driver.findElement(LabOrders).click();
		Thread.sleep(3000);
		driver.findElement(checknx).click();
		Thread.sleep(3000);
		driver.findElement(Frequency1).click();
		Thread.sleep(3000);
		driver.findElement(Frequencyeverymorning1).click();
		Thread.sleep(3000);
		driver.findElement(dURATION1send).sendKeys("7");
		Thread.sleep(3000);
		driver.findElement(select).click();
		Thread.sleep(3000);
		driver.findElement(Days1).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit18).click();
		Thread.sleep(3000);

		// Nursing Orders Section
		driver.findElement(NursingOrders).click();
		Thread.sleep(3000);
		driver.findElement(checkbx).click();
		Thread.sleep(3000);
		driver.findElement(fre).click();
		Thread.sleep(3000);
		driver.findElement(Frequencyeverymorning2).click();
		Thread.sleep(3000);
		driver.findElement(dURATION2send).sendKeys("7");
		Thread.sleep(3000);
		driver.findElement(select2).click();
		Thread.sleep(3000);
		driver.findElement(Days2).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit19).click();
		Thread.sleep(3000);

		// Radiology Orders Section
		driver.findElement(RadiologyOrders).click();
		Thread.sleep(3000);
		driver.findElement(mcjehclk).click();
		Thread.sleep(3000);
		driver.findElement(Frequency3).click();
		Thread.sleep(3000);
		driver.findElement(Frequencyeverymorning3).click();
		Thread.sleep(3000);
		driver.findElement(dURATION2send3).sendKeys("7");
		Thread.sleep(3000);
		driver.findElement(select3).click();
		Thread.sleep(3000);
		driver.findElement(Days3).click();
		Thread.sleep(3000);
		driver.findElement(xclinicalComment).sendKeys("Clinical Comment");
		Thread.sleep(3000);
		driver.findElement(kSaveExit20).click();
		Thread.sleep(3000);

		// Non OT Procedure Orders Section
		driver.findElement(NonOTProcedureOrders).click();
		Thread.sleep(3000);
		driver.findElement(checkbxa).click();
		Thread.sleep(3000);
		driver.findElement(Frequencyeverymorning4).click();
		Thread.sleep(3000);
		driver.findElement(Duration4).sendKeys("7");
		Thread.sleep(3000);
		driver.findElement(select4).click();
		Thread.sleep(3000);
		driver.findElement(Days4).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit21).click();
		Thread.sleep(3000);

		// OT Procedure Orders Section
		driver.findElement(OTProcedureOrders).click();
		Thread.sleep(3000);
		driver.findElement(checjkjk).click();
		Thread.sleep(3000);
		driver.findElement(Speciality5).click();
		Thread.sleep(3000);
		driver.findElement(PrimaryCareMedicine).click();
		Thread.sleep(3000);
		driver.findElement(Suregon).click();
		Thread.sleep(3000);
		driver.findElement(DATOMRSURAZISYED).click();
		Thread.sleep(3000);
		driver.findElement(Assistantsend).sendKeys("Assistant Name");
		Thread.sleep(3000);
		driver.findElement(DATOMRSURAZISYED5).click();
		Thread.sleep(3000);
		driver.findElement(HighRiskCase).click();
		Thread.sleep(3000);
		driver.findElement(HighRiskCase1send).sendKeys("High Risk Reason");
		Thread.sleep(3000);
		driver.findElement(kSaveExit22).click();
		Thread.sleep(3000);
		
		
		// Consultan Section
		driver.findElement(Consultan).click();
		Thread.sleep(3000);
		driver.findElement(arrow).click();
		Thread.sleep(3000);
		driver.findElement(Blood).click();
		Thread.sleep(3000);
		driver.findElement(savw).click();

		// Mark to Bill Section
		driver.findElement(MarkToBill).click();
		Thread.sleep(3000);
		driver.findElement(Continuee).click();






	}
}
