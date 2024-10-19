package MRDPages;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ADTRequestForm 
{
	WebDriver driver;

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//ADT
	By ADT=By.xpath("//*[@id='mat-menu-panel-1']/div/div/div[1]/div[1]/div[3]/div/img");

	//AddButton
	By AddButton=By.cssSelector("mat-icon[ng-reflect-message='Add Admission Request']");

	//PrimaryIdentification
	By PriID=By.cssSelector("mat-select[ng-reflect-name='primaryId']");
	By Prisearch=By.cssSelector("input[aria-label='dropdown search']");
	By Priselect=By.xpath("//span[contains(text(),'Passport')]");

	//PriNumber
	By PriNumber=By.cssSelector("input[ng-reflect-name='primaryDocNo']");

	//Name
	By Name=By.cssSelector("input[ng-reflect-name='fullName']");

	//ExpiryDate
	By ExpiryDate=By.cssSelector("input[ng-reflect-placeholder='Expiry Date']");

	//Title
	By Title=By.cssSelector("mat-select[ng-reflect-name='prefix']");
	By Titlesearch=By.cssSelector("input[aria-label='dropdown search']");
	By Titleselect=By.xpath("//span[contains(text(),'Tan Sri Dato')]");

	//Gender
	By Gender=By.cssSelector("mat-select[ng-reflect-name='gender']");
	By Gendersearch=By.cssSelector("input[aria-label='dropdown search']");
	By Genderselect=By.xpath("//span[contains(text(),'FEMALE')]");

	//DOB
	By DOB=By.cssSelector("input[ng-reflect-name='dob']");

	By Religion=By.cssSelector("mat-select[ng-reflect-name='religion']");
	By ReligionSelOpt=By.xpath("//span[contains(text(),'Islam')]");

	By Preferedlanguage=By.cssSelector("mat-select[ng-reflect-name='preferredLanguage']");
	By PreferedlanguageSelOpt=By.xpath("//span[contains(text(),'Bahasa Malaysia')]");

	By Nationality=By.cssSelector("mat-select[ng-reflect-name='nation']");
	By NationalitySelopt=By.xpath("//span[contains(text(),'Albania')]");

	By MotherName=By.cssSelector("input[ng-reflect-name='motherName']");
	//Mobile 
	By Mobile=By.cssSelector("input[ng-reflect-name='mobileNo']");

	//Email
	By Email=By.cssSelector("input[ng-reflect-name='emailId']");

	//AdmittingDoctor
	By Admdoctor=By.cssSelector("mat-select[ng-reflect-name='primaryCareDoc']");
	By AdmDctsearch=By.cssSelector("input[aria-label='dropdown search']");
	By AdmDctselect=By.xpath("//span[contains(text(),'DATO DR PHIL OSMAN')]");

	//AdmittingDepartment 
	By AdmDepartment=By.cssSelector("mat-select[ng-reflect-name='primaryCareDept']");
	By AdmDepsearch=By.cssSelector("input[aria-label='dropdown search']");
	By AdmDepselect=By.xpath("//span[contains(text(),'General Medicine')]");

	//AttendingDoctor
	By AttendDoctor=By.cssSelector("mat-select[ng-reflect-name='attendingCareDoc']");
	By AttendDctsearch=By.cssSelector("input[aria-label='dropdown search']");
	By AttendDctselect=By.xpath("//span[contains(text(),'Luke David')]");

	//ReferringDoctor
	By ReferringDoctor=By.cssSelector("mat-select[ng-reflect-name='refferingDoc']");
	By ReferringDctsearch=By.cssSelector("input[aria-label='dropdown search']");
	By ReferringDctselect=By.xpath("//span[contains(text(),'Dr Edward Kerry')]");

	//AdmissionType
	By Admissiontype=By.cssSelector("mat-select[ng-reflect-name='typeOfAdmission']");
	By Admissiontypesearch=By.cssSelector("input[aria-label='dropdown search']");
	By Admissiontypeselect=By.xpath("//span[contains(text(),'Elective')]");

	//ReasonAdmission
	By ReasonAdmission=By.cssSelector("mat-select[ng-reflect-name='reasonOfAdmission']");
	By ReasonAdmsearch=By.cssSelector("input[aria-label='dropdown search']");
	By ReasonAdmselect=By.xpath("//span[contains(text(),'For surgery')]");

	//DOA
	By DOA=By.cssSelector("input[ng-reflect-name='DOA']");

	//Length
	By Length=By.cssSelector("input[ng-reflect-name='ELS'");

	//FinancialClass
	By Financialclass=By.cssSelector("mat-select[ng-reflect-name='financialClass']");
	By Financialsearch=By.cssSelector("input[aria-label='dropdown search']");
	By Financialselect=By.xpath("//span[contains(text(),'Third Class')]");

	//BedCategory 
	By Bedcategory=By.cssSelector("mat-select[ng-reflect-name='bedCategory']");
	By Bedcatsearch=By.cssSelector("input[aria-label='dropdown search']");
	By Bedcatselect=By.xpath("//span[contains(text(),'4-Bedded')]");

	//PayerType
	By Payertype=By.cssSelector("mat-select[ng-reflect-name='paymentEntitlement']");
	By Payertypesearch=By.cssSelector("input[aria-label='dropdown search']");
	By Payertypeselect=By.xpath("//span[contains(text(),'Insurance')]");

	//Notes
	By Notes=By.cssSelector("input[ng-reflect-name='notes']");

	//Remarks 
	By Remarks=By.cssSelector("input[ng-reflect-name='remarks'");

	//Save 
	By Save=By.cssSelector("mat-icon[ng-reflect-message='Save']");

	//ConfirmButton
	By ConfirmButton=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	By ADTReqSaved=By.xpath("//span[contains(text(),'Record Saved Successfully')]");

	//Edit 

	By Edit=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-request/mat-drawer-container/mat-drawer-content/div/div[2]/table/tbody/tr[1]/td[13]/div/mat-icon[2]");

	public void ADTFORREQUEST(String PrimaryIdNumber12, String PatientNamePar, String ExpiryDatePar, String DOBPar, String MobilePar, String EmailPar, String DOAPar, String LengthPar, String NotesPar, String RemarksPar) throws InterruptedException, IOException
	{


		//Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(6000);
		WebElement ele2=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele2).build().perform();
		act.click(ele2).perform();
		//Thread.sleep(2000);

		//ADT
		Thread.sleep(5000);
		driver.findElement(ADT).click();

		//ScreenShot1
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1,new File(".//ScreenShot//AdmissionRequestPage.png"));

		//AddButton
		Thread.sleep(4000);
		driver.findElement(AddButton).click();

		//ScreenShot1
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2,new File(".//ScreenShot//AdmissionRequest2.png"));
		//PrimaryID
		Thread.sleep(2000);
		driver.findElement(PriID).click();
		Thread.sleep(2000);
		driver.findElement(Prisearch).sendKeys("Passport");
		Thread.sleep(2000);
		driver.findElement(Priselect).click();

		//PriNumber
		Date d=new Date(System.currentTimeMillis()+ System.nanoTime());
		Long id=d.getTime();
		Thread.sleep(2000);
		driver.findElement(PriNumber).sendKeys(PrimaryIdNumber12+id);
		System.out.println("id="+id);

		//Name
		Thread.sleep(2000);
		driver.findElement(Name).sendKeys(PatientNamePar);

		//ExpiryDate
		Thread.sleep(2000);
		driver.findElement(ExpiryDate).sendKeys(ExpiryDatePar);

		//Title
		Thread.sleep(2000);
		driver.findElement(Title).click(); 
		Thread.sleep(2000);
		driver.findElement(Titlesearch).sendKeys("Tan Sri Dato'");
		Thread.sleep(2000);
		driver.findElement(Titleselect).click();

		//Gender
		Thread.sleep(2000);
		driver.findElement(Gender).click();
		//Thread.sleep(3000);
		//driver.findElement(Gendersearch).sendKeys("MALE");
		Thread.sleep(3000);
		driver.findElement(Genderselect).click();

		//DOB
		Thread.sleep(2000);
		driver.findElement(DOB).sendKeys(DOBPar);

		//Mobile 
		Thread.sleep(2000);
		driver.findElement(Mobile).sendKeys(MobilePar);

		//Email
		//Thread.sleep(2000);
		//driver.findElement(Email).sendKeys(EmailPar);

		//AdmittingDoctor
		Thread.sleep(2000);
		driver.findElement(Admdoctor).click();
		Thread.sleep(2000);
		//driver.findElement(AdmDctsearch).sendKeys("AMAN");
		Thread.sleep(2000);
		driver.findElement(AdmDctselect).click();
		
		//AdmittingDepartment
		Thread.sleep(2000);
		driver.findElement(AdmDepartment).click();
		//Thread.sleep(2000);
		//driver.findElement(AdmDepsearch).sendKeys("Cardiology");
		Thread.sleep(2000);
		driver.findElement(AdmDepselect).click();

		//RefDoctor
		Thread.sleep(2000);
		driver.findElement(ReferringDoctor).click();
		Thread.sleep(2000);
		driver.findElement(ReferringDctsearch).sendKeys("Dr Edward Kerry");
		Thread.sleep(2000);
		driver.findElement(ReferringDctselect).click();

		//AttendingDoctor
		Thread.sleep(2000);
		driver.findElement(AttendDoctor).click();
		Thread.sleep(2000);
		driver.findElement(AttendDctsearch).sendKeys("Luke David");
		Thread.sleep(2000);
		driver.findElement(AttendDctselect).click();


		//AdmissionType
		Thread.sleep(2000);
		driver.findElement(Admissiontype).click();
		Thread.sleep(2000);
		driver.findElement(Admissiontypesearch).sendKeys("Elective");
		Thread.sleep(2000);
		driver.findElement(Admissiontypeselect).click();

		//ReasonAdmission
		Thread.sleep(2000);
		driver.findElement(ReasonAdmission).click();
		Thread.sleep(2000);
		driver.findElement(ReasonAdmsearch).sendKeys("For surgery");
		Thread.sleep(2000);
		driver.findElement(ReasonAdmselect).click();

		//Date of Admission
		LocalDateTime dt = LocalDateTime.now();

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String myDate = dt.format(df);
		Thread.sleep(2000);
		driver.findElement(DOA).sendKeys(myDate);
		//Length
		Thread.sleep(2000);
		driver.findElement(Length).sendKeys(LengthPar);
		//FinancialClass
		Thread.sleep(2000);
		driver.findElement(Financialclass).click();
		Thread.sleep(2000);
		driver.findElement(Financialsearch).sendKeys("Third Class");
		Thread.sleep(2000);
		driver.findElement(Financialselect).click();
		//BedCategory 
		Thread.sleep(2000);
		driver.findElement(Bedcategory).click();
		Thread.sleep(2000);
		driver.findElement(Bedcatsearch).sendKeys("4-Bedded");
		Thread.sleep(2000);
		driver.findElement(Bedcatselect).click();
		//PayerType
		Thread.sleep(2000);
		driver.findElement(Payertype).click();
		Thread.sleep(2000);
		driver.findElement(Payertypesearch).sendKeys("Insurance");
		Thread.sleep(2000);
		driver.findElement(Payertypeselect).click();
		//Notes
		//Thread.sleep(2000);
		//driver.findElement(Notes).sendKeys(NotesPar);
		//Remarks
		//Thread.sleep(2000);
		//driver.findElement(Remarks).sendKeys(RemarksPar);
		//Save
		Thread.sleep(2000);
		driver.findElement(Save).click();
		//ConfirmButton
		Thread.sleep(2000);
		driver.findElement(ConfirmButton).click();

		/*Thread.sleep(2000);
		WebElement selectR1=driver.findElement(ADTReqSaved);
		String SRActual1=selectR1.getText();
		System.out.println("message : "+SRActual1);
		String expected1="Record Saved Successfully";
		Assert.assertEquals(SRActual1,expected1,"Record Saved Successfully");*/
		
		
		//Edit 
		Thread.sleep(8000);
		driver.findElement(Edit).click();  
		Thread.sleep(4000);

	}
	public ADTRequestForm (WebDriver driver)
	{
		this .driver=driver;
	}
}