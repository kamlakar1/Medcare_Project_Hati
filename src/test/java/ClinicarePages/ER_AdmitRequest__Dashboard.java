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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByCssSelector;
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

public class ER_AdmitRequest__Dashboard  {

	WebDriver driver=null;

	//----Main Menu---//

	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By Menulk = By.cssSelector("img[src='assets/demo/images/icons/grid.png']");
	By ER=By.cssSelector("img[src='../../../assets/images/master-icons/ER.png']");
	By SecondarySurvey=By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/ERASSEQ.png']");
	By ES = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/ERES.png']");
	//By Anesthesia = By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[4]/p-scrollpanel/div/div[1]/div/div[2]/div[8]/div");

	//----Serach Name_MPI and add the primary and secodary survey---//
	By Name_MPI=By.cssSelector("input[id='Name/MPI']");
	By mpi = By.cssSelector("input[formcontrolname='mpi']");
	By Search=By.id("Search");
	By Continue = By.xpath("//span[contains(text(),'Continue')]");
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


	By OTProcedureOrders = By.xpath("//app-patient-casesheet/div/div[2]/div/app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[8]/div/div/div/div/div/button");
	By checjkjk = By.xpath("//p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/p-table/div/div/table/tbody/tr[1]/td[2]");
	By Speciality5 = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[2]/p-autocomplete/span/button");	
	By PrimaryCareMedicine = By.xpath("//span[contains(text(),'General Medicine')]");
	By Suregon = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[1]/div[3]/p-autocomplete/span/button");
	By DATOMRSURAZISYED = By.xpath("//span[contains(text(),'DATO MR SURAZI S S SYED')]");
	By Assistantsend = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[2]/div[1]/p-autocomplete/span/input");
	By DATOMRSURAZISYED5 = By.xpath("//span[contains(text(),'DATO DR PHIL')]");
	By HighRiskCase = By.xpath("//p-tabpanel[1]/div/form/div/div[2]/div/div[5]/p-checkbox/div/div[2]");
	By HighRiskCase1send = By.cssSelector("input[id='inpTex']");
	By PAC = By.xpath("//app-ot-orders/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[2]/div/div[6]/p-checkbox[2]/div/div[2]");
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

	By OrderBasket = By.xpath("//span[contains(text(),'Order Basket')]");
	By SubmitOrder = By.xpath("/html/body/div[4]/div/div[3]/apflex-order-basket/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[2]/div/div/div/div/button[2]");



	// kar
	By SeconadySuervy = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[3]");
	By Selectrecord = By.xpath("//app-anesthesia-mgmt-queue/div/div/form[1]/div[7]/p-table/div/div/table/tbody/tr/td[1]/div/p-button");
	By PatientStatus = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-anesthesia-mgmt-queue/div/div/form[2]/div/div/div[1]/p-dropdown/div/span");
	By ArrivedAtOT = By.xpath("//span[contains(text(),'Moved To OT')]");
	By Save2 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-anesthesia-mgmt-queue/div/div/form[2]/div/div/div[4]/app-lt-post-button/button");



	By Anesthesia = By.xpath("/html/body/app-root/app-main/div/app-topbar/div/div[2]/div[2]/ul/li[4]/p-scrollpanel/div/div[1]/div/div[2]/div[8]/div");
	By ProcedureSearch = By.cssSelector("input[formcontrolname='procedureSearch']");
	By TransurethralresectionofProstate = By.xpath("//app-pac-schedule/div/div/div[1]/form/div/div[2]/div[1]/p-table/div/div/table/tbody/tr/td[2]");
	By Speciality = By.xpath("//app-pac-schedule/div/div/div[1]/form/div/div[2]/div[2]/div[2]/p-autocomplete/span/input");
	By Specialityopt = By.xpath("//span[contains(text(),'DR RANI M R MUKERJI')]");
	By Save = By.cssSelector("app-lt-post-button[buttonlabel='Save']");
	By ChooseAnesthetist = By.xpath("//app-pac-schedule/div/div/div[2]/div/div[2]/form/div/div/div[1]/p-autocomplete/span/button");
	By DRRANIMRMUKERJI = By.xpath("//span[contains(text(),'DR RANI M R MUKERJI')]");
	By Date = By.cssSelector("td[style='background: rgb(179, 201, 156);']");
	By CreateShecule = By.xpath("//span[contains(text(),'Create Schedule')]");


	// Pac

