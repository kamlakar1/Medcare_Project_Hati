package MRDPages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OP_ExistingAppoint_CreateVolume_Allocated_Transferred_FileAccept_BacktoMRDRece_MRDRece 
{
		WebDriver driver;
		//By Search=By.xpath("mat-icon[mattooltip='Search']");
		By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
		//By ADTMenu=By.xpath("//span[contains(text(),'ADT')]");
		By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
		By AdmissionForm=By.xpath("//span[contains(text(),'Admission Form')]");
		By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");

		//By Search=By.xpath("mat-icon[mattooltip='Search']");
		By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
		By OPDMenu=By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[1]/div[1]/div[1]/div/img");
		By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
		
		By AppointMainmenu=By.xpath("//*[@id='2001']/img");
		By AppointmentMenu=By.cssSelector("//*[@id='200101']/img");
		By RegistrationMenu=By.cssSelector("a[id='2004']");
		By EncounterList=By.cssSelector("a[id='2006']");
		
		By AppointmentType=By.cssSelector("mat-select[ng-reflect-placeholder='Appointment Type']");
		By AppointmentTypeSelOpt=By.xpath("//span[contains(text(),'Doctor')]");
		
		By ConsultationType=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[2]/div/div[1]/div[3]/mat-select");
		By ConsultationTypeSel=By.xpath("//span[contains(text(),'Clinical Consultation')]");
		
		By Speciality=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[1]/table/tbody/tr/td[1]/mat-form-field[3]/div/div[1]/div[3]/mat-select");
		By SpecialitySelOpt=By.xpath("//span[contains(text(),'General Medicine')]");
		
		By DoctorSel=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[1]/div/div[2]/div/ul/li[3]/span/button");
		By AppointmentOnsat=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-appointment/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div/ejs-schedule/div[3]/div/table/tbody/tr[2]/td[2]/div/table/thead/tr[1]/td[7]/div/div[1]/div/div[2]");
		
		By ExistingBtn=By.cssSelector("mat-radio-button[ng-reflect-value='registered']");
		By AdvancedSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
		By MRNField=By.cssSelector("input[name='MRN']");
		By SearchClick=By.cssSelector("button[ng-reflect-message='Search']");
	
		By Selectpatient=By.cssSelector("mat-radio-button[data-automation-attribute='radio-record']");
		By Gender=By.cssSelector("mat-select[ng-reflect-name=['Gender']");
		By GenderSel=By.xpath("//span[contains(text(),'MALE')]");  
		
		By MobileNo=By.cssSelector("input[ng-reflect-placeholder='Mobile No']");
		By SaveBtn=By.cssSelector("button[ng-reflect-message='Save']");
		By SaveDialog=By.cssSelector("button[data-automation-attribute='button-save-dialog']");
		
	By MRNClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	By MRDMenu=By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[2]/div[1]/div[2]/div/img");
	By DiagnosisCoding=By.xpath("//*[@id='70009']/img");
	
	By SampleRow=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-diagnosis-coding/mat-sidenav-container/mat-sidenav-content/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr[1]");
	
	public void DiagnosisCoding_OPD_ExistingAppoint() throws InterruptedException, IOException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date nowdate = new Date();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();

		Thread.sleep(10000);
		driver.findElement(OPDMenu).click();
		
		//..Over the slide bar in OPD Screen....//

				Thread.sleep(3000);
				WebElement overforopdslide1=driver.findElement(SideBarMenu);
				act.moveToElement(overforopdslide1).build().perform();

				Thread.sleep(5000);
				driver.findElement(RegistrationMenu).click();
				driver.findElement(RegistrationMenu).click();

				Thread.sleep(5000);
				driver.findElement(EncounterList).click();

				Thread.sleep(5000);
				WebElement MRN1=driver.findElement(MRNClick1);
				String MRNS=MRN1.getText();

				System.out.println("MRN Number:"+MRNS);
				Thread.sleep(4000);
				Actions act1 = new Actions(driver);
				Thread.sleep(2000);
				WebElement ele2=driver.findElement(mainmenuADTScreen);
				act1.moveToElement(ele2).build().perform();
				act1.click(ele2).perform();

		//..Over the slide bar in OPD Screen....//

		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(AppointMainmenu).click();
		
		Thread.sleep(5000);
		driver.findElement(AppointmentMenu).click();

		Thread.sleep(2000);
		WebElement TypeofAppointment = wait.until(ExpectedConditions.elementToBeClickable(AppointmentType)); 
		TypeofAppointment.click();
		Thread.sleep(2000);
		WebElement AppointmentTypeOpt = wait.until(ExpectedConditions.elementToBeClickable(AppointmentTypeSelOpt)); 
		AppointmentTypeOpt.click();
		
		Thread.sleep(2000);
		WebElement TypeOfConsultation = wait.until(ExpectedConditions.elementToBeClickable(ConsultationType)); 
		TypeOfConsultation.click();
		Thread.sleep(2000);
		WebElement ConsultationTypeOPt = wait.until(ExpectedConditions.elementToBeClickable(ConsultationTypeSel)); 
		ConsultationTypeOPt.click();
		
		Thread.sleep(2000);
		WebElement SpecialityType = wait.until(ExpectedConditions.elementToBeClickable(Speciality)); 
		SpecialityType.click();
		Thread.sleep(2000);
		WebElement SpecialityOpt = wait.until(ExpectedConditions.elementToBeClickable(SpecialitySelOpt)); 
		SpecialityOpt.click();
		
		Thread.sleep(2000);
		WebElement DoctorSelType = wait.until(ExpectedConditions.elementToBeClickable(DoctorSel)); 
		DoctorSelType.click();
		
		Thread.sleep(2000);
		WebElement Appointmentsat = wait.until(ExpectedConditions.elementToBeClickable(AppointmentOnsat)); 
		Appointmentsat.click();
		
		Thread.sleep(2000);
		WebElement Existing = wait.until(ExpectedConditions.elementToBeClickable(ExistingBtn)); 
		Existing.click();
		
		Thread.sleep(2000);
		WebElement ADVSearch = wait.until(ExpectedConditions.elementToBeClickable(AdvancedSearch)); 
		ADVSearch.click();
		
		Thread.sleep(2000);
		WebElement MRNInput = wait.until(ExpectedConditions.elementToBeClickable(MRNField)); 
		MRNInput.sendKeys(MRNS);

		Thread.sleep(2000);
		WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(SearchClick)); 
		Search.click();
		
		Thread.sleep(2000);
		WebElement PatientSel = wait.until(ExpectedConditions.elementToBeClickable(Selectpatient)); 
		PatientSel.click();
		
		Thread.sleep(2000);
		WebElement Mobile = wait.until(ExpectedConditions.elementToBeClickable(MobileNo)); 
		Mobile.sendKeys("7569206892");
		
		Thread.sleep(2000);
		WebElement SaveBt = wait.until(ExpectedConditions.elementToBeClickable(SaveBtn)); 
		SaveBt.click();
		
		Thread.sleep(2000);
		WebElement SaveYes = wait.until(ExpectedConditions.elementToBeClickable(SaveDialog)); 
		SaveYes.click();
		
		/*Thread.sleep(2000);
		WebElement GenderClick = wait.until(ExpectedConditions.elementToBeClickable(Gender)); 
		GenderClick.click();
		Thread.sleep(2000);
		WebElement GenderSelOPt = wait.until(ExpectedConditions.elementToBeClickable(GenderSel)); 
		GenderSelOPt.click();*/
		

		/*Thread.sleep(5000);
		WebElement MRN1=driver.findElement(MRNClick1);
		String MRNS=MRN1.getText();

		System.out.println("MRN Number:"+MRNS);
		Thread.sleep(4000);
		Actions act1 = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(mainmenuADTScreen);
		act1.moveToElement(ele2).build().perform();
		act1.click(ele2).perform();
		
		Thread.sleep(4000);
		driver.findElement(MRDMenu).click();
		
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();
		
		Thread.sleep(4000);
		driver.findElement(DiagnosisCoding).click();
		
		Thread.sleep(4000);
		driver.findElement(SampleRow).click();*/
		
		
		

	}
	public OP_ExistingAppoint_CreateVolume_Allocated_Transferred_FileAccept_BacktoMRDRece_MRDRece(WebDriver driver)
	{
		this.driver=driver;
	}
}
