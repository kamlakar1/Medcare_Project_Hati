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

public class DiagnosisCoding_OPD_Enter_ICD_Details_Save 
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
		By RegistrationMenu=By.cssSelector("a[id='2004']");
		By EncounterList=By.cssSelector("a[id='2006']");
	
	By MRNClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[1]");
	By MRDMenu=By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[2]/div[1]/div[2]/div/img");
	By DiagnosisCoding=By.xpath("//*[@id='70009']/img");
	
	By SampleRow=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-diagnosis-coding/mat-sidenav-container/mat-sidenav-content/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr[1]");
	By ICDCode=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-diagnosis-coding/mat-sidenav-container/mat-sidenav-content/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr[1]/td[10]/a/mat-icon");
	By Diagnosis=By.cssSelector("input[ng-reflect-placeholder='Pick one']");
	By DiagnosisSelOpt=By.xpath(" //span[contains(text(),'3506 - Heterophoria')] ");
	By FinalProvisnal=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-diagnosis-icd/div[2]/div[3]/mat-grid-list/div/mat-grid-tile[2]/div/mat-button-toggle-group/mat-button-toggle[2]/button");
	By Add=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-diagnosis-icd/div[2]/div[3]/mat-grid-list/div/mat-grid-tile[4]/div/button");
	By SaveBtn=By.cssSelector("button[ng-reflect-message='Save']");
	public void DiagnosisCoding_OPD_Enter_ICD_Details() throws InterruptedException, IOException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date nowdate = new Date();
		WebDriverWait wait = new WebDriverWait(driver,6000);

		
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
		
		Thread.sleep(4000);
		driver.findElement(MRDMenu).click();
		
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide2).build().perform();
		
		Thread.sleep(4000);
		driver.findElement(DiagnosisCoding).click();
		
		Thread.sleep(4000);
		driver.findElement(SampleRow).click();
		
		Thread.sleep(3000);
		WebElement ROW = wait.until(ExpectedConditions.elementToBeClickable(ICDCode)); 
		ROW.click();
		
		Thread.sleep(100);
		WebElement DignosisPick = wait.until(ExpectedConditions.elementToBeClickable(Diagnosis)); 
		DignosisPick.sendKeys("test");	
		Thread.sleep(300);
		WebElement DiagnosisOpt= wait.until(ExpectedConditions.elementToBeClickable(DiagnosisSelOpt)); 
		DiagnosisOpt.click();
		
		Thread.sleep(300);
		WebElement FinalProv = wait.until(ExpectedConditions.elementToBeClickable(FinalProvisnal)); 
		FinalProv.click();
		
		WebElement AddButton= wait.until(ExpectedConditions.elementToBeClickable(Add)); 
		AddButton.click();
		
		WebElement SaveButton= wait.until(ExpectedConditions.elementToBeClickable(SaveBtn)); 
		SaveButton.click();
		
		
		

	}
	public DiagnosisCoding_OPD_Enter_ICD_Details_Save(WebDriver driver)
	{
		this.driver=driver;
	}
}