	By PACc = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/PAC.png']");
	By continue_9 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-anesthesia-mgmt-queue/div/div/form[1]/div[7]/p-table/div/div/table/tbody/tr[1]/td[1]/div/p-button/button/span[1]");
	By selctreco = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[1]/form/div[4]/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	By Unitsendkeys = By.cssSelector("input[formcontrolname='Unit']");
	By AdverseReactionsendkeys = By.cssSelector("textarea[formcontrolname='Adverse']");
	By Componentsendkeys = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/form[1]/div[2]/div[1]/div[2]/p-autocomplete/span/button");
	By Cryoprecipitateopt = By.xpath("//span[contains(text(),'Cryoprecipitate')]");
	By save1 = By.xpath("//p-scrollpanel/div/div[1]/div/div/div[2]/form[1]/div[2]/div[3]/div/div[2]/button");
	By Orderbasket = By.xpath("//app-anesthesia-banner-component/div/div/div/div[4]/div[2]/div/p-button/button/span[1]");
	By Submitorder = By.xpath("/html/body/div[4]/div/div[2]/apflex-order-basket/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div[1]/div[2]/div/div/div/div/button[2]");


	// k
	By AnesthesiaRecord = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/ANESMANGRECRD.png']");
	By Continue_7 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-anesthesia-mgmt-queue/div/div/form[1]/div[7]/p-table/div/div/table/tbody/tr[1]/td[1]/div/p-button/button/span[1]");
	By Role = By.xpath("//app-post-op-procedure-details/div[1]/div[1]/p-panel[2]/div/div[2]/div/form/div[1]/div[1]/p-dropdown/div/span");
	By Physician = By.xpath("//span[contains(text(),'Physician')]");
	By user= By.xpath("//app-post-op-procedure-details/div[1]/div[1]/p-panel[2]/div/div[2]/div/form/div[1]/div[2]/p-dropdown/div/span");
	By DRRANIMRMUKERJI_1 = By.xpath("//span[contains(text(),'DR RANI M R MUKERJI')]");
	By PAC_Completed = By.xpath("//span[contains(text(),'PAC Complete')]");	
	By selectone = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-anesthesia-mgmt-queue/div/div/form[1]/div[7]/p-table/div/div/table/tbody/tr[1]/td[1]/div/p-button");

	//
	By PLAN_ADMIT = By.cssSelector("button[id='PLAN_ADMIT']");
	By StandingOrders = By.id("StandingOrders");
	By AdmitNote  = By.id("AdmitNote");
	By physicianInstruction = By.cssSelector("textarea[formcontrolname='physicianInstruction']");

	By AdmissionType = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[1]/p-dropdown/div/div[2]");
	By AdmissionTypeopt = By.xpath("//span[contains(text(),'Elective')]");
	By ReasonforAdmission = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[2]/p-dropdown/div/div[2]");
	By ReasonforAdmissionopt = By.xpath("//span[contains(text(),'Treatment & Case Management')]");
	By AdmittingFacility = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[3]/p-dropdown/div/div[2]");
	By AdmittingFacilityopt = By.xpath("//span[contains(text(),'HATI Intl Specialist Hospital, KL')]");
	By AdmittingDepartment = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[4]/p-dropdown/div/div[2]");
	By AdmittingDepartmentopt = By.xpath("//span[contains(text(),'General Medicine')]");
	By AdmittingPhysician = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/div[5]/div[1]/p-dropdown/div/div[2]");
	By AdmittingPhysicianopt = By.xpath("//span[contains(text(),'DATO DR PHIL   OSMAN  ')]");
	By AdmitToWard = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/div[5]/div[2]/p-dropdown/div/div[2]");
	By AdmitToWardopt = By.xpath("//span[contains(text(),'SW_SURGICAL WARD')]");
	By ExpectedLOS = By.cssSelector("input[id='firstName']");	

	By AdmissionCategory = By.xpath("//p-tabpanel[1]/div/form/div/div[1]/div/div/div[6]/div[1]/p-dropdown/div/div[2]");
	By AdmissionCategoryopt = By.xpath("//span[contains(text(),'IP')]");
	By kSaveExit282 = By.id("SaveExit");

	//login
	By tab1 = By.id("tab1");
	By tab2 = By.id("tab2");
	By tab3 = By.id("tab3");
	By tab4 = By.id("tab4");
	By tab5 = By.id("tab5");
	By tab6 = By.id("tab6");
	By tab7 = By.id("tab7");
	By tab8 = By.id("tab8");

