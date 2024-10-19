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

public class Anesthesia  {

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


	By OTProcedureOrders = By.cssSelector("button[id='PLAN_OT']");
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



	By Anesthesia = By.xpath("//div[contains(text(),'Anesthesia Management')]");
	By ProcedureSearch = By.cssSelector("input[formcontrolname='procedureSearch']");
	By TransurethralresectionofProstate = By.xpath("//app-pac-schedule/div/div/div[1]/form/div/div[2]/div[1]/p-table/div/div/table/tbody/tr/td[2]");
	By Speciality = By.xpath("//app-pac-schedule/div/div/div[1]/form/div/div[2]/div[2]/div[2]/p-autocomplete/span/input");
	By Specialityopt = By.xpath("//span[contains(text(),'General Medicine')]");
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
    By Closeed = By.xpath("/html/body/div[4]/div/div[1]/div/button");

	// k
	By AnesthesiaRecord = By.xpath("//span[contains(text(),'Anesthesia Record')]");
	By Continue_7 = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-anesthesia-mgmt-queue/div/div/form[1]/div[7]/p-table/div/div/table/tbody/tr[1]/td[1]/div/p-button/button/span[1]");
	By Role = By.xpath("//app-post-op-procedure-details/div[1]/div[1]/p-panel[2]/div/div[2]/div/form/div[1]/div[1]/p-dropdown/div/span");
	By Physician = By.xpath("//span[contains(text(),'Physician')]");
	By user= By.xpath("//app-post-op-procedure-details/div[1]/div[1]/p-panel[2]/div/div[2]/div/form/div[1]/div[2]/p-dropdown/div/span");
	By DRRANIMRMUKERJI_1 = By.xpath("//span[contains(text(),'DR RANI M R MUKERJI')]");
	By PAC_Completed = By.xpath("//span[contains(text(),'PAC Complete')]");


	
	By selectone = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-anesthesia-mgmt-queue/div/div/form[1]/div[7]/p-table/div/div/table/tbody/tr[1]/td[1]/div/p-button");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	public Anesthesia (WebDriver driver)

	{
		this.driver=driver;

	}


	public void fks() throws InterruptedException, IOException, AWTException 

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
		Thread.sleep(9000);
		driver.findElement(ES).click();
		Thread.sleep(25000);

		//----Serach Name_MPI and add the primary and secodary survey---//

		driver.findElement(Name_MPI).sendKeys("UNKNOWN-17:12:53:11");
		Thread.sleep(3000);
		driver.findElement(Search).click();
		Thread.sleep(3000);
		driver.findElement(Continue).click();
		Thread.sleep(3000);
		//driver.findElement(PrimarySurvey).click();

		Thread.sleep(8000);
		Thread.sleep(5000);

		Robot robot = new Robot(); for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL); }

		Thread.sleep(4000);

		driver.findElement(SeconadySuervy).click();
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
		driver.findElement(Assistantsend).sendKeys("DATO DR PHIL");
		Thread.sleep(3000);
		driver.findElement(DATOMRSURAZISYED5).click();
		Thread.sleep(3000);
		driver.findElement(HighRiskCase).click();
		Thread.sleep(3000);
		driver.findElement(HighRiskCase1send).sendKeys("High Risk Reason");
		Thread.sleep(3000);
		driver.findElement(PAC).click();
		Thread.sleep(3000);
		driver.findElement(kSaveExit22).click();
		Thread.sleep(8000);

