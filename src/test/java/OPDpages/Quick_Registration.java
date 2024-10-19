package OPDpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import OPDTest.DeleteExcelRowWithSelenium;
import OPDTest.ReadExcelRowWithSelenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Quick_Registration 
{

	//WebDriver driver=null; 
	WebDriver driver; 
	public Quick_Registration(WebDriver driver) 
	{
		this.driver=driver;

	}
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By OPDMenu=By.xpath("//span[contains(text(),'OPD')]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By RegistrationMenu=By.xpath("//span[contains(text(),'Registration')]");
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//By EncounterListClick=By.xpath("//span[contains(text(),'Patient Blocking')]");
	
	
	//Quick Registration
	By QuickRegistrationClick=By.xpath("//span[contains(text(),'Quick Registration')]");

	//Basic Information
	//for all search same xpath
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//PrimaryID
	By Primaryidclick=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Primaryidselectvalue=By.xpath("//span[contains(text(),'Old IC')]");

	//PrimaryIDnumber
	By PrimaryIDnumberclick=By.cssSelector("input[formcontrolname='primaryNumber']");

	//ExpiryDate
	//By Expirydateclick=By.cssSelector("input[formcontrolname='expiryDate']");

	//Title
	By Titleclick=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titleselectvalue=By.xpath("//span[contains(text(),'Tan Sri Dato Seri')]");

	//Name 
	By Nameclick=By.cssSelector("input[formcontrolname='firstName']");

	//Gender
	By Genderclick=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Genderselectvalue=By.xpath("//span[contains(text(),' FEMALE ')]");

	//DOB
	By DOBclick=By.cssSelector("input[ng-reflect-name='dateOfBirth']");

	//CountryCode
	By CountryCodeclick=By.cssSelector("mat-select[ng-reflect-name='countryCodemobile']");
	By CountryCodeselectvalue=By.xpath("//span[contains(text(),' +213 ')]");

	//MobielNo
	By Mobilenoclick=By.cssSelector("input[formcontrolname='mobileNumber']");

	//Encounter Details
	//EncounterType
	By EncoujnterTypeclick=By.cssSelector("mat-select[ng-reflect-name='encounterType']");
	By EncounterTypeselectvalue=By.xpath("//span[contains(text(),' New Case ')]");

	//SpecialityField
	By Specialityfieldclick=By.cssSelector("mat-select[ng-reflect-name='department']");
	By Specialityfieldselect=By.xpath("//span[contains(text(),' General Medicine')]");

	//Doctor
	By Doctorclick=By.cssSelector("mat-select[ng-reflect-name='doctor']");
	By Doctorselect=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");

	//Clinic
	By Clinicclick=By.cssSelector("mat-select[ng-reflect-name='clinic']");
	By Clinicselect=By.xpath("//span[contains(text(),'Consultation Room 1')]");

	//Counter 
	By Counterclick=By.cssSelector("mat-select[ng-reflect-name='cashCounter']");
	By Counterselect=By.xpath("//span[contains(text(),' REGISTRATION COUNTER 1 ')]");

	//ENcounter Remarks
	By EncounterRemarksclick=By.cssSelector("textarea[formcontrolname='remarks']");

	//Encounter Notes Button
	By EncounterNotesButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Internal Note']");

	//Add Notes
	By AddNotesClick=By.cssSelector("input[ng-reflect-name='notes']");

	//Add Remark Button
	By AddRemarkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");

	//Close Button
	By CloseButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Close']");

	//Referral Details
	//Visit Reason
	By VisitReasonClick=By.cssSelector("mat-select[ng-reflect-name='visittype']");
	By VisitReasonSelOpt=By.xpath("//span[contains(text(),'Visit cancellation')]");

	//ReferralType
	By ReferralTypeClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelOpt=By.xpath("//span[contains(text(),' Emergency Referral ')]");

	//Referral
	By ReferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By ReferralSelOpt=By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain \")]");

	//Patient Category
	By PatientCategoryClick=By.cssSelector("mat-select[ng-reflect-name='patientCategory']");
	By PatientCategorySelOpt=By.xpath("//span[contains(text(),' Senior Citizen ')]");

	//Encounter Notes
	By EncounterNotesClick=By.cssSelector("input[formcontrolname='practiceNotes']");

	//Patient Notes
	By PatientNotes=By.cssSelector("textarea[formcontrolname='reportRemarks']");

	//Referral Remarks
	By ReferralRemarksClick=By.cssSelector("textarea[formcontrolname='referralRemarks']");	

	//Tariff
	By Tariffclick12=By.cssSelector("mat-select[data-automation-attribute='encounterTariff0']");
	By Tariffselect12=By.xpath("//span[contains(text(),'Self Tariff')]");	

	//Add Payer Button
	By AddPayerButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Payer']");

	//Payer Type Click
	By PayerTypeClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/mat-select");
	By PayerTypeSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Payer
	By PayerCLick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[3]/mat-select"); 
	By PayerSelOpt=By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span");

	//Tariff2
	By Tariff22Click=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[4]/mat-select");
	By Tariff22Selopt=By.xpath("//span[contains(text(),'Insurance Tariff')]");

	//Policy number
	By PolicyNoClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-sample-patient-registration/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[8]/input");

	//Save 
	By Saveclick=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By Saveconfirm=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
	//By Saveconfirm=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-regsuccess-dialog/div/div[3]/div/button[1]/span[1]/mat-icon");
	//By patientblock=By.id("12121");

	By doctor = By.xpath("//span[contains(text(),'DATO DR PHIL OSMAN')]");
	//Referral Details

	public void Quick_Registration_Verification(String QuickPrimaryIdNumberPar,String QuickMobileNumberPar,String QuickEncounterRemarksPar,String QuickAddNotesPar,String QuickEncounterNotesPar,String QuickPatientNotesPar,String QuickReferralRemarksPar) throws InterruptedException, IOException 
	{
		
		

		// Create object and take the data from another class
		DeleteExcelRowWithSelenium  data = new DeleteExcelRowWithSelenium();
		String EnterPatientName=data.TkaePatientName;
		System.out.println("Print the patient name" + EnterPatientName);

		//Clicking on menu Icon
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		Thread.sleep(5000);
		driver.findElement(OPDMenu).click();
		Thread.sleep(5000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();
		Thread.sleep(5000);
		driver.findElement(RegistrationMenu).click();
		Thread.sleep(5000);
		driver.findElement(QuickRegistrationClick).click();

		//Adding Basic Information
		Thread.sleep(5000);


		//Selecting Tariff
		Thread.sleep(3000);
		driver.findElement(Tariffclick12).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(Tariffselect12).click();

		//Primary Identification
		Thread.sleep(1000);
		driver.findElement(Primaryidclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Old IC");
		Thread.sleep(2000);
		driver.findElement(Primaryidselectvalue).click();


		//Primary Id number
		Thread.sleep(2000);
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());

		String id=String.valueOf(d.getTime());

		driver.findElement(PrimaryIDnumberclick).sendKeys(QuickPrimaryIdNumberPar+id);

		//Expire Date
		//Thread.sleep(2000);
		//driver.findElement(Expirydateclick).sendKeys(QuickExparyDatePar);
		//Title
		Thread.sleep(1000);
		driver.findElement(Titleclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato Seri");
		Thread.sleep(1000);
		driver.findElement(Titleselectvalue).click();
		//Add Full Name
		// Set the path to your Excel file
		/* String excelFilePath = "C:\\Users\\Kamlakar\\Desktop\\Readdata.xlsx.xlsx";

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Access the specific sheet you want to modify (0 is the first sheet)
            Sheet sheet = workbook.getSheetAt(0);

            // Get the row index you want to read and delete (adjust as needed)
            int rowIndex = 0; // for example

            // Read and display the row data (you can customize this part)
            Row row = sheet.getRow(rowIndex);
            if (row != null) {
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println(); // New line for the next row
            } else {
                System.out.println("Row index is out of range.");
            }

            // Delete the row
            if (rowIndex >= 0 && rowIndex < sheet.getPhysicalNumberOfRows()) {
                sheet.removeRow(row);
                sheet.shiftRows(rowIndex + 1, sheet.getLastRowNum(), -1); // Shift rows to close the gap
            } else {
                System.out.println("Row index is out of range.");
            }

            // Save the modified Excel file
            try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
                workbook.write(fos);

            }*/

		

		Thread.sleep(1000);
		driver.findElement(Nameclick).sendKeys(EnterPatientName);
		//Clicking on Gender
		//Thread.sleep(1000);
		//driver.findElement(Genderclick).click();
		//Thread.sleep(1000);
		//driver.findElement(AllDropDownSearch).sendKeys("FEMALE");
		//Thread.sleep(1000);
		//	driver.findElement(Genderselectvalue).click();
		//Clicking on DOB
		//Thread.sleep(1000);
		//driver.findElement(DOBclick).sendKeys(QuickDateOfBirthPar);
		//Country Code
		Thread.sleep(1000);
		driver.findElement(CountryCodeclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("+213");
		Thread.sleep(1000);
		driver.findElement(CountryCodeselectvalue).click();
		//Mobile Number
		Thread.sleep(1000);
		driver.findElement(Mobilenoclick).sendKeys(QuickMobileNumberPar);

		//Encounter Details
		//Encounter Type
		Thread.sleep(1000);
		driver.findElement(EncoujnterTypeclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("New Case");
		Thread.sleep(1000);
		driver.findElement(EncounterTypeselectvalue).click();

		//Select Specialty
		Thread.sleep(1000);
		driver.findElement(Specialityfieldclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("General Medicine");
		Thread.sleep(1000);
		driver.findElement(Specialityfieldselect).click();
		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(Doctorclick).click();
		Thread.sleep(2000);
		//driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
	//	Thread.sleep(2000);
		driver.findElement(doctor).click();
		//Selecting Clinic
		Thread.sleep(1000);
		driver.findElement(Clinicclick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Consultation Room 1");
		Thread.sleep(1000);
		driver.findElement(Clinicselect).click();
		//Selecting Counter
		Thread.sleep(1000);
		/*
		 * driver.findElement(Counterclick).click(); Thread.sleep(1000);
		 * driver.findElement(AllDropDownSearch).sendKeys("REGISTRATION COUNTER 1");
		 * Thread.sleep(1000); driver.findElement(Counterselect).click();
		 */
		//Encounter Remarks
		Thread.sleep(1000);
		driver.findElement(EncounterRemarksclick).sendKeys(QuickEncounterRemarksPar);

		//Clicking on Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesButtonClick).click();
		//Adding Notes
		Thread.sleep(2000);
		driver.findElement(AddNotesClick).sendKeys(QuickAddNotesPar);
		//Clicking on Add Remark Button
		Thread.sleep(2000);
		driver.findElement(AddRemarkButtonClick).click();

		//Closing Dialog
		Thread.sleep(2000);
		driver.findElement(CloseButtonClick).click();

		//Referral Details
		//Visit Reason	
		Thread.sleep(1000);
		driver.findElement(VisitReasonClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Visit cancellation");
		Thread.sleep(1000);
		driver.findElement(VisitReasonSelOpt).click();
		//Referral Type
		Thread.sleep(1000);
		driver.findElement(ReferralTypeClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(1000);
		driver.findElement(ReferralTypeSelOpt).click();
		//Referral
		Thread.sleep(1000);
		driver.findElement(ReferralClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Dato' Dr. Jefri Zain");
		Thread.sleep(1000);
		driver.findElement(ReferralSelOpt).click();
		//Patient Category
		Thread.sleep(1000);
		
		/*
		driver.findElement(PatientCategoryClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Senior Citizen");
		Thread.sleep(1000);
		driver.findElement(PatientCategorySelOpt).click();
		//Encounter Notes
		Thread.sleep(1000);
		driver.findElement(EncounterNotesClick).sendKeys(QuickEncounterNotesPar);
		//Patient Notes
		Thread.sleep(1000);
		driver.findElement(PatientNotes).sendKeys(QuickPatientNotesPar);

		//Referral Remarks
		Thread.sleep(1000);
		driver.findElement(ReferralRemarksClick).sendKeys("Testing Referral Remarks");
*/
		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		
		//Clicking on save button
		Thread.sleep(4000);
		driver.findElement(Saveclick).click();
		//driver.findElement(Saveclick).click();

		//Clicking on OK Button
		Thread.sleep(5000);
		//driver.findElement(Saveconfirm).click();
		driver.findElement(Saveconfirm).click();

		Thread.sleep(2000);

		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File(".//ScreenShots//QuickRegWithNewIC.png"));

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs.get(0));

		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();

		

		
	}

}