	// ADT 
	By ADT = By.cssSelector("img[src='../../../assets/images/master-icons/adt.png']");
	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By Collapse = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	By clickonedit = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-incubation/div[3]/mat-table/mat-row/mat-cell[14]/mat-icon");
	By PatientNamesend = By.cssSelector("input[ng-reflect-name='name']");
	By Serach = By.xpath("/html/body/div[5]/div[2]/div/div/div/div/form/div[6]/div[2]/button[1]/span[1]/mat-icon");

	//============
	//----Main Menu---//


	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By MainMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By OPConsultant=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[2]/div[2]/div/img");
	By ConsultationQ=By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li[1]/ul/li[1]/a/span[1]");
	By PatientName=By.cssSelector("input[id='patientname']");
	By SearchPatient=By.cssSelector("button[id='Search']");


	By StartConsult=By.xpath("//*[@id='startconsult']");
	By AdmitOrder=By.id("PLAN_ADMIT");
	By StandinNotes=By.cssSelector("textarea[formcontrolname='StandingOrders']");

	By AdmitNotes=By.cssSelector("textarea[formcontrolname='AdmitNote']");

	By AdmissionTypeSelOpt=By.xpath("//span[contains(text(),'Elective')]");
	By ReasonForAdmission=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-admit-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[2]/p-dropdown");
	By ReasonForAdmissionSelOPt=By.xpath("//span[contains(text(),'Elective Surgery')]");

	//By AdmittingDepartment=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-admit-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/div[4]/div[4]/p-dropdown");
	By AdmittingDepartmentSelopt=By.xpath("//span[contains(text(),'General Medicine')]");

	//By AdmittingPhysician=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/p-dialog/div/div/div[3]/app-admit-order/div/div/div/p-tabview/div/div[2]/p-tabpanel[1]/div/form/div/div[1]/div/div/div[5]/div[1]/p-dropdown");
	By AdmittingPhysicianSelopt=By.xpath("//span[contains(text(),'PHIL')]");

	//By AdmittingFacility=By.xpath("//form/div/div[1]/div/div/div[4]/div[3]/p-dropdown/div/span");
	By AdmittingFacilitySelOpt=By.xpath("//span[contains(text(),'KL')]"); 

	//By AdmitToWard=By.xpath("//form/div/div[1]/div/div/div[5]/div[2]/p-dropdown/div/div[2]");
	By AdmitWardSelOpt=By.xpath("//span[contains(text(),'SW_SURGICAL WARD')]");

	By SaveAndExit=By.id("SaveExit");

	By Consultation=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[3]/div/div[1]/div[1]");
	By ConsultationDropDown=By.xpath("/html/body/div[4]/div/div/div[1]/p-dropdown");
	By ConsultationDropdownSelopt=By.xpath("//span[contains(text(),'1st. Consultation (Specialist)')]");
	By SaveConsulat=By.xpath("/html/body/div[4]/div/div/div[2]/button");

	By MarkToBill=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/span/app-op-banner/div/div/div/div/div[4]/div/div[2]/div/div[1]/button");
	By ContinueBill=By.cssSelector("app-lt-post-button[buttonlabel='Continue']");
	By ContinueBillyes=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/p-confirmdialog/div/div/div[3]/button[2]");

	By mainmenu1=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[4]/div/img");	
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionDashboard=By.xpath("//*[@id='568401']/img");

	//Advanced Search
	By AdvancedSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By MRNClick=By.cssSelector("input[ng-reflect-placeholder='Patient MRN']");
	//Search
	By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");

	By PatientNameMPI=By.cssSelector("input[placeholder='Name']");
	By SearchPatient1=By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-consult-q/div/div/div/div[1]/form/div/div[7]/div/div[2]/button");

	By SaveAdmission=By.cssSelector("mat-icon[ng-reflect-message='Save Admission']");
	By ReasonForAdmissionADT=By.cssSelector("mat-select[ng-reflect-name='reasonForAdmission']");
	By AllDropDown=By.cssSelector("mat-option[ng-reflect-value='[object Object]']");
	By Doctor=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By ADTWard=By.cssSelector("mat-select[ng-reflect-placeholder='Select Ward']");
	By ADTWardSelOPt=By.xpath("//span[contains(text(),'Ward W3-A')]"); 
	By Bed=By.cssSelector("mat-select[ng-reflect-name='bedNo']");
	By BedClick=By.xpath("/html/body/div[5]/div[2]/div/div/div/mat-option[3]");
	By BedSelOPt=By.xpath("//span[contains(text(),'Bed00')]");
	//Save Button
	By SaveBtnClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/div/div/button[2]/span[1]/mat-icon");
	//Yes BUtton
	By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	//Clicking on row
	By ROWClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container[2]/mat-drawer-content/div/table/tbody/tr[1]");
	//Update Status
	By UpdateStatus=By.cssSelector("img[ng-reflect-message='Update Status']");

