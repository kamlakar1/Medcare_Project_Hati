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
import org.testng.Assert;

public class DiagnosisCoding_OPD_Uploaddocument_Save_Downloaddocument 
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
	By Upload=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-diagnosis-coding/mat-sidenav-container/mat-sidenav-content/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr[1]/td[12]/a/mat-icon");
	By ChooseFile=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-diagnosis-coding/mat-sidenav-container/mat-sidenav/div/div[2]/div[2]/input");
	By SaveFile=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-diagnosis-coding/mat-sidenav-container/mat-sidenav/div/div[2]/div[4]/mat-grid-list/div/mat-grid-tile[2]/div/div/button");
	By ConfirmSave=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirmation/div/form/div[3]/div/button[1]");
	By FIleUploadSucc=By.xpath("//span[contains(text(),'File Uploaded successfully')]");
	By Download=By.cssSelector("mat-icon[ng-reflect-message='Download']");
	public void DiagnosisCoding_OPD_UploadFIle_Download() throws InterruptedException, IOException
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
		
		Thread.sleep(2000);
		driver.findElement(DiagnosisCoding).click();
		
		Thread.sleep(2000);
		driver.findElement(SampleRow).click();
		
		Thread.sleep(2000);
		WebElement UploadFile = wait.until(ExpectedConditions.elementToBeClickable(Upload)); 
		UploadFile.click();
		
		Thread.sleep(2000);
		WebElement ChooseFIles = wait.until(ExpectedConditions.elementToBeClickable(ChooseFile)); 
		ChooseFIles.sendKeys("C:\\MedcareImg\\data.txt");
		
		Thread.sleep(3000);
		WebElement Save= wait.until(ExpectedConditions.elementToBeClickable(SaveFile)); 
		Save.click();
		
		Thread.sleep(2000);
		WebElement SaveYes = wait.until(ExpectedConditions.elementToBeClickable(ConfirmSave)); 
		SaveYes.click();
	
		/*Thread.sleep(2000);
		WebElement selectR2=driver.findElement(FIleUploadSucc);
		String SRActual2=selectR2.getText();
		System.out.println("message : "+SRActual2);
		String expected2="File Uploaded successfully";
		Assert.assertEquals(SRActual2,expected2,"File Uploaded successfully");*/
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(500, 0).click().build().perform();
		
		Thread.sleep(2000);
		WebElement UploadFile1 = wait.until(ExpectedConditions.elementToBeClickable(Upload)); 
		UploadFile1.click();
		
		Thread.sleep(2000);
		WebElement DownloadFile = wait.until(ExpectedConditions.elementToBeClickable(Download)); 
		DownloadFile.click();
		
		
		
		
		
		

	}
	public DiagnosisCoding_OPD_Uploaddocument_Save_Downloaddocument(WebDriver driver)
	{
		this.driver=driver;
	}
}