/*
		// Consultan Section
		driver.findElement(Consultan).click();
		Thread.sleep(3000);
		driver.findElement(arrow).click();
		Thread.sleep(3000);
		driver.findElement(Blood).click();
		Thread.sleep(3000);
		driver.findElement(savw).click();
*/
		// Mark to Bill Section
		driver.findElement(OrderBasket).click();
		Thread.sleep(3000);
		driver.findElement(SubmitOrder).click();
		Thread.sleep(14000);

		driver.findElement(Menulk).click();
		Thread.sleep(12000);
		driver.findElement(Anesthesia).click();
		Thread.sleep(10000);

		// Handling a new window/tab if opened
		String mainWindow1 = driver.getWindowHandle();
		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1)); // Switch back to the original tab
		Thread.sleep(14000);

		//driver.findElement(mpi).sendKeys("ABDUL FAWWAS");
		//Thread.sleep(3000);
		//driver.findElement(Search).click();
		Thread.sleep(3000);
		driver.findElement(selectone).click();
		Thread.sleep(3000);
		driver.findElement(PatientStatus).click();
		Thread.sleep(3000);
		driver.findElement(ArrivedAtOT).click();
		Thread.sleep(3000);
		driver.findElement(Save2).click();
		Thread.sleep(3000);
		driver.findElement(Continue).click();
		Thread.sleep(3000);
		
		//driver.findElement(Anesthesia).click();
		Thread.sleep(3000);
		driver.findElement(ProcedureSearch).sendKeys("Pro");
		Thread.sleep(5000);
		driver.findElement(TransurethralresectionofProstate).click();
		Thread.sleep(3000);
		driver.findElement(Speciality).sendKeys("General Medicine");
		Thread.sleep(3000);
		driver.findElement(Specialityopt).click();
		Thread.sleep(3000);
		driver.findElement(Save).click();
		Thread.sleep(3000);
		driver.findElement(ChooseAnesthetist).click();
		Thread.sleep(3000);
		driver.findElement(DRRANIMRMUKERJI).click();
		Thread.sleep(3000);
		// Locate the scrollable element (based on the element you want to scroll)
		WebElement scrollableElement = driver.findElement(By.xpath("//app-clinical-schedule-calendar/ejs-schedule/div[3]/div/table/tbody/tr[2]/td[2]/div"));

		// Scroll down to the bottom of the element using JavaScript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", scrollableElement);

		Thread.sleep(12000);

		// Locate the target element
		WebElement element = driver.findElement(Date);

		// Use JavaScript to get the computed background color
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		String bgColor = (String) jss.executeScript("return window.getComputedStyle(arguments[0]).backgroundColor;", element);

		// Extract the green value from the RGB color
		String[] rgbValues = bgColor.replace("rgb(", "").replace(")", "").split(", ");
		int greenValue = Integer.parseInt(rgbValues[1]);

		// Check if the green value is 201, and then click if true
		if (greenValue == 201) {
			element.click();
		}

		Thread.sleep(3000);	
		driver.findElement(CreateShecule).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(PACc).click();
		Thread.sleep(3000);
		driver.findElement(continue_9).click();
		Thread.sleep(3000);
		driver.findElement(selctreco).click();
		Thread.sleep(3000);
		driver.findElement(Unitsendkeys).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(AdverseReactionsendkeys).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(Componentsendkeys).click();
		Thread.sleep(3000);
		driver.findElement(Cryoprecipitateopt).click();
		Thread.sleep(3000);
		driver.findElement(save1).click();
		Thread.sleep(8000);
		driver.findElement(Orderbasket).click();
		Thread.sleep(3000);
		driver.findElement(Submitorder).click();
		Thread.sleep(5000);
		driver.findElement(Closeed).click();
		Thread.sleep(5000);

		driver.findElement(AnesthesiaRecord).click();
		Thread.sleep(3000);
		driver.findElement(Continue_7).click();
		Thread.sleep(3000);
		driver.findElement(Role).click();
		Thread.sleep(3000);
		driver.findElement(Physician).click();
		Thread.sleep(3000);
		driver.findElement(user).click();
		Thread.sleep(3000);
		driver.findElement(DRRANIMRMUKERJI_1).click();
		Thread.sleep(3000);
		driver.findElement(PAC_Completed).click();
		Thread.sleep(3000);


	}
}