	//Status
	By StatusClick=By.cssSelector("mat-select[ng-reflect-name='first']");
	By StatusSelopt=By.xpath("//span[contains(text(),'ADMITTED')]");

	//Remarks
	By RemarksClick12=By.cssSelector("input[ng-reflect-name='remarks']");

	//Confirm 
	By ConfirmButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Confirm']");

	By StatusUpdated=By.xpath("//span[contains(text(),'Status Updated')]");

	By NewAdmission1 = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPDNEWADM.png']");
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
	//By Select = By.xpath("//button[contains(text(),'Select')]");
	By Admit_Assessment = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[1]/div/p-tabmenu/div/div/div/ul/li[2]/a/span[1]");
	// History
	// Locators for HIST_ALLERGY
	By HIST_ALLERGY = By.id("HIST_ALLERGY");
	By Preglodie = By.xpath("//span[contains(text(),'Pergolide')]");
	By SelectReaction = By.xpath("//div[@class='p-multiselect-trigger']");
	By AbdominalPain = By.xpath("//span[contains(text(),'Abdominal Pain')]");
	//By Severity = By.xpath("//div[@class='p-dropdown-trigger']");
	//By Mild = By.xpath("//span[contains(text(),'Mild')]");
	//By kSaveExit1 = By.id("SaveExit");

	// Locators for HIST_COMPLAINT
	By HIST_COMPLAINT = By.id("HIST_COMPLAINT");
	By checkbox1 = By.xpath("//p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]");
	//By kSaveExit2 = By.id("SaveExit");

	// Locators for HIST_HPI
	By HIST_HPI = By.id("HIST_HPI");
	By sendkey1 = By.xpath("//p-editor/div/div[2]/div[1]");
	//By kSaveExit3 = By.id("SaveExit");

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
	//By ADT = By.xpath("/html/body/app-root/app-main/div/div[1]/div/app-menu/ul/li/ul/li[7]/a/span[1]");
	By NewAdmissionn = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/CSNEWADM.png']");
	By IPNEWADMASSE = By.cssSelector("img[src='https://mykare-qa.hatiintl.com/lt-assets/menu-icons/IPNEWADMASSE.png']");
	
