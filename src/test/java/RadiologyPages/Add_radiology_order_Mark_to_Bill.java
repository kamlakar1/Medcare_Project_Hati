package RadiologyPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class Add_radiology_order_Mark_to_Bill{


	WebDriver driver=null;

	//Menu
	By mainmenu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");

	//BillingIcon 
	By Inventory=By.xpath("//span[contains(text(),'Procurement')]");
	By GoodReturnNote =By.id("10006");
	By GoodReturnNotesub = By.id("10601");
	By Expand = By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	By Collapse = By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
	By Enter_GRNP_No = By.cssSelector("input[ng-reflect-placeholder='Enter GRN No.']");
	By Search = By.cssSelector("button[ng-reflect-message='Search']");
	By Returnno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr[1]/td[10]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");	
	By Add_new = By.cssSelector("button[ng-reflect-message='Add New']");

	By Add_New =By.cssSelector("button[ng-reflect-message='Add New']");
	By Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field");
	By OPStoreoption = By.xpath("//span[contains(text(),'OP Store 1')]");
	By Supplier = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field");
	By supplieropt=By.xpath("//span[contains(text(),' Antah Pharma Sdn Bhd ')]");
	By Against = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field");
	By Direct = By.xpath("//span[contains(text(),'Direct')]");
	By ReferenceNo = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[6]/div/mat-form-field/div/div[1]/div[3]/input");	
	By Due_Date = By.cssSelector("input[ng-reflect-placeholder='Choose a date']");
	By AddItems= By.cssSelector("button[ng-reflect-message='Add Items']");

	By Stationarybox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-batchwise/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox");
	By adds = By.cssSelector("mat-icon[ng-reflect-message='Add Items']");
	By SelectReason= By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[2]/table/tbody/tr/td[15]/mat-form-field");
	By ReturnRequired = By.xpath("//span[contains(text(),' Return Required ')]");
	By reason = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[3]/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field");
	By Save_submit = By.cssSelector("button[ng-reflect-message='Save & Submit']");
	By 	Yes = By.cssSelector("button[ng-reflect-message='Yes']");
	By Checkkkk = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr/td[1]/mat-checkbox");
	By save = By.cssSelector("button[ng-reflect-message='Save']");
	By recordccheckbox = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr[1]/td[1]/mat-checkbox");

	By getreurnno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr[1]/td[3]");
	By retun_no =By.cssSelector("input[ng-reflect-placeholder='Return No']");
	By Details = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr/td[16]/a/mat-icon");
	By ApproveButton = By.cssSelector("button[ng-reflect-message='Approve']");


	By OpConsultant = By.xpath("//img[@src='../../../assets/images/master-icons/OPConsult.png']");
	By patientname = By.id("patientname");
	By Search1 = By.id("Search");
	By Strat = By.id("tokenbutton");
	By startconsult= By.id("startconsult");
	By RadilogyIOrde = By.xpath("/html/body/app-root/app-main/div/div[2]/div/app-patient-casesheet/div/div[2]/div/app-case-sheet/div[2]/div/div[4]/app-soap-comp-header/div[7]/div/div/div/div/div/button/span[1]");
	By Addorder = By.xpath("//td[contains(text(),'CT Abdomen')]");
	By ExpnadDropdown = By.cssSelector("//button[@class='p-element p-ripple p-autocomplete-dropdown p-button-icon-only p-button p-component ng-star-inserted']");
	By Frequncy = By.xpath("//ul[@role='listbox']/li[2]");
	By Duration = By.id("durationNum");
	By ClinicalComment = By.id("clinicalComment");
	By Save_Exit = By.id("SaveExit");

	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");

	public Add_radiology_order_Mark_to_Bill (WebDriver driver)

	{
		this.driver=driver;

	}


	public void consultAddservice() throws InterruptedException, IOException, AWTException 
	{
		
		
		
		
		
		Thread.sleep(3000);
	    driver.findElement(EncounterListClick).click();
	

		
	
		WebElement ptname=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[1]"));
		String regptname=ptname.getText();

		System.out.println("Patient name");

		//Clicking on menu Icon
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();


		//InventoryIcon  Itemcode
		Thread.sleep(800);
		driver.findElement(OpConsultant).click();
		Thread.sleep(8000);


		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.get(1));



		Thread.sleep(10000);
		driver.findElement(patientname).sendKeys(regptname);
		Thread.sleep(1000);
		driver.findElement(Search1).click();
		Thread.sleep(1000);
		driver.findElement(Strat).click();
		Thread.sleep(1000);
		driver.findElement(startconsult).click();
		Thread.sleep(80000);
		driver.findElement(RadilogyIOrde).click();
		Thread.sleep(1000);
		driver.findElement(Addorder).click();
		Thread.sleep(1000);
		driver.findElement(ExpnadDropdown).click();
		Thread.sleep(1000);
		driver.findElement(Frequncy).click();
		Thread.sleep(1000);
		driver.findElement(Duration).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(ClinicalComment).sendKeys("good");
		Thread.sleep(1000);
		driver.findElement(Save_Exit).click();
		Thread.sleep(1000);

	}
}
