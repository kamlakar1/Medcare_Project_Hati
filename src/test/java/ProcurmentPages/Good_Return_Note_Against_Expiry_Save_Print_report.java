package ProcurmentPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class Good_Return_Note_Against_Expiry_Save_Print_report {


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
	By Returnno = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr/td[13]");
	By SideBarMenu=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");	
	By Add_new = By.cssSelector("button[ng-reflect-message='Add New']");
	
	By Add_New =By.cssSelector("button[ng-reflect-message='Add New']");
	By Store = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[2]/div/mat-form-field");
	By OPStoreoption = By.xpath("//span[contains(text(),'OP Store 1')]");
	By Supplier = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[3]/div/mat-form-field");
	By supplieropt=By.xpath("//span[contains(text(),' Antah Pharma Sdn Bhd ')]");
	By Against = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-addnew-goodreturnnote/div[1]/mat-grid-list/div/mat-grid-tile[4]/div/mat-form-field");
    By Expiry = By.xpath("//span[contains(text(),'Expiry')]");
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
	
	By Cancel = By.cssSelector("a[ng-reflect-message='Cancel']");
	By cancelreason = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-cancel/div/div[2]/mat-form-field[1]/div/div[1]/div[3]/mat-select");
	By Not_resquired=By.xpath("//span[contains(text(),'Not Required')]");
	By cancell = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-cancel/div/div[3]/div/button/span[1]/mat-icon");
	By Print = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-goodreturnnote/div[2]/div[2]/table/tbody/tr/td[15]/a[2]/mat-icon");
	
	
	By From_Date = By.cssSelector("input[ng-reflect-placeholder='From date']");
	By To_date = By.cssSelector("input[ng-reflect-placeholder='To date']");
	
	By serachdate = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-nearbyexpiry/div/div[2]/mat-grid-list/div/mat-grid-tile[3]/div/a");
	
	By AddItemlistcheckbox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-nearbyexpiry/div/div[2]/div/mat-table/mat-row[4]/mat-cell[1]/mat-checkbox/label");
	By AddItem_s = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-additem-nearbyexpiry/div/div[3]/div/button/span[1]/mat-icon");
	
	
	
	
	public Good_Return_Note_Against_Expiry_Save_Print_report (WebDriver driver)

	{
		this.driver=driver;

	}


	public void Good_Return_Note_Against_Expiry_Save_Print_reportfunc() throws InterruptedException, IOException, AWTException 
	{

		//Clicking on menu Icon
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();


		//InventoryIcon  Itemcode
		Thread.sleep(800);
		driver.findElement(Inventory).click();
		Thread.sleep(8000);

		Thread.sleep(2000);
		WebElement HoverSideBar=driver.findElement(SideBarMenu);
		act.moveToElement(HoverSideBar).build().perform();

		driver.findElement(GoodReturnNote).click();
		Thread.sleep(1000);
		driver.findElement(GoodReturnNotesub).click();
		Thread.sleep(800);
		//Clicking outside space after clicking ward
		Thread.sleep(2000);
		driver.findElement(Add_New).click();
		Thread.sleep(800);
		driver.findElement(Store).click();
		Thread.sleep(1000);
		driver.findElement(OPStoreoption).click();
		Thread.sleep(1000);
		driver.findElement(Supplier).click();
		Thread.sleep(1000);
		driver.findElement(supplieropt).click();
		Thread.sleep(1000);
		driver.findElement(Against).click();
		Thread.sleep(1000);
		driver.findElement(Expiry).click();
		Thread.sleep(1000);
		driver.findElement(ReferenceNo).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(Due_Date).sendKeys("02/02/2025");
		Thread.sleep(1000);
		driver.findElement(AddItems).click();
		
		
		WebElement toClear = driver.findElement(From_Date);
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		WebElement to_Clear = driver.findElement(To_date);
		to_Clear.sendKeys(Keys.CONTROL + "a");
		to_Clear.sendKeys(Keys.DELETE);
		
		
		//Clicking outside space after clicking ward
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveByOffset(200, 0).click().build().perform();
		
	
		Thread.sleep(2000);
		driver.findElement(serachdate).click();
		Thread.sleep(2000);
		driver.findElement(AddItemlistcheckbox).click();
		Thread.sleep(2000);
		driver.findElement(AddItem_s).click();
		
		
		Thread.sleep(5000);
	
		Robot robot = new Robot();
		for (int i = 0; i < 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(900);
	//	driver.findElement(SelectReason).click();
		//Thread.sleep(1000);
	   // driver.findElement(ReturnRequired).click();
	    Thread.sleep(1000);
		driver.findElement(reason).click();
		Thread.sleep(1000);
		driver.findElement(ReturnRequired).click();
		Thread.sleep(1000);
		driver.findElement(save).click();
		Thread.sleep(1000);
		driver.findElement(Yes).click();
		Thread.sleep(3000);
		
		String getreturnnon = driver.findElement(getreurnno).getText();
	
	//	driver.findElement(recordccheckbox).click();
		Thread.sleep(1000);
		driver.findElement(Expand).click();
		Thread.sleep(1000);
		driver.findElement(retun_no).sendKeys(getreturnnon);
		Thread.sleep(1000);
		driver.findElement(Search).click();
		Thread.sleep(1000);
		driver.findElement(Checkkkk).click();
		Thread.sleep(1000);
		driver.findElement(Print).click();
	    Thread.sleep(3000);
	    String IssueListindvrify = driver.getCurrentUrl();
		String ActualReturnno = IssueListindvrify;
		String ExpectedReturnno = IssueListindvrify;
		Assert.assertEquals(ActualReturnno, ExpectedReturnno, "Report has been printed");
		Thread.sleep(1000);
		File screenshot_10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_10, new File(".//ScreenShots//Good_Return_Note_Against_Expiry_Save_Print_report.png")); 
		Thread.sleep(1000);


	}
}
