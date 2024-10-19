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

public class DocumentManagement_Search_IP_Patient_Upload_Document_Save 
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
	By ADTMenu=By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[1]/div[1]/div[3]/div/img");
	By AdmissionDashboard=By.xpath("//*[@id='568401']/img");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	By MRNClick1=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container[2]/mat-drawer-content/div/table/tbody/tr[1]/td[2]");
	By MRDMenu=By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[2]/div[1]/div[2]/div/img");
	By DocumentMgmt=By.xpath("//*[@id='70012']/img");

	By AdvancedSearch=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By MRNField=By.cssSelector("input[ng-reflect-placeholder='MRN']");
	By Search=By.cssSelector("button[ng-reflect-message='Search']");
	By SampleRow=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-document-upload-management/mat-sidenav-container/mat-sidenav-content/mat-tab-group[2]/div/mat-tab-body/div/div/table/tbody/mat-row");

	By Upload=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-diagnosis-coding/mat-sidenav-container/mat-sidenav-content/mat-tab-group/div/mat-tab-body[1]/div/div/table/tbody/tr[1]/td[12]/a/mat-icon");
	By ChooseFile=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-document-upload-management/mat-sidenav-container/mat-sidenav/div/div[2]/div[2]/input");
	By SaveFile=By.cssSelector("mat-icon[ng-reflect-message='Save']");
	By ConfirmSave=By.cssSelector("button[ng-reflect-message='Yes']");
	By FIleUploadSucc=By.xpath("//span[contains(text(),'File Uploaded successfully')]");
	By Download=By.cssSelector("mat-icon[ng-reflect-message='Download']");
	public void DocumentMgmt_OPD_UploadFIle_Save() throws InterruptedException, IOException
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

		Thread.sleep(8000);
		driver.findElement(ADTMenu).click();

		//..Over the slide bar in OPD Screen....//

		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(5000);
		driver.findElement(AdmissionDashboard).click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(300, 0).click().build().perform();

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
		driver.findElement(DocumentMgmt).click();

		Thread.sleep(2000);
		WebElement Asearch = wait.until(ExpectedConditions.elementToBeClickable(AdvancedSearch)); 
		Asearch.click();

		Thread.sleep(1000);
		WebElement MRNFild = wait.until(ExpectedConditions.elementToBeClickable(MRNField)); 
		MRNFild.sendKeys(MRNS);

		Thread.sleep(1000);
		WebElement SearchClick = wait.until(ExpectedConditions.elementToBeClickable(Search)); 
		SearchClick.click();

		Thread.sleep(2000);
		WebElement SRow = wait.until(ExpectedConditions.elementToBeClickable(SampleRow)); 
		SRow.click();

		/*Thread.sleep(2000);
		WebElement UploadFile = wait.until(ExpectedConditions.elementToBeClickable(Upload)); 
		UploadFile.click();*/

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

		/*Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(500, 0).click().build().perform();

		Thread.sleep(2000);
		WebElement UploadFile1 = wait.until(ExpectedConditions.elementToBeClickable(Upload)); 
		UploadFile1.click();

		Thread.sleep(2000);
		WebElement DownloadFile = wait.until(ExpectedConditions.elementToBeClickable(Download)); 
		DownloadFile.click();*/







	}
	public DocumentManagement_Search_IP_Patient_Upload_Document_Save(WebDriver driver)
	{
		this.driver=driver;
	}
}