	By Tile = By.xpath("//app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[2]");
	By optytle = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div[1]/form/mat-grid-list/div/mat-grid-tile[1]/div/app-master-form-field/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]");
	By TanSriDatuk = By.xpath("//span[contains(text(),'Tan Sri Datuk')]");
    By kinName = By.cssSelector("input[ng-reflect-name='kinName']");
    
    By kk = By.cssSelector("mat-icon[ng-reflect-message='Add new kin']");
	
	public ER_AdmitRequest__Dashboard (WebDriver driver)

	{
		this.driver=driver;

	}


	public void khs() throws InterruptedException, IOException, AWTException 

	{

		Thread.sleep(14000);

		//----Main Menu---//

		driver.findElement(mainmenu).click();
		Thread.sleep(12000);
		driver.findElement(ER).click();
		Thread.sleep(10000);


		// Handling a new window/tab if opened
		String mainWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // Switch back to the original tab
		Thread.sleep(14000);

		driver.findElement(SecondarySurvey).click();
		Thread.sleep(3000);
		driver.findElement(ES).click();
		Thread.sleep(25000);

		//----Serach Name_MPI and add the primary and secodary survey---//

		driver.findElement(Name_MPI).sendKeys("UNKNOWN-17:12:54:07");
		Thread.sleep(3000);
		driver.findElement(Search).click();
		Thread.sleep(3000);
		driver.findElement(Continue).click();
		Thread.sleep(3000);
		//driver.findElement(PrimarySurvey).click();

		Thread.sleep(8000);
		Thread.sleep(5000);

		Robot robot = new Robot(); for (int i = 0; i < 6; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); }

		Thread.sleep(4000);

		driver.findElement(SeconadySuervy).click();
		Thread.sleep(8000);
		// Admit
		driver.findElement(PLAN_ADMIT).click();
		Thread.sleep(3000);
		driver.findElement(StandingOrders).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(AdmitNote).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(physicianInstruction).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(AdmissionType).click();
		Thread.sleep(3000);
		driver.findElement(AdmissionTypeopt).click();
		Thread.sleep(3000);
		driver.findElement(ReasonforAdmission).click();
		Thread.sleep(3000);
		driver.findElement(ReasonforAdmissionopt).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingFacility).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingFacilityopt).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingDepartment).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingDepartmentopt).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingPhysician).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingPhysicianopt).click();
		Thread.sleep(3000);
		driver.findElement(AdmitToWard).click();
		Thread.sleep(3000);
		driver.findElement(AdmitToWardopt).click();
		Thread.sleep(3000);
		driver.findElement(ExpectedLOS).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(AdmissionCategory).click();
		Thread.sleep(3000);
		driver.findElement(AdmissionCategoryopt).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit282).click();
		Thread.sleep(3000);
		driver.quit();


		//Login to 10021234
		Thread.sleep(8000);	

		/*
		driver = new ChromeDriver();
		driver.get("https://mykare-qa.hatiintl.com/Medcare/#/");
		Thread.sleep(10000);

		// Login
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
		Thread.sleep(13000);

		// Navigating to the LAB module
		driver.findElement(mainmenu).click();
		Thread.sleep(8000);
		driver.findElement(ADT).click();
		Thread.sleep(14000);

		// Expanding and searching for a patient
		driver.findElement(Expand).click();
		Thread.sleep(3000);
		driver.findElement(PatientNamesend).sendKeys("AMRUTA");
		Thread.sleep(3000);
		driver.findElement(Serach).click();
		Thread.sleep(3000);

		 */

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

		/*//Over the slide bar in Billing menu Screen
				Thread.sleep(3000);
				WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
				act3.moveToElement(overforopdslide2).build().perform();*/

		/*Thread.sleep(4000);
				driver.findElement(AdmissionDashboard).click();*/

		//Click on Advanced Search
		Thread.sleep(12000);
		driver.findElement(AdvancedSearchClick).click();

		Thread.sleep(3000);
		driver.findElement(MRNClick).sendKeys("UNKNOWN-17:12:55:50");

		Thread.sleep(3000);
		driver.findElement(SearchClick).click();

		Thread.sleep(8000);
		driver.findElement(SaveAdmission).click();

		Thread.sleep(3000);
		driver.findElement(ReasonForAdmissionADT).click();

		Thread.sleep(3000);
		driver.findElement(AllDropDown).click();

		Thread.sleep(3000);
		driver.findElement(Doctor).click();
		Thread.sleep(3000);
		driver.findElement(AdmittingPhysicianSelopt).click();
		
		Thread.sleep(3000);
	    driver.findElement(Tile).click();
		Thread.sleep(3000);
	    driver.findElement(optytle).click();
		Thread.sleep(3000);
	    driver.findElement(TanSriDatuk).click();
		Thread.sleep(3000);
	    driver.findElement(kinName).sendKeys("k");
	    Thread.sleep(3000); 
	    driver.findElement(kk).click();

		Thread.sleep(3000);
		driver.findElement(ADTWard).click();
		Thread.sleep(3000);
		driver.findElement(ADTWardSelOPt).click();

		Thread.sleep(3000);
		driver.findElement(Bed).click();
		Thread.sleep(3000);
		driver.findElement(BedClick).click();

		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(SaveBtnClick).click();

		//Clicking on Okay dialog
		Thread.sleep(3000);
		driver.findElement(OkButtonClick).click();

		//TabSwitch
		Thread.sleep(5000);
		String windowHandle3 = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs2 = new ArrayList<Object> (driver.getWindowHandles());

		//Use the list of window handles to switch between windows
		Thread.sleep(5000);
		driver.switchTo().window((String)tabs2.get(0));	

		//Clicking Row 
		Thread.sleep(5000);
		driver.findElement(ROWClick).click();

		//Clicking update status menu. 
		Thread.sleep(3000);
		driver.findElement(UpdateStatus).click();

		//Clicking on status.
		Thread.sleep(3000);
		driver.findElement(StatusClick).click();
		Thread.sleep(2000);
		driver.findElement(StatusSelopt).click();

		//Adding Remarks
		Thread.sleep(2000);
		driver.findElement(RemarksClick12).sendKeys("Want to do admitted patient");

		//Clicking on confirm button
		Thread.sleep(2000);
		driver.findElement(ConfirmButtonClick).click();

		driver.close();			

	}
}
